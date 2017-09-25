package com.atos.stock.impl;

import org.hibernate.Session;

import com.atos.stock.dao.*;
import com.atos.stock.model.StockData;
import com.atos.stock.utils.MyUtil;
public class StockDataDAOImpl implements StockDataDAO{

	@Override
	public void addStockData(StockData sd) {
		// TODO Auto-generated method stub
		
		Session session=MyUtil.getSession();
		session.save(sd);
		
	}

}
