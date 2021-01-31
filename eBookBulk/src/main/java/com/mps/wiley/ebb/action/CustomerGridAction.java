package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.mps.common.AppSystem;
import main.java.com.mps.common.GenericComparator;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.ebb.domain.Country;
import main.java.com.mps.wiley.ebb.domain.Customer;
import main.java.com.mps.wiley.ebb.service.CustomerService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class CustomerGridAction extends Struts2AbstractAction implements ModelDriven<Customer>
{
	private static final long serialVersionUID = 1L;
	private Integer rows = 0;
	private Integer page = 0;
	private Integer total = 0;
	private Integer records = 0;
	private String sord;
	private String sidx;
	private boolean loadonce = false;
	private int to;
	private int from;
	
	private int firstFlag = 0;
	
	List<Customer> customerGridModel;
	List<Customer> searchCustomerListObj = new ArrayList<Customer>();
	public List<Country> countries = AppSystem.COUNTRIES;
	
	
	public Integer getRows()
	{
		return rows;
	}
	
	
	public void setRows(Integer rows)
	{
		this.rows = rows;
	}
	
	
	public Integer getPage()
	{
		return page;
	}
	
	
	public void setPage(Integer page)
	{
		this.page = page;
	}
	
	
	public Integer getTotal()
	{
		return total;
	}
	
	
	public void setTotal(Integer total)
	{
		this.total = total;
	}
	
	
	public Integer getRecords()
	{
		return records;
	}
	
	
	public void setRecords(Integer records)
	{
		this.records = records;
	}
	
	
	public String getSord()
	{
		return sord;
	}
	
	
	public void setSord(String sord)
	{
		this.sord = sord;
	}
	
	
	public String getSidx()
	{
		return sidx;
	}
	
	
	public void setSidx(String sidx)
	{
		this.sidx = sidx;
	}
	
	
	public boolean isLoadonce()
	{
		return loadonce;
	}
	
	
	public void setLoadonce(boolean loadonce)
	{
		this.loadonce = loadonce;
	}
	
	
	public int getTo()
	{
		return to;
	}
	
	
	public void setTo(int to)
	{
		this.to = to;
	}
	
	
	public int getFrom()
	{
		return from;
	}
	
	
	public void setFrom(int from)
	{
		this.from = from;
	}
	
	private Customer customer;
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	
	public List<Customer> getCustomerGridModel()
	{
		return customerGridModel;
	}
	
	
	public void setCustomerGridModel(List<Customer> customerGridModel)
	{
		this.customerGridModel = customerGridModel;
	}
	
	
	public List<Customer> getSearchCustomerListObj()
	{
		return searchCustomerListObj;
	}
	
	
	public void setSearchCustomerListObj(List<Customer> searchCustomerListObj)
	{
		this.searchCustomerListObj = searchCustomerListObj;
	}
	
	@Override
	public Customer getModel()
	{
		customer = new Customer();
		return customer;
	}
	
	public int getFirstFlag()
	{
		return firstFlag;
	}


	public void setFirstFlag(int firstFlag)
	{
		this.firstFlag = firstFlag;
	}

	@Autowired
	private CustomerService customerService;
	
	@Action(value = "searchCustomerGridAction", results = {@Result(name = "success", type = "json")})
	public String populateSearchCustomerGrid() throws Exception
	{
		
		System.out.println(customer.getCompanyName());
		
		if (customer.getCountry() != null)
			System.out.println(customer.getCountry().getId());
		
		if(firstFlag == 1)
		{
			searchCustomerListObj = customerService.getCustomers(customer);
		}
		else
		{
			searchCustomerListObj = null;
		}
		
		if (("asc".equalsIgnoreCase(getSord()) || "desc".equalsIgnoreCase(getSord())) && getSidx() != null & !getSidx().trim().equals(""))
		{
			Collections.sort(searchCustomerListObj, new GenericComparator(sidx, getSord()));
		}
		if (getSord() != null && getSord().equalsIgnoreCase("desc"))
		{
			//Collections.sort(searchCustomerListObj);
			//Collections.reverse(searchCustomerListObj);
		}
		
		setRecords(searchCustomerListObj.size());
		to = getRows() * getPage();
		from = to - getRows();
		
		if (to > getRecords())
		{
			to = getRecords();
		}
		setTotal((int)Math.ceil((double)getRecords() / (double)getRows()));
		
		
		for (Customer cst : searchCustomerListObj)
		{
			cst.getCountry().setValue(AppSystem.COUNTRIES_MAP.get(cst.getCountry().getId()).getCountryName());
		}
		
		if (loadonce)
		{
			setCustomerGridModel(searchCustomerListObj);
		}
		else
		{
			setCustomerGridModel(searchCustomerListObj.subList(from, to));
		}
		return SUCCESS;
	}
	
}
