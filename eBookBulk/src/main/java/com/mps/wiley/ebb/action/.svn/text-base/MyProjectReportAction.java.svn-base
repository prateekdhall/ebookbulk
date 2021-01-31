///*package main.java.com.mps.wiley.ebb.action;
//
//
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletResponse;
//
//import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
//import main.java.com.mps.wiley.ebb.reportsCreator.MyProjectReportCreator;
//
//import main.java.com.mps.wiley.ebb.service.ReportService;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.struts2.ServletActionContext;
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
//import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.ParentPackage;
//import org.apache.struts2.convention.annotation.Result;
//import org.springframework.beans.factory.annotation.Autowired;
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
//public class MyProjectReportAction extends Struts2AbstractAction
//{
//	private static final long serialVersionUID = 1L;
//	@Autowired
//	private ReportService reportService;
//	 
//	@Action(value = "myProjectReport", interceptorRefs = {@InterceptorRef("commonStack")}, results = {@Result(name = "success", type = "tiles", location = "myProject"), @Result(name = "input", type = "redirect", location = "home.do")})
//	public String myProjectReport() throws Exception
//	{
//		try
//		{
//			//HttpServletResponse responseObject = ServletActionContext.getResponse();
//			ServletOutputStream out = null;
//			MyProjectReportCreator utils = new MyProjectReportCreator();
//			HSSFWorkbook workbook = utils.createWorkBook(reportService);
//			responseObject.setContentType("application/vnd.ms-excel");
//			responseObject.setHeader("Content-Disposition", "attachment; filename=MyProjet.xls");
//			out = responseObject.getOutputStream();
//			workbook.write(out);
//			out.flush();
//			out.close();
//		}
//		catch (Exception e)
//		{  e.printStackTrace();
//			log.debug(e.getMessage());
//			addActionError(getText("error.unexpect"));
//			return INPUT;
//		}
//		return null;
//	}
//	
//	*//**
//	 * 
//	 * @author Mithlesh Kumar
//	 * @Company MPS Limited
//	 * @MethodDetails Export Cascading style sheet
//	 *//*
//	
//	 * @Action(value = "myprojectCsv", interceptorRefs = {@InterceptorRef("defaultStack")}, results = {@Result(name = "success", type = "dispatcher",
//	 * location = "/WEB-INF/view/jsp/project/myprojectgrid.jsp"), @Result(name = "input", type = "dispatcher", location =
//	 * "/WEB-INF/view/jsp/project/myprojectgrid.jsp")})
//	 * public String myprojectCsv() throws Exception
//	 * {
//	 * 
//	 * myProjectInProgressGrid = prjService.getProjectListByStatus(project.getProjectStatus());
//	 * myProjectInProgressGrid.add(getProject());
//	 * Collection<Project> resultList = myProjectInProgressGrid;
//	 * Project[] projectExportxls = resultList.toArray(new Project[resultList.size()]);
//	 * HttpServletResponse responseObject = ServletActionContext.getResponse();
//	 * try
//	 * {
//	 * responseObject.setContentType("text/csv");
//	 * if (project.getProjectStatus() == 1)
//	 * {
//	 * responseObject.setHeader("Content-Disposition", "attachment; filename=In_Progress.csv");
//	 * }
//	 * else if (project.getProjectStatus() == 2)
//	 * {
//	 * responseObject.setHeader("Content-Disposition", "attachment; filename=Active.csv");
//	 * }
//	 * else if (project.getProjectStatus() == 3)
//	 * {
//	 * responseObject.setHeader("Content-Disposition", "attachment; filename=In_Active.csv");
//	 * 
//	 * }
//	 * responseObject.getWriter().append("Project Name");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Requester");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Customer");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Project Type");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Available Date");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Expiry Date");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Thresold Date");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Sold Qty");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Backup Qty");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append("Thresold Qty");
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append('\n');
//	 * if (projectExportxls != null)
//	 * {
//	 * 
//	 * for (int i = 0; i < projectExportxls.length; i++)
//	 * {
//	 * if (projectExportxls[i].getProjectName() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getProjectName());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getRequester().getId() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getRequester().getId());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getCustomer().getId() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getCustomer().getId());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getProjectType() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getProjectType());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getAvailableDate() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getAvailableDate().toString());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getExpiryDate() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getExpiryDate().toString());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getThresoldDate() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getThresoldDate().toString());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getSoldQty() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getSoldQty());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getBackupQty() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getBackupQty());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * if (projectExportxls[i].getThresoldQty() != null)
//	 * {
//	 * responseObject.getWriter().append("" + projectExportxls[i].getThresoldQty());
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * else
//	 * {
//	 * responseObject.getWriter().append("");
//	 * responseObject.getWriter().append(',');
//	 * }
//	 * responseObject.getWriter().append(',');
//	 * responseObject.getWriter().append('\n');
//	 * }
//	 * }
//	 * 
//	 * }
//	 * catch (Exception e)
//	 * {
//	 * // TODO: handle exception
//	 * }
//	 * return null;
//	 * }
//	 
//	
//}
//*/