package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.PromoCodeConfigValue;

import org.springframework.dao.DataAccessException;

public interface PromoCodeDao
{
	public int insertPromoCode(CodeConfig codeConfig) throws DataAccessException;
	
	public CodeConfig selectPromoCode(int projectId) throws DataAccessException;
	
	public List<PromoCodeConfigValue> getProjectPromoCodeList(Project project) throws DataAccessException;
	
	public int selectPromoCodeCount(int projectId) throws DataAccessException;
	
	public int updatePromoCodeConfig(CodeConfig codeConfig) throws DataAccessException;
	
	public void removePromoCodeConfig(Project project) throws DataAccessException;

}
