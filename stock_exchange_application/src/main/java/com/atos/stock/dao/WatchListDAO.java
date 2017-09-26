package dao;

import model.SeUser;
import model.StockData;
import model.WatchList;

public interface WatchListDAO {
	public void addWatchList(WatchList wl);
	public void deleteWatchList(long watchlistId);
	public void deleteWatchList(SeUser user);
	public void deleteWatchList(StockData sd);
	
}
