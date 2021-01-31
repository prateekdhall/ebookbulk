//package main.java.com.mps.wiley.ebb.action;
//
//
//import java.util.ArrayList;
//
//import java.util.List;
//
//import javax.servlet.ServletOutputStream;
//
//import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
//import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectActivityReport;
//import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;
//import main.java.com.mps.wiley.ebb.reportsCreator.CustomerProjectActivityReportCreator;
//import main.java.com.mps.wiley.ebb.service.ReportService;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
//import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.ParentPackage;
//import org.apache.struts2.convention.annotation.Result;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//
//import com.opensymphony.xwork2.ModelDriven;
//
//
///**
// * 
// * @Author Mithlesh Kumar
// * @Company MPS Limited
// * @MethodDetails Export excel sheet
// */
//@ParentPackage("ebbs")
//@Namespace("/ebbs")
//public class CustomerProjectActivityReportAction extends Struts2AbstractAction implements ModelDriven<ReportCriteriaBean>
//{
//	private static final long serialVersionUID = 1L;
//	@Autowired
//	private ReportService reportService;
//	private ReportCriteriaBean reportCriteriaBean;
//	private List<CustomerProjectActivityReport> customerProjectActivityReportList = new ArrayList<CustomerProjectActivityReport>();
//	
//	
//	/*@Action(value = "projectActivityCustomerReport", results = {@Result(name = "success", type = "tiles", location = "customerProjectActivityReport"), @Result(name = "input", type = "tiles", location = "customerProjectActivityReport")})
//	public String projectActivityCustomerReport() throws DataAccessException
//	{
//		return SUCCESS;
//	}
//	
//	
//	@Action(value = "projectActivityCustomerReportExport", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "customerProjectActivityReport"), @Result(name = "input", type = "tiles", location = "customerProjectActivityReport")})
//	public String projectActivityCustomerReportExport() throws Exception
//	{
//		try
//		{
//			ServletOutputStream out = null;
//			CustomerProjectActivityReportCreator activityUtils = new CustomerProjectActivityReportCreator();
//			customerProjectActivityReportList = reportService.getCustomerProjectActiveList(reportCriteriaBean);
//			CustomerProjectActivityReport[] dto = customerProjectActivityReportList.toArray(new CustomerProjectActivityReport[customerProjectActivityReportList.size()]);
//			HSSFWorkbook workbook = activityUtils.createActivityWorkBook(dto);
//			responseObject.setContentType("application/vnd.ms-excel");
//			responseObject.setHeader("Content-Disposition", "attachment; filename=Customer-Project-Activity.xls");
//			out = responseObject.getOutputStream();
//			workbook.write(out);
//			out.flush();
//			out.close();
//			return null;
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//			log.debug(e.getMessage());
//			addActionError(getText("error.unexpect"));
//			return INPUT;
//		}
//	}
//	*/
//	
//	@Override
//	public ReportCriteriaBean getModel()
//	{
//		
//		return reportCriteriaBean = new ReportCriteriaBean();
//	}
//	
//	
//	public ReportCriteriaBean getReportCriteriaBean()
//	{
//		return reportCriteriaBean;
//	}
//	
//	
//	public void setReportCriteriaBean(ReportCriteriaBean reportCriteriaBean)
//	{
//		this.reportCriteriaBean = reportCriteriaBean;
//	}
//	
//	
//}
