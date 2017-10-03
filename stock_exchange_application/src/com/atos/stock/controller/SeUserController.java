package com.atos.stock.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.dao.SeUserDAOImpl;
import com.atos.stock.model.SeUser;
import com.atos.stock.services.CompanyDataService;
import com.atos.stock.services.SeUserService;
import com.atos.stock.utils.MyUtil;
import com.atos.stock.utils.ResetMail;

@Controller
public class SeUserController {

	@Autowired
	private SeUserService seUserService;

	//private HttpSession httpSession; 

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView loginPage(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		//request.getSession().setAttribute("user",new SeUser());
		session=request.getSession();
		System.out.println(session.getId());

		if(session.getAttribute("isLoggedIn")==null)
		{

			ModelAndView mav = new ModelAndView("loginpage");
			return mav;
		}
		else
		{
			RedirectView view = new RedirectView("/userdashboard.html", true);
			return new ModelAndView(view);	
		}

	}

	@RequestMapping(value="/validate",method = RequestMethod.POST)
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response,HttpSession httpSession)
	{
		httpSession=request.getSession();
		ModelAndView mav = null;
		if(httpSession.getAttribute("isLoggedIn")!=null && httpSession.getAttribute("isLoggedIn").equals("true"))
		{
			System.out.println("herejhg");
			return new ModelAndView("userdashboard");
		}

		if (seUserService.checkUser(request.getParameter("customerName"), request.getParameter("customerPwd"))) {
			
			System.out.println("hereskjdkjjhg");
			//RedirectView view = new RedirectView("/userdashboard.html", true);
			mav= new ModelAndView("userdashboard");
			//mav = new ModelAndView("userdashboard");	    
			//httpSession=request.getSession(true);
			SeUser s=seUserService.getUser(request.getParameter("customerName"));
			httpSession.setAttribute("user",s);
			httpSession.setAttribute("isLoggedIn", "true");
			if(s.getUserRole().equals("ADMIN"))
			{
				httpSession.setAttribute("isLoggedIn", "trueadmin");
				return new ModelAndView("redirect:files.html");
			}
			
			return mav;

		} 
		else 
		{
			System.out.println("herejhsldkok324g");
			RedirectView view = new RedirectView("/login.html", true);
			//view.setExposeModelAttributes(false);
			//ModelAndView view=new ModelAndView("/login.html");
			view.addStaticAttribute("message", "Username or Password is wrong!!");
			return new ModelAndView(view);// new ModelAndView("loginpage","message","Username or password is wrong !");

		}	
	}
	
	
	
	
	
	@RequestMapping("/admindashboard")
	public ModelAndView dashboardAdmin(HttpServletRequest request,HttpServletResponse response,HttpSession session)
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
			
			return new ModelAndView("admindashboard");
		}

		RedirectView view = new RedirectView("/login.html", true);
		//view.setExposeModelAttributes(false);
		//ModelAndView view=new ModelAndView("/login.html");
		//view.addStaticAttribute("message", "Username or Password is wrong!!");
		return new ModelAndView(view);

	}
	
	@RequestMapping("/users")
	public ModelAndView allUsers(HttpServletRequest request,HttpServletResponse response,HttpSession session)
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
			List<SeUser> li=seUserService.getAllUsers();
			return new ModelAndView("userdata","data",li);
		}

		RedirectView view = new RedirectView("/login.html", true);
		//view.setExposeModelAttributes(false);
		//ModelAndView view=new ModelAndView("/login.html");
		//view.addStaticAttribute("message", "Username or Password is wrong!!");
		return new ModelAndView(view);

	}
		
	
	@RequestMapping("/userdashboard")
	public ModelAndView dashboardUser(HttpServletRequest request,HttpServletResponse response,HttpSession session)
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
		else if(session.getAttribute("isLoggedIn").equals("true"))
		{
			
			return new ModelAndView("userdashboard");
		}

		RedirectView view = new RedirectView("/login.html", true);
		//view.setExposeModelAttributes(false);
		//ModelAndView view=new ModelAndView("/login.html");
		//view.addStaticAttribute("message", "Username or Password is wrong!!");
		return new ModelAndView(view);

	}

	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession )
	{
		httpSession=request.getSession();
		if(httpSession.getAttribute("isLoggedIn")!=null && httpSession.getAttribute("isLoggedIn").equals("true"))
		{
			RedirectView view = new RedirectView("/userdashboard.html", true);
			return new ModelAndView(view);			
		}

		ModelAndView mav = null;
		SeUserDAO sdo=new SeUserDAOImpl();
		SeUser s=new SeUser();
		s.setUserName(request.getParameter("customerEmail"));
		s.setUserPassword(request.getParameter("customerPwd"));
		s.setUserFullname(request.getParameter("customerName"));
		s.setUserPhone(new BigDecimal(request.getParameter("customerMobile")));
		s.setUserStatus("UNVERIFIED");
		s.setUserRole("USER");
		seUserService.addUser(s);

		RedirectView view = new RedirectView("/login.html", true);
		mav= new ModelAndView(view);
		mav.addObject("registerMessage", "Registration Successfull !");
		return mav;  
	}

	@RequestMapping("/forgotpassword")
	public ModelAndView forgot(HttpServletRequest request, HttpServletResponse response,HttpSession httpSession)
	{
		httpSession=request.getSession();
		if(httpSession.getAttribute("isLoggedIn")!=null && httpSession.getAttribute("isLoggedIn").equals("true"))
		{
			return new ModelAndView("userdashboard");
		}
		ModelAndView mav = null;		
		mav = new ModelAndView("forgot");

		return mav;	
	}


	@RequestMapping("/reset")
	public ModelAndView reset(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
	{
		httpSession=request.getSession();

		if(httpSession.getAttribute("isLoggedIn")!=null && httpSession.getAttribute("isLoggedIn").equals("true"))
		{
			RedirectView view = new RedirectView("/userdashboard.html", true);
			return new ModelAndView(view);
		}


		SeUser s=seUserService.getUser(request.getParameter("email"));
		if(s==null)
		{
			ModelAndView mav=new ModelAndView("forget");
			mav.addObject("errmsg", "User Not Found !");
			return mav;
		}
		String host=request.getRequestURL().toString();

		//String hash=DigestUtils.sha1Hex(s.getUserName()+"-"+new Date().getTime());

		seUserService.setTempPass(request.getParameter("email"));
		SeUser se=seUserService.getUser(request.getParameter("email"));
		String url = host.substring(0, host.lastIndexOf('/'))+"/resetpassword.html?q="+se.getTempPass();
		String to=se.getUserName();
		String subject="Reset Password link for Your Account";
		String body="Please click below link to reset your password\n"+url;
		try {
			ResetMail.sendFromGMail(to, subject, body);
			System.out.println("Email Sent....!");
		} catch (Exception ex) {
			System.out.println("Could not send email....!");
			ex.printStackTrace();
		}



		return new ModelAndView("loginpage");

	}


	@RequestMapping(value="/resetpassword", method = RequestMethod.GET)
	public ModelAndView resetpassword(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
	{
		//httpSession=request.getSession();
		if(httpSession.getAttribute("isLoggedIn")!=null && httpSession.getAttribute("isLoggedIn").equals("true"))
		{
			return new ModelAndView("userdashboard");
		}

		String hash=request.getParameter("q");
		SeUser s=seUserService.getUserByTempPass(hash);

		if(s!=null);
		{
			ModelAndView mav = new ModelAndView("changepassword");
			mav.addObject("username", s.getUserName());
			return mav;

		}    

	}

	@RequestMapping(value="/repassword")
	public ModelAndView repassword(HttpServletRequest request, HttpServletResponse response,HttpSession httpSession)
	{
		//httpSession=request.getSession();
		if(httpSession.getAttribute("isLoggedIn")!=null && httpSession.getAttribute("isLoggedIn").equals("true"))
		{
			return new ModelAndView("userdashboard");
		}

		if(request.getParameter("password").equals(request.getParameter("password_c")))
		{
			System.out.println("called");
			seUserService.changePassword(request.getParameter("username"), request.getParameter("password"));
			ModelAndView mav = new ModelAndView("loginpage");
			mav.addObject("message", "Password Reset Succesfull !");
			return mav;

		}
		else
		{
			ModelAndView mav = new ModelAndView("changepassword");

			mav.addObject("username", request.getParameter("username"));
			mav.addObject("err", "Password Not Match !");
			return mav;

		}		  

	}


	@RequestMapping(value="/change")
	public ModelAndView changePass(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{	
		session=request.getSession();
		System.out.println(session.getId());
		if(session.getAttribute("isLoggedIn")==null)
			return new ModelAndView("loginpage");
		if(session.getAttribute("isLoggedIn").equals("true"))
		{
			return new ModelAndView("changepass");
		}

		return new ModelAndView("loginpage");

	}

	@RequestMapping(value="/changepass")
	public ModelAndView setpassword(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
	{
		//httpSession=request.getSession();

		if(httpSession.getAttribute("isLoggedIn")!=null && httpSession.getAttribute("isLoggedIn").equals("true") || httpSession.getAttribute("isLoggedIn").equals("trueadmin"))
		{
			SeUser s=(SeUser) httpSession.getAttribute("user");
			String passwordOld=DigestUtils.sha1Hex(request.getParameter("passwordOld"));
			String passwordNew=DigestUtils.sha1Hex(request.getParameter("passwordNew"));
			//System.out.println(s.getUserName());

			if(s.getUserPassword().equals(passwordOld))
			{
				seUserService.changePassword(s.getUserName(), passwordNew);
				ModelAndView mav = new ModelAndView("userdashboard");
				mav.addObject("message", "Password Reset Succesfull !");
				return mav;
			}

			ModelAndView mav = new ModelAndView("changepassword");
			mav.addObject("message", "Old Password Not Matched !");
			return mav;



		}

		return new ModelAndView("loginpage");
	}


	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response,HttpSession httpSession)
	{	
		httpSession=request.getSession();	
		httpSession.invalidate();
		RedirectView view = new RedirectView("/login.html", true);
		//view.setExposeModelAttributes(false);
		//ModelAndView view=new ModelAndView("/login.html");
		//	view.addStaticAttribute("message", "Username or Password is wrong!!");
		return new ModelAndView(view);

	}





}