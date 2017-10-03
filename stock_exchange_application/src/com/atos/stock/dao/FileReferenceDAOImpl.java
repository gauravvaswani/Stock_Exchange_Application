package com.atos.stock.dao;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.FileReferenceDAO;
import com.atos.stock.model.FileReference;
import com.atos.stock.utils.MyUtil;

@Repository("fileReferenceDao")
public class FileReferenceDAOImpl implements FileReferenceDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addFileReference(FileReference fr) {
		
		Session session=sessionFactory.getCurrentSession();
		session.save(fr);
	
	}
	
	@Override
	public byte[] readFileReference(byte[] data) {
		 
		for(byte b:data)
		{
		
	      	System.out.print((char)b);
	    }

		return data;
		
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean deleteFileReference(long id) {
		
		Session session ;
		session = sessionFactory.getCurrentSession();
		FileReference obj =(FileReference) session.load(FileReference.class, id);
		session.delete(obj);
		session.flush();
		return true;
	
		
	}
	
	@Override
	public FileReference getFile(long id)
	{
		Session session ;
		session = sessionFactory.getCurrentSession();
		Query q=session.createQuery("from FileReference where fileId='"+id+"'");
		List<FileReference> li=q.list();
		return li.get(0);

	}
	
	@Override
	public List<FileReference> getFiles()
	{
		Session session ;
		session = sessionFactory.getCurrentSession();
		Query q=session.createQuery("from FileReference");
		List<FileReference> li=q.list();
		return li;

	}
}

