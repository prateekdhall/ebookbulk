package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.PromoCodeConfigValue;

import org.springframework.dao.DataAccessException;

public interface PromoCodeService
{
	public int insertPromoCode(CodeConfig codeConfig) throws DataAccessException;
	
	public int insertPromoValue(CodeValue codeValue, CodeConfig codeConfig, Project project) throws DataAccessException;
	
	public CodeConfig selectPromoCode(int projectId) throws DataAccessException;
	
	public int generatePromoCode(CodeConfig codeConfig,CodeValue codeValue, Project project) throws DataAccessException;
	
	public int generatePromoCode(CodeConfig codeConfig,CodeValue codeValue, Project project, ProjectUrlService prjurlservice) throws DataAccessException;
	
	public  List<PromoCodeConfigValue> getProjectPromoCodeService(Project project) throws DataAccessException;
	
	public List<CodeValue> selectPromoCodeValueService(int projectId) throws DataAccessException;
	
	public int selectPromoCountService(int projectId) throws DataAccessException;
	
	public int updatePromoCodeService(CodeConfig codeConfig) throws DataAccessException;
	
	public void deletePromoCode(Project project)	throws DataAccessException;
	
	public void deletePromoCodeValues(Project project)	throws DataAccessException; 
}
