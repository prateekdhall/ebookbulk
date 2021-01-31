package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.common.util.StringUtil;
import main.java.com.mps.wiley.ebb.domain.Customer;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("CustomerDao")
@Transactional
public class CustomerDaoImpl extends AbstractBaseDao<Customer> implements CustomerDao
{
	public CustomerDaoImpl()
	{
		super();
	}
	
	@Override
	public String getTableName()
	{
		return "CUSTOMER";
	}
	
	@Override
	public String getFields()
	{
		return "CUST_ID,COMPANY_NAME,PHONE_NO,ADDRESS,ADD_CITY,ADD_STATE,ADD_ZIPCODE,COUNTRY_ID,CREATED_BY,CREATED_DATE,UPDATED_BY,UPDATED_DATE";
	}
	
	
	@Override
	public List<Customer> getCustomers(Customer customer) throws DataAccessException
	{
		String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " myCustomer";
		List<String> queryParam = new ArrayList<String>();
		if (StringUtil.isValidStr(customer.getCompanyName()) || customer.getCountry().getId() != -1)
		{
			strQuery = strQuery + " where " + customerSelectQuery(customer);
			
		}
		if (StringUtil.isValidStr(customer.getCompanyName()))
		{
			queryParam.add("%" + customer.getCompanyName() + "%");
		}
		if (customer.getCountry().getId() != -1)
		{
			queryParam.add(customer.getCountry().getId() + "");
		}
		System.out.println("Query::" + strQuery);
		return simpleJdbcTemplate.query(strQuery.toString(), this, queryParam.toArray());
		
	}
	
	String customerSelectQuery(Customer customer)
	{
		StringBuilder tempSql = new StringBuilder();
		boolean check = false;
		if (StringUtil.isValidStr(customer.getCompanyName()))
		{
			tempSql.append("myCustomer.COMPANY_NAME like ?");
			check = true;
		}
		if (customer.getCountry().getId() != -1)
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("myCustomer.COUNTRY_ID=?");
		}
		return tempSql.toString();
	}
	
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Customer customer = new Customer();
		customer.setCustomerId(rs.getInt("CUST_ID"));
		customer.setCompanyName(rs.getString("COMPANY_NAME"));
		customer.setPhoneNo(rs.getString("PHONE_NO"));
		customer.setAddress(rs.getString("ADDRESS"));
		customer.setCity(rs.getString("ADD_CITY"));
		customer.setState(rs.getString("ADD_STATE"));
		customer.getCountry().setId(rs.getInt("COUNTRY_ID"));
		customer.setZipCode(rs.getString("ADD_ZIPCODE"));
		customer.setCreatedBy(rs.getString("CREATED_BY"));
		customer.setCreatedDate(rs.getDate("CREATED_DATE"));
		customer.setUpdatedBy(rs.getString("UPDATED_BY"));
		customer.setUpdatedDate(rs.getDate("UPDATED_DATE"));
		return customer;
	}
	
	@Override
	@Transactional
	public int insertCustomer(Customer customer) throws DataAccessException
	{
		final String strQuery = "INSERT INTO " + getTableName() + " ( COMPANY_NAME, PHONE_NO, ADDRESS,ADD_CITY, ADD_STATE, COUNTRY_ID, ADD_ZIPCODE, CREATED_BY, CREATED_DATE, UPDATED_BY, UPDATED_DATE) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
		simpleJdbcTemplate.update(strQuery, customer.getCompanyName(), customer.getPhoneNo(), customer.getAddress(), customer.getCity(), customer.getState(), customer.getCountry().getId(), customer.getZipCode(), customer.getCreatedBy(), customer.getCreatedDate(), customer.getUpdatedBy(), customer.getUpdatedDate());
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	@Override
	@Transactional
	public int updateCustomer(Customer customer) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET COMPANY_NAME = ?, PHONE_NO =?,ADDRESS = ?, ADD_CITY = ?, ADD_STATE= ?, COUNTRY_ID = ?, ADD_ZIPCODE = ?, UPDATED_BY = ?, UPDATED_DATE = ? WHERE CUST_ID = ?";
		return simpleJdbcTemplate.update(strQuery, customer.getCompanyName(), customer.getPhoneNo(), customer.getAddress(), customer.getCity(), customer.getState(), customer.getCountry().getId(), customer.getZipCode(), customer.getUpdatedBy(), customer.getUpdatedDate(), customer.getCustomerId());
	}
	
	@Override
	@Transactional
	public Customer getCustomerById(int iCustomerId) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE CUST_ID = ?";
		return simpleJdbcTemplate.queryForObject(strQuery.toString(), this, iCustomerId);
	}
	
	@Override
	public List<Customer> getAllCustomers() throws DataAccessException
	{
		return getObjectList("select CUST_ID, COMPANY_NAME from CUSTOMER", Customer.class, new String[] {"customerId", "companyName"}, new int[] {INTEGER, STRING});
	}
}
