package com.atos.stock.dao;

import com.atos.stock.model.FileReference;


public interface FileReferenceDAO {
	
	public void addFileReference(FileReference fr);
	public byte[] readFileReference(byte[] data);
	public boolean deleteFileReference(long id);
	public FileReference getFile(long id);
}
