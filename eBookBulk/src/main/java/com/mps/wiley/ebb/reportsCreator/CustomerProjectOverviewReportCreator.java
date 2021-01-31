package main.java.com.mps.wiley.ebb.reportsCreator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectOverviewReport;
import main.java.com.mps.wiley.ebb.reportsBean.ReportCriteriaBean;
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
public class CustomerProjectOverviewReportCreator
{
	public HSSFWorkbook createWorkBook(CustomerProjectOverviewReport[] dto) throws Exception
	{
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Customer - Project Overview");
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
		
		HSSFCellStyle style = workbook.createCellStyle();
		HSSFRow row = null;
		for (int j = 0; j < 1; j++)
		{
			row = sheet.createRow((short)+j);
			HSSFCell cell = null;
			for (int ii = 0; ii < 10; ii++)
			{
				cell = row.createCell(+ii);
				if (ii == 0)
				{
					cell.setCellValue(new HSSFRichTextString("Project Name"));
				}
				if (ii == 1)
				{
					cell.setCellValue(new HSSFRichTextString("Available"));
				}
				if (ii == 2)
				{
					cell.setCellValue(new HSSFRichTextString("Expiration"));
				}
				if (ii == 3)
				{
					cell.setCellValue(new HSSFRichTextString("Sold Qty"));
				}
				if (ii == 4)
				{
					cell.setCellValue(new HSSFRichTextString("Backup Qty"));
				}
				if (ii == 5)
				{
					cell.setCellValue(new HSSFRichTextString("Activation Start"));
				}
				if (ii == 6)
				{
					cell.setCellValue(new HSSFRichTextString("Activation End"));
				}
				if (ii == 7)
				{
					cell.setCellValue(new HSSFRichTextString("Title"));
				}
				if (ii == 8)
				{
					cell.setCellValue(new HSSFRichTextString("Downloads"));
				}
				
				
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
		
		for (int i = 0; i < dto.length; i++)
		{
			int rowcounter = 1;
			row = sheet.createRow(rowcounter);
			if (dto[i].getProjectName() != null)
			{
				row.createCell(0).setCellValue(new HSSFRichTextString("" + dto[i].getProjectName()));
			}
			else
			{
				row.createCell(0).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getAvailable() != null)
			{
				row.createCell(1).setCellValue(new HSSFRichTextString("" + dto[i].getAvailable()));
			}
			else
			{
				row.createCell(1).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getExpiration() != null)
			{
				row.createCell(2).setCellValue(new HSSFRichTextString("" + dto[i].getExpiration()));
			}
			else
			{
				row.createCell(2).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getSoldQty() != null)
			{
				row.createCell(3).setCellValue(new HSSFRichTextString("" + dto[i].getSoldQty()));
			}
			else
			{
				row.createCell(3).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getBackupQty() != null)
			{
				row.createCell(4).setCellValue(new HSSFRichTextString("" + dto[i].getBackupQty()));
			}
			else
			{
				row.createCell(4).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getActivationStart() != null)
			{
				row.createCell(5).setCellValue(new HSSFRichTextString("" + dto[i].getActivationStart()));
			}
			else
			{
				row.createCell(5).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getAcivationEnd() != null)
			{
				row.createCell(6).setCellValue(new HSSFRichTextString("" + dto[i].getAcivationEnd()));
			}
			else
			{
				row.createCell(6).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getTitle() != null)
			{
				  row.createCell(7).setCellValue(new HSSFRichTextString("" + dto[i].getTitle()));
			 
			}
			else
			{
				row.createCell(7).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getDownloads() != null)
			{
				row.createCell(8).setCellValue(new HSSFRichTextString("" + dto[i].getDownloads()));
			}
			else
			{
				row.createCell(8).setCellValue(new HSSFRichTextString(""));
			}
			rowcounter++;
		}
		
		
		return workbook;
		
		
	}
	
}
