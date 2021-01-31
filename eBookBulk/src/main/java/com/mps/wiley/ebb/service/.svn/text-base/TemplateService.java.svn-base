package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.ProjectField;
import main.java.com.mps.wiley.ebb.domain.Template;
import org.springframework.dao.DataAccessException;


public interface TemplateService
{
	public int addTemplate(Template template, List<ProjectField> projectFieldList) throws DataAccessException;
	
	public int updateTemplate(Template template, List<ProjectField> projectFieldList) throws DataAccessException;
	
	public int deleteTemplate(Template template) throws DataAccessException;
	
	public Template getTemplateById(Template temp) throws DataAccessException;
	
	public List<Template> getTemplates() throws DataAccessException;
	
	public Template getTemplateById(Integer iTempId) throws DataAccessException;
	
	public boolean createRegistrationForm(List<DynamicField> list) throws DataAccessException;
	
	public int[] fetchProjectPromoCodeAndRegistrationFlag(List<ProjectField> projectFieldList, Integer templateProjectId) throws DataAccessException;
	
	public int updateProjectPromoCodeAndRegistrationFlag(Integer templateProjectId, Integer promoCodeExistFlag, Integer registrationFlagExist ) throws DataAccessException;
}
