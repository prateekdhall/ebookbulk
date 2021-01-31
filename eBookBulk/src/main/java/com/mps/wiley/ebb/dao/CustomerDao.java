package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.Customer;

import org.springframework.dao.DataAccessException;


public interface CustomerDao extends BaseDao<Customer>
{
	public int insertCustomer(Customer customer) throws DataAccessException;
	
	public int updateCustomer(Customer customer) throws DataAccessException;
	
	public Customer getCustomerById(int iCustomerId) throws DataAccessException;
	
	public List<Customer> getCustomers(Customer customer) throws DataAccessException;
	
	public List<Customer> getAllCustomers() throws DataAccessException;
}
