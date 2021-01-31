package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.mps.common.GenericComparator;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.common.Modules;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.ProjectService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class ProjectGridAction extends Struts2AbstractAction implements ModelDriven<Project>
{
	private static final long serialVersionUID = 2381331583937525331L;
	
	private Project project;
	private int module;
	List<Project> projectGridModel;
	List<Project> projectListObj = new ArrayList<Project>();
	private Integer rows = 0;
	private Integer page = 0;
	private Integer total = 0;
	private Integer records = 0;
	private String sord;
	private String sidx;
	private boolean loadonce = false;
	private int to;
	private int from;
	private String id;
	private String status;
	
	/**
	 * @return the status
	 */
	public final String getStatus()
	{
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public final void setStatus(String status)
	{
		this.status = status;
	}
	
	public Project getModel()
	{
		project = new Project();
		return project;
	}
	
	public Project getProject()
	{
		return project;
	}
	
	public void setProject(Project project)
	{
		this.project = project;
	}
	
	
	/**
	 * @return the module
	 */
	public final int getModule()
	{
		return module;
	}
	
	/**
	 * @param module
	 *           the module to set
	 */
	public final void setModule(int module)
	{
		this.module = module;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public List<Project> getProjectGridModel()
	{
		return projectGridModel;
	}
	
	public void setProjectGridModel(List<Project> projectGridModel)
	{
		this.projectGridModel = projectGridModel;
	}
	
	public List<Project> getProjectListObj()
	{
		return projectListObj;
	}
	
	public void setKeyContactListObj(List<Project> projectListObj)
	{
		this.projectListObj = projectListObj;
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
	
	@Autowired
	private ProjectService projectService;
	
	@Action(value = "projectGridAction", results = {@Result(name = "success", type = "json")})
	public String populateProjectGrid() throws Exception
	{
		try
		{
			System.out.println("Module: " + getModule());
			if (getModule() == Modules.MY_PROJECT)
			{
				User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
				projectListObj = projectService.loadMyProject(project.getProjectStatus(), sessionUser.getUsrId());
			}
			else if (getModule() == Modules.PROJECT_SEARCH)
			{
				System.out.println("Project Grid Action Status: " + status);
				projectListObj = projectService.getProjects(project, status);
			}
			
			if (("asc".equalsIgnoreCase(getSord()) || "desc".equalsIgnoreCase(getSord())) && getSidx() != null & !getSidx().trim().equals(""))
			{
				Collections.sort(projectListObj, new GenericComparator(sidx, getSord()));
			}
			if (getSord() != null && getSord().equalsIgnoreCase("desc"))
			{
				//Collections.sort(projectListObj);
				//Collections.reverse(projectListObj);
			}
			
			setRecords(projectListObj.size());
			to = getRows() * getPage();
			from = to - getRows();
			
			if (to > getRecords())
			{
				to = getRecords();
			}
			setTotal((int)Math.ceil((double)getRecords() / (double)getRows()));
			if (loadonce)
			{
				setProjectGridModel(projectListObj);
			}
			else
			{
				setProjectGridModel(projectListObj.subList(from, to));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@Action(value = "myprojectgrid", interceptorRefs = {@InterceptorRef("commonStack")},
			results = {@Result(name = "success", type = "dispatcher",
					location = "/WEB-INF/view/jsp/project/myprojectgrid.jsp"), @Result(name = "input",
					type = "dispatcher", location = "/WEB-INF/view/jsp/project/myprojectgrid.jsp")})
	public String myprojectgrid() throws Exception
	{
		System.out.println("Status: " + project.getProjectStatus());
// project.setProjectStatus(AppConstants.STATUS_PENDING);
		return SUCCESS;
	}
}
