package main.java.com.mps.wiley.ebb.service;


import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.domain.Customer;
import main.java.com.mps.wiley.ebb.domain.KeyContact;

import org.springframework.dao.DataAccessException;


public interface CustomerService
{
	public int saveCustomer(Customer customer,Map<String, Object> session) throws DataAccessException;
	
	public Customer viewCustomer(int customerId) throws DataAccessException;
	
	public List<Customer> getCustomers(Customer customer) throws DataAccessException;
	
	public List<Customer> getAllCustomers() throws DataAccessException;
	
	public List<KeyContact> getKeyContactGridDetails(int customerId) throws DataAccessException;
	
	public Customer getCustomerById(int customerId) throws DataAccessException;
	
}
