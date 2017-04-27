package com.vighneswari;
import java.util.Date;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import java.util.Iterator;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.mail.Session;
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
import com.google.appengine.api.datastore.Transaction;
@SuppressWarnings("unused")
@Controller
@RequestMapping("/")
public class BankController {

	private int Balance;



	@RequestMapping(value = "/", method = { RequestMethod.GET,RequestMethod.POST})
	public String getAddRgisterPage(ModelMap model) 
	{

		return "index";

	}

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String getAddRegisterPage(ModelMap model)
	{

		return "add";

	}
	
	

	@RequestMapping(value = "/add", method = { RequestMethod.GET,RequestMethod.POST})
	public String add(HttpServletRequest request, ModelMap model) 
	{

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String Address = request.getParameter("Address");
		String date =  request.getParameter("date");
		String key = request.getParameter("key");
		String Mobile= request.getParameter("Mobile");
		String Gender= request.getParameter("Gender");
		String City= request.getParameter("City");
		//String Amount =request.getParameter("Amount");
		String AccountType= request.getParameter("AccountType");
		String AadharNumber=request.getParameter("AadharNumber");
		String AccountNumber= request.getParameter("AccountNumber");
		String DateOfBirth= request.getParameter("DateOfBirth");
		String Occupation= request.getParameter("Occupation");
		//int Balance=request.getParameter("Balance");
		int Balance= 0;
		
		Bank c = new Bank();
		c.setname(name);
		c.setemail(email);
		c.setAddress(Address);
		c.setDate(new Date());
		c.setMobile(Mobile);
		c.setGender(Gender);
		c.setCity(City);
		c.setAccountType(AccountType);
		c.setAadharNumber(AadharNumber);
		c.setAccountNumber(AccountNumber);
		c.setDataOfBirth(DateOfBirth);
		c.setOccupation(Occupation);
		//c.setAmount(Amount);
		
		CustomerBal b = new CustomerBal();
		b.setname(name);
		b.setAccountNumber(AccountNumber);
		b.setBalance(Balance);
		b.setAccountType(AccountType);
		b.setMobile(Mobile);

		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(c);
			pm.makePersistent(b);
		} finally {
			pm.close();
		}
	
