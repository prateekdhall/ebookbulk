package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AppSystem;
import main.java.com.mps.common.mail.MailObject;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.common.util.AppUtil;
import main.java.com.mps.common.util.DateUtil;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.common.Modules;
import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.ContentFile;
import main.java.com.mps.wiley.ebb.domain.Customer;
import main.java.com.mps.wiley.ebb.domain.ExceptionMessage;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectHistory;
import main.java.com.mps.wiley.ebb.domain.ProjectUrl;
import main.java.com.mps.wiley.ebb.domain.Template;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.ContentFileService;
import main.java.com.mps.wiley.ebb.service.CustomerService;
import main.java.com.mps.wiley.ebb.service.ProjectService;
import main.java.com.mps.wiley.ebb.service.ProjectUrlService;
import main.java.com.mps.wiley.ebb.service.PromoCodeService;
import main.java.com.mps.wiley.ebb.service.TemplateService;
import main.java.com.mps.wiley.ebb.service.UserService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import bsh.ParseException;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;


@ParentPackage("ebbs")
@Namespace("/ebbs")
// @Validations(
// intRangeFields = {
// @IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "project.prjAdmin.id", min = "1", key = "error.pprjAdmin.id"),
// @IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "project.customer.id", min = "1", key = "error.projCustomer.id"),
// @IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "project.requester.id", min = "1", key = "error.projRequester.id")},
// requiredStrings = {
// @RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "project.projectName", key = "error.proj.name")})
public class ProjectAction extends Struts2AbstractAction implements ModelDriven<Project>, Preparable
{
	private static final long serialVersionUID = 7809079304257623062L;
	
	private static final String SUCCESS1 = "success1";
	private static final String SUCCESS2 = "success2";
	
	private Project project;
	private Project searchProject;
	private ProjectUrl projecturl;
	private int module;
	private int firstFlag = 0;
	private String status;
	private String[] statusArray = new String[] {};
	private String actionNameX;
	private Template template;
	
	List<ExceptionMessage> exceptionMessageListCPObj;
	
	/**
	 * @return the template
	 */
	public final Template getProjectTemplate()
	{
		return template;
	}
	
	/**
	 * @param template the template to set
	 */
	public final void setProjectTemplate(Template template)
	{
		System.out.println("*********** Template Setter ***********");
		this.template = template;
	}
	
	public String getActionName()
	{
		return actionNameX;
	}
	
	public void setActionName(String action)
	{
		this.actionNameX = action;
	}
	
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
	
	/**
	 * @return the statusArray
	 */
	public final String[] getStatusArray()
	{
		return statusArray;
	}
	
	/**
	 * @param statusArray the statusArray to set
	 */
	public final void setStatusArray(String[] statusArray)
	{
		this.statusArray = statusArray;
	}
	
	/**
	 * @return the project
	 */
	public final Project getProject()
	{
		return project;
	}
	
	/**
	 * @param project the project to set
	 */
	public final void setProject(Project project)
	{
		this.project = project;
	}
	
	public Project getSearchProject()
	{
		return searchProject;
	}
	
	public void setSearchProject(Project searchProject)
	{
		this.searchProject = searchProject;
	}
	
	public ProjectUrl getProjecturl()
	{
		return projecturl;
	}
	
	public void setProjecturl(ProjectUrl projecturl)
	{
		this.projecturl = projecturl;
	}
	
	public int getModule()
	{
		return module;
	}
	
	public void setModule(int module)
	{
		this.module = module;
	}
	
	@Autowired
	private ProjectService prjService;
	
	@Autowired
	private ProjectUrlService prjUrlService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomerService custService;
	
	@Autowired
	private ContentFileService cfService;
	
	@Autowired
	private PromoCodeService promoCodeService;
	
	@Autowired
	private TemplateService tmplService;
	
	private List<User> adminList;
	private List<User> requesterList;
	private List<Customer> customerList;
// private List<String> projectNameList = new ArrayList<String>();
	private List<Project> projectList;
	
	public List<Project> getProjectList()
	{
		return projectList;
	}
	
	public void setProjectList(List<Project> projectList)
	{
		this.projectList = projectList;
	}
	
	@Override
	public Project getModel()
	{
		// project = new Project();
		return project;
	}
	
