package main.java.com.mps.wiley.ebb.action;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import main.java.com.mps.common.AppSystem;
import main.java.com.mps.common.mail.MailObject;
import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.Email;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectUrl;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.KeyContactService;
import main.java.com.mps.wiley.ebb.service.ProjectService;
import main.java.com.mps.wiley.ebb.service.ProjectUrlService;
import main.java.com.mps.wiley.ebb.service.PromoCodeService;
import main.java.com.mps.wiley.ebb.service.UserService;
import main.java.com.mps.wiley.exception.UnableToProcessException;
import main.java.com.mps.wiley.util.EmailUtil;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class ProjectUrlAction extends Struts2AbstractAction implements ModelDriven<ProjectUrl>, Preparable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7809079304257623062L;
	
	private Project searchProject;
	private ProjectUrl projecturl;
	private Email email = new Email();
	
	public ProjectUrl getProjecturl()
	{
		return projecturl;
	}
	
	public void setProjecturl(ProjectUrl projecturl)
	{
		this.projecturl = projecturl;
	}
	
	public Email getEmail()
	{
		return email;
	}
	
	public void setEmail(Email email)
	{
		this.email = email;
	}
	
	@Autowired
	private ProjectUrlService prjurlservice;
	
	@Autowired
	private ProjectService prjService;
	
	@Autowired
	private KeyContactService keyContactService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	PromoCodeService promoCodeService;
	
	public ProjectUrl getModel()
	{
		// project = new Project();
		return projecturl;
	}
	
	@Override
	public void prepare() throws Exception
	{
		System.out.println("******** prepare *********");
	}
	
	@Action(value = "generateProjectUrl", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "emailTemplate"), @Result(name = "input", type = "tiles", location = "home")})
	@SkipValidation
	public String generateProjectUrl()
	{
		try
		{
			String stateParam = "";
			String isActive = "";
			
			String urlType = "";
			final int prjId = projecturl.getProjectId();
			System.out.println("enetr==" + prjId);
			Project project = prjService.getProjectById(prjId);
			if (null != requestObject.getParameter("state"))
			{
				stateParam = requestObject.getParameter("state");
			}
			if (null != requestObject.getParameter("isActive"))
			{
				isActive = requestObject.getParameter("isActive");
			}
			
			if (isActive.equals("0"))
			{
				// Truncate Project Urls from project_url table respective to
				// project id if Project is not Active
				// if (stateParam.equals("1"))
				prjurlservice.deleteProjectUrl(projecturl);
				
			}
			else if (isActive.equals("1"))
			{
				// do nothing
				// only new url will generated
			}
			
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			// Populate ProjectUrl
			projecturl.setProjectId(prjId);
			
			if (project.getProjectType().toString().equals("1"))
				urlType = "SINGLE";
			else if (project.getProjectType().toString().equals("2"))
				urlType = "MULTI";
			
			projecturl.setUrlType(urlType);
			projecturl.setCodeStatus(0);// 0 stands for url not in use
			projecturl.setGeneratedBy(sessionUser.getUserName());
			projecturl.setUrlcount("0");
			List<ProjectUrl> list = prjurlservice.getProjectUrlList(project); // Used
			// for
			// Generate
			// and
			// Re-Generate
			// Link
			// on
			// create
			// Project
			// Page
			
			boolean checkPromCodeValue = this.generatePromocode(project);
			
			prjurlservice.saveProjectUrl(projecturl, project, list);// Create
			// New or
			// Additional
			// Url in
			// Project_Url
			// on
			// clicking
			// of
			// Generate
			// Url Link and create Excel
			list = prjurlservice.getProjectUrlList(project);
			// used to update Project Url Flag in Project table depends upon generate url and promocode
			// matches the actual count has been generated
			
				project = prjurlservice.getProjectUrlAndPromoCodeFlag(project, checkPromCodeValue, list);
			
				
			final int iStatus = prjService.updateProject(project, session);// Update
			// Url_Flag
			// in
			// Project
			// Table
			// to
			// Active/Inactive
			// the
			// Generate
			// Link
			
			// Get KeyContacts EmailIds for Project in format LastName
			// Firstname<Email Id>,LastName Firstname<Email Id>
			
			String projectContactList = keyContactService.getProjectKeyContacts(project);
			//projectContactList = projectContactList.substring(0, projectContactList.length() - 2);
			email.setTo(projectContactList);
			// requestObject.setAttribute("toList", projectContactList);
			System.out.println("To Email IDs==" + projectContactList);
			
			// Get CC Email Ids for PA and Requestor
			
			List<User> userList = userService.getUsersByIds(project.getPrjAdmin().getId(),project.getRequester().getId());
			
			String emailList = "";
			for (User userEmailList : userList)
			{
				emailList = emailList + userEmailList.getUserName() + "; ";
			}
			//emailList = emailList.substring(0, emailList.length() - 2);
			email.setCc(emailList);
			// requestObject.setAttribute("ccList", emailList);
			System.out.println("CC Email IDs==" + emailList);
			
			String From = AppSystem.getMailConfig("admin.email");
			email.setFrom(From);
			// requestObject.setAttribute("from", From);
			// addActionMessage(getText("msg.project.update.url.success"));
			
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
	
	@Action(value = "sendEmailWithAttachment", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "emailTemplate"), @Result(name = "input", type = "tiles", location = "emailTemplate")})
	@SkipValidation
	public String sendEmailWithAttachment()
	{
		try
		{
			String From = email.getFrom();
			String[] toArr = null;
			String[] ccArr = null;
			MailObject objMail = null;
			String to = email.getTo();
			to = this.getEmailIds(to);
			String cc = email.getCc();
			cc = this.getCCEmailIds(cc);
			String Subject = email.getSubject();
			String TemplateFile = email.getEditor();
			TemplateFile = "<html><head><title></title></head><body>" + TemplateFile + "</body></html>";
			this.writeEmailTemplate(TemplateFile);
			TemplateFile = AppSystem.getConfig("templatefilename");
			String attachedFile = AppSystem.getConfig("tempexcelpath") + "temp" + ".xls";
			
			if (to.contains(","))
				toArr = to.split(",");
			else
				to = to;
			if (cc.contains(","))
				ccArr = cc.split(",");
			else
				cc = cc;
			
			if (toArr == null && ccArr == null)
				objMail = EmailUtil.sendEmailWithAttachment(to, cc, TemplateFile, From, Subject, attachedFile);
			else
				objMail = EmailUtil.sendEmailWithAttachment(toArr, ccArr, TemplateFile, From, Subject, attachedFile);
			
			if (objMail != null)
			{
				try
				{
					System.out.println("Sending E-mail....");
					AppSystem.EMAILSERVER.sendEmail(objMail);
					System.out.println("E-mail sent");
					addActionMessage(getText("msg.project.email.sent.success"));
					requestObject.setAttribute("success", "success");
				}
				catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					addActionError(getText("msg.project.email.sent.failure"));
					requestObject.setAttribute("success", "failure");
				}
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect.email.format"));
			return INPUT;
		}
		
		return SUCCESS;
	}
	
	
	@Action(value = "openXls", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "emailTemplate"), @Result(name = "input", type = "tiles", location = "emailTemplate")})
	@SkipValidation
	public String openXls()
	{
		try
		{
			FileInputStream fis = null;
			String filename="temp";
			File file=new File(AppSystem.getConfig("tempexcelpath") + "temp" + ".xls");
			/*boolean b=this.sendXlsFile(responseObject,file,filename);
			System.out.println("File Upload=="+b);*/
			
			filename = filename+".xls";
			responseObject.setContentType("application/download");
			responseObject.setHeader("Content-disposition", "attachment;filename="
					+ filename);
			ServletOutputStream out = responseObject.getOutputStream();
			fis = new FileInputStream(file);
			byte[] buf = new byte[4 * 1024]; // 4K buffer 
			int bytesRead;
			while ((bytesRead = fis.read(buf)) != -1)
				out.write(buf, 0, bytesRead);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			
			return INPUT;
		}
		
		return SUCCESS;
	}
	
	public boolean sendXlsFile(HttpServletResponse response, File file,
			String downloadFileName) throws UnableToProcessException
	{
		FileInputStream fis = null;
		try
		{
			downloadFileName = downloadFileName+".xls";
			response.setContentType("application/download");
			response.setHeader("Content-disposition", "attachment;filename="
					+ downloadFileName);
			ServletOutputStream out = response.getOutputStream();
			fis = new FileInputStream(file);
			byte[] buf = new byte[4 * 1024]; // 4K buffer 
			int bytesRead;
			while ((bytesRead = fis.read(buf)) != -1)
				out.write(buf, 0, bytesRead);

		}
		catch (Exception e)
		{
			throw new UnableToProcessException(e);
		}
		finally
		{
			if (fis != null)
				try
				{
					fis.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
		}

		return true;
	}
	
	public void writeEmailTemplate(String content)
	{
		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(AppSystem.getConfig("templatefilepath")));
			out.write(content);
			out.close();
		}
		catch (IOException e)
		{
			System.out.println("Exception " + e);
			
		}
	}
	
	public String getEmailIds(String emailid)
	{
		String emailList = "";
		if (emailid.contains(";"))
		{
			String emailarr[] = emailid.split(";");
			for (int i = 0; i < emailarr.length; i++)
			{
				String emailstr = emailarr[i];
				if (emailstr.indexOf('<') > 0 && emailstr.indexOf('>') > 0)
				{
					emailstr = emailstr.substring(emailstr.indexOf('<') + 1, emailstr.indexOf('>'));
					emailstr=emailstr.trim();
				}
				else
				{
					emailstr = emailstr;
					emailstr=emailstr.trim();
				}
				emailList = emailList + emailstr + ",";
			}
			emailList = emailList.substring(0, emailList.length() - 1);
		}
		else
		{
			emailid=emailid.trim();
			emailList = emailid+",";
		}
		if(emailList.lastIndexOf(",")<0)
		{
			emailList=emailList+",";
		}
		return emailList;
	}
	
	public String getCCEmailIds(String emailid)
	{
		String emailList = "";
		if (emailid.contains(";"))
		{
			String emailarr[] = emailid.split(";");
			for (int i = 0; i < emailarr.length; i++)
			{
				String emailstr = emailarr[i];
				emailstr=emailstr.trim();
				emailList = emailList + emailstr + ",";
			}
			emailList = emailList.substring(0, emailList.length() - 1);
		}
		else
		{
			emailid=emailid.trim();
			emailList = emailid+",";
		}
		if(emailList.lastIndexOf(",")<0)
		{
			emailList=emailList+",";
		}
		return emailList;
	}
	
	public boolean generatePromocode(Project project)
	{
		boolean b = false;
		try
		{
			int promoUpdate = 0;
			CodeValue codeValue = new CodeValue();
			CodeConfig configObj = promoCodeService.selectPromoCode(project.getProjectId());
			if(configObj!=null)
			{
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			System.out.println(codeValue.getCount());
			
			// if(project.getProjectType()==1)
			if (!project.getOnceActive().toString().equals("1"))
			{
				if (!configObj.getCodeStyle().equalsIgnoreCase("MANUAL"))
					promoCodeService.deletePromoCodeValues(project);
			}
			else if (project.getOnceActive().toString().equals("1"))
			{
				// No record will delete only additional quantity will added in PromoCode Value Table
			}
			
			
			System.out.println(configObj.getCfId());
			codeValue.setProjectId(configObj.getProjectId());
			codeValue.setCodeType(configObj.getCodeType());
			codeValue.setCodeStatus(0);
			codeValue.setGeneratedBy(sessionUser.getUserName());
			codeValue.setGeneratedDate(new Date());
			codeValue.setCount(project.getSoldQty() + project.getBackupQty());
			if (project.getOnceActive().toString().equals("0"))
				promoUpdate = promoCodeService.generatePromoCode(configObj, codeValue, project);
			else if (project.getOnceActive().toString().equals("1"))
				promoUpdate = promoCodeService.generatePromoCode(configObj, codeValue, project, prjurlservice);
			b = this.checkPromoCodeFlag(project, configObj);
			
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}
	
	public boolean checkPromoCodeFlag(Project project, CodeConfig configObj)
	{
		boolean check = false;
		int prjQuantity = 0;
		List<CodeValue> promoCodeValueList = promoCodeService.selectPromoCodeValueService(project.getProjectId());
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
				check = true;
			
			
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
				check = true;
			
		}
		return check;
	}
	
	
}