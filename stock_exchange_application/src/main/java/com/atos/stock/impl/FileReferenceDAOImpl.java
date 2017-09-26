package com.atos.stock.impl;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
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
		 
		for(byte b:data)
		{
		
	      	System.out.print((char)b);
	    }

		return data;
		
	}
	
	@Override
	public boolean deleteFileReference(long id) {
		
		Session session ;
		session = MyUtil.getSession();
		FileReference obj =(FileReference) session.load(FileReference.class, id);
		session.delete(obj);
		session.flush();
		return true;
	
		
	}
	
	@Override
	public FileReference getFile(long id)
	{
		Session session ;
		session = MyUtil.getSession();
		Query q=session.createQuery("from FileReference where fileId='"+id+"'");
		List<FileReference> li=q.list();
		return li.get(0);

	}
}

