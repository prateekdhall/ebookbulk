package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.PromoCodeConfigValue;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("PromoCodeDao")
@Transactional
public class PromoCodeDaoImpl extends AbstractBaseDao implements PromoCodeDao
{
	
	public PromoCodeDaoImpl()
	{
		
	}
	
	private final String INSERT_FIELD = "PROJECT_ID, STYLE, CODE_TYPE, CODE_SIZE, QTY, CODE_PREFIX, CREATED_BY, CREATED_DATE, UPDATED_BY, UPDATED_DATE";
	
	@Override
	public int insertPromoCode(CodeConfig codeConfig) throws DataAccessException
	{
		System.out.println("codeConfig.getCodeType()==="+codeConfig.getCodeType()+"===codeConfig.getCodeSize()==="+codeConfig.getCodeSize());
		if (codeConfig.getCodeType().equals(""))
		{
			codeConfig.setCodeType(null);
		}
		
		if (codeConfig.getCodeSize().equals(""))
		{
			codeConfig.setCodeSize(null);
		}
		System.out.println("codeConfig.getCodeType()==="+codeConfig.getCodeType()+"===codeConfig.getCodeSize()==="+codeConfig.getCodeSize());
		
		final String strQuery = "INSERT INTO " + getTableName() + " ( " + INSERT_FIELD + " ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		simpleJdbcTemplate.update(strQuery, codeConfig.getProjectId(), codeConfig.getCodeStyle(), codeConfig.getCodeType(), codeConfig.getCodeSize(), codeConfig.getCodeQuantity(), codeConfig.getCodePrefix(), codeConfig.getCreatedBy(), codeConfig.getCreatedDate(), codeConfig.getUpdatedBy(), codeConfig.getUpdatedDate());
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	@Override
	public String getFields()
	{
		return "PCODE_CONF_ID, PROJECT_ID, STYLE, CODE_TYPE, CODE_SIZE, QTY, CODE_PREFIX, CREATED_BY, CREATED_DATE, UPDATED_BY, UPDATED_DATE";
	}
	
	@Override
	public String getTableName()
	{
		return "PROMO_CODE_CONFIG";
	}
	
	@Override
	public CodeConfig selectPromoCode(int projectId) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE PROJECT_ID = ?";
		final List<CodeConfig> objList = simpleJdbcTemplate.query(strQuery.toString(), this, projectId);
		if (objList == null || objList.isEmpty())
		{
			return null;
		}
		else
		{
			return objList.get(0);
		}
	}
	
	
	@Override
	public int selectPromoCodeCount(int projectId) throws DataAccessException
	{
		final String strQuery = "SELECT  COUNT(*) FROM " + getTableName() + " WHERE PROJECT_ID = ?";
		final int count = simpleJdbcTemplate.queryForInt(strQuery, projectId);
		return count;
	}
	
	@Override
	public CodeConfig mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		CodeConfig codeConfig = new CodeConfig();
		codeConfig.setCfId(rs.getInt("PCODE_CONF_ID"));
		codeConfig.setCodePrefix(rs.getString("CODE_PREFIX"));
		codeConfig.setCodeQuantity(rs.getInt("QTY"));
		codeConfig.setCodeSize(rs.getString("CODE_SIZE"));
		codeConfig.setCodeStyle(rs.getString("STYLE"));
		codeConfig.setCodeType(rs.getString("CODE_TYPE"));
		codeConfig.setCreatedBy(rs.getString("CREATED_BY"));
		codeConfig.setCreatedDate(rs.getDate("CREATED_DATE"));
		codeConfig.setProjectId(rs.getInt("PROJECT_ID"));
		codeConfig.setUpdatedBy(rs.getString("UPDATED_BY"));
		codeConfig.setUpdatedDate(rs.getDate("UPDATED_DATE"));
		return codeConfig;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<PromoCodeConfigValue> getProjectPromoCodeList(Project project) throws DataAccessException
	{
		System.out.println("Inside getProjectPromoCodeList");
		final String query = "SELECT PCC.PCODE_CONF_ID, PCC.PROJECT_ID, PCC.STYLE, PCC.CODE_TYPE, PCC.CODE_SIZE, PCC.QTY, PCC.CODE_PREFIX, PCV.PROMO_CODE, PCV.CODE_STATUS, PCV.COUNT" + " FROM PROMO_CODE_CONFIG PCC, PROMO_CODE_VALUES PCV WHERE" + " PCC.PROJECT_ID=PCV.PROJECT_ID AND PCC.PROJECT_ID=?";
		List<PromoCodeConfigValue> resultList = getObjectList(query, PromoCodeConfigValue.class, new String[] {"codeConfig.cfId", "codeConfig.projectId", "codeConfig.codeStyle", "codeConfig.codeType", "codeConfig.codeSize", "codeConfig.codeQuantity", "codeConfig.codePrefix", "codeValue.promoCode", "codeValue.codeStatus", "codeValue.count"}, new int[] {INTEGER, INTEGER, STRING, STRING, STRING, INTEGER, STRING, STRING, INTEGER, INTEGER}, project.getProjectId());
		return resultList;
	}
	
	@Override
	@Transactional
	public int updatePromoCodeConfig(CodeConfig codeConfig) throws DataAccessException
	{
		final String sql = "{ call sp_ebulkbook_update_promocode_config_details( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
		if (codeConfig.getCodeType().equals(""))
		{
			codeConfig.setCodeType(null);
		}
		
		if (codeConfig.getCodeSize().equals(""))
		{
			codeConfig.setCodeSize(null);
		}
		return simpleJdbcTemplate.update(sql, new Object[] {codeConfig.getCfId(), codeConfig.getProjectId(), codeConfig.getCodeStyle(), codeConfig.getCodeType(), codeConfig.getCodeSize(), codeConfig.getCodeQuantity(), codeConfig.getCodePrefix(), codeConfig.getCreatedBy(), codeConfig.getUpdatedBy(), codeConfig.getUpdatedDate()});
		
	}
	
	
	@Override
	@Transactional
	public void removePromoCodeConfig(Project project) throws DataAccessException
	{
		final String strQuery = "DELETE FROM " + getTableName() + " WHERE PROJECT_ID = ?";
		simpleJdbcTemplate.update(strQuery, project.getProjectId());
		
	}
	
	
}