package main.java.com.mps.wiley.ebb.reportsCreator;


import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.wiley.ebb.reportsBean.MyProjectReportDto;
import main.java.com.mps.wiley.ebb.service.ReportService;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;


/**
 * 
 * @author Mithlesh Kumar
 * @Company MPS Limited
 */

public class MyProjectReportCreator
{
	private List<MyProjectReportDto> myProjectInProgressGrid = new ArrayList<MyProjectReportDto>();
	
	
	public HSSFWorkbook createWorkBook(ReportService reportService) throws Exception
	
	{
		HSSFWorkbook workbook = new HSSFWorkbook();
		for (int ij = 1; ij <= 3; ij++)
		{
			myProjectInProgressGrid = reportService.getProjectListByStatus(ij);
			
			// Collection<ProjectReportDto> resultList = myProjectInProgressGrid;
			MyProjectReportDto[] dto = myProjectInProgressGrid.toArray(new MyProjectReportDto[myProjectInProgressGrid.size()]);
			HSSFSheet sheet = null;
			if (ij == 1)
			{
				sheet = workbook.createSheet("In Progress");
				sheet.setDefaultRowHeight((short)300);
				sheet.setDefaultRowHeightInPoints(300);
			}
			else if (ij == 2)
			{
				sheet = workbook.createSheet("Active");
				sheet.setDefaultRowHeight((short)300);
				sheet.setDefaultRowHeightInPoints(300);
			}
			else if (ij == 3)
			{
				sheet = workbook.createSheet("in Active");
				sheet.setDefaultRowHeight((short)300);
				sheet.setDefaultRowHeightInPoints(300);
			}
			sheet.setColumnWidth(0, 3500);
			sheet.setColumnWidth(1, 3500);
			sheet.setColumnWidth(2, 5900);
			sheet.setColumnWidth(3, 5500);
			sheet.setColumnWidth(4, 5500);
			sheet.setColumnWidth(5, 5500);
			sheet.setColumnWidth(6, 5500);
			sheet.setColumnWidth(7, 5500);
			sheet.setColumnWidth(8, 3000);
			sheet.setColumnWidth(9, 3000);
			sheet.setColumnWidth(10, 3500);
			sheet.setColumnWidth(11, 3500);
			sheet.setColumnWidth(12, 5900);
			sheet.setColumnWidth(13, 5500);
			sheet.setColumnWidth(14, 5500);
			HSSFCellStyle style = workbook.createCellStyle();
			HSSFRow row = null;
			for (int j = 0; j < 1; j++)
			{
				row = sheet.createRow((short)+j);
				HSSFCell cell = null;
				for (int ii = 0; ii < 16; ii++)
				{
					cell = row.createCell(+ii);
					if (ii == 0)
					{
						cell.setCellValue(new HSSFRichTextString("Project ID"));
					}
					if (ii == 1)
					{
						cell.setCellValue(new HSSFRichTextString("Project Name"));
					}
					if (ii == 2)
					{
						cell.setCellValue(new HSSFRichTextString("Customer"));
					}
					if (ii == 3)
					{
						cell.setCellValue(new HSSFRichTextString("Title"));
					}
					if (ii == 4)
					{
						cell.setCellValue(new HSSFRichTextString("DRM"));
					}
					if (ii == 5)
					{
						cell.setCellValue(new HSSFRichTextString("Project Type"));
					}
					if (ii == 6)
					{
						cell.setCellValue(new HSSFRichTextString("eComp"));
					}
					if (ii == 7)
					{
						cell.setCellValue(new HSSFRichTextString("Available"));
					}
					if (ii == 8)
					{
						cell.setCellValue(new HSSFRichTextString("Expiration"));
					}
					if (ii == 9)
					{
						cell.setCellValue(new HSSFRichTextString("Sold Qty"));
					}
					if (ii == 10)
					{
						cell.setCellValue(new HSSFRichTextString("Backup Qty"));
					}
					if (ii == 11)
					{
						cell.setCellValue(new HSSFRichTextString("Downloads"));
					}
					if (ii == 12)
					{
						cell.setCellValue(new HSSFRichTextString("Template"));
					}
					if (ii == 13)
					{
						cell.setCellValue(new HSSFRichTextString("Notes"));
					}
					if (ii == 14)
					{
						cell.setCellValue(new HSSFRichTextString("MPS Comments"));
					}
					cell.setCellStyle(style);
				}
			}
			
			for (int i = 0; i < dto.length; i++)
			{
				row = sheet.createRow(i + 1);
				if (dto[i].getProjectId() != null)
				{
					row.createCell(0).setCellValue(new HSSFRichTextString("" + dto[i].getProjectId()));
				}
				else
				{
					row.createCell(0).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getProjectName() != null)
				{
					row.createCell(1).setCellValue(new HSSFRichTextString("" + dto[i].getProjectName()));
				}
				else
				{
					row.createCell(1).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getCustomer() != null)
				{
					row.createCell(2).setCellValue(new HSSFRichTextString("" + dto[i].getCustomer()));
				}
				else
				{
					row.createCell(2).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getTitle() != null)
				{
					row.createCell(3).setCellValue(new HSSFRichTextString("" + dto[i].getTitle()));
				}
				else
				{
					row.createCell(3).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getDrm() != null)
				{
					row.createCell(4).setCellValue(new HSSFRichTextString("" + dto[i].getDrm()));
				}
				else
				{
					row.createCell(4).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getProjectType() != null)
				{
					row.createCell(5).setCellValue(new HSSFRichTextString("" + dto[i].getProjectType()));
				}
				else
				{
					row.createCell(5).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].geteComp() != null)
				{
					row.createCell(6).setCellValue(new HSSFRichTextString("" + dto[i].geteComp()));
				}
				else
				{
					row.createCell(6).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getAvailable() != null)
				{
					row.createCell(7).setCellValue(new HSSFRichTextString("" + dto[i].getAvailable()));
				}
				else
				{
					row.createCell(7).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getExpiration() != null)
				{
					row.createCell(8).setCellValue(new HSSFRichTextString("" + dto[i].getExpiration()));
				}
				else
				{
					row.createCell(8).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getSoldQty() != null)
				{
					row.createCell(9).setCellValue(new HSSFRichTextString("" + dto[i].getSoldQty()));
				}
				else
				{
					row.createCell(9).setCellValue(new HSSFRichTextString(""));
				}
				
				if (dto[i].getBackupQty() != null)
				{
					row.createCell(10).setCellValue(new HSSFRichTextString("" + dto[i].getBackupQty()));
				}
				else
				{
					row.createCell(10).setCellValue(new HSSFRichTextString(""));
				}
				
				
				if (dto[i].getDownloads() != null)
				{
					row.createCell(11).setCellValue(new HSSFRichTextString("" + dto[i].getDownloads()));
				}
				else
				{
					row.createCell(11).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getTemplate() != null)
				{
					row.createCell(12).setCellValue(new HSSFRichTextString("" + dto[i].getTemplate()));
				}
				else
				{
					row.createCell(12).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getNotes() != null)
				{
					row.createCell(13).setCellValue(new HSSFRichTextString("" + dto[i].getNotes()));
				}
				else
				{
					row.createCell(13).setCellValue(new HSSFRichTextString(""));
				}
				if (dto[i].getMpsComments() != null)
				{
					row.createCell(14).setCellValue(new HSSFRichTextString("" + dto[i].getMpsComments()));
				}
				else
				{
					row.createCell(14).setCellValue(new HSSFRichTextString(""));
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
			
		}
		
		return workbook;
		
		
	}
	
	public static void main(String[] args)
	{
		
	}
}
