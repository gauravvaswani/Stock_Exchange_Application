package com.atos.stock.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.*;
import com.atos.stock.dao.StockDataDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;
import com.atos.stock.utils.MyUtil;


@Repository("stockDataDAO")
public class StockDataDAOImpl implements StockDataDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addStockData(StockData sd) {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.getCurrentSession();
		session.save(sd);
		
	}
	
	
	public List<StockData> getStockData(CompanyData company) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StockData s where s.companyData=\'"+company.getCompanyCode()+"\'");
		List<StockData> li=query.list();
		System.out.println("called");
//		System.out.println(li);
		System.out.println("here");
		return li;
//		for(StockData sd:li){
//			System.out.println(sd.getStockId()+" "+sd.getCompanyData()+" "+sd.getClosingStockValue());
//		}
		//return null;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean updateStockData(CompanyData company,StockData sd) {
		// TODO Auto-generated method stub
//		Session session=sessionFactory.getCurrentSession();
//		
//		StockDataDAO sdd=new StockDataDAOImpl();
//		System.out.println(company.getCompanyCode());
//		System.out.println(sd.getHighestStockValue());
//		System.out.println(sd.getLowestStockValue());
//		System.out.println(sd.getLastTradePrice());
//		StockData sda=sdd.getStockData(company);
//		sda.setHighestStockValue(sd.getHighestStockValue());
//		sda.setLowestStockValue(sd.getLowestStockValue());
//		sda.setOpeningStockValue(sd.getOpeningStockValue());
//		sda.setClosingStockValue(sd.getClosingStockValue());
//		sda.setVolume(sd.getVolume());
//		
//		BigDecimal ltp=sdd.getStockData(company).getLastTradePrice();
//		System.out.println(ltp);
//		sda.setLastTradePrice(sd.getLastTradePrice());
//		BigDecimal cp=(sd.getLastTradePrice().subtract(ltp)).divide(new BigDecimal(100));
//		System.out.println(cp);
//		sda.setChangePercentage(cp);
//		session.saveOrUpdate(sda);
		
		return true;
	}

	
	@Override
	public List<StockData> getAllStockData() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StockData where companyData IS NOT NULL");
		return query.list();
	}
	
	@Override
	public List<StockData> getTopStockData(String market) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StockData where market='"+market+"' order by lastTradePrice desc");
		return query.list();
	}
	
	@Override
	public List<StockData> getBottomStockData(String market) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StockData where market='"+market+"' order by lastTradePrice asc");
		return query.list();
	}


	@Override
	public StockData getStockData(int parseInt) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StockData where stockId="+parseInt);
		return (StockData) query.list().get(0);
	}
	
	

}