		return "index";
	}

	@RequestMapping(value = "/update/{name}", method = RequestMethod.GET)
	public String getUpdateRegisterPage(@PathVariable String name,
		HttpServletRequest request, ModelMap model) {

		PersistenceManager pm = PMF.get().getPersistenceManager();

		Query q = pm.newQuery(Bank.class);
		q.setFilter("name == nameParameter");
		q.setOrdering("date desc");
		q.declareParameters("String nameParameter");

		try {
			List<Bank> results = (List<Bank>) q.execute(name);

			if (results.isEmpty()) {
				model.addAttribute("register", null);
			} else {
				model.addAttribute("register", results.get(0));
			}
		} finally {
			q.closeAll();
			pm.close();
		}

		return "update";

	}

	@RequestMapping(value = "/loginController", method = RequestMethod.POST)
	public String log(HttpServletRequest request, ModelMap model)
	{
		String Username1 = request.getParameter("name");
		String Password1 = request.getParameter("Mobile");
		System.out.println(Username1);
		PersistenceManager pm = PMF.get().getPersistenceManager();	
		
		Query q = pm.newQuery(Bank.class);
		
		q.setFilter("name == '"+Username1+"' && Mobile == '"+Password1+"' ");
		q.declareParameters("String Username1, String Password1");
		List<Bank> results = (List<Bank>) q.execute(Username1,Password1);

		System.out.println("hello"+results);
		if(results.isEmpty())
		{
			System.out.println("not");
			return "loginfail";
		} 
		
		else
		{
			System.out.println("vijju");
		    return "home";
		}
		}
	
	@RequestMapping(value = "/depositController", method = RequestMethod.GET)
	public String deposit(HttpServletRequest request, ModelMap model)
	{
		int   bal = 0;
		PersistenceManager pm = PMF.get().getPersistenceManager();

		String AccountNumber = request.getParameter("AccountNumber");
		int Balance = Integer.parseInt(request.getParameter("Balance"));

		Query q = pm.newQuery(CustomerBal.class);
		q.setFilter("AccountNumber=='"+AccountNumber+"'");
		List<CustomerBal> results=(List<CustomerBal>)q.execute(AccountNumber);
		
		for (CustomerBal val : results)
		{
			   System.out.println(" fdfdgdg " + val.getBalance());
			 bal = val.getBalance();
			   } 
		   int bal1 = bal + Balance;
		   System.out.println("good"  +bal1);
	    CustomerBal c_bal, detached = null;
	   
	    	c_bal = pm.getObjectById(CustomerBal.class,
	    			AccountNumber);

	        // If you're using transactions, you can call
	        // pm.setDetachAllOnCommit(true) before committing to automatically
	        // detach all objects without calls to detachCopy or detachCopyAll.
	        detached = pm.detachCopy(c_bal);
	   

	    c_bal.setBalance(bal1);
	        try {
	            pm.makePersistent(c_bal);
	        } finally {
	            pm.close();
	        }
	return "deposit1";
	} 

	
	private void Bank() 
	{
			
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request, ModelMap model) {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String Address =request.getParameter("Address");
		String date =  request.getParameter("date");
		String key = request.getParameter("key");
		String Mobile= request.getParameter("Mobile");
		String Gender= request.getParameter("Gender");
		String City= request.getParameter("City");
		String AccountType= request.getParameter("AccountTye");
		String AadharNumber=request.getParameter("AadharNumber");
		String AccountNumber= request.getParameter("AccountNumber");
		String DateOfBirth= request.getParameter("DateOfBirth");
		String Occupation= request.getParameter("Occupation");
		String Income= request.getParameter("Income");
		String Balance= request.getParameter("Balance");

		PersistenceManager pm = PMF.get().getPersistenceManager();

		try {

			Bank c = pm.getObjectById(Bank.class, key);

			c.setname(name);
			c.setemail(email);
			c.setAddress(Address);
			c.setDate(new Date());
			//c.setkey(key);
			c.setMobile(Mobile);
			c.setGender(Gender);
			c.setCity(City);
			c.setAccountType(AccountType);
			c.setAadharNumber(AadharNumber);
			c.setAccountNumber(AccountNumber);
			c.setDataOfBirth(DateOfBirth);
			c.setOccupation(Occupation);
			//c.setIncome(Income);
			//c.setBalance(Balance);

		} finally {

			pm.close();
		}

		// return to list
		return new ModelAndView("redirect:/list");

	}
	@RequestMapping(value = "/adminloginController", method = RequestMethod.POST)
	public String admin(HttpServletRequest request, ModelMap model)
	{
		String Username1 = request.getParameter("name");
		String Password1 = request.getParameter("Mobile");
		System.out.println(Username1);
		PersistenceManager pm = PMF.get().getPersistenceManager();	
		
		Query q = pm.newQuery(Bank.class);
		
		q.setFilter("name == '"+Username1+"' && Mobile == '"+Password1+"' ");
		q.declareParameters("String Username1, String Password1");
		List<Bank> results = (List<Bank>) q.execute(Username1,Password1);

		

		System.out.println("hello"+results);
		return "adminview";
	}
	

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listBank(ModelMap model,HttpServletRequest request) 
	{
	PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(CustomerBal.class);
	

		List<Bank> results = null;

		try
		{
			results = (List<Bank>) q.execute();
			System.out.println("list classssssas");
			System.out.println("results" +results);
			if (results.isEmpty()) {
			
				model.addAttribute("bankList", null);
			} else {
				
				model.addAttribute("bankList", results);
			}

		} 
		finally {
			q.closeAll();
			pm.close();
		}

		return "list";

	}
	@RequestMapping(value = "/withdrawController", method = RequestMethod.GET)
	public String withdraw(HttpServletRequest request, ModelMap model)
	{
	
		int bal3=0;
		PersistenceManager pm = PMF.get().getPersistenceManager();

		String AccountNumber = request.getParameter("AccountNumber");
		int Balance = Integer.parseInt(request.getParameter("Balance"));

		Query q = pm.newQuery(CustomerBal.class);
		q.setFilter("AccountNumber=='"+AccountNumber+"'");
		List<CustomerBal> results=(List<CustomerBal>)q.execute(AccountNumber);
		
		
		for (CustomerBal val : results)
		{
			System.out.println(" fdfdgdg " + val.getBalance());
			bal3 = val.getBalance();
		} 
		   int bal1 = bal3 - Balance;
		   System.out.println("good"  +bal1);
		   
	        CustomerBal c_bal, detached = null;
	        c_bal = pm.getObjectById(CustomerBal.class,AccountNumber);


	        detached = pm.detachCopy(c_bal);
	        c_bal.setBalance(bal1);
	        
	        try 
	        {
	           pm.makePersistent(c_bal);
	        } 
	        finally
	        {
	            pm.close();
	        }
	        	return "withdraw1";
	} 
	
	
	@RequestMapping(value = "/transferController", method = RequestMethod.GET)
	public String transfer(HttpServletRequest request, ModelMap model)
	{
		int  bal5 =0;
		int bal6= 0;
		PersistenceManager pm = PMF.get().getPersistenceManager();

		String AccountNumber = request.getParameter("AccountNumber");
		int Balance = Integer.parseInt(request.getParameter("Balance"));

		Query q = pm.newQuery(CustomerBal.class);
		q.setFilter("AccountNumber=='"+AccountNumber+"'");
		List<CustomerBal> results=(List<CustomerBal>)q.execute(AccountNumber);
		
		for (CustomerBal val : results)
		{
			   System.out.println(" fdfdgdg " + val.getBalance());
			 bal5 = val.getBalance();
			   } 
		
		   int bal1 = bal5 - Balance;
		   System.out.println("good"  +bal1);
		   String AccountNumber1 = request.getParameter("AccountNumber");
			

			Query w = pm.newQuery(CustomerBal.class);
			w.setFilter("AccountNumber=='"+AccountNumber+"'");
			List<CustomerBal> result=(List<CustomerBal>)q.execute(AccountNumber);
			
			for (CustomerBal val : result)
			{
				   System.out.println(" fdfdgdg " + val.getBalance());
				 bal6 = val.getBalance();
				   } 
			
		   int bal7=bal1+bal6;
		   
		   
	    CustomerBal c_bal, detached = null;
	   
	    	c_bal = pm.getObjectById(CustomerBal.class,
	    			AccountNumber);

	        // If you're using transactions, you can call
	        // pm.setDetachAllOnCommit(true) before committing to automatically
	        // detach all objects without calls to detachCopy or detachCopyAll.
	        detached = pm.detachCopy(c_bal);
	   

	    c_bal.setBalance(bal7);
	        try {
	            pm.makePersistent(c_bal);
	        } finally {
	            pm.close();
	        }
	return "transfer1";
	} 
	


}