package com.atos.stock.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.atos.stock.dao.StockDataDAO;
import com.atos.stock.dao.StockDataDAOImpl;
import com.atos.stock.model.CompanyData;
import com.atos.stock.model.FileReference;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;
import com.atos.stock.services.CompanyDataService;
import com.atos.stock.services.FileReferenceService;
import com.atos.stock.services.SeUserService;
import com.atos.stock.services.StockDataService;
import com.atos.stock.services.UserPortfolioService;

@Controller
@RequestMapping("/")
public class CompanyController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private CompanyDataService companyDataService;
	
	@Autowired
	private StockDataService stockDataService;
	
	@Autowired
	private FileReferenceService fileReferenceService;
	
	@Autowired
	private SeUserService seUserService;
	
	@Autowired
	private UserPortfolioService userPortfolioService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	  public String index()
	  {
	    return "index";
	  }

	@RequestMapping(value="/index")
	public ModelAndView indexRed()
	{
		ModelAndView mav;
		List<Object> li=new ArrayList<Object>();
		li.add(stockDataService.getTopStockData("BSE"));
		li.add(stockDataService.getTopStockData("NSE"));
		li.add(stockDataService.getBottomStockData("BSE"));
		li.add(stockDataService.getBottomStockData("NSE"));
		
		return new ModelAndView("index","data",li);
		
	}
	@RequestMapping(value ="/getcompanydata")
	public ModelAndView simpleDisplay1(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = null;
		CompanyData cd=new CompanyData();
		cd.setCompanyCode(request.getParameter("addCompanyCode"));
		cd.setCompanySymbol(request.getParameter("addCompanySymbol"));
		cd.setCompanyName(request.getParameter("addCompanyName"));
		cd.setCompanyQuantity(new BigDecimal(request.getParameter("addCompanyQuantity")));
		cd.setCompanyStatus("Active");
		cd.setIndustrySector(request.getParameter("addCompanyIndustry"));
		cd.setIsin(request.getParameter("addCompanyISIN"));
		companyDataService.addCompany(cd);
		mav = new ModelAndView("redirect:companies.html");

		//mav.addObject("msg","company added successfully");
		
		return mav;


	}
	@RequestMapping(value = "/listcompany", method = RequestMethod.GET)
	public ModelAndView simpleDisplay2(){
		List<CompanyData> list= null;
		CompanyData cd1=new CompanyData();
		list=companyDataService.getAllCompanies();
		return new ModelAndView("company","msg11",list);
	}
	
	@RequestMapping("/companies")
	public ModelAndView getCompanies(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		session=request.getSession();

		if(session.getAttribute("isLoggedIn")==null)
		{
			RedirectView view = new RedirectView("/login.html", true);
			//view.setExposeModelAttributes(false);
			//ModelAndView view=new ModelAndView("/login.html");
			//view.addStaticAttribute("message", "Username or Password is wrong!!");
			return new ModelAndView(view);
		}
		else if(session.getAttribute("isLoggedIn").equals("trueadmin"))
		{
			List<CompanyData> li=companyDataService.getAllCompanies();
			
			return new ModelAndView("company","company",li);
		}

		RedirectView view = new RedirectView("/login.html", true);
		//view.setExposeModelAttributes(false);
		//ModelAndView view=new ModelAndView("/login.html");
		//view.addStaticAttribute("message", "Username or Password is wrong!!");
		return new ModelAndView(view);

	}

	@RequestMapping(value = "/delist", method = RequestMethod.GET)
	public ModelAndView editEmployee(HttpServletRequest request, HttpServletResponse response){
		List<CompanyData> list=null;
		String Code=request.getParameter("id");
		companyDataService.delistCompany(companyDataService.getCompany(Code));
		list=companyDataService.getAllCompanies();
		return new ModelAndView("company","company",list);
	}
	
	
	@RequestMapping(value = "/companydata", method = RequestMethod.GET)
	public ModelAndView simpleDisplay(){		
		return new ModelAndView("addCompanyData");
	}
	

	@RequestMapping(value = "/files", method = RequestMethod.GET)
	public ModelAndView companiesDisplay(HttpServletRequest request,HttpServletResponse response, HttpSession session){
		
		if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("trueadmin"))
		{
			List<FileReference> li=new ArrayList<FileReference>();
			li=fileReferenceService.getFiles();
			
			//List<StockData> s=stockDataService.getAllStockData();
			//System.out.println(s.get(0).getMarket());
			return new ModelAndView("filesdata","files",li);
		}
		else
		{
			RedirectView view = new RedirectView("/login.html", true);
			//view.setExposeModelAttributes(false);
			//ModelAndView view=new ModelAndView("/login.html");
			view.addStaticAttribute("message", "Login First !");
			return new ModelAndView(view);
		}
		
	}
	
	@Transactional
	@RequestMapping(value = "/uploadstock")
	public ModelAndView uploadStock(@RequestParam CommonsMultipartFile file, HttpSession session){
		
		String path=session.getServletContext().getRealPath("/");  
		String filename=file.getOriginalFilename();   
		try{  
			byte stocks[]=file.getBytes();  
			FileReference filereference=new FileReference();
			filereference.setFileData(stocks);
			filereference.setFileName(filename);
			filereference.setFileProcessingDate(new Timestamp(new Date().getTime()));
			fileReferenceService.addFileReference(filereference);

			String stockData = new String(stocks);
			String[] rows = stockData.split("\n");
			String prev=null;
			int flag=0;
			String prevcom="";
			int count=0;
			for(int i=0;i<rows.length;i++)
			{
				String stock[]=rows[i].split(",");
				
				String companyCode=stock[0];
				System.out.println(companyCode);
				CompanyData cd=companyDataService.getCompany(companyCode);
				if(cd==null)
				{
					continue;
				}
				else
				{
					
					//StockDataDAO sdd=new StockDataDAOImpl();
					
					List<StockData> li=stockDataService.getStockData(cd);
					prev=null;
					//System.out.println(li.size());
					if(li.size()!=0)
					{
						if(li.size()==1 && !prevcom.equals(cd.getCompanyCode()))
						{		
							
							StockData s=li.get(0);
							s.setCompanyData(cd);
							BigDecimal close=new BigDecimal(stock[2]);
							s.setClosingStockValue(close);
							System.out.println(stock[2]);
							BigDecimal high=new BigDecimal(stock[3]);
							System.out.println(stock[3]);
							s.setHighestStockValue(high);
							BigDecimal low=new BigDecimal(stock[4]);
							System.out.println(stock[4]);
							s.setLowestStockValue(low);
							BigDecimal open=new BigDecimal(stock[5]);
							System.out.println(stock[5]);
							s.setOpeningStockValue(open);
							System.out.println(stock[6]);
							BigDecimal volume=new BigDecimal(Double.parseDouble(stock[6]));
							s.setVolume(volume);
							System.out.println(stock[6]);
							BigDecimal ltr=close;
							System.out.println(ltr);
							s.setMarket("NSE");
							BigDecimal ltp=s.getLastTradePrice();
							System.out.println(ltp);
							s.setLastTradePrice(ltr);
							BigDecimal cp=(ltr.subtract(ltp)).divide(new BigDecimal(100));
							System.out.println(cp);
							s.setChangePercentage(cp);
							sessionFactory.getCurrentSession().saveOrUpdate(s);							
						}
						if(li.size()==1 && prevcom.equals(cd.getCompanyCode()))
						{
							System.out.println("aata Ithe");
														
								StockData s=new StockData();
								s.setCompanyData(cd);
								BigDecimal close=new BigDecimal(stock[2]);
								s.setClosingStockValue(close);
								System.out.println(stock[2]);
								BigDecimal high=new BigDecimal(stock[3]);
								System.out.println(stock[3]);
								s.setHighestStockValue(high);
								BigDecimal low=new BigDecimal(stock[4]);
								System.out.println(stock[4]);
								s.setLowestStockValue(low);
								BigDecimal open=new BigDecimal(stock[5]);
								System.out.println(stock[5]);
								s.setOpeningStockValue(open);
								System.out.println(stock[6]);
								BigDecimal volume=new BigDecimal(Double.parseDouble(stock[6]));
								s.setVolume(volume);
								System.out.println(stock[6]);
								BigDecimal ltr=close;
								System.out.println(ltr);
								s.setMarket("NSE");
								s.setLastTradePrice(ltr);
								sessionFactory.getCurrentSession().saveOrUpdate(s);							
							
						}
						
						if(li.size()==2)
						{
							if(flag==0)
							{
							
								StockData s=li.get(0);
								s.setCompanyData(cd);
								BigDecimal close=new BigDecimal(stock[2]);
								s.setClosingStockValue(close);
								System.out.println(stock[2]);
								BigDecimal high=new BigDecimal(stock[3]);
								System.out.println(stock[3]);
								s.setHighestStockValue(high);
								BigDecimal low=new BigDecimal(stock[4]);
								System.out.println(stock[4]);
								s.setLowestStockValue(low);
								BigDecimal open=new BigDecimal(stock[5]);
								System.out.println(stock[5]);
								s.setOpeningStockValue(open);
								System.out.println(stock[6]);
								BigDecimal volume=new BigDecimal(Double.parseDouble(stock[6]));
								s.setVolume(volume);
								System.out.println(stock[6]);
								BigDecimal ltr=close;
								System.out.println(ltr);
								s.setMarket("BSE");
								BigDecimal ltp=s.getLastTradePrice();
								System.out.println(ltp);
								s.setLastTradePrice(ltr);
								BigDecimal cp=(ltr.subtract(ltp)).divide(new BigDecimal(100));
								System.out.println(cp);
								s.setChangePercentage(cp);
								sessionFactory.getCurrentSession().saveOrUpdate(s);		
								flag=1;
							}
							else
							{
								StockData s=li.get(1);
								s.setCompanyData(cd);
								BigDecimal close=new BigDecimal(stock[2]);
								s.setClosingStockValue(close);
								System.out.println(stock[2]);
								BigDecimal high=new BigDecimal(stock[3]);
								System.out.println(stock[3]);
								s.setHighestStockValue(high);
								BigDecimal low=new BigDecimal(stock[4]);
								System.out.println(stock[4]);
								s.setLowestStockValue(low);
								BigDecimal open=new BigDecimal(stock[5]);
								System.out.println(stock[5]);
								s.setOpeningStockValue(open);
								System.out.println(stock[6]);
								BigDecimal volume=new BigDecimal(Double.parseDouble(stock[6]));
								s.setVolume(volume);
								System.out.println(stock[6]);
								BigDecimal ltr=close;
								System.out.println(ltr);
								s.setMarket("NSE");
								BigDecimal ltp=s.getLastTradePrice();
								System.out.println(ltp);
								s.setLastTradePrice(ltr);
								BigDecimal cp=(ltr.subtract(ltp)).divide(new BigDecimal(100));
								System.out.println(cp);
								s.setChangePercentage(cp);
								sessionFactory.getCurrentSession().saveOrUpdate(s);
								flag=0;
							}
						}
					}
					else
					{
						StockData s=new StockData();
						s.setCompanyData(cd);
						BigDecimal close=new BigDecimal(stock[2]);
						s.setClosingStockValue(close);
						System.out.println(stock[2]);
						BigDecimal high=new BigDecimal(stock[3]);
						System.out.println(stock[3]);
						s.setHighestStockValue(high);
						BigDecimal low=new BigDecimal(stock[4]);
						System.out.println(stock[4]);
						s.setLowestStockValue(low);
						BigDecimal open=new BigDecimal(stock[5]);
						System.out.println(stock[5]);
						s.setOpeningStockValue(open);
						System.out.println(stock[6]);
						BigDecimal volume=new BigDecimal(Double.parseDouble(stock[6]));
						s.setVolume(volume);
						System.out.println(stock[6]);
						BigDecimal ltr=close;
						System.out.println(ltr);
						System.out.println(prev);
						if(prev==null || prev=="NSE")
						{
							s.setMarket("BSE");
							prev="BSE";
						}
//						else
//						{
//							
//								s.setMarket("NSE");
//								prev=null;
//							
//						}
						prevcom=cd.getCompanyCode();	
						s.setLastTradePrice(ltr);
						sessionFactory.getCurrentSession().saveOrUpdate(s);
						flag=0;
					}
					
				}
			}

		}catch(Exception e)
		{
			System.out.println(e);
		}  


        
        return new ModelAndView("redirect:showstock.html");
		
	}

	@Transactional
	@RequestMapping(value = "/uploadcompanydata")
	public ModelAndView uploadCompany(@RequestParam CommonsMultipartFile filedata, HttpSession session) throws URISyntaxException{
		
		String path=session.getServletContext().getRealPath("/");  
		String filename=filedata.getOriginalFilename();   
		try{  
			byte companies[]=filedata.getBytes();  
			String completeData = new String(companies);
			String[] rows = completeData.split("\n");
			for(int i=0;i<rows.length;i++)
			{
				String company[]=rows[i].split(",");

				String companyCode=company[0];
				CompanyData cd=companyDataService.getCompany(companyCode);
				if(cd==null)
				{

					String companySymbol=company[1];
					String companyName=company[2];
					String industrySector=company[6];
					String isin = company[5];
					String companyStatus = company[3];
					CompanyData companyData = new CompanyData();
					
						companyData.setCompanyQuantity(new BigDecimal(Math.random() * (9999999 - 1)));
					
					companyData.setCompanyCode(companyCode);
					companyData.setCompanySymbol(companySymbol);
					companyData.setCompanyName(companyName);
					companyData.setIndustrySector(industrySector);
					companyData.setIsin(isin);    

					companyData.setCompanyStatus(companyStatus);
					sessionFactory.getCurrentSession().save(companyData);
					// companyDataService.addCompany(companyData);
				}

			}

		}catch(Exception e)
		{
			System.out.println(e);
		}  


		return new ModelAndView("redirect:companies.html");

	}


}
