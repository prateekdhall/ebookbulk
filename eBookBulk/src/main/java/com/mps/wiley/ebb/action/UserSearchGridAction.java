package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.mps.common.GenericComparator;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.UserService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class UserSearchGridAction extends Struts2AbstractAction implements ModelDriven<User>
{
	private static final long serialVersionUID = 4899501234938183637L;
	private Integer rows = 0;
	private Integer page = 0;
	private Integer total = 0;
	private Integer records = 0;
	private String sord;
	private String sidx;
	private boolean loadonce = false;
	private int to;
	private int from;
	
	private int firstFlag;
	
	List<User> userGridModel;
	List<User> searchUserListObj = new ArrayList<User>();
	
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
	
	private User searchUser;
	
	public User getSearchUser()
	{
		return searchUser;
	}
	
	
	public void setSearchUser(User searchUser)
	{
		this.searchUser = searchUser;
	}
	
	
	public List<User> getUserGridModel()
	{
		return userGridModel;
	}
	
	
	public void setUserGridModel(List<User> userGridModel)
	{
		this.userGridModel = userGridModel;
	}
	
	
	public List<User> getSearchUserListObj()
	{
		return searchUserListObj;
	}
	
	
	public void setSearchUserListObj(List<User> searchUserListObj)
	{
		this.searchUserListObj = searchUserListObj;
	}
	
	@Override
	public User getModel()
	{
		searchUser = new User();
		return searchUser;
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
	private UserService userService;
	
	@Action(value = "searchUserGridAction", results = {@Result(name = "success", type = "json")})
	public String populateSearchUserGrid() throws Exception
	{
		System.out.println("SearchGridAction called");
		System.out.println("first flag::" + firstFlag);
		if (firstFlag == 1)
		{
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			searchUser.setUsrId(sessionUser.getUsrId());
			searchUserListObj = userService.getUsers(searchUser);
			System.out.println("first flag");
		}
		else
		{
			searchUserListObj = null;
		}
		if (("asc".equalsIgnoreCase(getSord()) || "desc".equalsIgnoreCase(getSord())) && getSidx() != null & !getSidx().trim().equals(""))
		{
			Collections.sort(searchUserListObj, new GenericComparator(sidx, getSord()));
		}
		if (getSord() != null && getSord().equalsIgnoreCase("desc"))
		{
			// Collections.sort(searchUserListObj);
			// Collections.reverse(searchUserListObj);
		}

		
		setRecords(searchUserListObj.size());
		to = getRows() * getPage();
		from = to - getRows();
		
		if (to > getRecords())
		{
			to = getRecords();
		}
		setTotal((int)Math.ceil((double)getRecords() / (double)getRows()));
		
		if (loadonce)
		{
			setUserGridModel(searchUserListObj);
		}
		else
		{
			setUserGridModel(searchUserListObj.subList(from, to));
		}
		return SUCCESS;
	}
}
