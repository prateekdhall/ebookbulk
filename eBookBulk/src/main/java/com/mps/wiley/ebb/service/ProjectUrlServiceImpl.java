package main.java.com.mps.wiley.ebb.service;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.ebb.dao.ProjectUrlDao;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectUrl;
import main.java.com.mps.wiley.util.ExcelFileUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("ProjectUrlService")
@Transactional
public class ProjectUrlServiceImpl implements ProjectUrlService
{
	/**
	 * Instantiates a new UserServiceImpl.
	 * 
	 */
	public ProjectUrlServiceImpl()
	{
	}
	
	@Autowired
	private ProjectUrlDao projectUrlDao;
	
	@Autowired
	private PromoCodeService promoCodeService;
	
	@Override
	@Transactional
	public void saveProjectUrl(ProjectUrl prjurl, Project project, List<ProjectUrl> list) throws DataAccessException
	{
		System.out.println("Project Id in ProjectUrlService::" + prjurl.getProjectId());
		String projectUrl = "";
		boolean b = false;
		projectUrl = project.getStUrl();
		int prjQuantity = 0;
		if ("1".equalsIgnoreCase(project.getProjectType().toString()))
		{
			prjQuantity = project.getSoldQty() + project.getBackupQty();
			// For Single Project Type
			projectUrl = projectUrl + String.valueOf(project.getProjectId()).toString() + "_temp" + ".htm";
			prjurl.setUrl(projectUrl);
			if (project.getOnceActive().toString().equals("0"))
				projectUrlDao.insertProjectUrl(prjurl);
		}// end of if
		else if ("2".equalsIgnoreCase(project.getProjectType().toString()))
		{
			// For Multi Project Type
			// If Project has beccame active in its life then only new additional url wiil create else
			// New url url will create on the base of sold quantity.
			if (project.getOnceActive().toString().equals("1"))
			{
				// if(prjQuantity>list.size())
				// prjQuantity=prjQuantity-list.size();
				prjQuantity = project.getSoldQty();
				for (int i = list.size(); i < prjQuantity; i++)
				{
					projectUrl = "";
					projectUrl = projectUrl + String.valueOf(project.getProjectId()).toString() + "_temp" + i + ".htm";
					prjurl.setUrl(projectUrl);
					projectUrlDao.insertProjectUrl(prjurl);
				}
			}
			else if (project.getOnceActive().toString().equals("0"))
			{
				prjQuantity = project.getSoldQty();
				
				for (int i = 0; i < prjQuantity; i++)
				{
					projectUrl = "";
					projectUrl = projectUrl + String.valueOf(project.getProjectId()).toString() + "_temp" + i + ".htm";
					prjurl.setUrl(projectUrl);
					projectUrlDao.insertProjectUrl(prjurl);
				}
			}
			
			
		}// end of elseif
		
		// Create Excel File
		
		Map<String, Object> reportDataMap = this.getGenerateUrlReport(project);
		Map<String, Object> reportDataMap1 = this.getGeneratePromocodeReport(project);
		Collection reportData = (Collection)reportDataMap.get(ProjectUrlService.REPORTS_DATA);
		Collection reportData1 = (Collection)reportDataMap1.get(ProjectUrlService.REPORTS_DATA1);
		System.out.println("ReportData Collection==" + reportData.size());
		System.out.println("ReportData1 Collection==" + reportData1.size());
		if (reportData != null && reportData.size() > 0)
		{
			b = this.createXlsFile(reportDataMap, reportDataMap1);
			System.out.println("CreateExcel File==" + b);
		}
		else
		{
			// url not generated, email will not sent
		}
		
		// Send Email to Customer with active key contact email-ids and cc to
		// admin
		
		/*
		 * String toemail = "prateekdhall@gmail.com";
		 * String TemplateFile = "url_promocode.vm";
		 * String From = AppSystem.getMailConfig("admin.email");
		 * String Subject = "Generated Url and Promocode List";
		 * String attachedFile = AppSystem.getConfig("tempexcelpath") + "temp"
		 * + ".xls";
		 * MailObject objMail = EmailUtil.sendEmailWithAttachment(toemail,
		 * TemplateFile, From, Subject, attachedFile);
		 * if (objMail != null) {
		 * System.out.println("Sending E-mail....");
		 * AppSystem.EMAILSERVER.sendEmail(objMail);
		 * System.out.println("E-mail sent");
		 * }
		 */
		
	}
	
