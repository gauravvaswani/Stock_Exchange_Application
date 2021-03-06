package dao;

import java.math.BigDecimal;

import model.SeUser;
import model.StockData;
import model.UserPortfolio;

public interface UserPortfolioDAO {
	public void addPortfolio(UserPortfolio up);
	public void deletePortfolio(long up);
	public void deletePortfolio(StockData sid);
	public void deletePortfolio(SeUser uid);
	public boolean updateQuantity(StockData sid,SeUser uid,BigDecimal qty);
	public UserPortfolio searchStock(StockData sid,SeUser uid);

	
	
	
}
