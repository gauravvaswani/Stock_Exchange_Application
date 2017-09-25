package com.atos.stock.impl;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.utils.MyUtil;

public class CompanyDataDAOImpl implements CompanyDataDAO{

	@Override
	public void addCompany(CompanyData cd) {
		Session session=MyUtil.getSession();
		session.save(cd);
		
	}

	@Override
	public CompanyData getCompany(String companyCode) {
				System.out.println(companyCode);
		Session session=MyUtil.getSession();
		Query query=session.createQuery("from CompanyData s where s.companyCode=\'"+companyCode+"\'");
		Iterator<CompanyData> it=query.iterate();
		while(it.hasNext())
		{
			return it.next();
		}
		
		return null;	
	}

	@Override
	public boolean deleteCompany(CompanyData cd) {
		Session session=MyUtil.getSession();
		session.delete(cd);		
		return true;
	}

}
