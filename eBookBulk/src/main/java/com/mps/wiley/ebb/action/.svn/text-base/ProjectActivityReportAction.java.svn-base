//package main.java.com.mps.wiley.ebb.action;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletResponse;
//
//import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
//import main.java.com.mps.wiley.common.AppConstants;
//import main.java.com.mps.wiley.ebb.domain.Customer;
//import main.java.com.mps.wiley.ebb.domain.User;
//import main.java.com.mps.wiley.ebb.reportsBean.ProjectActivityReport;
//import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;
//import main.java.com.mps.wiley.ebb.reportsCreator.ProjectActivityReportCreator;
//import main.java.com.mps.wiley.ebb.service.CustomerService;
//import main.java.com.mps.wiley.ebb.service.ReportService;
//import main.java.com.mps.wiley.ebb.service.UserService;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.struts2.ServletActionContext;
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.ParentPackage;
//import org.apache.struts2.convention.annotation.Result;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//
//import com.opensymphony.xwork2.ModelDriven;
//
///**
// * 
// * @author : Krishna Gaur
// * @category : Reports
// * 
// */
//
//
//@ParentPackage("ebbs")
//@Namespace("/ebbs")
//public class ProjectActivityReportAction extends Struts2AbstractAction implements ModelDriven<ReportCriteriaBean>
//{
//	private static final long serialVersionUID = 7809079304257623062L;
//	
//	private ReportCriteriaBean reportCriteriaBean;
//	private ProjectActivityReport projectActivityReport;
//	
//	private List<User> adminList = new ArrayList<User>();
//	private List<Customer> customerList = new ArrayList<Customer>();
//	
//	@Autowired
//	UserService userService;
//	
//	@Autowired
//	CustomerService custService;
//	
//	@Autowired
//	ReportService reportService;
//
//	public ReportCriteriaBean getReportCriteriaBean()
//	{
//		return reportCriteriaBean;
//	}
//
//	public void setReportCriteriaBean(ReportCriteriaBean reportCriteriaBean)
//	{
//		this.reportCriteriaBean = reportCriteriaBean;
//	}
//	
//	public ProjectActivityReport getProjectActivityReport()
//	{
//		return projectActivityReport;
//	}
//
//	public void setProjectActivityReport(ProjectActivityReport projectActivityReport)
//	{
//		this.projectActivityReport = projectActivityReport;
//	}
//
//
//	@Override
//	public ReportCriteriaBean getModel()
//	{
//		// reportCriteriaBean = new ReportCriteriaBean();
//		return null;
//	}
//
//	
//	public List<User> getAdminList()
//	{
//		return adminList;
//	}
//
//	public void setAdminList(List<User> adminList)
//	{
//		this.adminList = adminList;
//	}
//
//	public List<Customer> getCustomerList()
//	{
//		return customerList;
//	}
//
//	public void setCustomerList(List<Customer> customerList)
//	{
//		this.customerList = customerList;
//	}
//
//	public UserService getUserService()
//	{
//		return userService;
//	}
//
//	public void setUserService(UserService userService)
//	{
//		this.userService = userService;
//	}
//
//	public CustomerService getCustService()
//	{
//		return custService;
//	}
//
//	public void setCustService(CustomerService custService)
//	{
//		this.custService = custService;
//	}
//
//	public ReportService getReportService()
//	{
//		return reportService;
//	}
//
//	public void setReportService(ReportService reportService)
//	{
//		this.reportService = reportService;
//	}
//	
//	@Action(value = "projectActivityReport",
//			results = {
//				@Result(name = "success", type = "tiles", location = "projectActivityReport"), 
//				@Result(name = "input", type = "tiles", location = "projectActivityReport")})
//	public String projectActivityReport() throws DataAccessException
//	{
//		try{
//				setAdminList(userService.getUsersByRoles(AppConstants.ROLE_SUPER_ADMIN, AppConstants.ROLE_PROJECT_ADMIN, AppConstants.ROLE_REQUESTER));
//				setCustomerList(custService.getAllCustomers());
//				return SUCCESS;
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				log.debug(e.getMessage());
//				addActionError(getText("error.unexpect"));
//				return INPUT;
//			}
//	}
//
//	@Action(value = "projectActivityReportExport", 
//			results = {@Result(name = "input", type = "tiles", location = "projectActivityReport")})
//	public String projectActivityReportExport() throws Exception
//	{
//		try{
//				System.out.println(reportCriteriaBean.getProjectId());
//				System.out.println(reportCriteriaBean.getProjectName());
//				System.out.println(reportCriteriaBean.getProjectType());
//				System.out.println(reportCriteriaBean.getEcomp()); 
//				System.out.println(reportCriteriaBean.getRequester().getValue()); 
//				System.out.println(reportCriteriaBean.getPrjAdmin().getValue()); 
//				System.out.println(reportCriteriaBean.getCustomer().getValue()); 
//
//				HttpServletResponse responseObject = ServletActionContext.getResponse();
//				ServletOutputStream out = null;
//		
//				List<ProjectActivityReport> list=reportService.getProjectActivityList(reportCriteriaBean);
//				
//				ProjectActivityReportCreator   excelCreator = new  ProjectActivityReportCreator();
//				System.out.println("Exccel");
//				HSSFWorkbook workbook = excelCreator.createProjectActivityWorkBook(list);
//				responseObject.setContentType("application/vnd.ms-excel");
//				
//					responseObject.setHeader("Content-Disposition", "attachment; filename=Project_Activity.xls");
//				
//				out = responseObject.getOutputStream();
//				// inputStream = requestObject.getInputStream();
//				workbook.write(out);
//				out.flush();
//				out.close();
//			   return null;
//		 }
//		 catch(Exception e)
//		 {
//			e.printStackTrace();
//			log.debug(e.getMessage());
//			addActionError(getText("error.unexpect"));
//			return INPUT;
//		 }
//	}
//	
//}