	@Override
	@Transactional
	public void deleteProjectUrl(ProjectUrl projecturl) throws DataAccessException
	{
		projectUrlDao.removeProjectUrl(projecturl);
	}
	
	@Override
	@Transactional
	public Map<String, Object> getGenerateUrlReport(Project project) throws DataAccessException
	{
		Map reportData = new HashMap<String, Object>();
		List<ProjectUrl> alist = projectUrlDao.getProjectUrlListByTodayDate(project);
		try
		{
			
			reportData.put(ProjectUrlService.REPORTS_HEADER, getGenerateUrlHeader(project));
			reportData.put(ProjectUrlService.REPORTS_FOOTER, getGenerateUrlFooter());
			reportData.put(ProjectUrlService.REPORTS_DATA, getGenerateUrlData(alist));
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return reportData;
		
	}
	
	@Override
	@Transactional
	public Map<String, Object> getGeneratePromocodeReport(Project project) throws DataAccessException
	{
		Map reportData1 = new HashMap<String, Object>();
		List<CodeValue> promoCodeValueList = promoCodeService.selectPromoCodeValueService(project.getProjectId());
		
		try
		{
			
			reportData1.put(ProjectUrlService.REPORTS_HEADER1, getGeneratePromocodeHeader(project));
			reportData1.put(ProjectUrlService.REPORTS_FOOTER1, getGeneratePromocodeFooter());
			reportData1.put(ProjectUrlService.REPORTS_DATA1, getGeneratePromocodeData(promoCodeValueList));
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return reportData1;
		
	}
	
	public String[][] getGenerateUrlHeader(Project project)
	{
		
		String[][] atlHeader = new String[6][2];
		String urlType = "";
		try
		{
			atlHeader[0][0] = "GENERATE URL LIST";// Header Row 1
			atlHeader[0][1] = "";// Header Row 1
			atlHeader[1][0] = "Project Id : ";// Header Row 1
			atlHeader[1][1] = String.valueOf(project.getProjectId());// Header
			// Row 1
			atlHeader[2][0] = "Project Name : ";// Header Row 2
			atlHeader[2][1] = project.getProjectName();// Header Row 2
			if ("1".equalsIgnoreCase(project.getProjectType().toString()))
			{
				urlType = "Single";
			}
			else if ("2".equalsIgnoreCase(project.getProjectType().toString()))
			{
				urlType = "Multi";
			}
			atlHeader[3][0] = "Url Type : ";// Header Row 3
			atlHeader[3][1] = urlType;// Header Row 3
			
			atlHeader[4][0] = "";
			atlHeader[5][0] = "Id";
			atlHeader[5][1] = "Url";
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		}
		
		return atlHeader;
		
	}
	
	public String[][] getGeneratePromocodeHeader(Project project)
	{
		
		String[][] atlHeader = new String[2][5];
		String urlType = "";
		try
		{
			atlHeader[0][0] = "GENERATE PROMOCODE LIST";// Header Row 1
			atlHeader[0][1] = "";// Header Row 1
			atlHeader[0][2] = "";// Header Row 1
			atlHeader[0][3] = "";// Header Row 1
			atlHeader[0][4] = "";// Header Row 1
			
			atlHeader[1][0] = "S.N. ";// Header Row 3
			atlHeader[1][1] = "PROMOCODE ";// Header Row 3
			atlHeader[1][2] = "CODE TYPE";// Header Row 3
			atlHeader[1][3] = "CODE STATUS";// Header Row 3
			atlHeader[1][4] = "COUNT";// Header Row 3
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		}
		
		return atlHeader;
		
	}
	
	
	public String[][] getGenerateUrlFooter()
	{
		return new String[1][2];
	}
	
	public String[][] getGeneratePromocodeFooter()
	{
		return new String[1][5];
	}
	
	public Collection<String[]> getGenerateUrlData(List<ProjectUrl> alist)
	{
		
		Collection<String[]> reportData = new ArrayList<String[]>();
		
		if (alist != null && alist.size() > 0)
		{
			
			int count = 1;
			
			for (ProjectUrl contentdata : alist)
			{
				
				String[] instEcomData = new String[2];
				instEcomData[0] = String.valueOf(count++);
				instEcomData[1] = contentdata.getUrl();
				reportData.add(instEcomData);
			}
		}
		return reportData;
	}
	
	
	public Collection<String[]> getGeneratePromocodeData(List<CodeValue> alist)
	{
		
		Collection<String[]> reportData = new ArrayList<String[]>();
		
		if (alist != null && alist.size() > 0)
		{
			
			int count = 1;
			
			for (CodeValue contentdata : alist)
			{
				String status = "";
				String[] instEcomData = new String[5];
				instEcomData[0] = String.valueOf(count++);
				instEcomData[1] = contentdata.getPromoCode();
				instEcomData[2] = contentdata.getCodeType();
				if (contentdata.getCodeStatus().toString().equals("1"))
					status = "USED";
				else if (contentdata.getCodeStatus().toString().equals("0"))
					status = "UNUSED";
				instEcomData[3] = status;
				instEcomData[4] = String.valueOf(contentdata.getCount());
				
				reportData.add(instEcomData);
			}
		}
		return reportData;
	}
	
	public boolean createXlsFile(Map reportDataMap, Map reportDataMap1) throws DataAccessException
	{
		// TODO Auto-generated method stub
		String[][] reportHeader = null;
		String[][] reportHeader1 = null;
		Collection<String[]> reportData = null;
		Collection<String[]> reportData1 = null;
		String[][] reportfooter = null;
		String[][] reportfooter1 = null;
		FileInputStream fis = null;
		File file = null;
		try
		{
			int reportLineNo = 0;
			reportHeader = (String[][])reportDataMap.get(ProjectUrlService.REPORTS_HEADER);
			
			reportHeader1 = (String[][])reportDataMap1.get(ProjectUrlService.REPORTS_HEADER1);
			
			reportData = (Collection<String[]>)reportDataMap.get(ProjectUrlService.REPORTS_DATA);
			
			reportData1 = (Collection<String[]>)reportDataMap1.get(ProjectUrlService.REPORTS_DATA1);
			
			reportfooter = (String[][])reportDataMap.get(ProjectUrlService.REPORTS_FOOTER);
			
			reportfooter1 = (String[][])reportDataMap1.get(ProjectUrlService.REPORTS_FOOTER1);
			
			file = ExcelFileUtil.createExcelFile("GenerateUrlListReport", reportHeader, "GeneratePromoCodeListReport", reportHeader1);
			reportLineNo = (reportLineNo + reportHeader.length);
			ExcelFileUtil.writeExcelFileData(file, "GenerateUrlListReport", reportLineNo, reportData, "GeneratePromoCodeListReport", reportData1);
			reportLineNo = (reportLineNo + reportData.size());
			ExcelFileUtil.writeExcelFileFooter(file, "GenerateUrlListReport", reportLineNo, reportfooter, "GeneratePromoCodeListReport", reportfooter1);
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if (fis != null)
				try
				{
					fis.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			reportfooter = null;
			reportData = null;
			reportHeader = null;
			if (file != null && file.exists())
			{
				//file.delete();
			}
		}
		
		return true;
	}
	
	@Override
	@Transactional
	public List<ProjectUrl> getProjectUrlList(Project project) throws DataAccessException
	{
		List<ProjectUrl> alist = projectUrlDao.getProjectUsedUrlList(project);
		
		return alist;
	}
	
	// used to update Project Url Flag in Project table depends upon genrate url and promocode
	// matches the actual count has been generated
	// will set 0 as URL_FLAG link will disable if count matches
	// will set 1 as URL_FLAG link will enable if count mismatches
	@Override
	@Transactional
	public Project getProjectUrlAndPromoCodeFlag(Project project, boolean checkPromCodeValue, List<ProjectUrl> list) throws DataAccessException
	{
		boolean CHK_URL_FLAG = false;
		boolean CHK_PROMOCODE_FLAG = false;
		if (list != null)
		{
			if(project.getProjectType().toString().equals("2"))
			{
			
			if ((list.size() == (project.getSoldQty() + project.getBackupQty())))
				CHK_URL_FLAG = true;
			else
				CHK_URL_FLAG = false;
			}
			else if(project.getProjectType().toString().equals("1"))
			{
				CHK_URL_FLAG = true;
			}
		}
		
		
		if (checkPromCodeValue)
		{
			CHK_PROMOCODE_FLAG = true;
		}
		else
		{
			CHK_PROMOCODE_FLAG = false;
		}
		if ((CHK_URL_FLAG) && (CHK_PROMOCODE_FLAG))
		{
			project.setUrlFlag(1);
			if (project.getOnceActive().toString().equals("1"))
			project.setOnceActive(1);
			else
				project.setOnceActive(0);
		}
		else
		{
			project.setUrlFlag(0);
			if (project.getOnceActive().toString().equals("1"))
				project.setOnceActive(1);
				else
					project.setOnceActive(0);
		}
		
		return project;
	}
	
}
