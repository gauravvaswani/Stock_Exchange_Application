package services;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.CompanyDataDAO;
import dao.SeUserDAO;
import dao.StockDataDAO;
import dao.UserPortfolioDAO;
import impl.CompanyDataDAOImpl;
import impl.SeUserDAOImpl;
import impl.StockDataDAOImpl;
import impl.UserPortfolioDAOImpl;
import model.CompanyData;
import model.SeUser;
import model.StockData;
import model.UserPortfolio;
import util.MyUtil;

public class UserPortfolioDAOTest {
public static void main(String args[]){
	
SeUser user1=new SeUser();

user1.setUserName("sneha");
user1.setUserPhone(new BigDecimal("9647845394"));
user1.setUserPassword("stock");
user1.setUserRole("Registered User");
user1.setUserFullname("sneha methwani");

SeUserDAO se =new SeUserDAOImpl();

//SeUser user=se.getUser("sneha");
se.addUser(user1);
/*
	SeUser user2=new SeUser();


	user2.setUserName("gunjan");
	user2.setUserPassword("market");
	user2.setUserRole("Registered User");
	SeUserDAO se =new SeUserDAOImpl();
	se.addUser(user);
	se.addUser(user2);*/
	
	
	
	CompanyData cd3=new CompanyData();
	cd3.setCompanyCode("ad364");
	cd3.setCompanyName("l&t");
	

	

	
	
//	CompanyData cd1=new CompanyData();
//	cd1.setCompanyCode("ad6564");
//	cd1.setCompanyName("atos");
//	
CompanyDataDAO cdo1=new CompanyDataDAOImpl();
 //CompanyData cd=cdo1.getCompany("ad6564");
//CompanyData cd=cdo1.getCompany("ad6564");
	cdo1.addCompany(cd3);
	//cdo1.addCompany(cd);
	

	
	
	StockData sd=new StockData();


	sd.setCompanyData(cd3);
	sd.setHighestStockValue(new BigDecimal(234));
	StockDataDAO sdo=new StockDataDAOImpl();
	//sdo.addStockData(sd);
	cd3.getStockData().add(sd);
	sdo.addStockData(sd);
	//sdo.addStockData(sd1);
	
	sd=sdo.getStockData(cd3);
	
	 UserPortfolio up=new UserPortfolio();


	 up.setSeUser(user1);
	 up.setStockData(sd);
	 up.setStockQuantity(new BigDecimal("1544.574"));
	
	 up.setPortfolioData(new Date());
 

	 UserPortfolioDAO ud = new UserPortfolioDAOImpl();
	//ud.addPortfolio(up1);
	ud.addPortfolio(up);
	 
	 
	 ud.deletePortfolio(user1);
	ud.updateQuantity(sd, user1, new BigDecimal(123));
	
	 UserPortfolio sd2=ud.searchStock(sd,user1);
	 System.out.println(sd2.getPortfolioId());
	 System.out.println(sd2.getPortfolioData());
	 System.out.println(sd2.getStockData());
	 
	//ud.updateQuantity(sd1, user2, new BigDecimal("1783.64"));
	 
	 
	 
	 
	 
	 MyUtil.commitSession();
	 
	
	
	
}
}
