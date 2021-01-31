package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.mps.common.GenericComparator;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.common.DynamicFieldConstants;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.ProjectField;
import main.java.com.mps.wiley.ebb.domain.RegisteredUser;
import main.java.com.mps.wiley.ebb.domain.RegistrationDetails;
import main.java.com.mps.wiley.ebb.domain.Template;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.DynamicFieldService;
import main.java.com.mps.wiley.ebb.service.ProjectFieldService;
import main.java.com.mps.wiley.ebb.service.RegistrationDetailsService;
import main.java.com.mps.wiley.ebb.service.TemplateService;
import main.java.com.mps.wiley.util.SaveObject;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.opensymphony.xwork2.ModelDriven;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class DynamicFieldGridAction extends Struts2AbstractAction implements ModelDriven<DynamicField>
{
	
	private static final long serialVersionUID = -7273760889712117702L;
	private Integer rows = 0;
	private Integer page = 0;
	private Integer total = 0;
	private Integer records = 0;
	private String sord;
	private String sidx;
	private boolean loadonce = false;
	private int to;
	private int from;
	
	List<DynamicField> dynamicFieldGridModel;
	List<DynamicField> listDynaFieldsObj = new ArrayList<DynamicField>();
	private List<ProjectField> projectFieldList = new ArrayList<ProjectField>();
	private DynamicField dynamicField;
	
	private Template template = new Template();
	
	@Autowired
	TemplateService tmplService;
	
	@Autowired
	RegistrationDetailsService registrationDetailsService;
	
	public Template getTemplate()
	{
		return template;
	}
	
	public void setTemplate(Template template)
	{
		this.template = template;
	}
	
	public List<DynamicField> getListDynaFieldsObj()
	{
		return listDynaFieldsObj;
	}
	
	public void setListDynaFieldsObj(List<DynamicField> listDynaFieldsObj)
	{
		this.listDynaFieldsObj = listDynaFieldsObj;
	}
	
	public List<DynamicField> getDynamicFieldGridModel()
	{
		return dynamicFieldGridModel;
	}
	
	public void setDynamicFieldGridModel(List<DynamicField> dynamicFieldGridModel)
	{
		this.dynamicFieldGridModel = dynamicFieldGridModel;
	}
	
	public DynamicField getDynamicField()
	{
		return dynamicField;
	}
	
	public void setDynamicField(DynamicField dynamicField)
	{
		this.dynamicField = dynamicField;
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
	
	@Override
	public DynamicField getModel()
	{
		dynamicField = new DynamicField();
		return dynamicField;
	}
	
	final String strFileSeperator = "/";
	
	final String PFLIST = "projectFieldSessionList";
	
	final String PROMOREGFLAG = "promoCodeRegistrationFlag";
	
	// final String strTemplatePath = AppSystem.getConfig("app.template.physicalpath") + strFileSeperator + AppConstants.TEMPLATE_SYSTEM +
	// strFileSeperator + "new.html";
	
	
	
	
	
	@Autowired
	private DynamicFieldService dynamicFieldService;
	
	@Autowired
	private ProjectFieldService projectFieldService;
	
	@Action(value = "dynamicFieldsAction", results = {@Result(name = "success", type = "tiles", location = "viewDynamicField"), @Result(name = "input", type = "tiles", location = "viewDynamicField")})
	public String populateDynamicFieldGrid() throws Exception
	{
		try
		{
			System.out.println("dynamicFieldsAction called");
			
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			
			
			/**************************** Mithilesh Work *********************/
			
			String fieldId = requestObject.getParameter("fieldId");
			String fielsName = requestObject.getParameter("fieldName");
			String fieldsTyple = requestObject.getParameter("fieldType");
			String fielsMandatory = requestObject.getParameter("fieldMandatory");
			String fielsOrder = requestObject.getParameter("fieldOrder");
			String fielsLabel = requestObject.getParameter("fieldLabel");
			String templateId = requestObject.getParameter("templateId");
			String pageId = requestObject.getParameter("pageId");
			
			String countrySelected = requestObject.getParameter("countrySelected");
			String hearus = requestObject.getParameter("hearus");
			String footNote = requestObject.getParameter("footNote");
			if(footNote==null)footNote="";
			
			System.out.println("pageId=" + pageId);
			if (pageId == null)
				pageId = "1";
			
			int pageIdint = Integer.parseInt(pageId);
			
			String[] fieldIds = fieldId.split(",");
			String[] fielsNames = fielsName.split(",");
			String[] fielsLabels = fielsLabel.split(",");
			String[] fieldsTyples = fieldsTyple.split(",");
			String[] fielsMandatorys = fielsMandatory.split(",");
			String[] fielsOrders = fielsOrder.split(",");
			
			List<DynamicField> objList = new ArrayList<DynamicField>();
			DynamicField objField = null;
			for (int i = 0; i < fieldIds.length; i++)
			{
				System.out.println(fieldIds[i] + "   " + fielsNames[i] + "  " + fieldsTyples[i] + "   " + fielsMandatorys[i] + " " + fielsOrders[i] + " " + fielsLabels[i]);
				
				objField = new DynamicField();
				int fieldIdc = Integer.parseInt(fieldIds[i]);
				int order = Integer.parseInt(fielsOrders[i].trim().toString());
				objField.setFieldId(fieldIdc);
				objField.setFieldName(fielsNames[i]);
				objField.setFieldLabel(fielsLabels[i]);
				objField.setFieldType(fieldsTyples[i]);
				objField.setFieldMandatory(fielsMandatorys[i]);
				objField.setFieldOrder(order);
				objList.add(objField);
			}
			System.out.println("List Values " + objList.size() + "   " + objList.get(0).getFieldId() + "  " + objList.get(0).getFieldName());
			
			/******************************* Ends Here ********************************/
			
			if (templateId != null)
			{
				template.setTemplateId(Integer.parseInt(templateId));
			}
			else
			{
				// template.setTemplateId(1);
				// Change this
				addActionError(getText("error.unexpect"));
			}
			
			System.out.println("template.getTemplateId(): " + template.getTemplateId());
			// template = tmplService.getTemplateById(template);
			
			ProjectField prjField = null;
			if (fieldIds.length > 0)
			{
				for (int i = 0; i < fieldIds.length; i++)
				{
					int fieldIdc = Integer.parseInt(fieldIds[i]);
					int order = Integer.parseInt(fielsOrders[i].trim().toString());
					int mandatory = 0;
					prjField = new ProjectField();
					prjField.setTemplateId(template.getTemplateId());
					prjField.setProjectId(template.getProjectId());
					
					prjField.setFldId(fieldIdc);
					prjField.setFldText(fielsNames[i]);
					
					if (fielsMandatorys[i].equals("true"))
						mandatory = 1;
					else if (fielsMandatorys[i].equals("false"))
						mandatory = 0;
					
					prjField.setFldMandatory(mandatory);
					prjField.setFldOrder(order);
					
					if(Integer.parseInt(fieldIds[i])==DynamicFieldConstants.COUNTRY)
					{
						prjField.setFldDefault(countrySelected);
					}
					
					
					if(Integer.parseInt(fieldIds[i])==DynamicFieldConstants.WHERE_DID_YOU_HEAR_ABOUT_US)
					{
						prjField.setFldDefault(hearus);
					}
			
					
					if(Integer.parseInt(fieldIds[i])==DynamicFieldConstants.STATE)
					{
						prjField.setFldFootnote(footNote);	
					}
					
					
					
					
					projectFieldList.add(prjField);
				}
			}
			// delete data for that project and template before inserting in table
			
			List<ProjectField> getprojectFieldList = projectFieldService.getProjectFieldByTemplateAndProjectId(template.getTemplateId(), template.getProjectId());
			if (getprojectFieldList.size() > 0)
			{
				// projectFieldService.deleteProjectFieldService(template.getTemplateId(), template.getProjectId());
			}
			
			// enter data in session for Project_field table for a specfic project and template
			
			session.put(PFLIST, projectFieldList);
			
			// listDynaFieldsObj = dynamicFieldService.loadDynamicFields();
			
			listDynaFieldsObj = objList;
			
			int intArrList[]=tmplService.fetchProjectPromoCodeAndRegistrationFlag((List<ProjectField>)session.get(PFLIST),template.getProjectId());
			session.put(PROMOREGFLAG, intArrList);
			
			
			// Object, template id retrueve after submitting form
			String htmlString = dynamicFieldService.writeHtmlFile(listDynaFieldsObj, template, session, countrySelected, hearus, footNote, intArrList);
			// searchUserListObj = userService.getUsers(searchUser);
			System.out.println("listDynaFieldsObj populate");
			
			if (("asc".equalsIgnoreCase(getSord()) || "desc".equalsIgnoreCase(getSord())) && getSidx() != null & !getSidx().trim().equals(""))
			{
				Collections.sort(listDynaFieldsObj, new GenericComparator(sidx, getSord()));
			}
			if (getSord() != null && getSord().equalsIgnoreCase("desc"))
			{
				//Collections.sort(listDynaFieldsObj);
				//Collections.reverse(listDynaFieldsObj);
			}
			
			setRecords(listDynaFieldsObj.size());
			to = getRows() * getPage();
			from = to - getRows();
			
			if (to > getRecords())
			{
				to = getRecords();
			}
			setTotal((int)Math.ceil((double)getRecords() / (double)getRows()));
			
			if (loadonce)
			{
				setDynamicFieldGridModel(listDynaFieldsObj);
			}
			else
			{
				setDynamicFieldGridModel(listDynaFieldsObj.subList(from, to));
			}
			
			
			requestObject.setAttribute("successMessage", "Data has been submitted successfully.");
			requestObject.setAttribute("htmlContent", htmlString);
			return SUCCESS;
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "dynamicFieldsSubmitAction", results = {@Result(name = "success", type = "json")})
	public String dynamicFieldsSubmitAction() throws Exception
	{
		System.out.println("dynamicFieldsSubmitAction called");
		System.out.println("dynamicFieldGridModel==" + dynamicFieldGridModel);
		if (dynamicFieldGridModel != null)
			System.out.println(dynamicFieldGridModel.size());
		
		return SUCCESS;
	}
	
	
	
	@Action(value = "registerUser", results = {@Result(name = "success", type = "tiles", location = "createCustomer"), @Result(name = "input", type = "tiles", location = "createCustomer")})
	@SkipValidation
	public String registerUser() throws Exception
	{
		RegistrationDetails registerObj = new RegistrationDetails();
		RegisteredUser serializeObj = new RegisteredUser();
		SaveObject so = new SaveObject();
		try
		{
			String name = "", email = "", phone = "", address = "", gender = "", country = "";
			int projectid = 0;
			
			projectid = Integer.parseInt(requestObject.getParameter("projectid").toString());
			registerObj.setProjectId(projectid);
			name = requestObject.getParameter("Name").toString();
			serializeObj.setName(name);
			email = requestObject.getParameter("EMAIL").toString();
			serializeObj.setEmail(email);
			phone = requestObject.getParameter("Phone").toString();
			serializeObj.setPhone(phone);
			address = requestObject.getParameter("Address").toString();
			serializeObj.setAddress(address);
			gender = requestObject.getParameter("Gender").toString();
			serializeObj.setGender(gender);
			country = requestObject.getParameter("Country").toString();
			serializeObj.setCountry(country);
			
			
			so.setJavaObject(serializeObj);
			byte[] data = so.saveObject();
			
			//registerObj.setRegistrationObject(data);//Need to check giving error after updates from svn
			registerObj.setIpAddress(requestObject.getRemoteAddr());
			registrationDetailsService.insertRegisteration(registerObj);
			
			return SUCCESS;
		}
		catch (DataAccessException e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	}
