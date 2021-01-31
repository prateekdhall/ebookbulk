package main.java.com.mps.wiley.ebb.reportsCreator;

import java.util.List;

import main.java.com.mps.wiley.ebb.reportsBean.ProjectOverviewReport;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class ProjectOverviewReportCreator
{
	
	public HSSFWorkbook createProjectOverviewWorkBook(List<ProjectOverviewReport> list) throws Exception
	{
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = null;
		
			sheet = workbook.createSheet("Project Overview");
			
			sheet.setColumnWidth(0, 10*256);
			sheet.setColumnWidth(1, 22*256);
			sheet.setColumnWidth(2, 13*256);
			sheet.setColumnWidth(3, 10*256);
			sheet.setColumnWidth(4, 19*256);
			sheet.setColumnWidth(5, 19*256);
			sheet.setColumnWidth(6, 10*256);
			sheet.setColumnWidth(7, 12*256);
			sheet.setColumnWidth(8, 22*256);
			sheet.setColumnWidth(9, 22*256);
			sheet.setColumnWidth(10, 40*256);
			sheet.setColumnWidth(11, 19*256);
			sheet.setColumnWidth(12, 19*256);
			sheet.setColumnWidth(13, 19*256);
			
			HSSFCellStyle style = workbook.createCellStyle();
			HSSFRow row = null;
			
			for (int i = 0; i < 1; i++)
			{
				row = sheet.createRow((short)+i);
				HSSFCell cell = null;
				for (int j = 0; j < 13; j++)
				{
					cell = row.createCell(+j);
			
					if (j == 0){cell.setCellValue(new HSSFRichTextString("Project ID"));}
					else if (j == 1){cell.setCellValue(new HSSFRichTextString("Project Name"));}
					else if (j == 2){cell.setCellValue(new HSSFRichTextString("Project Type"));}
					else if (j == 3){cell.setCellValue(new HSSFRichTextString("eComp"));}
					else if (j == 4){cell.setCellValue(new HSSFRichTextString("Available"));}
					else if (j == 5){cell.setCellValue(new HSSFRichTextString("Expiration"));}
					else if (j == 6){cell.setCellValue(new HSSFRichTextString("Sold Qty"));}
					else if (j == 7){cell.setCellValue(new HSSFRichTextString("Backup Qty"));}
					else if (j == 8){cell.setCellValue(new HSSFRichTextString("Activation Start"));}
					else if (j == 9){cell.setCellValue(new HSSFRichTextString("Activation Start"));}
					else if (j == 10){cell.setCellValue(new HSSFRichTextString("Title"));}
					else if (j == 11){cell.setCellValue(new HSSFRichTextString("Downloads"));}
					else if (j == 12){cell.setCellValue(new HSSFRichTextString("Registrations"));}
					else if (j == 13){cell.setCellValue(new HSSFRichTextString("Promo Codes"));}
			
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
				ProjectOverviewReport projectOverviewReport=list.get(i);
				row = sheet.createRow(i + 1);
				
				if (projectOverviewReport.getProjectId() != null)
				{
					row.createCell(0).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getProjectId()));
				}
				else
				{
					row.createCell(0).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getProjectName() != null)
				{
					row.createCell(1).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getProjectName()));
				}
				else
				{
					row.createCell(1).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getProjectType() != null)
				{
					row.createCell(2).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getProjectType().getValue()));
				}
				else
				{
					row.createCell(2).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getEcomp() != null)
				{
					row.createCell(3).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getEcomp().getValue()));
				}
				else
				{
					row.createCell(3).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getAvailableDate() != null)
				{
					row.createCell(4).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getAvailableDate()));
				}
				else
				{
					row.createCell(4).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getExpiryDate() != null)
				{
					row.createCell(5).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getExpiryDate()));
				}
				else
				{
					row.createCell(5).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getSoldQty() != null)
				{
					row.createCell(6).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getSoldQty()));
				}
				else
				{
					row.createCell(6).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getBackupQty() != null)
				{
					row.createCell(7).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getBackupQty()));
				}
				else
				{
					row.createCell(7).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getActivationStart() != null)
				{
					row.createCell(8).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getActivationStart()));
				}
				else
				{
					row.createCell(8).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getAcivationEnd() != null)
				{
					row.createCell(9).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getAcivationEnd()));
				}
				else
				{
					row.createCell(9).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getTitle() != null)
				{
					row.createCell(10).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getTitle()));
				}
				else
				{
					row.createCell(10).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getDownloads() != null)
				{
					row.createCell(11).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getDownloads()));
				}
				else
				{
					row.createCell(11).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectOverviewReport.getRegistrations() != null && projectOverviewReport.getRegistrationApplicable() == 1)
				{
					row.createCell(12).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getRegistrations()));
				}
				else
				{
					row.createCell(12).setCellValue(new HSSFRichTextString("n/a"));
				}
				
				if (projectOverviewReport.getPromoCodes() != null && projectOverviewReport.getPromoCodesApplicable() == 1)
				{
					row.createCell(13).setCellValue(new HSSFRichTextString("" + projectOverviewReport.getPromoCodes()));
				}
				else
				{
					row.createCell(13).setCellValue(new HSSFRichTextString("n/a"));
				}
			}
		
		return workbook;
		
	}
	

	
}
