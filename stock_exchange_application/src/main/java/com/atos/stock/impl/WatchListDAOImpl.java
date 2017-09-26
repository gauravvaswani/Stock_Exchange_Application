package impl;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import dao.WatchListDAO;
import model.SeUser;
import model.StockData;
import model.WatchList;
import util.MyUtil;

public class WatchListDAOImpl implements WatchListDAO {

	@Override
	public void addWatchList(WatchList wl) {
		Session session=MyUtil.getSession();
		session.save(wl);
			
	}

	@Override
	public void deleteWatchList(long watchlistId) {
		Session session = MyUtil.getSession();
		Query query=session.createQuery("from WatchList w where w.watchlistId="+watchlistId);
		Iterator<WatchList> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}
		
		

	

	}

	@Override
	public void deleteWatchList(SeUser user) {
		// TODO Auto-generated method stub
		
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from WatchList where seUser="+user.getUserId());
		Iterator<WatchList> li=query.iterate();
		while(li.hasNext())
		{
			session.delete(li.next());
		}
		
	}

	@Override
	public void deleteWatchList(StockData sd) {
		// TODO Auto-generated method stub
		
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from WatchList where stockData="+sd.getStockId());
		Iterator<WatchList> li=query.iterate();
		while(li.hasNext())
		{
			session.delete(li.next());
		}
		
	}
}
