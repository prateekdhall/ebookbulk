package main.java.com.mps.wiley.ebb.reportsCreator;

import java.util.List;

import main.java.com.mps.wiley.ebb.reportsBean.ProjectActivityReport;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

/**
 * 
 * @author : Krishna Gaur
 * @category : Reports
 * 
 */

public class ProjectActivityReportCreator
{

	
	public HSSFWorkbook createProjectActivityWorkBook(List<ProjectActivityReport> list) throws Exception
	{
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = null;
		
			sheet = workbook.createSheet("Project Activity");
			
			sheet.setColumnWidth(0, 10*256);
			sheet.setColumnWidth(1, 22*256);
			sheet.setColumnWidth(2, 13*256);
			sheet.setColumnWidth(3, 10*256);
			sheet.setColumnWidth(4, 15*256);
			sheet.setColumnWidth(5, 10*256);
			sheet.setColumnWidth(6, 12*256);
			sheet.setColumnWidth(7, 13*256);
			sheet.setColumnWidth(8, 10*256);
			sheet.setColumnWidth(9, 10*256);
			sheet.setColumnWidth(10, 13*256);
			
			HSSFCellStyle style = workbook.createCellStyle();
			HSSFRow row = null;
			
			for (int i = 0; i < 1; i++)
			{
				row = sheet.createRow((short)+i);
				HSSFCell cell = null;
				for (int j = 0; j < 11; j++)
				{
					cell = row.createCell(+j);
			
					if (j == 0){cell.setCellValue(new HSSFRichTextString("Project ID"));}
					else if (j == 1){cell.setCellValue(new HSSFRichTextString("Project Name"));}
					else if (j == 2){cell.setCellValue(new HSSFRichTextString("Project Type"));}
					else if (j == 3){cell.setCellValue(new HSSFRichTextString("eComp"));}
					else if (j == 4){cell.setCellValue(new HSSFRichTextString("URL"));}
					else if (j == 5){cell.setCellValue(new HSSFRichTextString("Date"));}
					else if (j == 6){cell.setCellValue(new HSSFRichTextString("Registrations"));}
					else if (j == 7){cell.setCellValue(new HSSFRichTextString("Promo Codes"));}
					else if (j == 8){cell.setCellValue(new HSSFRichTextString("Success"));}
					else if (j == 9){cell.setCellValue(new HSSFRichTextString("Failure"));}
					else if (j == 10){cell.setCellValue(new HSSFRichTextString("Abort"));}
			
					cell.setCellStyle(style);
				}
		  }
			
			style.setBorderBottom((short)1);
			style.setBorderLeft((short)1);
			style.setBorderRight((short)1);
			style.setBorderTop((short)1);
			style.setTopBorderColor(HSSFColor.BLACK.index);
			style.setBottomBorderColor(HSSFColor.BLACK.index);
			style.setFillBackgroundColor(HSSFColor.AUTOMATIC.index);
			style.setFillPattern(HSSFCellStyle.SQUARES);
			style.setFillForegroundColor(HSSFColor.LIGHT_GREEN.index);
			style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			
			
					
			for (int i = 0; i < list.size(); i++)
			{
				ProjectActivityReport projectActivityReport=list.get(i);
				row = sheet.createRow(i + 1);
				
				if (projectActivityReport.getProjectId() != null)
				{
					row.createCell(0).setCellValue(new HSSFRichTextString("" + projectActivityReport.getProjectId()));
				}
				else
				{
					row.createCell(0).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getProjectName() != null)
				{
					row.createCell(1).setCellValue(new HSSFRichTextString("" + projectActivityReport.getProjectName()));
				}
				else
				{
					row.createCell(1).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getProjectType() != null)
				{
					row.createCell(2).setCellValue(new HSSFRichTextString("" + projectActivityReport.getProjectType().getValue()));
				}
				else
				{
					row.createCell(2).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getEcomp() != null)
				{
					row.createCell(3).setCellValue(new HSSFRichTextString("" + projectActivityReport.getEcomp().getValue()));
				}
				else
				{
					row.createCell(3).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getUrl() != null)
				{
					row.createCell(4).setCellValue(new HSSFRichTextString("" + projectActivityReport.getUrl()));
				}
				else
				{
					row.createCell(4).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getDate() != null)
				{
					row.createCell(5).setCellValue(new HSSFRichTextString("" + projectActivityReport.getDate()));
				}
				else
				{
					row.createCell(5).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getRegistrations() != null)
				{
					row.createCell(6).setCellValue(new HSSFRichTextString("" + projectActivityReport.getRegistrations()));
				}
				else
				{
					row.createCell(6).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getPromocodes() != null)
				{
					row.createCell(7).setCellValue(new HSSFRichTextString("" + projectActivityReport.getPromocodes()));
				}
				else
				{
					row.createCell(7).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getSuccess() != null)
				{
					row.createCell(8).setCellValue(new HSSFRichTextString("" + projectActivityReport.getSuccess()));
				}
				else
				{
					row.createCell(8).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectActivityReport.getFailure() != null)
				{
					row.createCell(9).setCellValue(new HSSFRichTextString("" + projectActivityReport.getFailure()));
				}
				else
				{
					row.createCell(9).setCellValue(new HSSFRichTextString(""));
				}
					
				if (projectActivityReport.getAbort() != null)
				{
					row.createCell(10).setCellValue(new HSSFRichTextString("" + projectActivityReport.getAbort()));
				}
				else
				{
					row.createCell(10).setCellValue(new HSSFRichTextString(""));
				}
				
			}
		
		return workbook;
		
	}
	

	
}
