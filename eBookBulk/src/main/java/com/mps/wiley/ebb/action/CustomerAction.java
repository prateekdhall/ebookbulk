package main.java.com.mps.wiley.ebb.action;


import java.util.Date;
import java.util.List;

import main.java.com.mps.common.AppSystem;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.Country;
import main.java.com.mps.wiley.ebb.domain.Customer;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.CustomerService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;


@ParentPackage("ebbs")
@Namespace("/ebbs")
@Validations(intRangeFields = {@IntRangeFieldValidator(type = ValidatorType.SIMPLE,
		fieldName = "customer.country.id", min = "1", key = "error.custCountry.required"),},
		requiredStrings = {@RequiredStringValidator(type = ValidatorType.SIMPLE,
				fieldName = "customer.companyName", key = "error.custCompanyName.required")})
public class CustomerAction extends Struts2AbstractAction
{
	
	private static final long serialVersionUID = 4651395692074707917L;
	private Customer customer;
	private Customer searchCustomer;
	private int firstFlag = 0;
	
	public int getFirstFlag()
	{
		return firstFlag;
	}
	
	public void setFirstFlag(int firstFlag)
	{
		this.firstFlag = firstFlag;
	}
	
	
	public Customer getCustomer()
	{
		log.info("*********** Getter Customer ***********");
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		log.info("*********** Setter Customer ***********");
		this.customer = customer;
	}
	
	public Customer getSearchCustomer()
	{
		return searchCustomer;
	}
	
	public void setSearchCustomer(Customer searchCustomer)
	{
		this.searchCustomer = searchCustomer;
	}
	
	@Autowired
	private CustomerService customerService;
	
	public List<Country> getCountries()
	{
		return countries;
	}
	
	public List<Country> countries = AppSystem.COUNTRIES;
	
	@Action(value = "createCustomer", results = {@Result(name = "success", type = "tiles",
			location = "createCustomer"), @Result(name = "input", type = "tiles",
			location = "createCustomer")})
	@SkipValidation
	public String createCustomer() throws Exception
	{
		try
		{
			session.remove(AppConstants.KC_GRID_LIST);
			session.remove(AppConstants.KC_DELETE_LIST);
			session.remove(AppConstants.KC_AUTO_COUNT);
			
			System.out.println(AppSystem.COUNTRIES_MAP.get(countries));
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "submitCustomer", results = {@Result(name = "success", type = "tiles",
			location = "createCustomer"), @Result(name = "input", type = "tiles",
			location = "createCustomer")})
	public String submitCustomer() throws Exception
	{
		try
		{
			log.info("**** Creating Customer *****");
			System.out.println("Customer Id::" + customer.getCustomerId());
			User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
			
			if (customer.getCustomerId() == null)
			{
				customer.setCreatedBy(sessionUser.getUserName());
				customer.setCreatedDate(new Date());
			}
			
			customer.setUpdatedDate(new Date());
			customer.setUpdatedBy(sessionUser.getUserName());
			
			Integer autoCustId = customerService.saveCustomer(customer,session);
			
			System.out.println("Auto Generated AutoId --" + autoCustId);
			
			session.remove(AppConstants.KC_GRID_LIST);
			session.remove(AppConstants.KC_DELETE_LIST);
			session.remove(AppConstants.KC_AUTO_COUNT);
			
			addActionMessage(getText("customerform.data.save"));
			customer.setCustomerId(autoCustId);
			return SUCCESS;
		}
		catch (org.springframework.dao.DuplicateKeyException de)
		{
			addFieldError("customer.companyName", getText("error.duplicate.companyName"));
			return INPUT;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	
	@Action(
			value = "searchCustomer",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {@Result(name = "success", type = "tiles", location = "searchCustomer"), @Result(
					name = "input", type = "tiles", location = "searchCustomer")})
	@SkipValidation
	public String searchCustomer() throws Exception
	{
		return SUCCESS;
	}
	
	@Action(value = "viewCustomer", interceptorRefs = {@InterceptorRef("commonStack")},
			results = {@Result(name = "success", type = "tiles", location = "viewCustomer"), @Result(
					name = "input", type = "tiles", location = "viewCustomer")})
	@SkipValidation
	public String viewCustomer()
	{
		try
		{
			setCustomer(customerService.getCustomerById(customer.getCustomerId()));
			
			session.remove(AppConstants.KC_GRID_LIST);
			session.remove(AppConstants.KC_DELETE_LIST);
			session.remove(AppConstants.KC_AUTO_COUNT);
			
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "updateCustomer", interceptorRefs = {@InterceptorRef("commonStack")},
			results = {@Result(name = "success", type = "tiles", location = "searchCustomer"), @Result(
					name = "input", type = "tiles", location = "viewCustomer")})
	public String updateCustomer()
	{
		try
		{
			User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
			
			if (customer.getCustomerId() == null)
			{
				customer.setCreatedBy(sessionUser.getUserName());
				customer.setCreatedDate(new Date());
			}
			
			customer.setUpdatedDate(new Date());
			customer.setUpdatedBy(sessionUser.getUserName());
			
			customerService.saveCustomer(customer,session);
			
			session.remove(AppConstants.KC_GRID_LIST);
			session.remove(AppConstants.KC_DELETE_LIST);
			session.remove(AppConstants.KC_AUTO_COUNT);
			
			addActionMessage(getText("customerform.data.update"));
			return SUCCESS;
		}
		catch (org.springframework.dao.DuplicateKeyException de)
		{
			addFieldError("customer.companyName", getText("error.duplicate.companyName"));
			return INPUT;
		}
		catch(Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			e.printStackTrace();
			return INPUT;
		}
	}
}