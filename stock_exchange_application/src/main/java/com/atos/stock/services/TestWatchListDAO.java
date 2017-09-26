package services;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import dao.CompanyDataDAO;
import dao.SeUserDAO;
import dao.StockDataDAO;
import dao.WatchListDAO;
import impl.CompanyDataDAOImpl;
import impl.SeUserDAOImpl;
import impl.StockDataDAOImpl;
import impl.WatchListDAOImpl;
import model.CompanyData;
import model.SeUser;
import model.StockData;
import model.WatchList;
import util.MyUtil;

public class TestWatchListDAO {

	public static void main(String[] args) {
		StockData sd = new StockData();
		CompanyData cd=new CompanyData();
		
		
		cd.setCompanyCode("50007");
		cd.setCompanyName("Infy");
		cd.setCompanyStatus("Listed");
		CompanyDataDAO cdo=new CompanyDataDAOImpl();
		cdo.addCompany(cd);
		//CompanyData cd = cdo.getCompany("50007");
		System.out.println(cd.getCompanyCode()+"\t"+cd.getCompanyName());
		
		
		SeUser se = new SeUser();
		se.setUserName("diksha");
		se.setUserPassword("stock");
		se.setUserFullname("diksha jasuja");
		se.setUserPhone(new BigDecimal("9798369065"));
		se.setUserRole("Registered user");
		SeUserDAO seo=new SeUserDAOImpl();
		seo.addUser(se);
		//SeUser se = seo.getUser("diksha");
		
		
		
		sd.setHighestStockValue(new BigDecimal("2256.535"));
		sd.setLowestStockValue(new BigDecimal("10.5"));
		sd.setOpeningStockValue(new BigDecimal("20.89"));
		sd.setClosingStockValue(new BigDecimal("1123.56"));
		sd.setLastTradePrice(new BigDecimal("1234"));
		sd.setChangePercentage(new BigDecimal("5.7"));
		sd.setVolume(new BigDecimal("5.7"));
		sd.setMarket("abc");
		sd.setCompanyData(cd);
		cd.getStockData().add(sd);
		
		StockDataDAO sdo=new StockDataDAOImpl();
		sdo.addStockData(sd);
		sd=sdo.getStockData(cd);
		StockData li=sdo.getStockData(cd);
		
		//Iterator<StockData> it=li.iterator();
//		WatchListDAO wd= new WatchListDAOImpl();
//		 
//				//wd.addWatchList(wl);
//		while(it.hasNext())
//		{
//			WatchList wl=new WatchList();
//			 wl.setSeUser(se);
//			 wl.setStockData(it.next());
//			 se.getWatchLists().add(wl);
//			 sd.getWatchLists().add(wl);
//			 wd.addWatchList(wl);
//		}
		
		
		
	
	//CompanyDataDAO cdo=new CompanyDataDAOImpl();
		cd.getStockData().add(sd);
		
	   
		
		 WatchList wl=new WatchList();
		 wl.setSeUser(se);
		 wl.setStockData(sd);
		 se.getWatchLists().add(wl);
		 sd.getWatchLists().add(wl);

		WatchListDAO wd= new WatchListDAOImpl();
		 
		wd.addWatchList(wl);
		

		wd.deleteWatchList(se);
	
		 
		 MyUtil.commitSession();

	}

	

}
