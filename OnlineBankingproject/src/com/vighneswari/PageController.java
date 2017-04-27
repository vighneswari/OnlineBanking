package com.vighneswari;
import java.util.Date;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vighneswari.PMF;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
//import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;


@SuppressWarnings("unused")
@Controller
@RequestMapping("/login")
public class PageController 
{
	
			@RequestMapping(value = "/log", method = RequestMethod.POST)
			public String reg(HttpServletRequest request, ModelMap model)
			{
				
			return "index";
			
			}
			@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
			public String loginpage(HttpServletRequest request, ModelMap model)
			{
				
			return "login";
			
			}
			
			@RequestMapping(value = "/about", method = RequestMethod.GET)
			public String about(HttpServletRequest request, ModelMap model)
			{

				return "about";

			}
			
			@RequestMapping(value = "/withdraw", method = RequestMethod.GET)
			public String withdraw(HttpServletRequest request, ModelMap model)
			{

				return "withdraw";

			}
			@RequestMapping(value = "/deposit", method = RequestMethod.GET)
			public String deposit(HttpServletRequest request, ModelMap model)
			{

				return "deposit";

			}
			
			@RequestMapping(value = "/regi", method = {RequestMethod.GET,RequestMethod.POST})
			public String regi(HttpServletRequest request, ModelMap model)
			{

				return "index";

			}
			@RequestMapping(value = "/regi2", method = RequestMethod.GET)
			public String regi2(HttpServletRequest request, ModelMap model)
			{

				return "registrationsucess";

			}
			@RequestMapping(value = "/transfer", method = RequestMethod.GET)
			public String transfer(HttpServletRequest request, ModelMap model)
			{

				return "transfer";

			}
			@RequestMapping(value = "/contactus", method = RequestMethod.GET)
			public String contactus(HttpServletRequest request, ModelMap model)
			{

				return "contactus";

			}
			@RequestMapping(value = "/enterence", method = RequestMethod.GET)
			public String enterence(HttpServletRequest request, ModelMap model)
			{

				return "enterence";

			}
			
				
			@RequestMapping(value = "/logout", method = RequestMethod.GET)
			public String logout(HttpServletRequest request, ModelMap model)
			{

				return "logout";

			}
		
			
			@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
			public String adminlogin(HttpServletRequest request, ModelMap model)
			{

				return "adminlogin";

			}
		
			
	}



	


	