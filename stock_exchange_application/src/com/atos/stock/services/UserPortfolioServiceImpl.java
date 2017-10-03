package com.atos.stock.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.UserPortfolioDAO;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;

@Service("userPortfolioService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserPortfolioServiceImpl implements UserPortfolioService {

	@Autowired
	private UserPortfolioDAO userPortfolioDao;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void addPortfolio(UserPortfolio up) {
		// TODO Auto-generated method stub
		userPortfolioDao.addPortfolio(up);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void deletePortfolio(long up) {
		// TODO Auto-generated method stub
		userPortfolioDao.deletePortfolio(up);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void deletePortfolio(StockData sid) {
		// TODO Auto-generated method stub
		userPortfolioDao.deletePortfolio(sid);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void deletePortfolio(SeUser uid) {
		// TODO Auto-generated method stub
		userPortfolioDao.deletePortfolio(uid);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean updateQuantity(StockData sid, SeUser uid, BigDecimal qty) {
		// TODO Auto-generated method stub
		return userPortfolioDao.updateQuantity(sid, uid, qty);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public UserPortfolio searchStock(StockData sid, SeUser uid) {
		// TODO Auto-generated method stub
		return userPortfolioDao.searchStock(sid, uid);
	}

	@Override
	public List<UserPortfolio> getStock(SeUser uid) {
		// TODO Auto-generated method stub
		return userPortfolioDao.getStock(uid);
	}
}
