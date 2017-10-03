package com.atos.stock.dao;

import java.util.List;

import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;

public interface StockDataDAO {
	
	public void addStockData(StockData sd);

	List<StockData> getAllStockData();

	boolean updateStockData(CompanyData company, StockData sd);

	List<StockData> getStockData(CompanyData company);

	List<StockData> getTopStockData(String market);

	List<StockData> getBottomStockData(String market);

	public StockData getStockData(int parseInt);

}
