package com.atos.stock.services;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;


public interface StockDataService {
	
	public void addStockData(StockData sd);

	List<StockData> getAllStockData();

	boolean updateStockData(CompanyData company, StockData sd);

	List<StockData> getStockData(CompanyData company);

	void insertStockFromFile(FileReader fr) throws IOException;
	
	List<StockData> getTopStockData(String market);

	List<StockData> getBottomStockData(String market);

	public StockData getStockData(int parseInt);

}
