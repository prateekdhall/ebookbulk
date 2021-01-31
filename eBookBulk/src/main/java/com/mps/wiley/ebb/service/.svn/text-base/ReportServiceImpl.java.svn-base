package main.java.com.mps.wiley.ebb.service;

import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.dao.CustomerProjectActivityDao;
import main.java.com.mps.wiley.ebb.dao.CustomerProjectOverviewDao;
import main.java.com.mps.wiley.ebb.dao.MyProjectReportDao;
import main.java.com.mps.wiley.ebb.dao.ProjectActivityReportDao;
import main.java.com.mps.wiley.ebb.dao.ProjectDetailsReportDao;
import main.java.com.mps.wiley.ebb.dao.ProjectHistoryReportDao;
import main.java.com.mps.wiley.ebb.dao.ProjectOverviewReportDao;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.MyProjectReportDto;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectDetailsReport;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author : Krishna Gaur
 * @category : Reports
 * 
 */

@Service("ReportService")
@Transactional
public class ReportServiceImpl implements ReportService
{
	public ReportServiceImpl()
	{
	}
	
	@Autowired
	private ProjectDetailsReportDao  projectDetailsReportDao;
	
	@Autowired
	private ProjectOverviewReportDao projectOverviewReportDao;
	
	@Autowired
	private ProjectActivityReportDao projectActivityReportDao;
	
	@Autowired
	private MyProjectReportDao projectReportDao;
	
	@Autowired
	private CustomerProjectOverviewDao customerProjectOverviewDao;
	
	@Autowired
	private CustomerProjectActivityDao customerProjectActivityDao;
	
	@Autowired
	private ProjectHistoryReportDao  projectHistoryReportDao;

	@Override
	@Transactional
	public List<ProjectDetailsReport> getProjectDetailsList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{
		return projectDetailsReportDao.getProjectDetailsList(reportCriteriaBean);
	}
	

	@Override
	@Transactional
	public List<ProjectOverviewReport> getProjectOverviewList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{
		return projectOverviewReportDao.getProjectOverviewList(reportCriteriaBean);
	}
	
	@Override
	@Transactional
	public List<ProjectActivityReport> getProjectActivityList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{
		return projectActivityReportDao.getProjectActivityList(reportCriteriaBean);
	}
	
	@Override
	@Transactional
	public List<MyProjectReportDto> getProjectListByStatus(int iStatus) throws DataAccessException
	{
		return projectReportDao.getProjectListByStatus(iStatus);
	}
	
	@Override
	@Transactional
	public List<CustomerProjectOverviewReport> getCustomerProjectOverviewList(ReportCriteriaBean customerProjectOverviewReportDto) throws DataAccessException
	{	 
		return customerProjectOverviewDao.getCustomerProjectOverviewList(customerProjectOverviewReportDto);
	}
	
	@Override
	@Transactional
	public List<CustomerProjectActivityReport> getCustomerProjectActiveList(ReportCriteriaBean customerProjectActivityReportDto) throws DataAccessException
	{
			return customerProjectActivityDao.getCustomerProjectActiveList(customerProjectActivityReportDto);
	}
	
	@Override
	public List<Map<String, Object>> getProjectHistoryList(ReportCriteriaBean reportCriteriaBean) throws DataAccessException
	{
		return projectHistoryReportDao.getProjectHistoryList(reportCriteriaBean);
	}
}
