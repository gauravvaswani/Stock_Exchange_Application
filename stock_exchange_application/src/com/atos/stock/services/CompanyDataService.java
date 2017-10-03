package com.atos.stock.services;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.atos.stock.model.CompanyData;

public interface CompanyDataService {
	
	public void addCompany(CompanyData cd);
	public CompanyData getCompany(String compnayCode);
	public boolean delistCompany(CompanyData cd);
	void insertCompanyFromFile(FileReader fr) throws IOException;
	public List<CompanyData> getAllCompanies();
   
}
