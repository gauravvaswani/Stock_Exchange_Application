package com.atos.stock.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.dao.SeUserDAOImpl;
import com.atos.stock.dao.WatchListDAO;
import com.atos.stock.dao.WatchListDAOImpl;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;
import com.atos.stock.model.WatchList;

@Service("watchListService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class WatchListServiceImpl implements WatchListService{


	@Autowired
	private WatchListDAO watchListDAO;

	@Override
	public void addWatchList(WatchList wl) {
		// TODO Auto-generated method stub
		watchListDAO.addWatchList(wl);
	}

	@Override
	public void deleteWatchList(long watchlistId) {
		// TODO Auto-generated method stub

		watchListDAO.deleteWatchList(watchlistId);

	}

	@Override
	public void deleteWatchList(SeUser user) {
		// TODO Auto-generated method stub

		watchListDAO.deleteWatchList(user);

	}

	@Override
	public void deleteWatchList(StockData sd) {
		// TODO Auto-generated method stub
		watchListDAO.deleteWatchList(sd);

	}

	@Override
	public List<WatchList> getWatchList(SeUser seUser) {
		// TODO Auto-generated method stub
		return watchListDAO.getWatchList(seUser);
	}

	@Override
	public boolean searchForStock(StockData sd, SeUser seUser) {
		// TODO Auto-generated method stub
		return watchListDAO.searchForStock(sd,seUser);
	}

	@Override
	public List<WatchList> getStock(SeUser attribute) {
		// TODO Auto-generated method stub
		System.out.println("in Service");
		return watchListDAO.getStock(attribute);
	}



}
