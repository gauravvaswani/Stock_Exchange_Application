package com.atos.stock.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.atos.stock.dao.FileReferenceDAO;
import com.atos.stock.model.FileReference;
import com.atos.stock.utils.MyUtil;

public class FileReferenceDAOImpl implements FileReferenceDAO {

	@Override
	public void addFileReference(FileReference fr) {
		
		Session session=MyUtil.getSession();
		session.save(fr);
		

	}
	@Override
	public byte[] readFileReference(byte[] data) {
	//	 
		return data;
		// TODO Auto-generated method stub
		
	
	}
	
	@Override
	public boolean deleteFileReference(long id) {
		
		Session session ;
		session = MyUtil.getSession();
		FileReference obj =(FileReference) session.load(FileReference.class, id);
		session.delete(obj);
		session.flush();
		return true;
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean deleteFileReferenceDate(Timestamp dt) {
		// TODO Auto-generated method stub
		
		Session session ;
		session = MyUtil.getSession();
		Query q=session.createQuery("from FileReference where fileProcessingData='"+dt+"'");
		Iterator<FileReference> it=q.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}
//		FileReference obj =(FileReference) session.load(FileReference.class, dt);
//		session.delete(obj);
//		session.flush();
		return true;
		
}

	
	/*

	@Override
	public byte[] readFileReference(byte[] data) {
	//	 for(byte b:data){
	  //      	System.out.println((char)b);
	        	
	    //    }
		return data;
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public boolean deleteFileReference(long id) {
		
		Session session ;
		session = MyUtil.getSession();
		FileReference obj =(FileReference) session.load(FileReference.class, id);
		session.delete(obj);
		session.flush();
		return true;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteFileReferenceDate(Timestamp dt) {
		// TODO Auto-generated method stub
		
		Session session ;
		session = MyUtil.getSession();
		FileReference obj =(FileReference) session.load(FileReference.class, dt);
		session.delete(obj);
		session.flush();
		return true;
		
}
		
	
*/
}

