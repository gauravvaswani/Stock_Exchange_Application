package com.atos.stock.services;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Date;

import com.atos.stock.dao.FileReferenceDAO;
import com.atos.stock.impl.FileReferenceDAOImpl;
import com.atos.stock.model.FileReference;
import com.atos.stock.utils.MyUtil;



public class Test {

	public static void main(String[] args) throws IOException {
		
		
		
		FileReference files = new FileReference();
		files.setFileId(9989);
		files.setFileName("doc");
		
		
		Date d=new Date();
		Timestamp st=new Timestamp(d.getTime());
		files.setFileProcessingData(st);
		
		
		
		Path path = Paths.get("D:/gayathri/proj_demo/s.txt");
		byte[] data = Files.readAllBytes(path);
		files.setFileData(data);
		
		FileReferenceDAO frd = new FileReferenceDAOImpl();
		frd.addFileReference(files);
		frd.readFileReference(data);
		frd.deleteFileReference(files.getFileId());
	frd.deleteFileReferenceDate(st);
		MyUtil.commitSession();
		System.out.println("obj inserted");
		for(byte b:data){
			      	System.out.println((char)b);
			        	
			    }
		
	//	
		

		
		
	//	
	//	
	//	System.out.println("dleted");
       
		
		
	}

}
