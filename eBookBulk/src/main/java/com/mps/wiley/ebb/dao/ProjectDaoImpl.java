package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.common.util.DateUtil;
import main.java.com.mps.common.util.StringUtil;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.Project;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("ProjectDao")
@Transactional
public class ProjectDaoImpl extends AbstractBaseDao<Project> implements ProjectDao
{
	public ProjectDaoImpl()
	{
	}
	
	private final String INSERT_FIELD = "PROJECT_ID, PROJECT_NAME, PRJ_ADMIN, REQUESTER, CUSTOMER, PROJECT_STATUS, NOTES, PROJECT_TYPE, ST_URL, ECOMP, AVAILABLE_DATE, EXPIRY_DATE, THRESOLD_DATE, DRM, REGISTRATION, PROMO_CODE, SOLD_QTY, BACKUP_QTY, THRESOLD_QTY, PRINT_ALLOWED, COPY_ALLOWED, CONVERSION_ALLOWED, PROJECT_TEMPLATE, CREATED_BY, CREATED_DATE, UPDATED_BY, UPDATED_DATE";
	
	@Override
	public String getTableName()
	{
		return "PROJECT";
	}
	
	@Override
	public String getFields()
	{
		return INSERT_FIELD + ", CONTENT_FLAG, TEMPLATE_FLAG, URL_FLAG, ONCE_ACTIVE";
	}
	
	@Override
	@Transactional
	public Project mapRow(ResultSet rs, int arg1) throws SQLException
	{
		Project project = new Project();
		
		project.setProjectId(rs.getInt("PROJECT_ID"));
		project.setProjectName(rs.getString("PROJECT_NAME"));
		project.getPrjAdmin().setId((rs.getInt("PRJ_ADMIN")));
		project.getRequester().setId((rs.getInt("REQUESTER")));
		project.getCustomer().setId((rs.getInt("CUSTOMER")));
		project.setProjectStatus(rs.getInt("PROJECT_STATUS"));
		project.setNotes(rs.getString("NOTES"));
		project.setProjectType(rs.getInt("PROJECT_TYPE"));
		project.setStUrl(rs.getString("ST_URL"));
		project.setEcomp(rs.getInt("ECOMP"));
		project.setAvailableDate(DateUtil.getDateStringFormatFromString(rs.getString("AVAILABLE_DATE")));
		project.setExpiryDate(DateUtil.getDateStringFormatFromString(rs.getString("EXPIRY_DATE")));
		project.setThresoldDate(DateUtil.getDateStringFormatFromString(rs.getString("THRESOLD_DATE")));
		project.setDrm(rs.getInt("DRM"));
		project.setRegistration(rs.getInt("REGISTRATION"));
		project.setPromoCode(rs.getInt("PROMO_CODE"));
		project.setSoldQty(rs.getInt("SOLD_QTY"));
		project.setBackupQty(rs.getInt("BACKUP_QTY"));
		project.setThresoldQty(rs.getInt("THRESOLD_QTY"));
		project.setPrintAllowed(rs.getInt("PRINT_ALLOWED"));
		project.setCopyAllowed(rs.getInt("COPY_ALLOWED"));
		project.setConversionAllowed(rs.getInt("CONVERSION_ALLOWED"));
		project.setTemplate(rs.getString("PROJECT_TEMPLATE"));
		project.setCreatedBy(rs.getInt("CREATED_BY"));
		project.setCreatedDate(rs.getDate("CREATED_DATE"));
		project.setUpdatedBy(rs.getInt("UPDATED_BY"));
		project.setUpdatedDate(rs.getDate("UPDATED_DATE"));
		project.setUrlFlag(rs.getInt("URL_FLAG"));
		project.setOnceActive(rs.getInt("ONCE_ACTIVE"));
		project.setContentFlag(rs.getInt("CONTENT_FLAG"));
		project.setTemplateFlag(rs.getInt("TEMPLATE_FLAG"));
		
		return project;
	}
	
	@Override
	@Transactional
	public int getNewProjectId() throws DataAccessException
	{
		final String strQuery = "select PROJECT_ID from PROJECT_SEQUENCE";
		int iPrjId = simpleJdbcTemplate.queryForInt(strQuery);
		iPrjId++;
		System.out.println("iPrjId: " + iPrjId);
		simpleJdbcTemplate.update("UPDATE PROJECT_SEQUENCE SET PROJECT_ID = ?", iPrjId);
		return iPrjId;
	}
	
