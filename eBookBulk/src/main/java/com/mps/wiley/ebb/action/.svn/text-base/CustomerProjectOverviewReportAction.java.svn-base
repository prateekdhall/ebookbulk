///*package main.java.com.mps.wiley.ebb.action;
//
// 
//import java.util.ArrayList;
// 
//import java.util.List;
//
//import javax.servlet.ServletOutputStream;
// 
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
// 
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
//import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.ParentPackage;
//import org.apache.struts2.convention.annotation.Result;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import com.opensymphony.xwork2.ModelDriven;
//import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
//  
//import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectOverviewReport;
//import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;
//import main.java.com.mps.wiley.ebb.reportsCreator.CustomerProjectOverviewReportCreator;
//import main.java.com.mps.wiley.ebb.service.ReportService;
// 
//
//
//*//**
// * 
// * @Author Mithlesh Kumar
// * @Company MPS Limited
// * @MethodDetails Export excel sheet
// *//*
//@ParentPackage("ebbs")
//@Namespace("/ebbs")
//public class CustomerProjectOverviewReportAction extends Struts2AbstractAction implements ModelDriven<ReportCriteriaBean>
//{
//	
//	private static final long serialVersionUID = 1L;
//	private List<CustomerProjectOverviewReport> customerProjectOverviewReportList = new ArrayList<CustomerProjectOverviewReport>();
//	
// 	 
//	@Autowired
//	private ReportService reportService;
//	private ReportCriteriaBean reportCriteriaBean;
//	
//	@Action(value = "projectOverviewCustomerReport", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "customerProjectOverviewReport"), @Result(name = "input", type = "redirect", location = "home.do")})
//	public String projectOverviewCustomerReport() throws DataAccessException
//	{
//		 	return SUCCESS;
//	}
//	
//	@Action(value = "projectOverviewCustomerReportExport", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "customerProjectOverviewReport"), @Result(name = "input",type = "tiles", location = "customerProjectOverviewReport")})
//	public String projectOverviewCustomerReportExport() throws Exception
//	{
//		try
//		{
//			 
//			ServletOutputStream out = null;
//			customerProjectOverviewReportList = reportService.getCustomerProjectOverviewList(reportCriteriaBean);
//		 	CustomerProjectOverviewReport[] dto = customerProjectOverviewReportList.toArray(new CustomerProjectOverviewReport[customerProjectOverviewReportList.size()]);
//			CustomerProjectOverviewReportCreator overviewUtils = new CustomerProjectOverviewReportCreator();
//			HSSFWorkbook workbook = overviewUtils.createWorkBook(dto);
//			responseObject.setContentType("application/vnd.ms-excel");
//			responseObject.setHeader("Content-Disposition", "attachment; filename=Customer-Project-Overview.xls");
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
//	
//	}
//
//	@Override
//	public ReportCriteriaBean getModel()
//	{
//		// TODO Auto-generated method stub
//		return reportCriteriaBean =new ReportCriteriaBean();
//	}
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
//	 
//	
//}
//*/