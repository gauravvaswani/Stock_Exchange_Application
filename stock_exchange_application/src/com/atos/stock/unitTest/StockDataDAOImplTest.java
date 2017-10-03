package com.atos.stock.unitTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Test;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.StockDataDAO;
import com.atos.stock.impl.CompanyDataDAOImpl;
import com.atos.stock.impl.StockDataDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;
import com.atos.stock.utils.MyUtil;

public class StockDataDAOImplTest {

	@Test
	public void testAddStockData() {
	
	/*	String csvFile = "stock_data.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] stock_info = line.split(cvsSplitBy);
						
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData comp=cdo.getCompany(stock_info[0]);
				
				StockData st=new StockData();
				st.setCompanyData(comp);
				st.setHighestStockValue(new BigDecimal(stock_info[1]));
				st.setLowestStockValue(new BigDecimal(stock_info[2]));
				st.setOpeningStockValue(new BigDecimal(stock_info[3]));
				st.setClosingStockValue(new BigDecimal(stock_info[4]));
				st.setLastTradePrice(new BigDecimal(stock_info[5]));
				st.setVolume(new BigDecimal(stock_info[6]));
				st.setChangePercentage(new BigDecimal(stock_info[7]));
				st.setMarket(stock_info[8]);
				StockDataDAO sd=new StockDataDAOImpl();
				comp.getStockData().add(st);
				
				StockDataDAO sdo=new StockDataDAOImpl();
				sdo.addStockData(st);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();
*/		
	}

	@Test
	public void testGetStockData() {

		
/*		String csvFile = "Get_Stock_Data.csv";
		String line = "";
		String cvsSplitBy = ",";
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				String comp=line;
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData cd=cdo.getCompany(comp);
				StockDataDAO sdo=new StockDataDAOImpl();
				assertNotNull(sdo.getStockData(cd));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
*/		
		
		
	}

	@Test
	public void testUpdateStockData() {
			
/*		String csvFile = "stock_data.csv";
		String line = "";
		String cvsSplitBy = ",";
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				String[] stock_info=line.split(",");
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData comp=cdo.getCompany(stock_info[0]);
				
				StockData st=new StockData();
				st.setCompanyData(comp);
				st.setHighestStockValue(new BigDecimal(stock_info[1]));
				st.setLowestStockValue(new BigDecimal(stock_info[2]));
				st.setOpeningStockValue(new BigDecimal(stock_info[3]));
				st.setClosingStockValue(new BigDecimal(stock_info[4]));
				st.setLastTradePrice(new BigDecimal(stock_info[5]));
				st.setVolume(new BigDecimal(stock_info[6]));
				st.setChangePercentage(new BigDecimal(stock_info[7]));
				st.setMarket(stock_info[8]);
				StockDataDAO sd=new StockDataDAOImpl();
				
				assertEquals(true,sd.updateStockData(comp, st));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
	}

	@Test
	public void testGetAllStockData() {
	
	/*	
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				StockDataDAO sdo=new StockDataDAOImpl();
				assertNotNull(sdo.getAllStockData());
	*/		
		
		
	}
}


