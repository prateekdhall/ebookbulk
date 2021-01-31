package main.java.com.mps.wiley.ebb.service;


import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.common.DynamicFieldConstants;
import main.java.com.mps.wiley.ebb.dao.ProjectDao;
import main.java.com.mps.wiley.ebb.dao.ProjectFieldDao;
import main.java.com.mps.wiley.ebb.dao.TemplateDao;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.ProjectField;
import main.java.com.mps.wiley.ebb.domain.Template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("TemplateService")
@Transactional
public class TemplateServiceImpl implements TemplateService
{
	@Autowired
	private TemplateDao tDao;
	
	@Autowired
	private ProjectFieldDao projectFieldDao;
	
	@Autowired
	private ProjectDao projectDao;
	
	public TemplateServiceImpl()
	{
	}
	
	@Override
	@Transactional
	public int addTemplate(Template template, List<ProjectField> projectFieldList) throws DataAccessException
	{
		
		final int iTemplateId = tDao.addTemplate(template);
		projectDao.updateProjectTemplateFlag(template.getProjectId());
		if (projectFieldList != null && projectFieldList.size() > 0)
		{
			projectFieldDao.removeProjectDyanamicFields(template.getTemplateId(), template.getProjectId());
			for (ProjectField objField : projectFieldList)
			{
				objField.setTemplateId(iTemplateId);
				objField.setProjectId(template.getProjectId());
				System.out.println("PrjId: " + objField.getProjectId());
			}
			
			projectFieldDao.insertProjectField(projectFieldList);
		}
		return iTemplateId;
	}
	
	
	
	@Override
	@Transactional
	public int updateTemplate(Template template, List<ProjectField> projectFieldList) throws DataAccessException
	{
		int iReturn = 0;
		iReturn = tDao.updateTemplate(template);
		iReturn = projectDao.updateProjectTemplateFlag(template.getProjectId());
		if (projectFieldList != null && projectFieldList.size() > 0)
		{
			projectFieldDao.removeProjectDyanamicFields(template.getTemplateId(), template.getProjectId());
			for (ProjectField objField : projectFieldList)
			{
				objField.setTemplateId(template.getTemplateId());
				objField.setProjectId(template.getProjectId());
				System.out.println("PrjId: " + objField.getProjectId());
			}
			iReturn = projectFieldDao.insertProjectField(projectFieldList);
		}
		return iReturn;
	}
	
	@Override
	@Transactional
	public int deleteTemplate(Template template) throws DataAccessException
	{
		return tDao.deleteTemplate(template);
	}
	
	@Override
	@Transactional
	public Template getTemplateById(Template temp) throws DataAccessException
	{
		return tDao.getTemplateById(temp);
	}
	
	@Override
	@Transactional
	public List<Template> getTemplates() throws DataAccessException
	{
		return tDao.getTemplate();
	}
	
	@Override
	@Transactional
	public Template getTemplateById(Integer iTempId) throws DataAccessException
	{
		return null;
	}
	
	@Override
	@Transactional
	public boolean createRegistrationForm(List<DynamicField> list) throws DataAccessException
	{
		boolean b = false;
		// Create Html File
		return b;
	}
	
	@Override
	@Transactional
	public int updateProjectPromoCodeAndRegistrationFlag(Integer templateProjectId, Integer promoCodeExistFlag, Integer registrationFlagExist) throws DataAccessException
	{
		int iReturn=0;
		iReturn=projectDao.updateProjectPromoCodeAndRegistrationFlagDao(templateProjectId, promoCodeExistFlag, registrationFlagExist);
		return iReturn;
		
	}
	
	@Override
	@Transactional
	public int[] fetchProjectPromoCodeAndRegistrationFlag(List<ProjectField> projectFieldList, Integer templateProjectId) throws DataAccessException
	{
		boolean b=false;int promoCodeExistFlag=0;int registrationFlagExist=0;
		int iReturn = 0;
		int intArr[]=new int[]{ 0,0};
		ArrayList aList=this.getprojectFieldList(projectFieldList);
		if(aList!=null && aList.size()>0)
		{
			promoCodeExistFlag=this.returnPromoCodeExist(aList);
			registrationFlagExist=this.returnRegistrationExist(aList);
		}
		else
		{
			promoCodeExistFlag=AppConstants.NO;
			registrationFlagExist=AppConstants.NO;
		}
		intArr[0]=promoCodeExistFlag;
		intArr[1]=registrationFlagExist;
		
		return intArr;
		
	}
	
	
	public ArrayList getprojectFieldList(List<ProjectField> projectFieldList)
	{
		ArrayList arr=new ArrayList();
		ArrayList arr_mandatory=new ArrayList();
		ArrayList arr_fieldId=new ArrayList();
		for (ProjectField objField : projectFieldList)
		{
			arr_fieldId.add(objField.getFldId());
			arr_mandatory.add(objField.getFldMandatory());
		}
		
		arr.add(arr_fieldId);
		arr.add(arr_mandatory);
		
		return arr;
	}
	
	public int returnPromoCodeExist(ArrayList alistAll)
	{
		int promoCodeExist=0;
		if(((ArrayList)alistAll.get(0)).contains(DynamicFieldConstants.PROMOCODE))
		{
			promoCodeExist=AppConstants.OPTIONAL;
			int promoCodeIndex=((ArrayList)alistAll.get(0)).indexOf(DynamicFieldConstants.PROMOCODE);
			if(((ArrayList)alistAll.get(1)).get(promoCodeIndex).toString().equals("1"))
			{
				promoCodeExist=AppConstants.MANDATORY;
			}
		}
		else
		{
			promoCodeExist=AppConstants.NO;
		}
		
		return promoCodeExist;
	}
	
	public int returnRegistrationExist(ArrayList alistAll)
	{
		int registartionExist=0;
		if(((ArrayList)alistAll.get(1)).contains(1))
		{
			registartionExist=AppConstants.MANDATORY;
		}
		else
		{
			registartionExist=AppConstants.OPTIONAL;
		}
		
		return registartionExist;
	}
	
}
