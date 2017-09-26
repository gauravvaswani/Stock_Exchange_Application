package com.atos.stock.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyUtil {

	static Session session=null;
	static SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	public static Session getSession() {
		// TODO Auto-generated method stub
		if(session==null)
		{
			session=sf.openSession();
			session.beginTransaction();
		}
		return session;
		
	}
	
	public static void commitSession()
	{
		session.getTransaction().commit();
	}

}
