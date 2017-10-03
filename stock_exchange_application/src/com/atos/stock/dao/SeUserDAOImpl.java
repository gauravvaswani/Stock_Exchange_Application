package com.atos.stock.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.model.SeUser;
import com.atos.stock.utils.MyUtil;

@Repository("seUserDao")
public class SeUserDAOImpl implements SeUserDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addUser(SeUser user) {
		
		String hashPassword=DigestUtils.sha1Hex(user.getUserPassword());
		user.setUserPassword(hashPassword);
		Session session=sessionFactory.getCurrentSession();
		session.save(user);		
	}
	
	@Override
	public boolean checkUser(String username,String password)
	{
		Session session=sessionFactory.getCurrentSession();
		String hashPassword=DigestUtils.sha1Hex(password);
		Query query=session.createQuery("from SeUser s where s.userName=\'"+username+"\' and s.userPassword=\'"+hashPassword+"\'");
		List<SeUser> li=query.list();
		if(li.size()==1)
			return true;
		else
			return false;
		
	}
	
	@Override
	public SeUser getUser(String username)
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from SeUser s where s.userName=\'"+username+"\'");
		Iterator<SeUser> it=query.iterate();
		List<SeUser> li=query.list();
		return li.get(0);
		//return (SeUser) sessionFactory.getCurrentSession().get(SeUser.class, username);
	
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public boolean updateUserFullname(String username,String updatedFullName)
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("update SeUser set userFullname=\'"+updatedFullName+"\' where userName=\'"+username+"\'");
		int i=query.executeUpdate();
		
		System.out.println(i);
		return true;	
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public boolean deleteUser(String username)
	{	
		Session session=MyUtil.getSession();
		SeUser s=getUser(username);
		session.delete(s);
		return true;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void setTempPass(String username)
	{
		Session session=sessionFactory.getCurrentSession();
		String hash=DigestUtils.sha1Hex(username+"-"+new Date().getTime());
		Query query=session.createQuery("update SeUser set tempPass=\'"+hash+"\' where userName=\'"+username+"\'");
		query.executeUpdate();
				
	}
	
	@Override
	public String getTempPass(String username)
	{
		Session session=sessionFactory.getCurrentSession();
		List<SeUser> li=new ArrayList<SeUser>();
		Query query=session.createQuery("from SeUser where userName=\'"+username+"\'");
		li=query.list();
		return li.get(0).getTempPass();			
	}

	@Override
	public SeUser getUserByTempPass(String tempPass) {
		
		Session session=sessionFactory.getCurrentSession();
		List<SeUser> li=new ArrayList<SeUser>();
		Query query=session.createQuery("from SeUser where tempPass=\'"+tempPass+"\'");
		li=query.list();
		SeUser s=li.get(0);	
		query=session.createQuery("update SeUser set tempPass='' where userName=\'"+s.getUserName()+"\'");
		query.executeUpdate();
		
		return s;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public boolean changePassword(String username, String password) {
		
		System.out.println("in Chnage");
		Session session=sessionFactory.getCurrentSession();
		String hashPassword=DigestUtils.sha1Hex(password);
		Query query=session.createQuery("update SeUser set userPassword=\'"+hashPassword+"\' where userName=\'"+username+"\'");
		int i=query.executeUpdate();
		if(i==1)
			return true;
		else
			return false;
	}

	@Override
	public List<SeUser> getAllUsers() {
		// TODO Auto-generated method stub
		
			Session session=sessionFactory.getCurrentSession();
			List<SeUser> li=new ArrayList<SeUser>();
			Query query=session.createQuery("from SeUser where userRole='USER'");
			return query.list();
					
		
		
	}
	
	

}
