package com.atos.stock.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.CompanyDataDAOImpl;
import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.dao.SeUserDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.StockData;


@Service("companyDataService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CompanyDataServiceImpl implements CompanyDataService{

	
	@Autowired
	private CompanyDataDAO companyDataDao=new CompanyDataDAOImpl();
	
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void addCompany(CompanyData cd) {
		// TODO Auto-generated method stub		
		companyDataDao.addCompany(cd);		
	}

	@Override
	public CompanyData getCompany(String compnayCode) {
		// TODO Auto-generated method stub
		
		return companyDataDao.getCompany(compnayCode);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean delistCompany(CompanyData cd) {
		// TODO Auto-generated method stub
		
		return companyDataDao.delistCompany(cd);
	}

	@Override
	public void insertCompanyFromFile(FileReader fr) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(fr);
		String sCurrentLine;
		String prev="null";
		while ((sCurrentLine = br.readLine()) != null) {
			String company[]=sCurrentLine.split(",");
			
			String companyCode=company[0];
			CompanyData cd=companyDataDao.getCompany(companyCode);
			if(cd==null)
			{
				continue;
			}
			String companySymbol=company[1];
			String companyName=company[2];
			String industrySector=company[6];
			String isin = company[5];
			String companyStatus = company[3];
			CompanyData companyData = new CompanyData();
			if(company[4]==null){
				 
				 companyData.setCompanyQuantity(new BigDecimal(Math.random() * (9999999 - 1)));
				}
//			BigDecimal close=new BigDecimal(stock[2]);
//			BigDecimal high=new BigDecimal(stock[3]);
//			BigDecimal low=new BigDecimal(stock[4]);
//			BigDecimal open=new BigDecimal(stock[5]);
//			BigDecimal volume=new BigDecimal(stock[6]);
//			BigDecimal ltr=close;
			
			
		    companyData.setCompanyCode(companyCode);
		    companyData.setCompanySymbol(companySymbol);
		    companyData.setCompanyName(companyName);
		    companyData.setIndustrySector(industrySector);
		    companyData.setIsin(isin);
		    
			
		    companyData.setCompanyStatus(companyStatus);
		    companyDataDao.addCompany(companyData);
           		
	}
	}

	@Override
	public List<CompanyData> getAllCompanies() {
		
		return companyDataDao.getAllCompanies();
	}
}
