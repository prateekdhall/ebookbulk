package main.java.com.mps.wiley.ebb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.AbstractBaseDao;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.Project;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("PromoValueDao")
@Transactional
public class PromoValueDaoImpl extends AbstractBaseDao<CodeValue> implements PromoValueDao
{
	@Override
	public int insertPromoValue(CodeValue codeValue) throws DataAccessException
	{
		String[] code = codeValue.getPromoCode().split(",");
		System.out.println("code::" + code[0]);
		if (codeValue.getCodeType().equals(""))
		{
			codeValue.setCodeType(null);
		}
		
		final String strQuery = "INSERT INTO " + getTableName() + " ( " + getFields() + " ) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
		List<Object[]> parameters = new ArrayList<Object[]>();
		for (int i = 0; i < code.length; i++)
		{
			parameters.add(new Object[] {codeValue.getProjectId(), code[i], codeValue.getCodeType(), codeValue.getCodeStatus(), codeValue.getGeneratedBy(), codeValue.getGeneratedDate(), codeValue.getCount()});
		}
		simpleJdbcTemplate.batchUpdate(strQuery, parameters);
		return simpleJdbcTemplate.queryForInt("select last_insert_id()");
	}
	
	@Override
	public String getFields()
	{
		return "PROJECT_ID,PROMO_CODE,CODE_TYPE,CODE_STATUS,GENERATED_BY,GENERATED_DATE,COUNT";
	}
	
	@Override
	public String getTableName()
	{
		return "PROMO_CODE_VALUES";
	}
	
	
	@Override
	public List<CodeValue> selectPromoCodeValue(int projectId) throws DataAccessException
	{
		final String strQuery = "SELECT " + getFields() + " FROM " + getTableName() + " WHERE PROJECT_ID = ?";
		final List<CodeValue> objList = simpleJdbcTemplate.query(strQuery.toString(), this, projectId);
		if (objList == null || objList.isEmpty())
		{
			return null;
		}
		else
		{
			return objList;
		}
	}
	
	@Override
	public CodeValue mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		CodeValue codeValue = new CodeValue();
		codeValue.setCodeStatus(rs.getInt("CODE_STATUS"));
		codeValue.setCodeType(rs.getString("CODE_TYPE"));
		codeValue.setCount(rs.getInt("COUNT"));
		codeValue.setGeneratedBy(rs.getString("GENERATED_BY"));
		codeValue.setGeneratedDate(rs.getDate("GENERATED_DATE"));
		codeValue.setProjectId(rs.getInt("PROJECT_ID"));
		codeValue.setPromoCode(rs.getString("PROMO_CODE"));
		return codeValue;
	}
	
	@Override
	@Transactional
	public void removePromoCodeValue(Project project) throws DataAccessException
	{
		final String strQuery = "DELETE FROM " + getTableName() + " WHERE PROJECT_ID = ?";
		simpleJdbcTemplate.update(strQuery, project.getProjectId());
		
	}
	
}
