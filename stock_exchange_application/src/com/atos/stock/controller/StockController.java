package com.atos.stock.controller;

import java.math.BigDecimal;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.atos.stock.model.CompanyData;
import com.atos.stock.model.SeUser;
import com.atos.stock.model.StockData;
import com.atos.stock.model.UserPortfolio;
import com.atos.stock.model.WatchList;
import com.atos.stock.services.CompanyDataService;
import com.atos.stock.services.FileReferenceService;
import com.atos.stock.services.SeUserService;
import com.atos.stock.services.StockDataService;
import com.atos.stock.services.UserPortfolioService;
import com.atos.stock.services.WatchListService;

@Controller
public class StockController {

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

	@Autowired
	private WatchListService watchListService;

	@RequestMapping(value = "/viewstock")
	public ModelAndView simpleDisplay(HttpServletRequest request){

		CompanyData cd=new CompanyData();
		cd=companyDataService.getCompany(request.getParameter("code"));
		ModelAndView mav=new ModelAndView();
		if(cd==null)
			mav=new ModelAndView("/");
		else
		{
			List<StockData> stocks=stockDataService.getStockData(cd);
			List<Object> li=new ArrayList<Object>();
			li.add(cd);
			li.add(stocks);
			cd.getCompanyName();
			cd.getCompanyCode();
			cd.getCompanyStatus();
			cd.getCompanySymbol();
			cd.getIndustrySector();
			cd.getIsin();
			mav=new ModelAndView("companyinformation","data",li); 



		}

		return mav;
	}
	@RequestMapping(value = "/addportfolio", method = RequestMethod.GET)
	public ModelAndView addPortfolio(HttpServletRequest request, HttpServletResponse response,HttpSession session){


		session=request.getSession();

		if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("true"))
		{
			List<StockData> li=null;
			//li=stockDataService.getStockData(companyDataService.getCompany(request.getParameter("id")));
			
			StockData stockData = (StockData) stockDataService.getStockData(Integer.parseInt(request.getParameter("id")));
			if(userPortfolioService.searchStock(stockData, (SeUser) session.getAttribute("user"))==null){
				UserPortfolio up = new UserPortfolio();
				up.setPortfolioDate(new Timestamp(new Date().getTime()));
				up.setStockData(stockData);
				up.setSeUser((SeUser) session.getAttribute("user"));
				up.setStockQuantity(new BigDecimal(1));
				userPortfolioService.addPortfolio(up);
			}
			
		}
		else
		{
			RedirectView view = new RedirectView("/login.html", true);
			//view.setExposeModelAttributes(false);
			//ModelAndView view=new ModelAndView("/login.html");
			view.addStaticAttribute("message", "Login First !");
			return new ModelAndView(view);
		}

		return new ModelAndView("redirect:portfolio.html");//,"msg","added");
	}

	@RequestMapping(value="/portfolio")
	public ModelAndView redirectPortfolio(HttpServletRequest request,HttpSession session)
	{
		session=request.getSession();

		if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("true"))
		{
			List<UserPortfolio> list=new ArrayList<UserPortfolio>();
			list=userPortfolioService.getStock((SeUser) session.getAttribute("user"));
			//System.out.println(list.get(0).getStockData().getCompanyData().getCompanyName());
			
				return new ModelAndView("portfolio","data",list);
			
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

	
	@RequestMapping(value="/watchlist")
	public ModelAndView redirectWatchlist(HttpServletRequest request,HttpSession session)
	{
		session=request.getSession();

		if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("true"))
		{
			SeUser se=(SeUser) session.getAttribute("user");
			System.out.println(se.getUserFullname());
			System.out.println("int cont");
			List<WatchList> list=watchListService.getStock(se);
			//System.out.println(list.get(0).getStockData().getCompanyData().getCompanyName());
			System.out.println(list.size());
			return new ModelAndView("watchlist","data",list);
			
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

	@RequestMapping(value = "/deleteport", method = RequestMethod.GET)
	public ModelAndView removePort(HttpServletRequest request, HttpServletResponse response,HttpSession session){

		session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("true"))
		{
			userPortfolioService.deletePortfolio(id);
			return new ModelAndView("redirect:portfolio.html");
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
	
	@RequestMapping(value = "/deletewatch", method = RequestMethod.GET)
	public ModelAndView removeWatch(HttpServletRequest request, HttpServletResponse response,HttpSession session){

		session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));

		if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("true"))
		{
			//watchListService.deleteWatchList((SeUser)session.getAttribute("user"));
			watchListService.deleteWatchList(id);
			return new ModelAndView("redirect:watchlist.html");
		}
		else
		{
			RedirectView view = new RedirectView("/login.html", true);
			view.addStaticAttribute("message", "Login First !");
			return new ModelAndView(view);
		}

	}



	@RequestMapping(value = "/addwatchlist", method = RequestMethod.GET)
	public ModelAndView addWatchlist(HttpServletRequest request, HttpServletResponse response,HttpSession session){


		session=request.getSession();

		if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("true"))
		{
			StockData stockData = (StockData) stockDataService.getStockData(Integer.parseInt(request.getParameter("id")));
			if(userPortfolioService.searchStock(stockData, (SeUser) session.getAttribute("user"))==null){
				WatchList wl=new WatchList();
				wl.setSeUser((SeUser) session.getAttribute("user") );
				wl.setStockData(stockData);
				watchListService.addWatchList(wl);
			}
		}
		else
		{
			RedirectView view = new RedirectView("/login.html", true);
			//view.setExposeModelAttributes(false);
			//ModelAndView view=new ModelAndView("/login.html");
			view.addStaticAttribute("message", "Login First !");
			return new ModelAndView(view);
		}
		return new ModelAndView("redirect:watchlist.html");//,"msg","added");

	}

	@RequestMapping(value = "/showstock", method = RequestMethod.GET)
	public ModelAndView showStockData(HttpServletRequest request, HttpServletResponse response){
		List<StockData> list = null;
		list=stockDataService.getAllStockData();

		return new ModelAndView("stocks","msg",list);

	}

}
