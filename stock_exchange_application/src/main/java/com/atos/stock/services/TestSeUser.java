package com.atos.stock.services;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.dao.StockDataDAO;
import com.atos.stock.impl.CompanyDataDAOImpl;
import com.atos.stock.impl.SeUserDAOImpl;
import com.atos.stock.impl.StockDataDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;
import com.atos.stock.model.WatchList;
import com.atos.stock.utils.MyUtil;

public class TestSeUser {

	public static void main(String[] args) {
		
//		SeUser user=new SeUser();
//		user.setUserId(1014);
//		user.setUserName("sanket");
//		user.setUserFullname("Sanket Solanki");
//		user.setUserPassword("123456");
//		user.setUserPhone(new BigDecimal(123456));
//		user.setUserRole("Admin");	
		SeUserDAO sd=new SeUserDAOImpl();
		//sd.addUser(user);
		
		
		//sd.setTempPass("xyzsanket");
		String username="sankets14";
		String hash=DigestUtils.sha1Hex(username+"-"+new Date().getTime());
		System.out.println(sd.getUserByTempPass(hash).getUserFullname());
		
//		CompanyData cd=new CompanyData();
//		StockData sdt=new StockData();
//		sdt.setStockId(1233);
//		sdt.setOpeningStockValue(new BigDecimal(12.7));
//		
//		cd.setId(1002);
//		cd.setCompanyCode("50004");
//		cd.setCompanyName("Infyd");
//		cd.setCompanyStatus("Listed");
//		cd.getStockData().add(sdt);
//		
	
//		CompanyDataDAO cdo=new CompanyDataDAOImpl();
//		cdo.addCompany(cd);
//		sdt.setCompanyData(cd);
//		StockDataDAO sdo=new StockDataDAOImpl();
//		sdo.addStockData(sdt);

		
//		CompanyData cd1=cdo.getCompany("50004");
//		if(cdo.deleteCompany(cd1))
//			System.out.println("deleted");
		
		//sdt.setStockId();
		
		
		
//		
//		sd.checkUser("sankets14", "1234ff56");
//		
//		SeUser u=sd.getUser("sankets14");
//		System.out.println(u.getUserFullname());
//		System.out.println(u.getUserRole());
		
//		CompanyData cd=new CompanyData();
//		cd.setCompanyCode("");
		
		
		
//		sd.updateUserFullname("Sanket", "Sanket Vinod Solanki");
		//sd.deleteUser("sankets14");
//		System.out.println(u.getUserFullname());
		MyUtil.commitSession();
		

	}

}
