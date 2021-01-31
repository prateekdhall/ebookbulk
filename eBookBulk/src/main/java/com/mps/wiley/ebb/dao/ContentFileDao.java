package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.ContentFile;

import org.springframework.dao.DataAccessException;


public interface ContentFileDao extends BaseDao<ContentFile>
{
	public int insertContentFile(ContentFile cf) throws DataAccessException;
	
	public int updateContentFile(ContentFile cf) throws DataAccessException;
	
	public void removeContentFile(ContentFile cf) throws DataAccessException;
	
	public ContentFile getContentFileById(Integer iCfId);
	
	public ContentFile getContentFileById(Integer iProjectId, Integer iFileId);
	
	public ContentFile getContentFileByColumn(String strQry, Object... objParam);
	
	public List<ContentFile> findProjectContentFiles(Integer iProjectId) throws DataAccessException;
}
