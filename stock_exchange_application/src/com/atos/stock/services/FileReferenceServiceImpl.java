package com.atos.stock.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.FileReferenceDAO;
import com.atos.stock.model.FileReference;

@Service("fileReferenceService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class FileReferenceServiceImpl implements FileReferenceService{

	@Autowired
	private FileReferenceDAO fileReferenceDao;
	
	@Override
	public void addFileReference(FileReference fr) {
		// TODO Auto-generated method stub
		fileReferenceDao.addFileReference(fr);
		
	}

	@Override
	public byte[] readFileReference(byte[] data) {
		// TODO Auto-generated method stub
		return fileReferenceDao.readFileReference(data);
	}

	@Override
	public boolean deleteFileReference(long id) {
		// TODO Auto-generated method stub
		return fileReferenceDao.deleteFileReference(id);
	}

	@Override
	public FileReference getFile(long id) {
		// TODO Auto-generated method stub
		return fileReferenceDao.getFile(id);
	}

	@Override
	public List<FileReference> getFiles() {
		// TODO Auto-generated method stub
		return fileReferenceDao.getFiles();
	}

}
