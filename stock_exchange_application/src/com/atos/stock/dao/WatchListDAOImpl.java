package com.atos.stock.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.atos.stock.dao.WatchListDAO;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;
import com.atos.stock.model.WatchList;

@Repository("watchListDAO")
public class WatchListDAOImpl implements WatchListDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addWatchList(WatchList wl) {
		Session session=sessionFactory.getCurrentSession();
		session.save(wl);
			
	}

	@Override	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteWatchList(long watchlistId) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("here");
		Query query=session.createQuery("from WatchList w where w.watchlistId="+watchlistId);
		Iterator<WatchList> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}
	}
	
	@Override
	public List<WatchList> getWatchList(SeUser seUser)
	{
		List<WatchList> liw=new ArrayList<WatchList>();
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from WatchList w where w.seUser="+seUser.getUserId());
		return query.list();
	}

	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteWatchList(SeUser user) {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from WatchList where seUser="+user.getUserId());
		Iterator<WatchList> li=query.iterate();
		while(li.hasNext())
		{
			session.delete(li.next());
		}
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteWatchList(StockData sd) {
		// TODO Auto-generated method stub
		System.out.println("here");
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from WatchList where stockData="+sd.getStockId());
		Iterator<WatchList> li=query.iterate();
		while(li.hasNext())
		{
			session.delete(li.next());
		}
		
	}

	@Override
	public boolean searchForStock(StockData sd, SeUser seUser) {
		//List<WatchList> li=null;
		//li = getWatchList(seUser);
		//for (Iterator iterator = li.iterator(); iterator.hasNext();) {
		//	WatchList watchList = (WatchList) iterator.next();
		//	if(sd.getStockId()==watchList.getStockData().getStockId()){
		//		return true;
		//	}
			
		//}
		
		Query query=sessionFactory.getCurrentSession().createQuery("from WatchList where stockData="+sd.getStockId()+" and seUser="+seUser.getUserId());
		if(query.list().size()>0)
			return true;
		else
			return false;
	}

	@Override
	public List<WatchList> getStock(SeUser attribute) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from WatchList u where u.seUser="+attribute.getUserId());
		
		return query.list();
	}

}
