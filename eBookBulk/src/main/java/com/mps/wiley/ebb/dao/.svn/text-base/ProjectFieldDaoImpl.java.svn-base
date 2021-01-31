package main.java.com.mps.wiley.ebb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.ContentFile;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectField;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("ProjectFieldDao")
@Transactional
public class ProjectFieldDaoImpl extends AbstractBaseDao<ProjectField> implements ProjectFieldDao 
{
	@Override
	public int insertProjectField(List<ProjectField> projectField) throws DataAccessException
	{
		final String strQuery = "INSERT INTO " + getTableName() + " ( "+getInsertFields()+" ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		List<Object[]> parameters = new ArrayList<Object[]>();
		for(ProjectField prjField : projectField)
		{
			parameters.add(new Object[]{prjField.getTemplateId(), prjField.getProjectId(), prjField.getPrjMomentumId(), prjField.getFldId(), prjField.getFldText(), prjField.getFldMandatory(), prjField.getFldOrder(), prjField.getFldDefault(), prjField.getFldFootnote()});
		}
	
		simpleJdbcTemplate.batchUpdate(strQuery, parameters);
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	@Override
	@Transactional
	public List<ProjectField> getProjectFieldByTemplateAndProjectId(Integer templateId, Integer projectId)
	{
		if(templateId!=null)
		return simpleJdbcTemplate.query("SELECT " + getFields() + " FROM " + getTableName() + " WHERE TEMPLATE_ID = ? AND PROJECT_ID = ?", this, templateId, projectId);
		else
		return simpleJdbcTemplate.query("SELECT " + getFields() + " FROM " + getTableName() + " WHERE PROJECT_ID = ?", this, projectId);	
	}
	
	@Override
	@Transactional
	public void removeProjectDyanamicFields(Integer templateId, Integer projectId) throws DataAccessException
	{
		final String strQuery = "DELETE FROM " + getTableName() + " WHERE TEMPLATE_ID = ? AND PROJECT_ID = ?";
		simpleJdbcTemplate.update(strQuery, templateId, projectId);
		
	}

	@Override
	public String getFields()
	{
		return "AUTO_ID,TEMPLATE_ID,PROJECT_ID,PRJ_MOMENTUM_ID,FLD_ID,FLD_TEXT,FLD_MANDATORY,FLD_ORDER,FLD_DEFAULT,FLD_FOOTNOTE";
	}
	
	public String getInsertFields()
	{
		return "TEMPLATE_ID,PROJECT_ID,PRJ_MOMENTUM_ID,FLD_ID,FLD_TEXT,FLD_MANDATORY,FLD_ORDER,FLD_DEFAULT,FLD_FOOTNOTE";
	}

	@Override
	public String getTableName()
	{
		return "PROJECT_FIELDS";
	}
	
	@Override
	public ProjectField mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ProjectField projectField = new ProjectField();
		projectField.setAutoId(rs.getInt("AUTO_ID"));
		projectField.setTemplateId(rs.getInt("TEMPLATE_ID"));
		projectField.setProjectId(rs.getInt("PROJECT_ID"));
		projectField.setPrjMomentumId(rs.getInt("PRJ_MOMENTUM_ID"));
		projectField.setFldId(rs.getInt("FLD_ID"));
		projectField.setFldText(rs.getString("FLD_TEXT"));
		projectField.setFldMandatory(rs.getInt("FLD_MANDATORY"));
		projectField.setFldOrder(rs.getInt("FLD_ORDER"));
		projectField.setFldDefault(rs.getString("FLD_DEFAULT"));
		projectField.setFldFootnote(rs.getString("FLD_FOOTNOTE"));
		return projectField;
	}
	
	
	
}
