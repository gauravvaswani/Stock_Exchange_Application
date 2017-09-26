package impl;

import java.math.BigDecimal;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import dao.UserPortfolioDAO;
import model.SeUser;
import model.StockData;
import model.UserPortfolio;
import util.MyUtil;

public class UserPortfolioDAOImpl implements UserPortfolioDAO {

	@Override
	public void addPortfolio(UserPortfolio up) {
		Session session=MyUtil.getSession();
		session.save(up);
		
	}

	@Override
	public void deletePortfolio(long up) {
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from UserPortfolio u where u.portfolioId=\'"+up+"\' ");
		Iterator<UserPortfolio> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}
		
		
	}

	@Override
	public boolean updateQuantity(StockData sid,SeUser uid,BigDecimal q) {
		Session session=MyUtil.getSession();
		Query query = session.createQuery("update UserPortfolio u set stockQuantity="+q+" where seUser= "+uid.getUserId()+" and stockData="+sid.getStockId()+"");
		int  i = query.executeUpdate();
System.out.println(i);
return true;
	}

	@Override
	public UserPortfolio searchStock(StockData sid,SeUser uid) {
		Session session=MyUtil.getSession();
		Query query = session.createQuery("from  UserPortfolio u where stockData="+sid.getStockId()+" and seUser="+uid.getUserId()+"");
		Iterator<UserPortfolio> it=query.iterate();
		while(it.hasNext())
		{
			
			return it.next();
		}
		
		return null;	
		
	}

	@Override
	public void deletePortfolio(StockData sid) {
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from UserPortfolio u where u.stockData="+sid.getStockId());
		Iterator<UserPortfolio> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}
	
		
	}

	@Override
	public void deletePortfolio(SeUser uid) {
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from UserPortfolio u where u.seUser="+uid.getUserId());
		Iterator<UserPortfolio> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}
	
		
	}



}
