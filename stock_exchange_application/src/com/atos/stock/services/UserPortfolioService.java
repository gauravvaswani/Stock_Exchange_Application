package com.atos.stock.services;

import java.math.BigDecimal;
import java.util.List;

import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;

public interface UserPortfolioService {
	
	public void addPortfolio(UserPortfolio up);
	public void deletePortfolio(long up);
	public void deletePortfolio(StockData sid);
	public void deletePortfolio(SeUser uid);
	public boolean updateQuantity(StockData sid,SeUser uid,BigDecimal qty);
	public UserPortfolio searchStock(StockData sid,SeUser uid);
	List<UserPortfolio> getStock(SeUser uid);

}
