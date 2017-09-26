package com.atos.stock.impl;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.atos.stock.dao.*;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;
import com.atos.stock.utils.MyUtil;
public class StockDataDAOImpl implements StockDataDAO{

	@Override
	public void addStockData(StockData sd) {
		// TODO Auto-generated method stub
		
		Session session=MyUtil.getSession();
		session.save(sd);
		
		
	}

	@Override
	public StockData getStockData(CompanyData company) {
		// TODO Auto-generated method stub
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from StockData s where s.companyData=\'"+company.getCompanyCode()+"\'");
		List<StockData> li=query.list();
		
//		System.out.println(li);
		return li.get(0);
//		for(StockData sd:li){
//			System.out.println(sd.getStockId()+" "+sd.getCompanyData()+" "+sd.getClosingStockValue());
//		}
		//return null;
	}

	@Override
	public boolean updateStockData(CompanyData company,StockData sd) {
		// TODO Auto-generated method stub
		Session session=MyUtil.getSession();
		
		StockDataDAO sdd=new StockDataDAOImpl();
		System.out.println(company.getCompanyCode());
		System.out.println(sd.getHighestStockValue());
		System.out.println(sd.getLowestStockValue());
		System.out.println(sd.getLastTradePrice());
		StockData sda=sdd.getStockData(company);
		sda.setHighestStockValue(sd.getHighestStockValue());
		sda.setLowestStockValue(sd.getLowestStockValue());
		sda.setOpeningStockValue(sd.getOpeningStockValue());
		sda.setClosingStockValue(sd.getClosingStockValue());
		sda.setVolume(sd.getVolume());
		
		BigDecimal ltp=sdd.getStockData(company).getLastTradePrice();
		System.out.println(ltp);
		sda.setLastTradePrice(sd.getLastTradePrice());
		BigDecimal cp=(sd.getLastTradePrice().subtract(ltp)).divide(new BigDecimal(100));
		System.out.println(cp);
		sda.setChangePercentage(cp);
		session.saveOrUpdate(sda);
		
		return true;
	}

	@Override
	public List<StockData> getAllStockData() {
		// TODO Auto-generated method stub
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from StockData where companyData IS NOT NULL");
		return query.list();
	}

}
