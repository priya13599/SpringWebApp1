package com.nucleus.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.dao.ICustomerDao;
import com.nucleus.model.Customer;
@Controller
public class CustomerController {
	
	
	@Autowired
    ICustomerDao iCustomerDao;
	
	
	
	@RequestMapping("/Request")
	public ModelAndView request1(Customer customer)
	{
		return new ModelAndView("CustomerForm");
	}
	
	
	@RequestMapping("/saveCustomer")
	public ModelAndView request2(Customer customer)
	{
		iCustomerDao.SaveCustomerData(customer);
		return new ModelAndView("result","cust",customer);
	}
	
}
