package com.atos.stock.unitTest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;

import com.atos.stock.dao.FileReferenceDAO;
import com.atos.stock.impl.FileReferenceDAOImpl;
import com.atos.stock.model.FileReference;
import com.atos.stock.utils.MyUtil;

public class FileReferenceDAOImplTest {

	@Test
	public void testAddFileReference() throws IOException {
		/*FileReference files = new FileReference();
		
		files.setFileName("samp");
		files.setFileProcessingDate(new Timestamp(new Date().getTime()));
		Path path = Paths.get("companyList.csv");
		byte[] data = Files.readAllBytes(path);
		files.setFileData(data);
		FileReferenceDAO frd = new FileReferenceDAOImpl();
		frd.addFileReference(files);
		MyUtil.commitSession();*/
	}

	@Test
	public void testDeleteFileReference() {
	/*	FileReferenceDAO fd=new FileReferenceDAOImpl();
		assertEquals(true,fd.deleteFileReference(2001));
		MyUtil.commitSession();*/

	}

	@Test
	public void testGetFile() {
	/*	FileReferenceDAO frd = new FileReferenceDAOImpl();
		FileReference fe=frd.getFile(2002);
		assertEquals(2002,fe.getFileId());*/
	
	}

}
