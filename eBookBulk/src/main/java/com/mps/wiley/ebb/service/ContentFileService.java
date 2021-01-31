package main.java.com.mps.wiley.ebb.service;

import java.util.List;

import main.java.com.mps.wiley.ebb.domain.ContentFile;

public interface ContentFileService
{
	
	public int updateContentFile(ContentFile cf);
	
	public ContentFile getContentFileById(Integer iCfId);

	public ContentFile getContentFileById(Integer iPrjId, Integer iFileId);

	public List<ContentFile> getContentFilesByProject(Integer iPrjId);

	public List<ContentFile> getContentFileByColumn(String strQry, Object... objParam);
	
	public List<ContentFile> findProjectContentFiles(Integer iPrjId);
}
