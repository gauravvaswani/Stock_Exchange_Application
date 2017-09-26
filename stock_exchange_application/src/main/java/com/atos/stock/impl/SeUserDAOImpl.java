package com.atos.stock.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.model.SeUser;
import com.atos.stock.utils.MyUtil;

public class SeUserDAOImpl implements SeUserDAO{

	@Override
	public void addUser(SeUser user) {
		
		String hashPassword=DigestUtils.sha1Hex(user.getUserPassword());
		user.setUserPassword(hashPassword);
		Session session=MyUtil.getSession();
		session.save(user);		
	}
	
	@Override
	public boolean checkUser(String username,String password)
	{
		Session session=MyUtil.getSession();
		String hashPassword=DigestUtils.sha1Hex(password);
		Query query=session.createQuery("from SeUser s where s.userName=\'"+username+"\' and s.userPassword=\'"+hashPassword+"\'");
		List li=query.list();
		if(li.size()==1)
			return true;
		else
			return false;
		
	}
	
	@Override
	public SeUser getUser(String username)
	{
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from SeUser s where s.userName=\'"+username+"\'");
		Iterator<SeUser> it=query.iterate();
		List<SeUser> li=query.list();
		return li.get(0);
	
	}
	
	@Override
	public boolean updateUserFullname(String username,String updatedFullName)
	{
		Session session=MyUtil.getSession();
		Query query=session.createQuery("update SeUser set userFullname=\'"+updatedFullName+"\' where userName=\'"+username+"\'");
		int i=query.executeUpdate();
		
		System.out.println(i);
		return true;	
	}
	
	@Override
	public boolean deleteUser(String username)
	{	
		Session session=MyUtil.getSession();
		SeUser s=getUser(username);
		session.delete(s);
		return true;
	}
	
	@Override
	public void setTempPass(String username)
	{
		Session session=MyUtil.getSession();
		String hash=DigestUtils.sha1Hex(username+"-"+new Date().getTime());
		Query query=session.createQuery("update SeUser set tempPass=\'"+hash+"\' where userName=\'"+username+"\'");
		query.executeUpdate();
				
	}
	
	@Override
	public String getTempPass(String username)
	{
		Session session=MyUtil.getSession();
		List<SeUser> li=new ArrayList<SeUser>();
		Query query=session.createQuery("from SeUser where userName=\'"+username+"\'");
		li=query.list();
		return li.get(0).getTempPass();			
	}

	@Override
	public SeUser getUserByTempPass(String tempPass) {
		
		Session session=MyUtil.getSession();
		List<SeUser> li=new ArrayList<SeUser>();
		Query query=session.createQuery("from SeUser where tempPass=\'"+tempPass+"\'");
		li=query.list();
		SeUser s=li.get(0);	
		query=session.createQuery("update SeUser set tempPass='' where userName=\'"+s.getUserName()+"\'");
		query.executeUpdate();
		
		return s;
	}

	@Override
	public boolean changePassword(String username, String password) {
		
		Session session=MyUtil.getSession();
		String hashPassword=DigestUtils.sha1Hex(password);
		Query query=session.createQuery("update SeUser set userPassword=\'"+hashPassword+"\' where userName=\'"+username+"\'");
		int i=query.executeUpdate();
		System.out.println(i);
		return true;
	}
	
	

}
