package main.java.com.mps.wiley.ebb.reportsCreator;
 
import main.java.com.mps.wiley.ebb.reportsBean.CustomerProjectActivityReport;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor; 

public class CustomerProjectActivityReportCreator
{
	
	public HSSFWorkbook createActivityWorkBook(CustomerProjectActivityReport[] dto ) throws Exception
	{
	 	HSSFWorkbook workbook = new HSSFWorkbook();	 
		HSSFSheet sheet = workbook.createSheet("Customer - Project Activity");
		
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
			for (int ii = 0; ii < 11; ii++)
			{
				cell = row.createCell(+ii);
				if (ii == 0)
				{
					cell.setCellValue(new HSSFRichTextString("Project Name"));
				}
				if (ii == 1)
				{
					cell.setCellValue(new HSSFRichTextString("URL"));
				}
				if (ii == 2)
				{
					cell.setCellValue(new HSSFRichTextString("Date"));
				}
				if (ii == 3)
				{
					cell.setCellValue(new HSSFRichTextString("Name"));
				}
				if (ii == 4)
				{
					cell.setCellValue(new HSSFRichTextString("Company"));
				}
				if (ii == 5)
				{
					cell.setCellValue(new HSSFRichTextString("Email"));
				}
				if (ii == 6)
				{
					cell.setCellValue(new HSSFRichTextString("Phone"));
				}
				if (ii == 7)
				{
					cell.setCellValue(new HSSFRichTextString("Mobile"));
				}
				if (ii == 8)
				{
					cell.setCellValue(new HSSFRichTextString("Country"));
				}
				
				if (ii == 9)
				{
					cell.setCellValue(new HSSFRichTextString("Promo Codes"));
				}
				if (ii == 10)
				{
					cell.setCellValue(new HSSFRichTextString("Download"));
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
			row = sheet.createRow(i + 1);
			if (dto[i].getProjectName() != null)
			{
				System.out.println(dto[i].getProjectName());
				row.createCell(0).setCellValue(new HSSFRichTextString("" + dto[i].getProjectName()));
			}
			else
			{
				row.createCell(0).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getUrl() != null)
			{
				row.createCell(1).setCellValue(new HSSFRichTextString("" + dto[i].getUrl()));
			}
			else
			{
				row.createCell(1).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getDates() != null)
			{
				row.createCell(2).setCellValue(new HSSFRichTextString("" + dto[i].getDates()));
			}
			else
			{
				row.createCell(2).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getNames() != null)
			{
				row.createCell(3).setCellValue(new HSSFRichTextString("" + dto[i].getNames()));
			}
			else
			{
				row.createCell(3).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getCompany() != null)
			{
				row.createCell(4).setCellValue(new HSSFRichTextString("" + dto[i].getCompany()));
			}
			else
			{
				row.createCell(4).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getEmail() != null)
			{
				row.createCell(5).setCellValue(new HSSFRichTextString("" + dto[i].getEmail()));
			}
			else
			{
				row.createCell(5).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getPhone() != null)
			{
				row.createCell(6).setCellValue(new HSSFRichTextString("" + dto[i].getPhone()));
			}
			else
			{
				row.createCell(6).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getMobile() != null)
			{
				row.createCell(7).setCellValue(new HSSFRichTextString("" + dto[i].getMobile()));
			}
			else
			{
				row.createCell(7).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getCountry() != null)
			{
				row.createCell(8).setCellValue(new HSSFRichTextString("" + dto[i].getCountry()));
			}
			else
			{
				row.createCell(8).setCellValue(new HSSFRichTextString(""));
			}
			
			if (dto[i].getPromoCodes() != null)
			{
				row.createCell(9).setCellValue(new HSSFRichTextString("" + dto[i].getPromoCodes()));
			}
			else
			{
				row.createCell(9).setCellValue(new HSSFRichTextString(""));
			}
			if (dto[i].getDownload() != null)
			{
				row.createCell(10).setCellValue(new HSSFRichTextString("" + dto[i].getDownload()));
			}
			else
			{
				row.createCell(10).setCellValue(new HSSFRichTextString(""));
			}
		}
		
		
		return workbook;
		
		
	}
}
