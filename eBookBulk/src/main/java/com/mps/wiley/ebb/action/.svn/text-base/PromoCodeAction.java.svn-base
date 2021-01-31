package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.service.ProjectService;
import main.java.com.mps.wiley.ebb.service.PromoCodeService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class PromoCodeAction extends Struts2AbstractAction implements ModelDriven<CodeConfig>, Preparable
{
	
	private static final long serialVersionUID = 7294387766989505575L;
	
	private CodeConfig codeConfig;
	
	private CodeValue codeValue;
	
	private List<CodeValue> promoCodeValueList = new ArrayList<CodeValue>();
	
	
	@Autowired
	PromoCodeService promoCodeService;
	
	@Autowired
	private ProjectService prjService;
	
	@Override
	public CodeConfig getModel()
	{
		CodeConfig codeConfig = new CodeConfig();
		return codeConfig;
	}
	
	public CodeConfig getCodeConfig()
	{
		return codeConfig;
	}
	
	
	public void setCodeConfig(CodeConfig codeConfig)
	{
		this.codeConfig = codeConfig;
	}
	
	public CodeValue getCodeValue()
	{
		return codeValue;
	}
	
	public void setCodeValue(CodeValue codeValue)
	{
		this.codeValue = codeValue;
	}
	
	
	public List<CodeValue> getPromoCodeValueList()
	{
		return promoCodeValueList;
	}
	
	public void setPromoCodeValueList(List<CodeValue> promoCodeValueList)
	{
		this.promoCodeValueList = promoCodeValueList;
	}
	
	
	@Action(value = "displayPromocode", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "promoCode"), @Result(name = "edit", type = "tiles", location = "updatePromocode")})
	public String displayPromocode()
	{
		System.out.println(codeConfig.getProjectId());
		Project project = prjService.getProjectById(codeConfig.getProjectId());
		int promoCodeCount = promoCodeService.selectPromoCountService(codeConfig.getProjectId());
		
		// promoCodeList=promoCodeService.getProjectPromoCodeService(project);
		
		codeConfig = promoCodeService.selectPromoCode(codeConfig.getProjectId());
		if (codeConfig != null)
		{
			if (codeConfig.getCodeStyle().equalsIgnoreCase("MANUAL"))
			{
				promoCodeValueList = promoCodeService.selectPromoCodeValueService(codeConfig.getProjectId());
				if (promoCodeValueList != null)
					if (promoCodeValueList.size() > 0)
					{
						String promoCodeList = "";
						for (CodeValue codeValueList : promoCodeValueList)
						{
							promoCodeList = promoCodeList + codeValueList.getPromoCode() + ",";
						}
						promoCodeList = promoCodeList.substring(0, promoCodeList.length() - 1);
						codeValue.setPromoCode(promoCodeList);
					}
			}
			requestObject.setAttribute("isActiveFlag", project.getOnceActive().toString());
			return "edit";
		}
		else
		{
			codeConfig = new CodeConfig();
			codeConfig.setProjectId(project.getProjectId());
		}
		
		return SUCCESS;
	}
	
	@Action(value = "addPromocode", results = {@Result(name = "success", type = "tiles", location = "promoCode")})
	public String addPromocode()
	{
		try
		{
			System.out.println("Code Config Id::" + codeConfig.getCodePrefix());
			System.out.println("Project Id::" + codeConfig.getProjectId());
			System.out.println("values::" + codeConfig.getCodeStyle() + "," + codeConfig.getCodeType() + "," + codeConfig.getCodePrefix() + "," + codeConfig.getCodeQuantity());
			System.out.println("size::" + codeConfig.getCodeSize());
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			codeConfig.setCreatedBy(sessionUser.getUserName());
			codeConfig.setCreatedDate(new Date());
			codeConfig.setUpdatedBy(sessionUser.getUserName());
			codeConfig.setUpdatedDate(new Date());
			promoCodeService.insertPromoCode(codeConfig);
			addActionMessage(getText("promo.code.config.save"));
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
		}
		return SUCCESS;
	}
	
	
	@Action(value = "updatePromoCode", results = {@Result(name = "success", type = "tiles", location = "updatePromocode")})
	public String updatePromoCode()
	{
		try
		{
			System.out.println("Code Config Id::" + codeConfig.getCodePrefix());
			System.out.println("Project Id::" + codeConfig.getProjectId());
			System.out.println("values::" + codeConfig.getCodeStyle() + "," + codeConfig.getCodeType() + "," + codeConfig.getCodePrefix() + "," + codeConfig.getCodeQuantity());
			System.out.println("size::" + codeConfig.getCodeSize());
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			codeConfig.setCreatedBy(sessionUser.getUserName());
			codeConfig.setCreatedDate(new Date());
			codeConfig.setUpdatedBy(sessionUser.getUserName());
			codeConfig.setUpdatedDate(new Date());
			int status = promoCodeService.updatePromoCodeService(codeConfig);
			
			
			System.out.println("status==" + status);
			Project project = prjService.getProjectById(codeConfig.getProjectId());
			project.setUrlFlag(0);
			final int iStatus = prjService.updateProject(project, session);
			System.out.println("iStatus==" + iStatus);
			addActionMessage(getText("promo.code.config.save"));
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
		}
		return SUCCESS;
	}
	
	
	@Action(value = "addPromoValue", results = {@Result(name = "success", type = "tiles", location = "promoCode")})
	public String addPromoValue()
	{
		try
		{
			System.out.println("addPromoValue action called...");
			System.out.println(codeValue.getPromoCode());
			Project project = prjService.getProjectById(codeConfig.getProjectId());
			if (!project.getOnceActive().toString().equals("1"))
			{
				promoCodeService.deletePromoCode(project);
			}
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			codeConfig.setCreatedBy(sessionUser.getUserName());
			codeConfig.setCreatedDate(new Date());
			codeConfig.setUpdatedBy(sessionUser.getUserName());
			codeConfig.setUpdatedDate(new Date());
			codeValue.setGeneratedBy(sessionUser.getUserName());
			codeValue.setGeneratedDate(new Date());
			codeValue.setProjectId(codeConfig.getProjectId());
			codeValue.setCodeStatus(0);
			
			promoCodeService.insertPromoValue(codeValue, codeConfig,project);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@Action(value = "generatePromocode", results = {@Result(name = "success", type = "tiles", location = "promoCode")})
	public String generatePromocode()
	{
		try
		{
			User sessionUser = (User)session.get(AppConstants.USER_OBJECT);
			System.out.println(codeValue.getCount());
			System.out.println(codeConfig.getProjectId());
			Project project = prjService.getProjectById(codeConfig.getProjectId());
			
			if (!project.getOnceActive().toString().equals("1"))
				promoCodeService.deletePromoCodeValues(project);
			
			CodeConfig configObj = promoCodeService.selectPromoCode(codeConfig.getProjectId());
			System.out.println(configObj.getCfId());
			codeValue.setProjectId(codeConfig.getProjectId());
			codeValue.setCodeType(codeConfig.getCodeType());
			codeValue.setCodeStatus(0);
			codeValue.setGeneratedBy(sessionUser.getUserName());
			codeValue.setGeneratedDate(new Date());
			int promoUpdate = promoCodeService.generatePromoCode(configObj, codeValue, null);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@Override
	public void prepare() throws Exception
	{
		// TODO Auto-generated method stub
		
	}
}