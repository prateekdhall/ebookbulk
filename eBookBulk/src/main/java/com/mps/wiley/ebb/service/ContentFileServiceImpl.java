package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import main.java.com.mps.wiley.ebb.dao.ContentFileDao;
import main.java.com.mps.wiley.ebb.domain.ContentFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("ContentFileService")
@Transactional
public class ContentFileServiceImpl implements ContentFileService
{
	public ContentFileServiceImpl()
	{
	}
	
	@Autowired
	ContentFileDao cfDao;
	
	@Override
	public int updateContentFile(ContentFile cf)
	{
		return cfDao.updateContentFile(cf);
	}
	
	@Override
	public ContentFile getContentFileById(Integer iCfId)
	{
		return cfDao.getContentFileById(iCfId);
	}
	
	@Override
	public ContentFile getContentFileById(Integer iPrjId, Integer iFileId)
	{
		return cfDao.getContentFileById(iPrjId, iFileId);
	}
	
	@Override
	public List<ContentFile> getContentFilesByProject(Integer iPrjId)
	{
		return cfDao.getObjectList("PROJECT_ID = ? AND PRJ_MOMENTUM_ID is null", iPrjId);
	}
	
	@Override
	public List<ContentFile> getContentFileByColumn(String strQry, Object... objParam)
	{
		return cfDao.getObjectList(strQry, objParam);
	}
	
	@Override
	public List<ContentFile> findProjectContentFiles(Integer iPrjId)
	{
		return cfDao.findProjectContentFiles(iPrjId);
	}
	
	
}
