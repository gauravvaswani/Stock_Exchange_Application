package com.atos.stock.dao;


import java.util.*;
import com.atos.stock.model.*;
import com.atos.stock.model.StockData;

public interface StockDataDAO {
	
	public void addStockData(StockData sd);
	public StockData getStockData(CompanyData company);
	public boolean updateStockData(CompanyData company,StockData sd);
	public List<StockData> getAllStockData();
}
