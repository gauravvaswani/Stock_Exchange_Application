package com.atos.stock.unitTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.dao.StockDataDAO;
import com.atos.stock.dao.WatchListDAO;
import com.atos.stock.impl.CompanyDataDAOImpl;
import com.atos.stock.impl.SeUserDAOImpl;
import com.atos.stock.impl.StockDataDAOImpl;
import com.atos.stock.impl.WatchListDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.WatchList;
import com.atos.stock.utils.MyUtil;

public class WatchListDAOImplTest {

	@Test
	public void testAddWatchList() {
/*
		String csvFile = "Watchlist.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] watch_list_info=line.split(",");
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData companyData=cdo.getCompany(watch_list_info[0]);
				
				StockDataDAO sd=new StockDataDAOImpl();
				StockData stock=sd.getStockData(companyData);
								
				SeUserDAO suo=new SeUserDAOImpl();
				SeUser user=suo.getUser(watch_list_info[1]);
				
				
				WatchList list=new WatchList();
				list.setSeUser(user);
				list.setStockData(stock);
				
				WatchListDAO list_dao=new WatchListDAOImpl();
				list_dao.addWatchList(list);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/

		
	}

	@Test
	public void testDeleteWatchListLong() {
	
/*		String csvFile = "watch_list_id.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				WatchListDAO wl=new WatchListDAOImpl();
				wl.deleteWatchList(new Long(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
	}

	@Test
	public void testDeleteWatchListSeUser() {
		
/*		String csvFile = "Watchlist.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] watch_list_info=line.split(",");
					
				SeUserDAO suo=new SeUserDAOImpl();
				SeUser user=suo.getUser(watch_list_info[1]);
		
				WatchListDAO list_dao=new WatchListDAOImpl();
				list_dao.deleteWatchList(user);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
		
	}

	@Test
	public void testDeleteWatchListStockData() {

/*		String csvFile = "Watchlist.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] watch_list_info=line.split(",");
				CompanyDataDAO cdo=new CompanyDataDAOImpl();
				CompanyData companyData=cdo.getCompany(watch_list_info[0]);
				
				StockDataDAO sd=new StockDataDAOImpl();
				StockData stock=sd.getStockData(companyData);
				
				WatchListDAO wl=new WatchListDAOImpl();
				wl.deleteWatchList(stock);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();

	*/	
	}

}
