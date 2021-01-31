package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.domain.ProjectHistory;

import org.springframework.dao.DataAccessException;


public interface ProjectHistoryDao extends BaseDao<ProjectHistory>
{
	public List<ProjectHistory> getProjectHistory(final Integer iPrjId) throws DataAccessException;
}
