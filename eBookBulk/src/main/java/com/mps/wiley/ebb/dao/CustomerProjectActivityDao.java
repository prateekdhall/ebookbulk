package main.java.com.mps.wiley.ebb.dao;


import java.util.List;

import main.java.com.mps.common.BaseDao;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;

import org.springframework.dao.DataAccessException;


/**
 * 
 * @author Mithlesh Kumar
 */
public interface CustomerProjectActivityDao extends BaseDao<CustomerProjectActivityReport>
{
	public List<CustomerProjectActivityReport> getCustomerProjectActiveList(ReportCriteriaBean customerProjectActivityReportDto) throws DataAccessException;
}
