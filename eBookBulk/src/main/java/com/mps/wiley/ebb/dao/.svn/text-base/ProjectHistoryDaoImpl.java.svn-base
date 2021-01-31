package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.ProjectHistory;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("ProjectHistoryDao")
@Transactional
public class ProjectHistoryDaoImpl extends AbstractBaseDao<ProjectHistory> implements ProjectHistoryDao
{
	@Override
	public String getFields()
	{
		return "HST_ID, PROJECT_ID, FIELD_NAME, PREV_VALUE, CURR_VALUE, NOTIFICATION, CREATED_BY, CREATED_DATE";
	}
	
	@Override
	public String getTableName()
	{
		return "PROJECT_HISTORY";
	}
	
	@Override
	public ProjectHistory mapRow(ResultSet rs, int arg1) throws SQLException
	{
		ProjectHistory dto = new ProjectHistory();
		dto.setHstId(rs.getInt(1));
		dto.setProjectId(rs.getInt(2));
		dto.setFieldName(rs.getString(3));
		dto.setPrevValue(rs.getString(4));
		dto.setCurrValue(rs.getString(5));
		dto.setNotification(rs.getInt(6));
		dto.setCreatedBy(rs.getInt(7));
		dto.setCreatedDate(rs.getDate(8));
		return dto;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<ProjectHistory> getProjectHistory(final Integer iPrjId) throws DataAccessException
	{
		return getObjectList("PROJECT_ID = ? AND CREATED_DATE = (SELECT max(CREATED_DATE) FROM PROJECT_HISTORY WHERE PROJECT_ID = ?)", iPrjId, iPrjId);
	}
}
