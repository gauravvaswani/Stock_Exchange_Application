package com.atos.stock.services;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.atos.stock.dao.FileReferenceDAO;
import com.atos.stock.impl.FileReferenceDAOImpl;
import com.atos.stock.model.FileReference;
import com.atos.stock.utils.MyUtil;

public class Test {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReference files = new FileReference();
		
		files.setFileName("samp");
		
		Date d=new Date();
		files.setFileProcessingData(d);
		
		Path path = Paths.get("D:/gayathri/proj_demo/s.txt");
		byte[] data = Files.readAllBytes(path);
		files.setFileData(data);
		
		
		FileReferenceDAO frd = new FileReferenceDAOImpl();
	
		frd.addFileReference(files);
		
		frd.readFileReference(data);
		
		files=frd.getFile(2030);
		
		//frd.deleteFileReference(files.getFileId());
		
		MyUtil.commitSession();
		System.out.println("obj inserted");
		
		
	}

}
