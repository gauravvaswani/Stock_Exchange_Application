package com.atos.stock.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.StockDataDAO;
import com.atos.stock.dao.StockDataDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;

@Service("stockDataService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StockDataServiceImpl implements StockDataService{
	
	@Autowired
	private StockDataDAO stockDataDAO;
	
	@Autowired
	private CompanyDataDAO companyDataDao;

	@Override
	public void addStockData(StockData sd) {
		// TODO Auto-generated method stub
		
		stockDataDAO.addStockData(sd);
		
	}

	@Override
	public List<StockData> getAllStockData() {
		// TODO Auto-generated method stub
		return stockDataDAO.getAllStockData();
	}

	@Override
	public boolean updateStockData(CompanyData company, StockData sd) {
		// TODO Auto-generated method stub
		return stockDataDAO.updateStockData(company, sd);
	}

	@Override
	public List<StockData> getStockData(CompanyData company) {
		// TODO Auto-generated method stub
		return stockDataDAO.getStockData(company);
	}
	
	
	@Override 
	public void insertStockFromFile(FileReader fr) throws IOException
	{
		BufferedReader br=new BufferedReader(fr);
		String sCurrentLine;
		String prev="null";
		while ((sCurrentLine = br.readLine()) != null) {
			String stock[]=sCurrentLine.split(",");
			
			String companyCode=stock[0];
			CompanyData cd=companyDataDao.getCompany(companyCode);
			if(cd==null)
			{
				continue;
			}
			else
			{
				String market="NSE";
				BigDecimal close=new BigDecimal(stock[2]);
				BigDecimal high=new BigDecimal(stock[3]);
				BigDecimal low=new BigDecimal(stock[4]);
				BigDecimal open=new BigDecimal(stock[5]);
				BigDecimal volume=new BigDecimal(stock[6]);
				BigDecimal ltr=close;
				if(prev==companyCode)
					market="BSE";					
				prev=companyCode;
				
				StockData stock1=new StockData();
				stock1.setClosingStockValue(close);
				stock1.setCompanyData(cd);
				stock1.setHighestStockValue(high);
				stock1.setLowestStockValue(low);
				stock1.setOpeningStockValue(open);
				stock1.setLastTradePrice(ltr);
				stock1.setMarket(market);
				stock1.setVolume(volume);
				cd.getStockData().add(stock1);
				
				stockDataDAO.addStockData(stock1);
				
			}
		}
	}

	@Override
	public List<StockData> getTopStockData(String market) {
		// TODO Auto-generated method stub
		return stockDataDAO.getTopStockData(market);
	}

	@Override
	public List<StockData> getBottomStockData(String market) {
		// TODO Auto-generated method stub
		return stockDataDAO.getBottomStockData(market);
	}

	@Override
	public StockData getStockData(int parseInt) {
		// TODO Auto-generated method stub
		return stockDataDAO.getStockData(parseInt);
	}
	
	
	
	

}
