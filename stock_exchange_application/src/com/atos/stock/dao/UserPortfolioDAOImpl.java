package com.atos.stock.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.atos.stock.dao.UserPortfolioDAO;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;


@Repository("userPortfolioDao")
public class UserPortfolioDAOImpl implements UserPortfolioDAO{


	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addPortfolio(UserPortfolio up) {
		Session session=sessionFactory.getCurrentSession();
		session.save(up);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deletePortfolio(long up) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from UserPortfolio u where u.idPortfolio=\'"+up+"\' ");
		Iterator<UserPortfolio> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean updateQuantity(StockData sid,SeUser uid,BigDecimal q) {
		Session session=sessionFactory.getCurrentSession();
		Query query = session.createQuery("update UserPortfolio u set stockQuantity="+q+" where seUser= "+uid.getUserId()+" and stockData="+sid.getStockId()+"");
		int  i = query.executeUpdate();
		System.out.println(i);
		return true;
	}

	@Override
	public UserPortfolio searchStock(StockData sid,SeUser uid) {
		Session session=sessionFactory.getCurrentSession();
		Query query = session.createQuery("from  UserPortfolio u where stockData="+sid.getStockId()+" and seUser="+uid.getUserId()+"");
		Iterator<UserPortfolio> it=query.iterate();
		while(it.hasNext())
		{

			return it.next();
		}

		return null;	

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deletePortfolio(StockData sid) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from UserPortfolio u where u.stockData="+sid.getStockId());
		Iterator<UserPortfolio> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}


	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deletePortfolio(SeUser uid) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from UserPortfolio u where u.seUser="+uid.getUserId());
		Iterator<UserPortfolio> it = query.iterate();
		while(it.hasNext())
		{
			session.delete(it.next());
		}


	}

	@Override
	public List<UserPortfolio> getStock(SeUser uid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from UserPortfolio u where u.seUser="+uid.getUserId());
		
		return query.list();
	}

}
