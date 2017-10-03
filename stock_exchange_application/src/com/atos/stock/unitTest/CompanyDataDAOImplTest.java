package com.atos.stock.unitTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Test;

import com.atos.stock.dao.CompanyDataDAO;
import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.impl.CompanyDataDAOImpl;
import com.atos.stock.impl.SeUserDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.SeUser;
import com.atos.stock.utils.MyUtil;

public class CompanyDataDAOImplTest {

	@Test
	public void testAddCompany() {
//		fail("Not yet implemented");
		
		/*CompanyData cd=new CompanyData();
		cd.setCompanyCode("500014");
		cd.setCompanyName("Infy");
		cd.setCompanyStatus("Listed");
		cd.setCompanySymbol("INFYNEW");
		cd.setIndustrySector("IT");
		cd.setIsin("ISN123456");
		cd.setCompanyStatus("ACTIVE");
		cd.setCompanyQuantity(new BigDecimal(2345));
		CompanyDataDAO cdo=new CompanyDataDAOImpl();
		cdo.addCompany(cd);
		MyUtil.commitSession();
		assertEquals("500014", cdo.getCompany("500014").getCompanyCode());*/
		/*String csvFile = "companyList.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	
            while ((line = br.readLine()) != null) {
            	CompanyData cd=new CompanyData();
            	CompanyDataDAO cdo=new CompanyDataDAOImpl();
                // use comma as separator
            	 String[] company = line.split(cvsSplitBy);
                 // user.set
            	 cd.setCompanyCode(company[0]);
            	 cd.setCompanySymbol(company[1]);
            	 cd.setCompanyName(company[2]);
            	 cd.setIndustrySector(company[6]);
            	 cd.setIsin(company[5]);
            	 cd.setCompanyStatus(company[3]);
            	 cdo.addCompany(cd);
               //   System.out.println( company[0] + " " + company[1] + " "+ company[2]+" "+ company[3] + " " + company[5] + " " +company[6] );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
   	 MyUtil.commitSession();*/

		
	}

	@Test
	public void testGetCompany() {
		//fail("Not yet implemented");
		/*CompanyDataDAO cdo=new CompanyDataDAOImpl();
		assertEquals("500013", cdo.getCompany("500013").getCompanyCode());*/
		/*String csvFile = "companyList.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] company_code={"500002","500003","500008","500009","500010","500012","500013","500014","500020","500023"};
        int i=0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                CompanyDataDAO cd=new CompanyDataDAOImpl();
                
            	String[] company = line.split(cvsSplitBy);
            	CompanyData comp=cd.getCompany(company_code[i++]);
            	assertNotNull(comp);
            	
            //    System.out.println( company[0] + " " + company[1] + " "+ company[2]+" "+ company[3] + " " + company[5] + " " +company[6] );
            	
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/

	}

	@Test
	public void testDeleteCompany() {
		//fail("Not yet implemented");
	/*	CompanyDataDAO cdo=new CompanyDataDAOImpl();
		assertEquals(true, cdo.deleteCompany(cdo.getCompany("500209")));*/
        String csvFile = "Delist_company.csv";
        String line = "";
        String cvsSplitBy = ",";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	
            while ((line = br.readLine()) != null) {
                // use comma as separator
            	 String company = line;
                 // user.set
            	 String code=company;
            	 CompanyDataDAO cdo=new CompanyDataDAOImpl();
            	 boolean flag=cdo.deleteCompany(cdo.getCompany(code));
            	 assertEquals(true, flag);
                 
            	 //   System.out.println( company[0] + " " + company[1] + " "+ company[2]+" "+ company[3] + " " + company[5] + " " +company[6] );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
   	 MyUtil.commitSession();

        
     
	}
}