	public int getFirstFlag()
	{
		return firstFlag;
	}
	
	public void setFirstFlag(int firstFlag)
	{
		this.firstFlag = firstFlag;
	}
	
	public ProjectAction()
	{
	}
	
	/**
	 * @return the adminList
	 */
	public final List<User> getAdminList()
	{
		return adminList;
	}
	
	/**
	 * @param adminList the adminList to set
	 */
	public final void setAdminList(List<User> adminList)
	{
		this.adminList = adminList;
	}
	
	/**
	 * @return the requesterList
	 */
	public final List<User> getRequesterList()
	{
		return requesterList;
	}
	
	/**
	 * @param requesterList the requesterList to set
	 */
	public final void setRequesterList(List<User> requesterList)
	{
		this.requesterList = requesterList;
	}
	
	/**
	 * @return the customerList
	 */
	public final List<Customer> getCustomerList()
	{
		return customerList;
	}
	
	/**
	 * @param customerList the customerList to set
	 */
	public final void setCustomerList(List<Customer> customerList)
	{
		this.customerList = customerList;
	}
	
	@Override
	public void prepare() throws Exception
	{
		System.out.println("******** prepare *********");
	}
	
	@Action(value = "createProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "tiles", location = "createProject"),
					@Result(name = "input", type = "redirect", location = "home.do")
			})
	@SkipValidation
	public String createProject()
	{
		try
		{
			project = generateProjectId();
			populateData();
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			project.getPrjAdmin().setId(sessionUser.getUsrId());
			
			session.remove(AppConstants.CF_GRID_LIST);
			session.remove(AppConstants.CF_DELETE_LIST);
			session.remove(AppConstants.CF_AUTO_COUNT);
			
			session.remove(AppConstants.EM_GRID_LIST);
			
			actionNameX = "add";
			
// exceptionMessageListCPObj = prjService.getExceptionMessagesByProject(project.getProjectId(),isNewProject);
// session.put(AppConstants.EM_GRID_LIST, exceptionMessageListCPObj);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		return SUCCESS;
	}
	
	public void prepareAddProject() throws Exception
	{
		populateData();
	}
	
	private void populateData()
	{
		// setAdminList(userService.getUsersByRoles(AppConstants.ROLE_SUPER_ADMIN, AppConstants.ROLE_PROJECT_ADMIN));
		setAdminList(userService.getUsersByRoles(AppConstants.ROLE_SUPER_ADMIN, AppConstants.ROLE_PROJECT_ADMIN, AppConstants.ROLE_REQUESTER));
		// setRequesterList(userService.getUsersByRole(AppConstants.ROLE_REQUESTER));
		setCustomerList(custService.getAllCustomers());
	}
	
	private Project generateProjectId()
	{
		Project prj = new Project();
		prj.setProjectId(prjService.getNewProjectId());
		return prj;
	}
	
	private boolean comboBoxValidation(Integer id)
	{
		return !((id == null) || (id.intValue() < 1));
	}
	
	private boolean projectValidations() throws ParseException, java.text.ParseException
	{
		
		boolean a1 = !(project.getProjectName().isEmpty());
		
		System.out.println(project.getPrjAdmin().getValue());
		
		boolean c1 = comboBoxValidation(project.getPrjAdmin().getId());
		boolean c2 = comboBoxValidation(project.getRequester().getId());
		boolean c3 = comboBoxValidation(project.getCustomer().getId());
		
		
		boolean b1 = DateUtil.getDateFormat(project.getAvailableDate()).before(DateUtil.getDateFormat(project.getExpiryDate()));
		boolean b2 = DateUtil.getDateFormat(project.getThresoldDate()).before(DateUtil.getDateFormat(project.getExpiryDate()));
		boolean b3 = DateUtil.getDateFormat(project.getThresoldDate()).after(DateUtil.getDateFormat(project.getAvailableDate()));
		
		if (a1 == false || c1 == false || c2 == false || c3 == false || b1 == false || b2 == false || b3 == false)
		{
			if (a1 == false)
			{
				addFieldError("project.projectName", getText("error.projectName"));
			}
			
			if (c1 == false)
			{
				addFieldError("project.prjAdmin.id", getText("error.prjAdmin.id"));
			}
			
			if (c2 == false)
			{
				addFieldError("project.requester.id", getText("error.requester.id"));
			}
			
			if (c3 == false)
			{
				addFieldError("project.customer.id", getText("error.customer.id"));
			}
			
			
			if (b1 == false)
			{
				// addActionError(getText("error.expiryDate"));
				addFieldError("project.expiryDate", getText("error.expiryDate"));
			}
			
			if (b2 == false || b3 == false)
			{
				// addActionError(getText("error.thresoldDate"));
				addFieldError("project.thresoldDate", getText("error.thresoldDate"));
			}
			
			return false;
		}
		else
		{
			return true;
		}
	}
	
	@Action(value = "addSubmitProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "tiles", location = "updateProject"),
					@Result(name = "input", type = "tiles", location = "createProject")
			})
	public String addProject()
	{
		try
		{
			System.out.println("******** addProject *********");
			
			if (projectValidations() == false)
				return INPUT;
			
			
			User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
			
			project.setCreatedBy(sessionUser.getUsrId());
			project.setUpdatedBy(sessionUser.getUsrId());
			
			if (project.getProjectId() != 0)
			{
				
				prjService.addProject(project, session);
				
				// project = generateProjectId();
				
				session.remove(AppConstants.CF_GRID_LIST);
				session.remove(AppConstants.CF_DELETE_LIST);
				session.remove(AppConstants.CF_AUTO_COUNT);
				
				session.remove(AppConstants.EM_GRID_LIST);
				
				
				viewProject();
				
				actionNameX = "edit";
				addActionMessage(getText("msg.project.add.success"));
				return SUCCESS;
			}
			else
			{
				session.remove(AppConstants.CF_GRID_LIST);
				session.remove(AppConstants.CF_DELETE_LIST);
				session.remove(AppConstants.CF_AUTO_COUNT);
				
				session.remove(AppConstants.EM_GRID_LIST);
				
				addActionError(getText("msg.project.add.failure"));
				
				return INPUT;
			}
		}
		catch (org.springframework.dao.DuplicateKeyException de)
		{
			addFieldError("project.projectName", getText("error.duplicate.projectName"));
			return INPUT;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "copyCriteriaProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {@Result(name = "success", type = "tiles", location = "copyCriteriaProject"),
					@Result(name = "input", type = "tiles", location = "createProject")})
	@SkipValidation
	public String copyCriteriaProject()
	{
		try
		{
			projectList = prjService.getAllProjects(project);
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "copyProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "tiles", location = "createProject"),
					@Result(name = "input", type = "tiles", location = "createProject")
			})
	@SkipValidation
	public String copyProject()
	{
		try
		{
			populateData();
			project = prjService.getProjectById(project.getProjectId());
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			
			if (sessionUser.getRoleId() == AppConstants.ROLE_PROJECT_ADMIN)
			{
				project.getPrjAdmin().setId(sessionUser.getUsrId());
			}
			
			actionNameX = "edit";
			List<ContentFile> contentFileListObj = cfService.getContentFilesByProject(project.getProjectId());
			exceptionMessageListCPObj = prjService.getExceptionMessagesByProject(project.getProjectId(), actionNameX);
			
			if (null != contentFileListObj && !contentFileListObj.isEmpty())
			{
				int addCountId = -10;
				for (ContentFile cf : contentFileListObj)
				{
					cf.setCfId(addCountId--);
				}
				
				session.remove(AppConstants.CF_GRID_LIST);
				session.remove(AppConstants.CF_DELETE_LIST);
				session.remove(AppConstants.CF_AUTO_COUNT);
				
				session.put(AppConstants.CF_GRID_LIST, contentFileListObj);
				session.put(AppConstants.CF_AUTO_COUNT, addCountId);
				session.put(AppConstants.EM_GRID_LIST, exceptionMessageListCPObj);
			}
			Project prj = generateProjectId();
			project.setProjectId(prj.getProjectId());
			project.setProjectStatus(AppConstants.STATUS_PENDING);
			project.setOnceActive(0);
			project.setUrlFlag(0);
			
			return SUCCESS;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "viewProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "tiles", location = "updateProject"),
					@Result(name = "input", type = "tiles", location = "searchProject")
			})
	@SkipValidation
	public String viewProject()
	{
		try
		{
			populateData();
			project = prjService.getProjectById(project.getProjectId());
			template = new Template();
			if (project.getTemplateFlag() == 1)
			{
				template.setProjectId(project.getProjectId());
				template = tmplService.getTemplateById(template);
				System.out.println("Template Name: " + template.getName());
			}
			requestObject.setAttribute("module", module);
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	public void prepareUpdateProject() throws Exception
	{
		System.out.println("******** prepareUpdateProject *********");
		populateData();
	}
	
	@Action(value = "updateProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success1", type = "tiles", location = "myProject"),
					@Result(name = "success2", type = "tiles", location = "searchProject"),
					@Result(name = "success", type = "tiles", location = "updateProject"),
					@Result(name = "input", type = "tiles", location = "updateProject")
			})
	public String updateProject()
	{
		try
		{
			boolean blnPromoCode = false;
			if (projectValidations() == false)
			{
				return INPUT;
			}
			
			User sessionUser = session.get(AppConstants.USER_OBJECT) != null ? (User)session.get(AppConstants.USER_OBJECT) : null;
			Integer userId = sessionUser.getUsrId();
			
			project.setCreatedBy(userId);
			project.setUpdatedBy(userId);
			
			CodeConfig configObj = promoCodeService.selectPromoCode(project.getProjectId());
			if (configObj != null)
			{
				blnPromoCode = this.checkPromoCodeFlag(project, configObj);
			}
			List<ProjectUrl> list = prjUrlService.getProjectUrlList(project);
			if (project.getProjectStatus() == AppConstants.STATUS_ACTIVE)
			{
				project.setOnceActive(1);
			}
			if (project.getOnceActive().toString().equals("1"))
			{
				prjUrlService.getProjectUrlAndPromoCodeFlag(project, blnPromoCode, list);
			}
			else if (project.getOnceActive().toString().equals("0"))
			{
				// project.setUrlFlag(0);
				prjUrlService.getProjectUrlAndPromoCodeFlag(project, blnPromoCode, list);
				project.setOnceActive(0);
			}
			
			final int iPrjId = project.getProjectId();
			final int iStatus = prjService.updateProject(project, session);
			if (iStatus != 0)
			{
				List<ProjectHistory> projectHistoryList = prjService.getProjectHistory(iPrjId);
				String strEmail = prjService.getProjectAdmin(iPrjId);
				
				sendContentMailToAdmin(strEmail, projectHistoryList);
				
				if (project.getProjectStatus() == AppConstants.STATUS_DELETED)
				{
					addActionMessage(getText("msg.project.delete.success"));
				}
				else
				{
					addActionMessage(getText("msg.project.update.success"));
				}
				session.remove(AppConstants.CF_GRID_LIST);
				session.remove(AppConstants.CF_DELETE_LIST);
				session.remove(AppConstants.CF_AUTO_COUNT);
				
				session.remove(AppConstants.EM_GRID_LIST);
				
				if (module == Modules.MY_PROJECT)
				{
					return SUCCESS1;
				}
				else if (module == Modules.PROJECT_SEARCH)
				{
					return SUCCESS2;
				}
				else
				{
					return SUCCESS;
				}
			}
			else
			{
				addActionError(getText("msg.project.update.failure"));
				session.remove(AppConstants.CF_GRID_LIST);
				session.remove(AppConstants.CF_DELETE_LIST);
				session.remove(AppConstants.CF_AUTO_COUNT);
				
				session.remove(AppConstants.EM_GRID_LIST);
				
				return INPUT;
			}
		}
		catch (org.springframework.dao.DuplicateKeyException de)
		{
			addFieldError("project.projectName", getText("error.duplicate.projectName"));
			return INPUT;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "searchProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "tiles", location = "searchProject"),
					@Result(name = "input", type = "tiles", location = "searchProject")})
	@SkipValidation
	public String searchProject() throws DataAccessException
	{
		try
		{
			populateData();
			
			session.remove(AppConstants.CF_GRID_LIST);
			session.remove(AppConstants.CF_DELETE_LIST);
			session.remove(AppConstants.CF_AUTO_COUNT);
			
			session.remove(AppConstants.EM_GRID_LIST);
			
			if (status != null)
			{
				status = AppUtil.convertArrayToQueryIn(statusArray);
				System.out.println("Project Action Status: " + status);
			}
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "myProject",
			interceptorRefs = {@InterceptorRef("commonStack")},
			results = {
					@Result(name = "success", type = "tiles", location = "myProject"),
					@Result(name = "input", type = "redirect", location = "home.do")})
	@SkipValidation
	public String myproject()
	{
		project = new Project();
		project.setProjectStatus(1);
		
		session.remove(AppConstants.CF_GRID_LIST);
		session.remove(AppConstants.CF_DELETE_LIST);
		session.remove(AppConstants.CF_AUTO_COUNT);
		
		session.remove(AppConstants.EM_GRID_LIST);
		
		System.out.println("***************************");
		return SUCCESS;
	}
	
	private void sendContentMailToAdmin(String email, List<ProjectHistory> projectHistoryList) throws Exception
	{
		try
		{
			List<MailObject> mailObject = new ArrayList<MailObject>();
			MailObject bean = null;
			
			bean = new MailObject();
			bean.setTemplate("project_history.vm");
			bean.setTo(email);
			bean.setFrom(AppSystem.getMailConfig("admin.email"));
			bean.setSubject("Notification of Field Change");
			
			for (ProjectHistory projectHistory : projectHistoryList)
			{
				projectHistory.setFieldName(projectHistory.getFieldName().replace('_', ' '));
			}
			
			bean.put("projectHistoryList", projectHistoryList);
			mailObject.add(bean);
			
			AppSystem.EMAILSERVER.sendEmail(mailObject);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	@Action(value = "drmDefineProject", interceptorRefs = {@InterceptorRef("commonStack")},
			results = {@Result(name = "success", type = "tiles", location = "drmDefine"), @Result(
					name = "input", type = "tiles", location = "drmDefine")})
	@SkipValidation
	public String drmDefineProject()
	{
		try
		{
			return SUCCESS;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	public boolean checkPromoCodeFlag(Project project, CodeConfig configObj)
	{
		boolean check = false;
		int prjQuantity = 0;
		List<CodeValue> promoCodeValueList = promoCodeService.selectPromoCodeValueService(project.getProjectId());
		if (promoCodeValueList != null)
		{
			if (project.getProjectType() == 1)
			{
				prjQuantity = project.getSoldQty() + project.getBackupQty();
				// FOR PREFIX
				if (configObj.getCodeStyle().equalsIgnoreCase("PREFIX"))
				{
					if (configObj.getCodeType().equalsIgnoreCase("SINGLE"))
					{
						if (prjQuantity == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
					else if (configObj.getCodeType().equalsIgnoreCase("MULTI"))
					{
						if (configObj.getCodeQuantity() == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
				}
				// FOR AUTO
				if (configObj.getCodeStyle().equalsIgnoreCase("AUTO"))
				{
					if (configObj.getCodeType().equalsIgnoreCase("SINGLE"))
					{
						if (prjQuantity == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
					else if (configObj.getCodeType().equalsIgnoreCase("MULTI"))
					{
						if (configObj.getCodeQuantity() == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
				}
				if (configObj.getCodeStyle().equalsIgnoreCase("MANUAL"))
					check = false;
				
				
			}
			else if (project.getProjectType() == 2)
			{
				prjQuantity = project.getSoldQty();
				if (configObj.getCodeStyle().equalsIgnoreCase("PREFIX"))
				{
					if (configObj.getCodeType().equalsIgnoreCase("SINGLE"))
					{
						if (prjQuantity == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
					else if (configObj.getCodeType().equalsIgnoreCase("MULTI"))
					{
						if (configObj.getCodeQuantity() == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
				}
				// FOR AUTO
				if (configObj.getCodeStyle().equalsIgnoreCase("AUTO"))
				{
					if (configObj.getCodeType().equalsIgnoreCase("SINGLE"))
					{
						if (prjQuantity == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
					else if (configObj.getCodeType().equalsIgnoreCase("MULTI"))
					{
						if (configObj.getCodeQuantity() == promoCodeValueList.size())
							check = true;
						else
							check = false;
					}
				}
				if (configObj.getCodeStyle().equalsIgnoreCase("MANUAL"))
					check = false;
				
			}
		}
		return check;
	}
	
	
}