	@Override
	@Transactional
	public int insertProject(Project project) throws DataAccessException
	{
		final String strQuery = "INSERT INTO " + getTableName() + " ( " + INSERT_FIELD + " ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		simpleJdbcTemplate.update(strQuery, project.getProjectId(), project.getProjectName(), project.getPrjAdmin().getId(), project.getRequester().getId(), project.getCustomer().getId(), project.getProjectStatus(), project.getNotes(), project.getProjectType(), project.getStUrl(), project.getEcomp(), DateUtil.getDateFormat(project.getAvailableDate()), DateUtil.getDateFormat(project.getExpiryDate()), DateUtil.getDateFormat(project.getThresoldDate()), project.getDrm(), project.getRegistration(), project.getPromoCode(), project.getSoldQty(), project.getBackupQty(), project.getThresoldQty(), project.getPrintAllowed(), project.getCopyAllowed(), project.getConversionAllowed(), project.getTemplate(), project.getCreatedBy(), project.getCreatedDate(), project.getUpdatedBy(), project.getUpdatedDate());
		return project.getProjectId();
	}
	
	@Override
	@Transactional
	public int updateProject(Project project) throws DataAccessException
	{
		// final String strQuery = "UPDATE " + getTableName() +
		// " SET PROJECT_ID = ?, PROJECT_NAME = ?, PRJ_ADMIN = ?, REQUESTER = ?, CUSTOMER = ?, PROJECT_STATUS = ?, NOTES = ?, PROJECT_TYPE = ?, ST_URL = ?, ECOMP = ?, AVAILABLE_DATE = ?, EXPIRY_DATE = ?, THRESOLD_DATE = ?, DRM = ?, REGISTRATION = ?, PROMO_CODE = ?, SOLD_QTY = ?, BACKUP_QTY = ?, THRESOLD_QTY = ?, DOWNLOADED_COUNT = ?, PRINT_ALLOWED = ?, COPY_ALLOWED = ?, CONVERSION_ALLOWED = ?, UPDATED_BY = ?, UPDATED_DATE = ? WHERE PROJECT_ID = ?";
		// return simpleJdbcTemplate.update(strQuery, project.getProjectId(), project.getProjectName(), project.getPrjAdmin().getId(),
		// project.getRequester().getId(), project.getCustomer().getId(), project.getProjectStatus(), project.getNotes(), project.getProjectType(),
		// project.getStUrl(), project.getEcomp(), project.getAvailableDate(), project.getExpiryDate(), project.getThresoldDate(), project.getDrm(),
		// project.getRegistration(), project.getPromoCode(), project.getSoldQty(), project.getBackupQty(), project.getThresoldQty(),
		// project.getDownloadedCount(), project.getPrintAllowed(), project.getCopyAllowed(), project.getConversionAllowed(), project.getUpdatedBy(),
		// project.getUpdatedDate(), project.getProjectId());
		
		
		final String sql = "{ call sp_ebulkbook_update_project_details( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
		return simpleJdbcTemplate.update(sql, new Object[] {project.getProjectId(), project.getProjectName(), project.getPrjAdmin().getId(), project.getRequester().getId(), project.getCustomer().getId(), project.getProjectStatus(), project.getNotes(), project.getProjectType(), project.getStUrl(), project.getEcomp(), DateUtil.getDateFormat(project.getAvailableDate()), DateUtil.getDateFormat(project.getExpiryDate()), DateUtil.getDateFormat(project.getThresoldDate()), project.getDrm(), project.getRegistration(), project.getPromoCode(), project.getSoldQty(), project.getBackupQty(), project.getThresoldQty(), project.getPrintAllowed(), project.getCopyAllowed(), project.getConversionAllowed(), project.getTemplate(), project.getCreatedBy(), project.getCreatedDate(), project.getUpdatedBy(), project.getUpdatedDate(), project.getUrlFlag(), project.getOnceActive()});
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public Project getProjectById(Integer iPrjId)
	{
		return simpleJdbcTemplate.queryForObject("SELECT " + getFields() + " FROM " + getTableName() + " WHERE PROJECT_ID = ?", this, iPrjId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Project> getProjectList(Project project, String strStatus) throws DataAccessException
	{
		StringBuilder query = new StringBuilder();
		final List<Object> paramStr = new ArrayList<Object>();
		query.append("SELECT myProject.PROJECT_ID, myProject.PROJECT_NAME, cust.COMPANY_NAME, userreq.USER_NAME, useradmin.USER_NAME, myProject.PROJECT_TYPE, myProject.ECOMP, myProject.PROJECT_STATUS,GROUP_CONCAT(files.FILE_ID),myProject.PROJECT_TEMPLATE, myProject.URL_FLAG, myProject.ONCE_ACTIVE, myProject.SOLD_QTY, myProject.ST_URL FROM PROJECT myProject INNER JOIN CUSTOMER as cust ON myProject.CUSTOMER = cust.CUST_ID INNER JOIN USER as useradmin ON myProject.PRJ_ADMIN = useradmin.USR_ID INNER JOIN USER as userreq ON myProject.REQUESTER = userreq.USR_ID LEFT JOIN CONTENT_FILES as files ON myProject.PROJECT_ID = files.PROJECT_ID ");
		if (null != project.getProjectId() || StringUtil.isValidStr(project.getProjectName()) || (-1 != project.getProjectType() && null != project.getProjectType()) || (-1 != project.getEcomp() && null != project.getEcomp()) || StringUtil.isValidStr(project.getCustomer().getValue()) || StringUtil.isValidStr(project.getRequester().getValue()) || StringUtil.isValidStr(project.getPrjAdmin().getValue()) || (StringUtil.isValidStr(strStatus)) || project.getNotes() != null)
		{
			query.append(" WHERE ");
			projectSelectQuery(query, project, paramStr, strStatus);
		}
		query.append(" GROUP BY myProject.PROJECT_ID");
		List<Project> resultList = getObjectList(query.toString(), Project.class, new String[] {"projectId", "projectName", "customer.value", "requester.value", "prjAdmin.value", "projectType", "ecomp", "projectStatus", "notes", "template", "urlFlag", "onceActive", "soldQty", "stUrl"}, new int[] {INTEGER, STRING, STRING, STRING, STRING, INTEGER, INTEGER, INTEGER, STRING, STRING, INTEGER, INTEGER, INTEGER, STRING}, paramStr.toArray());
		return resultList;
	}
	
	private void projectSelectQuery(final StringBuilder tempSql, final Project project, final List<Object> paramStr, String strStatus)
	{
		boolean check = false;
		if (null != project.getProjectId())
		{
			tempSql.append("myProject.PROJECT_ID=?");
			paramStr.add(project.getProjectId());
			check = true;
		}
		if (StringUtil.isValidStr(project.getProjectName()))
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("myProject.PROJECT_NAME like ?");
			paramStr.add("%" + project.getProjectName() + "%");
			check = true;
		}
		if (StringUtil.isValidStr(project.getCustomer().getValue()))
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("cust.COMPANY_NAME like ?");
			paramStr.add("%" + project.getCustomer().getValue() + "%");
			check = true;
		}
		if (StringUtil.isValidStr(project.getRequester().getValue()))
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("userreq.USER_NAME like ?");
			paramStr.add("%" + project.getRequester().getValue() + "%");
			check = true;
		}
		if (StringUtil.isValidStr(project.getPrjAdmin().getValue()))
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("useradmin.USER_NAME like ?");
			paramStr.add("%" + project.getPrjAdmin().getValue() + "%");
			check = true;
		}
		if (null != project.getProjectType() && -1 != project.getProjectType())
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("myProject.PROJECT_TYPE=?");
			paramStr.add(project.getProjectType());
			check = true;
		}
		if (null != project.getEcomp() && -1 != project.getEcomp())
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("myProject.ECOMP=?");
			paramStr.add(project.getEcomp());
			check = true;
		}
		if (StringUtil.isValidStr(strStatus))
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("myProject.PROJECT_STATUS in (" + strStatus + ")");
			// paramStr.add(strStatus);
			check = true;
		}
		if (project.getNotes() != null)
		{
			if (check)
			{
				tempSql.append(" AND ");
			}
			tempSql.append("files.FILE_ID like ?");
			paramStr.add("%" + project.getNotes() + "%");
			check = true;
		}
		return;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Project> getAllProjectList(Project project) throws DataAccessException
	{
		System.out.println("Inside Dao");
		final String query = "SELECT myProject.PROJECT_ID, myProject.PROJECT_NAME FROM " + getTableName() + " myProject";
		List<Project> resultList = getObjectList(query, Project.class, new String[] {"projectId", "projectName"}, new int[] {INTEGER, STRING});
		System.out.println("Project Name::" + resultList.get(0).getProjectName());
		return resultList;
	}
	
	@Transactional
	public void pendingToActiveCron() throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET PROJECT_STATUS = " + AppConstants.STATUS_ACTIVE + " WHERE PROJECT_STATUS = " + AppConstants.STATUS_PENDING + " AND URL_FLAG = '1' AND CONTENT_FLAG = '1' AND TEMPLATE_FLAG = '1' AND ( DATE(AVAILABLE_DATE) = CURDATE() OR DATE(AVAILABLE_DATE) < CURDATE()) AND ONCE_ACTIVE = 0";
		simpleJdbcTemplate.update(strQuery);
	}
	
	@Transactional
	public void activeToInactiveCaseOneCron() throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET PROJECT_STATUS = " + AppConstants.STATUS_ACTIVE + " WHERE PROJECT_STATUS = " + AppConstants.STATUS_PENDING + " AND ( DATE(EXPIRY_DATE) = CURDATE() OR DATE(EXPIRY_DATE) < CURDATE())";
		simpleJdbcTemplate.update(strQuery);
	}
	
	@Transactional
	public void activeToInactiveCaseTwoCron() throws DataAccessException
	{
		final String sql = "{ call sp_ebulkbook_cron_project_Active_To_Inactive() }";
		simpleJdbcTemplate.update(sql);
	}
	
	
	@Override
	@Transactional
	public List<Project> getProjectListByStatus(Integer iStatus, Integer iPrjAdmin) throws DataAccessException
	{
		final StringBuilder strQry = new StringBuilder();
		strQry.append("SELECT p.PROJECT_ID, p.PROJECT_NAME, p.CUSTOMER, c.COMPANY_NAME, p.REQUESTER, ur.USER_NAME, p.PRJ_ADMIN, ua.USER_NAME, p.PROJECT_TYPE, p.AVAILABLE_DATE, p.EXPIRY_DATE, p.THRESOLD_DATE, p.SOLD_QTY, p.BACKUP_QTY, p.THRESOLD_QTY");
		strQry.append(", GROUP_CONCAT(files.FILE_ID), GROUP_CONCAT(files.TITLE), p.URL_FLAG, p.ONCE_ACTIVE");
		strQry.append(" FROM PROJECT p INNER JOIN CUSTOMER as c ON p.CUSTOMER = c.CUST_ID INNER JOIN USER as ua ON p.PRJ_ADMIN = ua.USR_ID INNER JOIN USER as ur ON p.REQUESTER = ur.USR_ID");
		strQry.append(" LEFT JOIN CONTENT_FILES as files ON p.PROJECT_ID = files.PROJECT_ID WHERE p.PROJECT_STATUS = ? AND p.PRJ_ADMIN = ?");
		strQry.append(" GROUP BY p.PROJECT_ID");
		
		List<Project> resultList = simpleJdbcTemplate.query(strQry.toString(), new RowMapper<Project>()
			{
				@Override
				public Project mapRow(ResultSet rs, int arg1) throws SQLException
				{
					Project project = new Project();
					
					project.setProjectId(rs.getInt(1));
					project.setProjectName(rs.getString(2));
					project.getCustomer().setId((rs.getInt(3)));
					project.getCustomer().setValue((rs.getString(4)));
					project.getRequester().setId((rs.getInt(5)));
					project.getRequester().setValue((rs.getString(6)));
					project.getPrjAdmin().setId((rs.getInt(7)));
					project.getPrjAdmin().setValue((rs.getString(8)));
					project.setProjectType(rs.getInt(9));
					project.setAvailableDate(DateUtil.getDateStringFormatFromString(rs.getString(10)));
					project.setExpiryDate(DateUtil.getDateStringFormatFromString(rs.getString(11)));
					project.setThresoldDate(DateUtil.getDateStringFormatFromString(rs.getString(12)));
					project.setSoldQty(rs.getInt(13));
					project.setBackupQty(rs.getInt(14));
					project.setThresoldQty(rs.getInt(15));
					project.setNotes(rs.getString(16));
					project.setTemplate(rs.getString(17));
					project.setUrlFlag(rs.getInt(18));
					project.setOnceActive(rs.getInt(19));
					
					return project;
				}
			}, iStatus, iPrjAdmin);
		return resultList;
	}
	
	public int updateProjectTemplateFlag(Integer iPrjId) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET TEMPLATE_FLAG = " + AppConstants.YES + " WHERE PROJECT_ID = ?";
		return simpleJdbcTemplate.update(strQuery, iPrjId);
	}
	
	
	public int updateProjectPromoCodeAndRegistrationFlagDao(Integer iPrjId, Integer promoFlag, Integer registrationFlag) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET PROMO_CODE = ?, REGISTRATION = ?  WHERE PROJECT_ID = ?";
		return simpleJdbcTemplate.update(strQuery, promoFlag, registrationFlag, iPrjId);
	}
}