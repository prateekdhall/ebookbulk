package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.mps.common.GenericComparator;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.ContentFile;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.service.ContentFileService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class ContentFileGridAction extends Struts2AbstractAction implements ModelDriven<ContentFile>
{
	
	List<ContentFile> contentFileGridModel;
	List<ContentFile> contentFileListObj = new ArrayList<ContentFile>();
	List<ContentFile> deletedContentFileList = new ArrayList<ContentFile>();
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
	
	private int projectId;
	
	@Autowired
	private ContentFileService cfService;
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	private String id;
	
	
	public List<ContentFile> getContentFileGridModel()
	{
		return contentFileGridModel;
	}
	
	public void setContentFileGridModel(List<ContentFile> contentFileGridModel)
	{
		this.contentFileGridModel = contentFileGridModel;
	}
	
	public List<ContentFile> getContentFileListObj()
	{
		return contentFileListObj;
	}
	
	public void setContentFileListObj(List<ContentFile> contentFileListObj)
	{
		this.contentFileListObj = contentFileListObj;
	}
	
	private Project project;
	
	public Project getProject()
	{
		log.info("*********** Getter project ***********");
		return project;
	}
	
	public void setProject(Project project)
	{
		log.info("*********** Setter project ***********");
		this.project = project;
	}
	
	private ContentFile contentFile;
	
	public ContentFile getContentFile()
	{
		log.info("*********** Getter ContentFile ***********");
		return contentFile;
	}
	
	public void setContentFile(ContentFile contentFile)
	{
		log.info("*********** Getter ContentFile ***********");
		this.contentFile = contentFile;
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
	
	
	@Override
	public ContentFile getModel()
	{
		contentFile = new ContentFile();
		return contentFile;
	}
	
	
	@SuppressWarnings("unchecked")
	@Action(value = "contentFileGridAction", results = {@Result(name = "success", type = "json")})
	public String populateContentFileGrid() throws Exception
	{
		
		projectId = contentFile.getProjectId();
		
		if (session.get(AppConstants.CF_GRID_LIST) == null)
		{
			System.out.println("Project Id = " + projectId);
			contentFileListObj = cfService.getContentFilesByProject(projectId);
			
			int addCountId = -10;
			
			session.remove(AppConstants.CF_GRID_LIST);
			session.remove(AppConstants.CF_DELETE_LIST);
			session.remove(AppConstants.CF_AUTO_COUNT);
			
			session.put(AppConstants.CF_GRID_LIST, contentFileListObj);
			session.put(AppConstants.CF_DELETE_LIST, deletedContentFileList);
			session.put(AppConstants.CF_AUTO_COUNT, addCountId);
		}
		else
		{
			contentFileListObj = (List<ContentFile>)session.get(AppConstants.CF_GRID_LIST);
			System.out.println("----- Edit Operation ------");
		}
		
		if (("asc".equalsIgnoreCase(getSord()) || "desc".equalsIgnoreCase(getSord())) && getSidx() != null & !getSidx().trim().equals(""))
		{
			Collections.sort(contentFileListObj, new GenericComparator(sidx, getSord()));
		}
		if (getSord() != null && getSord().equalsIgnoreCase("desc"))
		{
			//Collections.sort(contentFileListObj);
			//Collections.reverse(contentFileListObj);
		}
		
		setRecords(contentFileListObj.size());
		to = getRows() * getPage();
		from = to - getRows();
		
		if (to > getRecords())
		{
			to = getRecords();
		}
		setTotal((int)Math.ceil((double)getRecords() / (double)getRows()));
		if (loadonce)
		{
			setContentFileGridModel(contentFileListObj);
		}
		else
		{
			setContentFileGridModel(contentFileListObj.subList(from, to));
		}
		return SUCCESS;
	}
	
	
	@SuppressWarnings("unchecked")
	@Action(value = "editContentFileGrid", results = {@Result(name = "success", type = "json")})
	public String editContentFileGrid() throws Exception
	{
		
		List<ContentFile> tempContentFileList = (List<ContentFile>)session.get(AppConstants.CF_GRID_LIST);
		List<ContentFile> deletedContentFileList = (List<ContentFile>)session.get(AppConstants.CF_DELETE_LIST);
		int addCountId = (Integer)session.get(AppConstants.CF_AUTO_COUNT);
		
		
		if (oper.equalsIgnoreCase("add"))
		{
			
			log.debug("Add ContentFile");
			
			addCountId = addCountId - 1;
			// contentFile.setPublicationDate(new Date()); // Temp DatePicker Implementation
			contentFile.setProjectId(projectId);
			contentFile.setCfId(addCountId);
			
			tempContentFileList.add(contentFile);
			session.put(AppConstants.CF_AUTO_COUNT, addCountId);
		}
		else if (oper.equalsIgnoreCase("edit"))
		{
			log.debug("Edit ContentFile");
			contentFile.setCfId(Integer.parseInt(id));
			
			for (ContentFile contentFileTemp : tempContentFileList)
			{
				if (contentFileTemp.getCfId().equals(contentFile.getCfId()))
				{
					int index;
					index = tempContentFileList.indexOf(contentFileTemp);
					tempContentFileList.remove(contentFileTemp);
					
					// contentFile.setPublicationDate(new Date()); // Temp DatePicker Implementation
					
					tempContentFileList.add(index, contentFile);
					
				}
			}
		}
		else if (oper.equalsIgnoreCase("del"))
		{
			log.debug("Delete ContentFile");
			contentFile.setCfId(Integer.parseInt(id));
			
			for (ContentFile contentFileTemp : tempContentFileList)
			{
				if (contentFileTemp.getCfId().equals(contentFile.getCfId()))
				{
					tempContentFileList.remove(contentFileTemp);
					deletedContentFileList.add(contentFile);
				}
			}
		}
		
		return SUCCESS;
	}
}
