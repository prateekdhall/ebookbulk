package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.mps.common.GenericComparator;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.Customer;
import main.java.com.mps.wiley.ebb.domain.KeyContact;
import main.java.com.mps.wiley.ebb.service.CustomerService;
import main.java.com.mps.wiley.ebb.service.UserService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class KeyContactGridAction extends Struts2AbstractAction implements ModelDriven<KeyContact>
{
	private static final long serialVersionUID = -5568570298381323093L;
	List<KeyContact> keyContactGridModel;
	List<KeyContact> keyContactListObj = new ArrayList<KeyContact>();
	List<KeyContact> deletedKeyContactList = new ArrayList<KeyContact>();
	private Integer rows = 0;
	private Integer page = 0;
	private Integer total = 0;
	private Integer records = 0;
	private String sord;
	private String sidx;
	private boolean loadonce = false;
	private int to;
	private int from;
	private String oper;
	private int firstFlag = 0;
	
	public int getFirstFlag()
	{
		return firstFlag;
	}
	
	public void setFirstFlag(int firstFlag)
	{
		this.firstFlag = firstFlag;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	private String id;
	
	
	public List<KeyContact> getKeyContactGridModel()
	{
		return keyContactGridModel;
	}
	
	public void setKeyContactGridModel(List<KeyContact> keyContactGridModel)
	{
		this.keyContactGridModel = keyContactGridModel;
	}
	
	public List<KeyContact> getKeyContactListObj()
	{
		return keyContactListObj;
	}
	
	public void setKeyContactListObj(List<KeyContact> keyContactListObj)
	{
		this.keyContactListObj = keyContactListObj;
	}
	
	private Customer customer;
	
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
	
	private KeyContact keyContact;
	
	public KeyContact getKeyContact()
	{
		log.info("*********** Getter KeyContact ***********");
		return keyContact;
	}
	
	public void setKeyContact(KeyContact keyContact)
	{
		log.info("*********** Getter KeyContact ***********");
		this.keyContact = keyContact;
	}
	
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
	
	public String getOper()
	{
		return oper;
	}
	
	public void setOper(String oper)
	{
		this.oper = oper;
	}
	
	public CustomerService getCustomerService()
	{
		return customerService;
	}
	
	public void setCustomerService(CustomerService customerService)
	{
		this.customerService = customerService;
	}
	
	public int getCustomerId()
	{
		return customerId;
	}
	
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	
	private int customerId;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private UserService userService;
	
	@SuppressWarnings("unchecked")
	@Action(value = "keyContactGridAction", results = {@Result(name = "success", type = "json")})
	public String populateKeyContactGrid() throws Exception
	{
		try
		{
//			String editOption = "";
//			for (Country country : countries)
//			{
//				editOption = editOption + country.getCountryId() + ":" + country.getCountryName() + ";" ;
//			}
//			System.out.println("editOption (Country List) for Editable Grid= "+ editOption);
			
			if (session.get(AppConstants.KC_GRID_LIST) == null)
			{
				keyContactListObj = customerService.getKeyContactGridDetails(customerId);
				int addCountId = -10;
				
				session.remove(AppConstants.KC_GRID_LIST);
				session.remove(AppConstants.KC_DELETE_LIST);
				session.remove(AppConstants.KC_AUTO_COUNT);
				
				session.put(AppConstants.KC_GRID_LIST, keyContactListObj);
				session.put(AppConstants.KC_DELETE_LIST, deletedKeyContactList);
				session.put(AppConstants.KC_AUTO_COUNT, addCountId);
			}
			else
			{
				keyContactListObj = (List<KeyContact>)session.get(AppConstants.KC_GRID_LIST);
				System.out.println("----- Edit Operation ------");
			}
			
			if (("asc".equalsIgnoreCase(getSord()) || "desc".equalsIgnoreCase(getSord())) && getSidx() != null & !getSidx().trim().equals(""))
			{
				Collections.sort(keyContactListObj, new GenericComparator(sidx, getSord()));
			}
			if (getSord() != null && getSord().equalsIgnoreCase("desc"))
			{
				// Collections.sort(keyContactListObj);
				// Collections.reverse(keyContactListObj);
			}

			
			setRecords(keyContactListObj.size());
			to = getRows() * getPage();
			from = to - getRows();
			
			if (to > getRecords())
			{
				to = getRecords();
			}
			setTotal((int)Math.ceil((double)getRecords() / (double)getRows()));
			if (loadonce)
			{
				setKeyContactGridModel(keyContactListObj);
			}
			else
			{
				setKeyContactGridModel(keyContactListObj.subList(from, to));
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@Override
	public KeyContact getModel()
	{
		keyContact = new KeyContact();
		return keyContact;
	}
	
	
	@SuppressWarnings("unchecked")
	@Action(value = "editKeyContactGrid", results = {@Result(name = "success", type = "json")})
	public String editKeyContactGrid() throws Exception
	{
		
		List<KeyContact> tempKeyContactList = (List<KeyContact>)session.get(AppConstants.KC_GRID_LIST);
		List<KeyContact> deletedKeyContactList = (List<KeyContact>)session.get(AppConstants.KC_DELETE_LIST);
		int addCountId = (Integer)session.get(AppConstants.KC_AUTO_COUNT);
		
//		int count=userService.userExist(keyContact.getEmail());
		
		if (oper.equalsIgnoreCase("add"))
		{
			
			log.debug("Add KeyContact");
			
			addCountId = addCountId - 1;
			keyContact.setCustomer(customerId);
			keyContact.setKcId(addCountId);
			
			tempKeyContactList.add(keyContact);
			session.put(AppConstants.KC_AUTO_COUNT, addCountId);
			
			// customerService.insertKeyContact(keyContact);
		}
		else if (oper.equalsIgnoreCase("edit"))
		{
			log.debug("Edit KeyContact");
			
			for (KeyContact keyContactTemp : tempKeyContactList)
			{
				if (keyContactTemp.getKcId().equals(keyContact.getKcId()))
				{
					int index;
					index=tempKeyContactList.indexOf(keyContactTemp);
					tempKeyContactList.remove(keyContactTemp);
					tempKeyContactList.add(index,keyContact);
				}
			}
			
			
			// customerService.updateKeyContact(keyContact);
		}
		else if (oper.equalsIgnoreCase("del"))
		{
			log.debug("Delete KeyContact");
			keyContact.setKcId(Integer.parseInt(id));
			
			for (KeyContact keyContactTemp : tempKeyContactList)
			{
				if (keyContactTemp.getKcId().equals(keyContact.getKcId()))
				{
					tempKeyContactList.remove(keyContactTemp);
					deletedKeyContactList.add(keyContact);
				}
			}
			
			// customerService.removeKeyContact(keyContact);
		}
		
		
		return SUCCESS;
	}
	
	
}
