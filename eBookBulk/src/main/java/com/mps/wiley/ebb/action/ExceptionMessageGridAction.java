package main.java.com.mps.wiley.ebb.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.mps.common.GenericComparator;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.common.util.StringUtil;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.ExceptionMessage;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.service.ProjectService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

@ParentPackage("ebbs")
@Namespace("/ebbs")
public class ExceptionMessageGridAction  extends Struts2AbstractAction implements ModelDriven<ExceptionMessage>
{

	List<ExceptionMessage> exceptionMessageGridModel;
	List<ExceptionMessage> exceptionMessageListObj = new ArrayList<ExceptionMessage>();
	
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
	private String oper;
	
	private Project project;
	private ExceptionMessage exceptionMessage;
	
	private Integer projectId;
	private String id;
	
	public String getActionName()
	{
		return actionName;
	}
	public void setActionName(String actionName)
	{
		this.actionName = actionName;
	}
	private String actionName;
	
	@Autowired
	private ProjectService projectService;
	
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
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	
	public List<ExceptionMessage> getExceptionMessageGridModel()
	{
		return exceptionMessageGridModel;
	}
	public void setExceptionMessageGridModel(List<ExceptionMessage> exceptionMessageGridModel)
	{
		this.exceptionMessageGridModel = exceptionMessageGridModel;
	}
	public List<ExceptionMessage> getExceptionMessageListObj()
	{
		return exceptionMessageListObj;
	}
	public void setExceptionMessageListObj(List<ExceptionMessage> exceptionMessageListObj)
	{
		this.exceptionMessageListObj = exceptionMessageListObj;
	}
	public Project getProject()
	{
		return project;
	}
	public void setProject(Project project)
	{
		this.project = project;
	}

	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public ExceptionMessage getExceptionMessage()
	{
		return exceptionMessage;
	}
	public void setExceptionMessage(ExceptionMessage exceptionMessage)
	{
		this.exceptionMessage = exceptionMessage;
	}

	@Action(value = "ExceptionMessageGridAction", results = {@Result(name = "success", type = "json")})
	public String populateContentFileGrid()
	{
		try
		{

			projectId = exceptionMessage.getProjectId();
			if(!StringUtil.isValidStr(actionName)){
				actionName = "edit";
			}
			
			if (session.get(AppConstants.EM_GRID_LIST) == null)
			{
				System.out.println("Project Id = " + projectId);
				exceptionMessageListObj = projectService.getExceptionMessagesByProject(projectId,actionName);
				
//				exceptionMessageListObj = projectService.getExceptionMessagesByProject(projectId,true);
				
				session.remove(AppConstants.EM_GRID_LIST);
				
				session.put(AppConstants.EM_GRID_LIST, exceptionMessageListObj);
			}
			else
			{
				exceptionMessageListObj = (List<ExceptionMessage>)session.get(AppConstants.EM_GRID_LIST);
				System.out.println("----- Edit Operation ------");
				
			}
			
			if (("asc".equalsIgnoreCase(getSord()) || "desc".equalsIgnoreCase(getSord())) && getSidx() != null & !getSidx().trim().equals(""))
			{
				Collections.sort(exceptionMessageListObj, new GenericComparator(sidx, getSord()));
			}
			if (getSord() != null && getSord().equalsIgnoreCase("desc"))
			{
				// Collections.sort(exceptionMessageListObj);
				// Collections.reverse(exceptionMessageListObj);
			}

			
			setRecords(exceptionMessageListObj.size());
			to = getRows() * getPage();
			from = to - getRows();
			
			if (to > getRecords())
			{
				to = getRecords();
			}
			setTotal((int)Math.ceil((double)getRecords() / (double)getRows()));
			if (loadonce)
			{
				setExceptionMessageGridModel(exceptionMessageListObj);
			}
			else
			{
				setExceptionMessageGridModel(exceptionMessageListObj.subList(from, to));
			}
			return SUCCESS;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return SUCCESS;

		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Action(value = "editExceptionMessageGridAction", results = {@Result(name = "success", type = "json")})
	public String editExceptionMessageGrid() throws Exception
	{
		
		List<ExceptionMessage> tempExceptionMessageList = (List<ExceptionMessage>)session.get(AppConstants.EM_GRID_LIST);

		if (oper.equalsIgnoreCase("edit"))
		{
			log.debug("Edit ExeeptionMessage");
			exceptionMessage.setMsgId(Integer.parseInt(id));
			
			for (ExceptionMessage exceptionMessageTemp : tempExceptionMessageList)
			{
				if (exceptionMessageTemp.getMsgId().equals(exceptionMessage.getMsgId()))
				{
					int index;
					index = tempExceptionMessageList.indexOf(exceptionMessageTemp);
					exceptionMessage.setExceptionEvent(exceptionMessageTemp.getExceptionEvent());
					tempExceptionMessageList.remove(exceptionMessageTemp);
					
					tempExceptionMessageList.add(index, exceptionMessage);
				}
			}
		}
		
		session.remove(AppConstants.EM_GRID_LIST);
		session.put(AppConstants.EM_GRID_LIST, tempExceptionMessageList);
		
		return SUCCESS;
	}
	@Override
	public ExceptionMessage getModel()
	{
		exceptionMessage = new ExceptionMessage();
		return exceptionMessage;
	}
	
	
}
