package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.common.util.DateUtil;
import main.java.com.mps.wiley.ebb.domain.ContentFile;
import main.java.com.mps.wiley.ebb.domain.DynamicField;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("ContentFileDao")
@Transactional
public class ContentFileDaoImpl extends AbstractBaseDao<ContentFile> implements ContentFileDao
{
	public ContentFileDaoImpl()
	{
	}
	
	@Override
	public String getTableName()
	{
		return "CONTENT_FILES";
	}
	
	@Override
	public String getFields()
	{
		return "CF_ID," + INSERT_FIELD + ", PRJ_MOMENTUM_ID, DOWNLOAD_URL, DOWNLOAD_COUNT";
	}
	
	private final String INSERT_FIELD = "PROJECT_ID, FILE_ID, FILE_NAME, FILE_TYPE, FILE_SIZE, TITLE, AUTHORS, NO_OF_PAGES, PUBLICATION_DATE, FILE_STATUS, CREATED_BY, CREATED_DATE, UPDATED_BY, UPDATED_DATE";
	
	@Override
	public ContentFile mapRow(ResultSet rs, int arg1) throws SQLException
	{
		ContentFile cf = new ContentFile();
		cf.setCfId(rs.getInt("CF_ID"));
		cf.setProjectId(rs.getInt("PROJECT_ID"));
		cf.setMomentumId(rs.getInt("PRJ_MOMENTUM_ID"));
		cf.setFileId(rs.getString("FILE_ID"));
		cf.setFileName(rs.getString("FILE_NAME"));
		cf.setFileType(rs.getInt("FILE_TYPE"));
		cf.setFileSize(rs.getInt("FILE_SIZE"));
		cf.setTitle(rs.getString("TITLE"));
		cf.setAuthors(rs.getString("AUTHORS"));
		cf.setNoOfPages(rs.getInt("NO_OF_PAGES"));
		cf.setPublicationDate(DateUtil.getDateNoTimeStringFormatFromString(rs.getString("PUBLICATION_DATE")));
		cf.setFileStatus(rs.getInt("FILE_STATUS"));
		cf.setDownloadUrl(rs.getString("DOWNLOAD_URL"));
		cf.setDownloadCount(rs.getInt("DOWNLOAD_COUNT"));
		cf.setCreatedBy(rs.getString("CREATED_BY"));
		cf.setCreatedDate(rs.getDate("CREATED_DATE"));
		cf.setUpdatedBy(rs.getString("UPDATED_BY"));
		cf.setUpdatedDate(rs.getDate("UPDATED_DATE"));
		return cf;
	}
	
	@Override
	@Transactional
	public int insertContentFile(ContentFile cf) throws DataAccessException
	{
		final String strQuery = "INSERT INTO " + getTableName() + " ( " + INSERT_FIELD + " ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		simpleJdbcTemplate.update(strQuery, cf.getProjectId(), cf.getFileId(), cf.getFileName(), cf.getFileType(), cf.getFileSize(), cf.getTitle(), cf.getAuthors(), cf.getNoOfPages(), DateUtil.getDateFormatFromNoTime(cf.getPublicationDate()), cf.getFileStatus(), cf.getCreatedBy(), cf.getCreatedDate(), cf.getUpdatedBy(), cf.getUpdatedDate());
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	@Override
	@Transactional
	public int updateContentFile(ContentFile cf) throws DataAccessException
	{
		final String strQuery = "UPDATE " + getTableName() + " SET FILE_NAME = ?, FILE_TYPE = ?, FILE_SIZE = ?, TITLE = ?, AUTHORS = ?, NO_OF_PAGES = ?, PUBLICATION_DATE = ?, FILE_STATUS = ?, UPDATED_BY = ?, UPDATED_DATE = ? WHERE CF_ID = ? ";
		return simpleJdbcTemplate.update(strQuery, cf.getFileName(), cf.getFileType(), cf.getFileSize(), cf.getTitle(), cf.getAuthors(), cf.getNoOfPages(), DateUtil.getDateFormatFromNoTime(cf.getPublicationDate()), cf.getFileStatus(), cf.getUpdatedBy(), cf.getUpdatedDate(), cf.getCfId());
	}
	
	@Override
	@Transactional
	public void removeContentFile(ContentFile cf) throws DataAccessException
	{
		final String strQuery = "DELETE FROM " + getTableName() + " WHERE CF_ID = ? ";
		simpleJdbcTemplate.update(strQuery, cf.getCfId());
		
	}
	
	@Override
	@Transactional
	public ContentFile getContentFileById(Integer iCfId)
	{
		return simpleJdbcTemplate.queryForObject("SELECT " + getFields() + " FROM " + getTableName() + " WHERE CF_ID = ?", this, iCfId);
	}
	
	@Override
	@Transactional
	public ContentFile getContentFileById(Integer iProjectId, Integer iFileId)
	{
		return simpleJdbcTemplate.queryForObject("SELECT " + getFields() + " FROM " + getTableName() + " WHERE PROJECT_ID = ? AND FILE_ID = ?", this, iProjectId, iFileId);
	}
	
	@Override
	@Transactional
	public ContentFile getContentFileByColumn(String strQry, Object... objParam)
	{
		List<ContentFile> objList = simpleJdbcTemplate.query("SELECT " + getFields() + " FROM " + getTableName() + " WHERE " + strQry, this, objParam);
		return (objList == null || objList.isEmpty()) ? null : objList.get(0);
	}
	
	@Override
	@Transactional
	public List<ContentFile> findProjectContentFiles(Integer iProjectId) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName()+ " WHERE PROJECT_ID = ? AND PRJ_MOMENTUM_ID IS NULL AND FILE_TYPE=1 AND FILE_STATUS in(1,2)";
		return simpleJdbcTemplate.query(strQuery.toString(), this, iProjectId);
	}
	
	
}
