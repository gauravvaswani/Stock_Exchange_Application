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

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.utils.MyUtil;


@Repository("companyDataDao")
public class CompanyDataDAOImpl implements CompanyDataDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addCompany(CompanyData cd) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(cd);
		
		
		
	}

	@Override
	public CompanyData getCompany(String companyCode) {
		// TODO Auto-generated method stub
		System.out.println(companyCode);
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from CompanyData s where s.companyCode=\'"+companyCode+"\'");
		List<CompanyData> li=query.list();
		if(li.size()!=0)
		{
			CompanyData c=li.get(0);
			return c;
		}
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public boolean delistCompany(CompanyData cd) {
		
		Session session=sessionFactory.getCurrentSession();
		List<SeUser> li=new ArrayList<SeUser>();
		Query query=session.createQuery("update CompanyData set companyStatus='Delisted' where companyCode=\'"+cd.getCompanyCode()+"\'");
		int i=query.executeUpdate();
		if(i==1)
			return true;
		else
			return false;
	}

	@Override
	public List<CompanyData> getAllCompanies() {
		
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from CompanyData");
		return query.list();
	}

}
