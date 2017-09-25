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
		// TODO Auto-generated method stub
		Session session=MyUtil.getSession();
		session.save(user);		
	}
	
	public void checkUser(String username,String password)
	{
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from SeUser s where s.userName=\'"+username+"\' and s.userPassword=\'"+password+"\'");
		List li=query.list();
		if(li.size()==1)
			System.out.println("User Authenticated");
		else
			System.out.println("Authentication Failed");
		
	}
	
	public SeUser getUser(String username)
	{
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from SeUser s where s.userName=\'"+username+"\'");
		Iterator<SeUser> it=query.iterate();
		while(it.hasNext())
		{
			return it.next();
		}
		
		return null;	
	}
	
	public boolean updateUserFullname(String username,String updatedFullName)
	{
		Session session=MyUtil.getSession();
		Query query=session.createQuery("update SeUser set userFullname=\'"+updatedFullName+"\' where userName=\'"+username+"\'");
		int i=query.executeUpdate();
		
		System.out.println(i);
		return true;	
	}
	
	public boolean deleteUser(String username)
	{	
		Session session=MyUtil.getSession();
		SeUser s=getUser(username);
		session.delete(s);
		return true;
	}
	
	public void setTempPass(String username)
	{
		Session session=MyUtil.getSession();
		String hash=DigestUtils.sha1Hex(username+"-"+new Date().getTime());
		//System.out.println(hash);
		Query query=session.createQuery("update SeUser set tempPass=\'"+hash+"\' where userName=\'"+username+"\'");
		query.executeUpdate();
				
	}
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
		return s;
	}

}
