package com.atos.stock.services;

import java.util.List;

import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;
import com.atos.stock.model.WatchList;

public interface WatchListService {
	
	public void addWatchList(WatchList wl);
	public void deleteWatchList(long watchlistId);
	public void deleteWatchList(SeUser user);
	public void deleteWatchList(StockData sd);
	List<WatchList> getWatchList(SeUser seUser);
	public boolean searchForStock(StockData sd,SeUser seUser);
	public List<WatchList> getStock(SeUser attribute);

}
