package com.atos.stock.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.StockDataDAO;
import com.atos.stock.impl.CompanyDataDAOImpl;
import com.atos.stock.impl.StockDataDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;
import com.atos.stock.utils.MyUtil;

public class TestStockData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		cd.setCompanyCode("500209");
//		cd.setCompanyName("INFOSYS");
//		cd.setCompanyQuantity(new BigDecimal(1000000));
//		cd.setCompanyStatus("ACTIVE");
//		cd.setCompanySymbol("INFY");
//		cd.setIndustrySector("SOFTWARE");
//		cd.setIsin("IN500209");
		
		/*CompanyData cd=new CompanyData();
		CompanyDataDAO cdo=new CompanyDataDAOImpl();
		cd=cdo.getCompany("500209");	
		StockData sd=new StockData();
		sd.setCompanyData(cd);

		sd.setHighestStockValue(new BigDecimal(907.5));
		sd.setLowestStockValue(new BigDecimal(894.30));
		sd.setOpeningStockValue(new BigDecimal(897.00));
		sd.setClosingStockValue(new BigDecimal(895.35));
		sd.setLastTradePrice(new BigDecimal(907.70));
		sd.setVolume(new BigDecimal(4544300));
		sd.setChangePercentage(new BigDecimal(12.75));
		cd.getStockData().add(sd);
		
		StockDataDAO sdd=new StockDataDAOImpl();
		sdd.addStockData(sd);*/
		
		
		//Get stock data of particular company using company code
		/*StockDataDAO std=new StockDataDAOImpl();
		CompanyData cd=new CompanyData();
		cd.setCompanyCode("500209");
		StockData sd=std.getStockData(cd);
		System.out.println(sd.getStockId()+" "+sd.getCompanyData().getCompanyCode()+" "+sd.getHighestStockValue()+" "+sd.getLowestStockValue()); */
		
		//Update the company data
		CompanyData cd=new CompanyData();
		CompanyDataDAO cdao=new CompanyDataDAOImpl();
		cd=cdao.getCompany("500209");
		System.out.println(cd.getCompanyName());
		//cd.setCompanyCode("500209");
		StockData sd=new StockData();
		sd.setHighestStockValue(new BigDecimal(917.5));
		sd.setLowestStockValue(new BigDecimal(904.30));
		sd.setOpeningStockValue(new BigDecimal(997.00));
		sd.setClosingStockValue(new BigDecimal(995.35));
		sd.setLastTradePrice(new BigDecimal(917.70));
		sd.setVolume(new BigDecimal(4544300));
		
		StockDataDAO sdao=new StockDataDAOImpl();
		sdao.updateStockData(cd, sd);
		
		//Get stock data of the all the companies
		/*StockDataDAO sd=new StockDataDAOImpl();
		List<StockData> list_of_stocks=sd.getAllStockData();
		for(StockData pp:list_of_stocks){
			System.out.println(pp.getStockId()+" "+pp.getCompanyData().getCompanyCode()+" "+pp.getHighestStockValue()+" "+ pp.getLowestStockValue()); 
		}*/
		MyUtil.commitSession();
		
		
		
	}

}
