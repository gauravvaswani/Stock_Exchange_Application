package com.atos.stock.dao;

import java.util.List;

import com.atos.stock.model.CompanyData;

public interface CompanyDataDAO {
	
	public void addCompany(CompanyData cd);
	public CompanyData getCompany(String compnayCode);
	public boolean delistCompany(CompanyData cd);
	public List<CompanyData> getAllCompanies();
	
	
	

}
