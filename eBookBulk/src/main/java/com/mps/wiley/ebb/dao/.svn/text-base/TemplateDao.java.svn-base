package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.Template;

import org.springframework.dao.DataAccessException;


public interface TemplateDao extends BaseDao<Template>
{
	public int addTemplate(Template temp) throws DataAccessException;
	
	public int updateTemplate(Template temp) throws DataAccessException;
	
	public int deleteTemplate(Template temp) throws DataAccessException;
	
	public Template getTemplateById(Template temp) throws DataAccessException;

	public List<Template> getTemplate() throws DataAccessException;

	public Template getTemplateById(Integer iTempId) throws DataAccessException;
}
