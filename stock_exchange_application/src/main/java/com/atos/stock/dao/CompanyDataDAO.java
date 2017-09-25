package com.atos.stock.dao;

import com.atos.stock.model.CompanyData;

public interface CompanyDataDAO {
	
	public void addCompany(CompanyData cd);
	public CompanyData getCompany(String compnayCode);
	public boolean deleteCompany(CompanyData cd);
	
	

}
