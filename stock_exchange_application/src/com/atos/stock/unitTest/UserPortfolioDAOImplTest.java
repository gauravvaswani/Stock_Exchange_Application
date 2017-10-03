package com.atos.stock.unitTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.dao.StockDataDAO;
import com.atos.stock.dao.UserPortfolioDAO;
import com.atos.stock.impl.CompanyDataDAOImpl;
import com.atos.stock.impl.SeUserDAOImpl;
import com.atos.stock.impl.StockDataDAOImpl;
import com.atos.stock.impl.UserPortfolioDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;
import com.atos.stock.utils.MyUtil;

public class UserPortfolioDAOImplTest {

	@Test
	public void testAddPortfolio() {
		
/*		String csvFile = "Portfolio.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] portfolio_info=line.split(",");
				SeUserDAO sdo=new SeUserDAOImpl();
				SeUser user=sdo.getUser(portfolio_info[0]);
				
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData comp=cdo.getCompany(portfolio_info[1]);
				
				StockData sd=new StockData();
				StockDataDAO stock=new StockDataDAOImpl();
				sd=stock.getStockData(comp);
				
				UserPortfolio up=new UserPortfolio();
				up.setSeUser(user);
				up.setStockData(sd);
				up.setStockQuantity(new BigDecimal(portfolio_info[2]));
				up.setPortfolioData(new Timestamp(new Date().getTime()));
				UserPortfolioDAO ud = new UserPortfolioDAOImpl();
				ud.addPortfolio(up);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/


	}

	@Test
	public void testDeletePortfolioLong() {
		
	/*	String csvFile = "Portfolio_Id.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				
				UserPortfolioDAO ud = new UserPortfolioDAOImpl();
				ud.deletePortfolio(new Long(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
		
		
	}

	@Test
	public void testUpdateQuantity() {
	
/*		String csvFile = "Portfolio.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] portfolio_info=line.split(",");
				SeUserDAO sdo=new SeUserDAOImpl();
				SeUser user=sdo.getUser(portfolio_info[0]);
				
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData comp=cdo.getCompany(portfolio_info[1]);
				
				StockData sd=new StockData();
				StockDataDAO stock=new StockDataDAOImpl();
				sd=stock.getStockData(comp);
				
				UserPortfolioDAO ud = new UserPortfolioDAOImpl();
				assertEquals(true,ud.updateQuantity(sd, user, new BigDecimal(portfolio_info[2])));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
		
	}

	@Test
	public void testSearchStock() {
			
/*		String csvFile = "Portfolio.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] portfolio_info=line.split(",");
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData comp=cdo.getCompany(portfolio_info[1]);
				
				StockDataDAO sdo=new StockDataDAOImpl();
				StockData sd= sdo.getStockData(comp);
				
				SeUserDAO udo=new SeUserDAOImpl();
				SeUser se=udo.getUser(portfolio_info[0]);
				UserPortfolioDAO up=new UserPortfolioDAOImpl();
				assertNotNull(up.searchStock(sd, se));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
	}

	@Test
	public void testDeletePortfolioStockData() {
		//fail("Not yet implemented");
/*	CompanyDataDAO cd=new CompanyDataDAOImpl();
		CompanyData comp=cd.getCompany("500012");
		
		StockDataDAO sd=new StockDataDAOImpl();
		
		UserPortfolioDAO upd= new UserPortfolioDAOImpl();
		upd.deletePortfolio(sd.getStockData(comp));
		MyUtil.commitSession();*/
/*		String csvFile = "Portfolio.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] portfolio_info=line.split(",");
								
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData comp=cdo.getCompany(portfolio_info[1]);
				
				StockData sd=new StockData();
				StockDataDAO stock=new StockDataDAOImpl();
				sd=stock.getStockData(comp);
				
				UserPortfolioDAO ud = new UserPortfolioDAOImpl();
				ud.deletePortfolio(sd);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
		
	}

	@Test
	public void testDeletePortfolioSeUser() {

/*		String csvFile = "Portfolio.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] portfolio_info=line.split(",");
				SeUserDAO sdo=new SeUserDAOImpl();
				SeUser user=sdo.getUser(portfolio_info[0]);
				
				UserPortfolioDAO ud = new UserPortfolioDAOImpl();
				ud.deletePortfolio(user);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();
	}*/
	}
}
