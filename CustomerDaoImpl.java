package com.nucleus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao{

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void SaveCustomerData(Customer customer) {
		
		Object[] object = {customer.getCustomerid(),customer.getCustomername()};
		jdbcTemplate.update("insert into customertablepr values(?,?)",object);
		
		
		
		
		
	}
	

}
