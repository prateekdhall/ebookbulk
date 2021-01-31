package main.java.com.mps.wiley.ebb.reportsCreator;

import java.util.List;

import main.java.com.mps.wiley.ebb.reportsBean.ProjectDetailsReport;

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

public class ProjectDetailsReportCreator
{
	
	public HSSFWorkbook createProjectDetailsWorkBook(List<ProjectDetailsReport> list) throws Exception
	{
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = null;
		
			sheet = workbook.createSheet("Project Details");
			
			sheet.setColumnWidth(0, 10*256);
			sheet.setColumnWidth(1, 15*256);
			sheet.setColumnWidth(2, 20*256);
			sheet.setColumnWidth(3, 10*256);
			sheet.setColumnWidth(4, 13*256);
			sheet.setColumnWidth(5, 25*256);
			sheet.setColumnWidth(6, 15*256);
			sheet.setColumnWidth(7, 15*256);
			sheet.setColumnWidth(8, 15*256);
			sheet.setColumnWidth(9, 12*256);
			sheet.setColumnWidth(10, 13*256);
			sheet.setColumnWidth(11, 19*256);
			sheet.setColumnWidth(12, 19*256);
			sheet.setColumnWidth(13, 19*256);
			sheet.setColumnWidth(14, 10*256);
			sheet.setColumnWidth(15, 12*256);
			sheet.setColumnWidth(16, 12*256);
			sheet.setColumnWidth(17, 40*256);
			sheet.setColumnWidth(18, 6*256);
			sheet.setColumnWidth(19, 11*256);
			sheet.setColumnWidth(20, 12*256);
			sheet.setColumnWidth(21, 12*256);
			sheet.setColumnWidth(22, 35*256);
			sheet.setColumnWidth(23, 30*256);
			sheet.setColumnWidth(24, 10*256);
			sheet.setColumnWidth(25, 20*256);
			sheet.setColumnWidth(26, 19*256);
			
			HSSFCellStyle style = workbook.createCellStyle();
			HSSFRow row = null;
			
			for (int i = 0; i < 1; i++)
			{
				row = sheet.createRow((short)+i);
				HSSFCell cell = null;
				for (int j = 0; j < 27; j++)
				{
					cell = row.createCell(+j);
					
					if (j == 0){cell.setCellValue(new HSSFRichTextString("Project ID"));}
					else if (j == 1){cell.setCellValue(new HSSFRichTextString("Project Name"));}
					else if (j == 2){cell.setCellValue(new HSSFRichTextString("Creation Date"));}
					else if (j == 3){cell.setCellValue(new HSSFRichTextString("Customer"));}
					else if (j == 4){cell.setCellValue(new HSSFRichTextString("Contact Name"));}
					else if (j == 5){cell.setCellValue(new HSSFRichTextString("Contact Email"));}
					else if (j == 6){cell.setCellValue(new HSSFRichTextString("Contact Phone"));}
					else if (j == 7){cell.setCellValue(new HSSFRichTextString("Requester"));}
					else if (j == 8){cell.setCellValue(new HSSFRichTextString("Project Admin"));}
					else if (j == 9){cell.setCellValue(new HSSFRichTextString("Project Type"));}
					else if (j == 10){cell.setCellValue(new HSSFRichTextString("eComp"));}
					else if (j == 11){cell.setCellValue(new HSSFRichTextString("Available"));}
					else if (j == 12){cell.setCellValue(new HSSFRichTextString("Expiration"));}
					else if (j == 13){cell.setCellValue(new HSSFRichTextString("Threshold"));}
					else if (j == 14){cell.setCellValue(new HSSFRichTextString("Sold Qty"));}
					else if (j == 15){cell.setCellValue(new HSSFRichTextString("Backup Qty"));}
					else if (j == 16){cell.setCellValue(new HSSFRichTextString("Threshold Qty"));}
					else if (j == 17){cell.setCellValue(new HSSFRichTextString("Title"));}
					else if (j == 18){cell.setCellValue(new HSSFRichTextString("DRM"));}
					else if (j == 19){cell.setCellValue(new HSSFRichTextString("Template"));}
					else if (j == 20){cell.setCellValue(new HSSFRichTextString("Registration"));}
					else if (j == 21){cell.setCellValue(new HSSFRichTextString("Promo Code"));}
					else if (j == 22){cell.setCellValue(new HSSFRichTextString("Short Tag URL"));}
					else if (j == 23){cell.setCellValue(new HSSFRichTextString("Notes"));}
					else if (j == 24){cell.setCellValue(new HSSFRichTextString("Status"));}
					else if (j == 25){cell.setCellValue(new HSSFRichTextString("Last Update"));}
					else if (j == 26){cell.setCellValue(new HSSFRichTextString("MPS Comments"));}
					
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
				ProjectDetailsReport projectDetailsReport=list.get(i);
				row = sheet.createRow(i + 1);
				
				if (projectDetailsReport.getProjectId() != null)
				{
					row.createCell(0).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getProjectId()));
				}
				else
				{
					row.createCell(0).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getProjectName() != null)
				{
					row.createCell(1).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getProjectName()));
				}
				else
				{
					row.createCell(1).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getCreatedDate() != null)
				{
					row.createCell(2).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getCreatedDate()));
				}
				else
				{
					row.createCell(2).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getCustomer() != null)
				{
					row.createCell(3).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getCustomer().getValue()));
				}
				else
				{
					row.createCell(3).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getContactName() != null)
				{
					row.createCell(4).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getContactName()));
				}
				else
				{
					row.createCell(4).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getContactEmail() != null)
				{
					row.createCell(5).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getContactEmail()));
				}
				else
				{
					row.createCell(5).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getContactPhone() != null)
				{
					row.createCell(6).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getContactPhone()));
				}
				else
				{
					row.createCell(6).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getRequester() != null)
				{
					row.createCell(7).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getRequester().getValue()));
				}
				else
				{
					row.createCell(7).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getPrjAdmin() != null)
				{
					row.createCell(8).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getPrjAdmin().getValue()));
				}
				else
				{
					row.createCell(8).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getProjectType() != null)
				{
					row.createCell(9).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getProjectType().getValue()));
				}
				else
				{
					row.createCell(9).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getEcomp() != null)
				{
					row.createCell(10).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getEcomp().getValue()));
				}
				else
				{
					row.createCell(10).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getAvailableDate() != null)
				{
					row.createCell(11).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getAvailableDate()));
				}
				else
				{
					row.createCell(11).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getExpiryDate() != null)
				{
					row.createCell(12).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getExpiryDate()));
				}
				else
				{
					row.createCell(12).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getThresoldDate() != null)
				{
					row.createCell(13).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getThresoldDate()));
				}
				else
				{
					row.createCell(13).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getBackupQty() != null)
				{
					row.createCell(14).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getBackupQty()));
				}
				else
				{
					row.createCell(14).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getSoldQty() != null)
				{
					row.createCell(15).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getSoldQty()));
				}
				else
				{
					row.createCell(15).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getThresoldQty() != null)
				{
					row.createCell(16).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getThresoldQty()));
				}
				else
				{
					row.createCell(16).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getTitle() != null)
				{
					row.createCell(17).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getTitle()));
				}
				else
				{
					row.createCell(17).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getDrm() != null)
				{
					row.createCell(18).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getDrm().getValue()));
				}
				else
				{
					row.createCell(18).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getTemplate() != null)
				{
					row.createCell(19).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getTemplate()));
				}
				else
				{
					row.createCell(19).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getRegistration() != null)
				{
					row.createCell(20).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getRegistration().getValue()));
				}
				else
				{
					row.createCell(20).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getPromoCode() != null)
				{
					row.createCell(21).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getPromoCode().getValue()));
				}
				else
				{
					row.createCell(21).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getStUrl() != null)
				{
					row.createCell(22).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getStUrl()));
				}
				else
				{
					row.createCell(22).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getNotes() != null)
				{
					row.createCell(23).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getNotes()));
				}
				else
				{
					row.createCell(23).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getProjectStatus() != null)
				{
					row.createCell(24).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getProjectStatus().getValue()));
				}
				else
				{
					row.createCell(24).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getUpdatedDate() != null)
				{
					row.createCell(25).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getUpdatedDate()));
				}
				else
				{
					row.createCell(25).setCellValue(new HSSFRichTextString(""));
				}
				
				if (projectDetailsReport.getMpsComments() != null)
				{
					row.createCell(26).setCellValue(new HSSFRichTextString("" + projectDetailsReport.getMpsComments()));
				}
				else
				{
					row.createCell(26).setCellValue(new HSSFRichTextString(""));
				}
			}
		
		return workbook;
		
	}
	
}
