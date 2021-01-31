package main.java.com.mps.wiley.ebb.action;


import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.domain.Customer;
import main.java.com.mps.wiley.ebb.domain.User;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectActivityReport;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectDetailsReport;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;
import main.java.com.mps.wiley.ebb.reportsCreator.CustomerProjectActivityReportCreator;
import main.java.com.mps.wiley.ebb.reportsCreator.CustomerProjectOverviewReportCreator;
import main.java.com.mps.wiley.ebb.reportsCreator.MyProjectReportCreator;
import main.java.com.mps.wiley.ebb.reportsCreator.ProjectActivityReportCreator;
import main.java.com.mps.wiley.ebb.reportsCreator.ProjectDetailsReportCreator;
import main.java.com.mps.wiley.ebb.reportsCreator.ProjectHistoryReportCreator;
import main.java.com.mps.wiley.ebb.reportsCreator.ProjectOverviewReportCreator;
import main.java.com.mps.wiley.ebb.service.CustomerService;
import main.java.com.mps.wiley.ebb.service.ReportService;
import main.java.com.mps.wiley.ebb.service.UserService;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.opensymphony.xwork2.ModelDriven;


/**
 * 
 * @author : Krishna Gaur
 * @category : Reports
 * 
 */


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class ReportAction extends Struts2AbstractAction implements ModelDriven<ReportCriteriaBean>
{
	private static final long serialVersionUID = 7809079304257623062L;
	
	private ReportCriteriaBean reportCriteriaBean;
	
	private List<User> adminList;
	private List<Customer> customerList;
	
	@Autowired
	UserService userService;
	
	@Autowired
	CustomerService custService;
	
	@Autowired
	ReportService reportService;
	
	public ReportCriteriaBean getReportCriteriaBean()
	{
		return reportCriteriaBean;
	}
	
	public void setReportCriteriaBean(ReportCriteriaBean reportCriteriaBean)
	{
		this.reportCriteriaBean = reportCriteriaBean;
	}
	
	@Override
	public ReportCriteriaBean getModel()
	{
		// reportCriteriaBean = new ReportCriteriaBean();
		return null;
	}
	
	public List<User> getAdminList()
	{
		return adminList;
	}
	
	public void setAdminList(List<User> adminList)
	{
		this.adminList = adminList;
	}
	
	public List<Customer> getCustomerList()
	{
		return customerList;
	}
	
	public void setCustomerList(List<Customer> customerList)
	{
		this.customerList = customerList;
	}
	
	private void populateData()
	{
		setAdminList(userService.getUsersByRoles(AppConstants.ROLE_SUPER_ADMIN, AppConstants.ROLE_PROJECT_ADMIN, AppConstants.ROLE_REQUESTER));
		setCustomerList(custService.getAllCustomers());
	}
	
	@Action(value = "projectDetailsReport",
			results = {
					@Result(name = "success", type = "tiles", location = "projectDetailsReport"),
					@Result(name = "input", type = "tiles", location = "projectDetailsReport")})
	public String projectDetailsReport() throws DataAccessException
	{
		try
		{
			populateData();
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "projectDetailsReportExport",
			results = {
					@Result(name = "input", type = "tiles", location = "projectDetailsReport")})
	public String projectDetailsReportExport()
	{
		try
		{
			System.out.println(reportCriteriaBean.getPrjAdmin());
			System.out.println(reportCriteriaBean.getProjectId());
			System.out.println(reportCriteriaBean.getProjectName());
			System.out.println(reportCriteriaBean.getRequester().getValue());
			System.out.println(reportCriteriaBean.getPrjAdmin().getValue());
			System.out.println(reportCriteriaBean.getCustomer().getValue());
			System.out.println(reportCriteriaBean.getProjectType());
			System.out.println(reportCriteriaBean.getEcomp());
			System.out.println(reportCriteriaBean.getStatusArray());
			System.out.println(reportCriteriaBean.getCreatedBy());
			
			HttpServletResponse responseObject = ServletActionContext.getResponse();
			ServletOutputStream out = null;
			
			List<ProjectDetailsReport> list = reportService.getProjectDetailsList(reportCriteriaBean);
			
			ProjectDetailsReportCreator excelCreator = new ProjectDetailsReportCreator();
			System.out.println("Exccel");
			HSSFWorkbook workbook = excelCreator.createProjectDetailsWorkBook(list);
			responseObject.setContentType("application/vnd.ms-excel");
			
			responseObject.setHeader("Content-Disposition", "attachment; filename=Project_Details.xls");
			
			out = responseObject.getOutputStream();
			// inputStream = requestObject.getInputStream();
			workbook.write(out);
			out.flush();
			out.close();
			return null;
		}
		catch (Exception e)
		{
			populateData();
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	
	@Action(value = "projectActivityReport",
			results = {
					@Result(name = "success", type = "tiles", location = "projectActivityReport"),
					@Result(name = "input", type = "tiles", location = "projectActivityReport")})
	public String projectActivityReport() throws DataAccessException
	{
		try
		{
			populateData();
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "projectActivityReportExport",
			results = {@Result(name = "input", type = "tiles", location = "projectActivityReport")})
	public String projectActivityReportExport() throws Exception
	{
		try
		{
			System.out.println(reportCriteriaBean.getProjectId());
			System.out.println(reportCriteriaBean.getProjectName());
			System.out.println(reportCriteriaBean.getProjectType());
			System.out.println(reportCriteriaBean.getEcomp());
			System.out.println(reportCriteriaBean.getRequester().getValue());
			System.out.println(reportCriteriaBean.getPrjAdmin().getValue());
			System.out.println(reportCriteriaBean.getCustomer().getValue());
			
			HttpServletResponse responseObject = ServletActionContext.getResponse();
			ServletOutputStream out = null;
			
			List<ProjectActivityReport> list = reportService.getProjectActivityList(reportCriteriaBean);
			
			ProjectActivityReportCreator excelCreator = new ProjectActivityReportCreator();
			System.out.println("Exccel");
			HSSFWorkbook workbook = excelCreator.createProjectActivityWorkBook(list);
			responseObject.setContentType("application/vnd.ms-excel");
			
			responseObject.setHeader("Content-Disposition", "attachment; filename=Project_Activity.xls");
			
			out = responseObject.getOutputStream();
			// inputStream = requestObject.getInputStream();
			workbook.write(out);
			out.flush();
			out.close();
			return null;
		}
		catch (Exception e)
		{
			populateData();
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "projectOverviewReport",
			results = {
					@Result(name = "success", type = "tiles", location = "projectOverviewReport"),
					@Result(name = "input", type = "tiles", location = "projectOverviewReport")})
	public String projectOverviewReport() throws DataAccessException
	{
		try
		{
			populateData();
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "projectOverviewReportExport",
			results = {@Result(name = "input", type = "tiles", location = "projectOverviewReport")})
	public String projectOverviewReportExport() throws Exception
	{
		try
		{
			System.out.println(reportCriteriaBean.getProjectId());
			System.out.println(reportCriteriaBean.getProjectName());
			System.out.println(reportCriteriaBean.getProjectType());
			System.out.println(reportCriteriaBean.getEcomp());
			System.out.println(reportCriteriaBean.getRequester().getValue());
			System.out.println(reportCriteriaBean.getPrjAdmin().getValue());
			System.out.println(reportCriteriaBean.getCustomer().getValue());
			
			HttpServletResponse responseObject = ServletActionContext.getResponse();
			ServletOutputStream out = null;
			
			List<ProjectOverviewReport> list = reportService.getProjectOverviewList(reportCriteriaBean);
			
			ProjectOverviewReportCreator excelCreator = new ProjectOverviewReportCreator();
			System.out.println("Exccel");
			HSSFWorkbook workbook = excelCreator.createProjectOverviewWorkBook(list);
			responseObject.setContentType("application/vnd.ms-excel");
			
			responseObject.setHeader("Content-Disposition", "attachment; filename=Project_Activity.xls");
			
			out = responseObject.getOutputStream();
			// inputStream = requestObject.getInputStream();
			workbook.write(out);
			out.flush();
			out.close();
			return null;
		}
		catch (Exception e)
		{
			populateData();
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "projectHistoryReport",
			results = {
					@Result(name = "success", type = "tiles", location = "projectHistoryReport"),
					@Result(name = "input", type = "tiles", location = "projectHistoryReport")})
	public String projectHistoryReport() throws DataAccessException
	{
		try
		{
			populateData();
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	@Action(value = "projectHistoryReportExport",
			results = {
					@Result(name = "input", type = "tiles", location = "projectHistoryReport")})
	public String projectHistoryReportExport() throws Exception
	{
		try
		{
			ServletOutputStream out = null;
			List<Map<String, Object>> map = reportService.getProjectHistoryList(reportCriteriaBean);
			ProjectHistoryReportCreator excelCreator = new ProjectHistoryReportCreator();
			HSSFWorkbook workbook = excelCreator.createProjectHistoryWorkBook(map);
			responseObject.setContentType("application/vnd.ms-excel");
			responseObject.setHeader("Content-Disposition", "attachment; filename=Project_History.xls");
			out = responseObject.getOutputStream();
			workbook.write(out);
			out.flush();
			out.close();
			return null;
		}
		catch (Exception e)
		{
			populateData();
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	/**
	 * Activity Report Action added by Mithlesh Kumar MPS Limited
	 */
	
	@Action(value = "projectActivityCustomerReport",
			results = {
					@Result(name = "success", type = "tiles", location = "customerProjectActivityReport"),
					@Result(name = "input", type = "tiles", location = "customerProjectActivityReport")})
	public String projectActivityCustomerReport() throws DataAccessException
	{
		return SUCCESS;
	}
	
	
	/**
	 * MyProject Report Action added by Mithlesh Kumar MPS Limited
	 */
	@Action(value = "myProjectReport",
			results = {
					@Result(name = "input", type = "tiles", location = "myProject")})
	public String myProjectReport() throws Exception
	{
		try
		{
			// HttpServletResponse responseObject = ServletActionContext.getResponse();
			ServletOutputStream out = null;
			MyProjectReportCreator utils = new MyProjectReportCreator();
			HSSFWorkbook workbook = utils.createWorkBook(reportService);
			responseObject.setContentType("application/vnd.ms-excel");
			responseObject.setHeader("Content-Disposition", "attachment; filename=MyProjet.xls");
			out = responseObject.getOutputStream();
			workbook.write(out);
			out.flush();
			out.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		return null;
	}
	
	
	/**
	 * Activity Report Action added by Mithlesh Kumar MPS Limited
	 */
	@Action(value = "projectActivityCustomerReportExport",
			results = {
					@Result(name = "success", type = "tiles", location = "customerProjectActivityReport"),
					@Result(name = "input", type = "tiles", location = "customerProjectActivityReport")})
	public String projectActivityCustomerReportExport() throws Exception
	{
		try
		{
			List<CustomerProjectActivityReport> customerProjectActivityReportList;
			ServletOutputStream out = null;
			CustomerProjectActivityReportCreator activityUtils = new CustomerProjectActivityReportCreator();
			customerProjectActivityReportList = reportService.getCustomerProjectActiveList(reportCriteriaBean);
			CustomerProjectActivityReport[] dto = customerProjectActivityReportList.toArray(new CustomerProjectActivityReport[customerProjectActivityReportList.size()]);
			HSSFWorkbook workbook = activityUtils.createActivityWorkBook(dto);
			responseObject.setContentType("application/vnd.ms-excel");
			responseObject.setHeader("Content-Disposition", "attachment; filename=Customer-Project-Activity.xls");
			out = responseObject.getOutputStream();
			workbook.write(out);
			out.flush();
			out.close();
			return null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
	}
	
	/**
	 * Overview Report Action added by Mithlesh Kumar MPS Limited
	 */
	@Action(value = "projectOverviewCustomerReport",
			results = {
					@Result(name = "success", type = "tiles", location = "customerProjectOverviewReport"),
					@Result(name = "input", type = "redirect", location = "home.do")})
	public String projectOverviewCustomerReport() throws DataAccessException
	{
		return SUCCESS;
	}
	
	/**
	 * Overview Report Action added by Mithlesh Kumar MPS Limited
	 */
	@Action(value = "projectOverviewCustomerReportExport",
			results = {
					@Result(name = "success", type = "tiles", location = "customerProjectOverviewReport"),
					@Result(name = "input", type = "tiles", location = "customerProjectOverviewReport")})
	public String projectOverviewCustomerReportExport() throws Exception
	{
		try
		{
			List<CustomerProjectOverviewReport> customerProjectOverviewReportList;
			ServletOutputStream out = null;
			customerProjectOverviewReportList = reportService.getCustomerProjectOverviewList(reportCriteriaBean);
			CustomerProjectOverviewReport[] dto = customerProjectOverviewReportList.toArray(new CustomerProjectOverviewReport[customerProjectOverviewReportList.size()]);
			CustomerProjectOverviewReportCreator overviewUtils = new CustomerProjectOverviewReportCreator();
			HSSFWorkbook workbook = overviewUtils.createWorkBook(dto);
			responseObject.setContentType("application/vnd.ms-excel");
			responseObject.setHeader("Content-Disposition", "attachment; filename=Customer-Project-Overview.xls");
			out = responseObject.getOutputStream();
			workbook.write(out);
			out.flush();
			out.close();
			return null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.debug(e.getMessage());
			addActionError(getText("error.unexpect"));
			return INPUT;
		}
		
	}
}
