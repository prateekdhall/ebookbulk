package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.Template;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("TemplateDao")
@Transactional
public class TemplateDaoImpl extends AbstractBaseDao<Template> implements TemplateDao
{
	final String INSERT_QRY = "PROJECT_ID,NAME,TYPE,CATEGORY,TITLE,DESCRIPTION,CREATED_BY,CREATED_DATE,PAGE_COUNT";
	
	
	public TemplateDaoImpl()
	{
	}
	
	@Override
	public String getTableName()
	{
		return "WEBSITE_TEMPLATE";
	}
	
	@Override
	public String getFields()
	{
		return "TEMPLATE_ID," + INSERT_QRY;
	}
	
	@Override
	public Template mapRow(ResultSet rs, int arg1) throws SQLException
	{
		Template template = new Template();
		template.setTemplateId(rs.getInt(1));
		template.setProjectId(rs.getInt(2));
		template.setName(rs.getString(3));
		template.setType(rs.getString(4));
		template.setCategory(rs.getString(5));
		template.setTitle(rs.getString(6));
		template.setDescription(rs.getString(7));
		template.setCreatedBy(rs.getString(8));
		template.setCreatedDate(rs.getDate(9));
		template.setPageCount(rs.getInt(10));
		return template;
	}
	
	@Override
	@Transactional
	public int addTemplate(Template temp) throws DataAccessException
	{
		insert(temp);
		temp.setTemplateId(null);
		return ((Template)read(temp)).getTemplateId();
		
		// final String strQry = "INSERT INTO " + getTableName() + " (" + INSERT_QRY + ") VALUES(?,?,?,?,?,?,?,?)";
		// return simpleJdbcTemplate.update(strQry, temp.getName(), temp.getType(), temp.getCategory(), temp.getTitle(), temp.getDescription(),
		// temp.getCreatedBy(), temp.getCreatedDate());
	}
	
	@Override
	@Transactional
	public int updateTemplate(Template temp) throws DataAccessException
	{
		return update(temp);
	}
	
	@Override
	@Transactional
	public int deleteTemplate(Template temp) throws DataAccessException
	{
		return remove(temp);
	}
	
	public Template getTemplateById(Template temp) throws DataAccessException
	{
		return (Template)read(temp);
	}
	
	@Override
	@Transactional
	public List<Template> getTemplate() throws DataAccessException
	{
		return getObjectList("1=1");
	}
	
	@Override
	@Transactional
	public Template getTemplateById(Integer iTempId) throws DataAccessException
	{
		return null;// getSingleObject("TEMPLATE_ID = ?", iTempId);
	}
}
