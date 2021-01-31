package main.java.com.mps.wiley.ebb.reportsCreator;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.java.com.mps.common.util.DateUtil;
import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.ebb.reportsBean.ProjectHistoryReport;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;


public class ProjectHistoryReportCreator
{
	
	public HSSFWorkbook createProjectHistoryWorkBook(List<Map<String, Object>> map) throws Exception
	{
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Project History");
		sheet.setColumnWidth(0, 2000);
		sheet.setColumnWidth(1, 4500);
		sheet.setColumnWidth(2, 4500);
		sheet.setColumnWidth(3, 4500);
		sheet.setColumnWidth(4, 4500);
		sheet.setColumnWidth(5, 4500);
		sheet.setColumnWidth(6, 4500);
		sheet.setColumnWidth(7, 4500);
		sheet.setColumnWidth(8, 4500);
		sheet.setColumnWidth(9, 5000);
		sheet.setColumnWidth(10, 7000);
		sheet.setColumnWidth(11, 7000);
		
		try
		{
			HSSFCellStyle style = workbook.createCellStyle();
			HSSFRow row = null;
			for (int i = 0; i < 1; i++)
			{
				row = sheet.createRow((short)+i);
				HSSFCell cell = null;
				for (int j = 0; j < 12; j++)
				{
					cell = row.createCell(+j);
					
					if (j == 0)
					{
						cell.setCellValue(new HSSFRichTextString("Sno."));
					}
					else if (j == 1)
					{
						cell.setCellValue(new HSSFRichTextString("Project ID"));
					}
					else if (j == 2)
					{
						cell.setCellValue(new HSSFRichTextString("Project Name"));
					}
					else if (j == 3)
					{
						cell.setCellValue(new HSSFRichTextString("Project Type"));
					}
					else if (j == 4)
					{
						cell.setCellValue(new HSSFRichTextString("eComp"));
					}
					else if (j == 5)
					{
						cell.setCellValue(new HSSFRichTextString("Available"));
					}
					else if (j == 6)
					{
						cell.setCellValue(new HSSFRichTextString("Expiration"));
					}
					else if (j == 7)
					{
						cell.setCellValue(new HSSFRichTextString("Sold Qty"));
					}
					else if (j == 8)
					{
						cell.setCellValue(new HSSFRichTextString("Backup Qty"));
					}
					else if (j == 9)
					{
						cell.setCellValue(new HSSFRichTextString("Status"));
					}
					else if (j == 10)
					{
						cell.setCellValue(new HSSFRichTextString("Changed By"));
					}
					else if (j == 11)
					{
						cell.setCellValue(new HSSFRichTextString("Changed Date"));
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
			
			if (map.size() != 0)
			{
				List<ProjectHistoryReport> list = new ArrayList<ProjectHistoryReport>();
				list = dbToexcelGenerator(map);
				
				System.out.println("list size:::" + list.size());
				final int iSize = list.size();
				for (int i = 0; i < iSize; i++)
				{
					ProjectHistoryReport projectHistoryReport = list.get(i);
					row = sheet.createRow(i + 1);
					if (projectHistoryReport.getSerialNo() != null)
					{
						row.createCell(0).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getSerialNo()));
					}
					else
					{
						row.createCell(0).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getProjectId() != null)
					{
						row.createCell(1).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getProjectId()));
					}
					else
					{
						row.createCell(1).setCellValue(new HSSFRichTextString(""));
					}
					
					if (projectHistoryReport.getProjectName() != null)
					{
						row.createCell(2).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getProjectName()));
					}
					else
					{
						row.createCell(2).setCellValue(new HSSFRichTextString(""));
					}
					
					if (projectHistoryReport.getProjectType().getValue() != null)
					{
						row.createCell(3).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getProjectType().getValue()));
					}
					else
					{
						row.createCell(3).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getEcomp().getValue() != null)
					{
						row.createCell(4).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getEcomp().getValue()));
					}
					else
					{
						row.createCell(4).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getAvailable() != null)
					{
						row.createCell(5).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getAvailable()));
					}
					else
					{
						row.createCell(5).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getExpiration() != null)
					{
						row.createCell(6).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getExpiration()));
					}
					else
					{
						row.createCell(6).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getSoldQuantity() != null)
					{
						row.createCell(7).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getSoldQuantity()));
					}
					else
					{
						row.createCell(7).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getBackupQuantity() != null)
					{
						row.createCell(8).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getBackupQuantity()));
					}
					else
					{
						row.createCell(8).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getStatus() != null)
					{
						row.createCell(9).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getStatus()));
					}
					else
					{
						row.createCell(9).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getCreatedBy() != null)
					{
						row.createCell(10).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getCreatedBy()));
					}
					else
					{
						row.createCell(10).setCellValue(new HSSFRichTextString(""));
					}
					if (projectHistoryReport.getCreatedDate() != null)
					{
						row.createCell(11).setCellValue(new HSSFRichTextString("" + projectHistoryReport.getCreatedDate()));
					}
					else
					{
						row.createCell(11).setCellValue(new HSSFRichTextString(""));
					}
					row.setRowStyle(style);
				}
			}
		}
		catch (Exception e)
		{
			throw new Exception(e.getMessage(), e);
		}
		return workbook;
		
	}
	
	private List<ProjectHistoryReport> dbToexcelGenerator(List<Map<String, Object>> prjHistoryList) throws Exception
	{
		
		try
		{
			List<ProjectHistoryReport> finalList = new ArrayList<ProjectHistoryReport>();
			final int iSize = prjHistoryList.size();
			String createdDate = null;
			int projectId = 0;
			int serialNo = 1;
			ProjectHistoryReport reportDto = new ProjectHistoryReport();
			for (int i = 0; i < iSize; i++)
			{
				
				if (i == 0)
				{
					createdDate = prjHistoryList.get(i).get("createdDate").toString();
					projectId = (Integer)prjHistoryList.get(i).get("projectId");
					reportDto.setSerialNo(serialNo);
					serialNo++;
					reportDto.setProjectId((Integer)prjHistoryList.get(i).get("projectId"));
					reportDto.setProjectName((String)prjHistoryList.get(i).get("projectName"));
					reportDto.getProjectType().setId((Integer)prjHistoryList.get(i).get("projectType"));
					reportDto.getProjectType().setValue(prjHistoryList.get(i).get("projectTypeValue").toString());
					reportDto.getEcomp().setId((Integer)prjHistoryList.get(i).get("ecomp"));
					reportDto.getEcomp().setValue(prjHistoryList.get(i).get("ecompValue").toString());
					reportDto.setCreatedBy((String)prjHistoryList.get(i).get("createdBy"));
					reportDto.setCreatedDate(DateUtil.getDateNoTimeStringFormatFromString(prjHistoryList.get(i).get("createdDate").toString()));
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("AVAILABLE_DATE"))
					{
						reportDto.setAvailable(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("EXPIRY_DATE"))
					{
						reportDto.setExpiration(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("SOLD_QTY"))
					{
						reportDto.setSoldQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("BACKUP_QTY"))
					
					{
						reportDto.setBackupQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("PROJECT_STATUS"))
					{
						if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_PENDING)
						{
							reportDto.setStatus("Pending");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_ACTIVE)
						{
							reportDto.setStatus("Active");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_INACTIVE)
						{
							reportDto.setStatus("Inactive");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_DELETED)
						{
							reportDto.setStatus("Deleted");
						}
					}
				}
				
				else if (projectId == (Integer)prjHistoryList.get(i).get("projectId") && createdDate.equalsIgnoreCase(prjHistoryList.get(i).get("createdDate").toString()))
				{
					createdDate = prjHistoryList.get(i).get("createdDate").toString();
					projectId = (Integer)prjHistoryList.get(i).get("projectId");
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("AVAILABLE_DATE"))
					{
						reportDto.setAvailable(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("EXPIRY_DATE"))
					{
						reportDto.setExpiration(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("SOLD_QTY"))
					{
						reportDto.setSoldQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("BACKUP_QTY"))
					
					{
						reportDto.setBackupQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("PROJECT_STATUS"))
					
					{
						if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_PENDING)
						{
							reportDto.setStatus("Pending");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_ACTIVE)
						{
							reportDto.setStatus("Active");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_INACTIVE)
						{
							reportDto.setStatus("Inactive");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_DELETED)
						{
							reportDto.setStatus("Deleted");
						}
					}
				}
				else if (projectId == (Integer)prjHistoryList.get(i).get("projectId") && !createdDate.equalsIgnoreCase(prjHistoryList.get(i).get("createdDate").toString()))
				{
					createdDate = prjHistoryList.get(i).get("createdDate").toString();
					projectId = (Integer)prjHistoryList.get(i).get("projectId");
					finalList.add(reportDto);
					reportDto = new ProjectHistoryReport();
					reportDto.setCreatedBy((String)prjHistoryList.get(i).get("createdBy"));
					reportDto.setCreatedDate(DateUtil.getDateNoTimeStringFormatFromString(prjHistoryList.get(i).get("createdDate").toString()));
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("AVAILABLE_DATE"))
					{
						reportDto.setAvailable(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("EXPIRY_DATE"))
					{
						reportDto.setExpiration(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("SOLD_QTY"))
					{
						reportDto.setSoldQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("BACKUP_QTY"))
					
					{
						reportDto.setBackupQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("PROJECT_STATUS"))
					
					{
						if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_PENDING)
						{
							reportDto.setStatus("Pending");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_ACTIVE)
						{
							reportDto.setStatus("Active");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_INACTIVE)
						{
							reportDto.setStatus("Inactive");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_DELETED)
						{
							reportDto.setStatus("Deleted");
						}
					}
					
				}
				else if (projectId != (Integer)prjHistoryList.get(i).get("projectId"))
				{
					finalList.add(reportDto);
					reportDto = new ProjectHistoryReport();
					createdDate = prjHistoryList.get(i).get("createdDate").toString();
					projectId = (Integer)prjHistoryList.get(i).get("projectId");
					reportDto.setSerialNo(serialNo);
					serialNo++;
					reportDto.setProjectId((Integer)prjHistoryList.get(i).get("projectId"));
					reportDto.setProjectName((String)prjHistoryList.get(i).get("projectName"));
					reportDto.getProjectType().setId((Integer)prjHistoryList.get(i).get("projectType"));
					reportDto.getProjectType().setValue(prjHistoryList.get(i).get("projectTypeValue").toString());
					reportDto.getEcomp().setId((Integer)prjHistoryList.get(i).get("ecomp"));
					reportDto.getEcomp().setValue(prjHistoryList.get(i).get("ecompValue").toString());
					reportDto.setCreatedBy((String)prjHistoryList.get(i).get("createdBy"));
					reportDto.setCreatedDate(DateUtil.getDateNoTimeStringFormatFromString(prjHistoryList.get(i).get("createdDate").toString()));
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("AVAILABLE_DATE"))
					{
						reportDto.setAvailable(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("EXPIRY_DATE"))
					{
						reportDto.setExpiration(prjHistoryList.get(i).get("currvalue").toString());
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("SOLD_QTY"))
					{
						reportDto.setSoldQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("BACKUP_QTY"))
					
					{
						reportDto.setBackupQuantity((String)prjHistoryList.get(i).get("currvalue"));
					}
					if (prjHistoryList.get(i).get("fieldName") != null && prjHistoryList.get(i).get("fieldName").toString().equalsIgnoreCase("PROJECT_STATUS"))
					
					{
						if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_PENDING)
						{
							reportDto.setStatus("Pending");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_ACTIVE)
						{
							reportDto.setStatus("Active");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_INACTIVE)
						{
							reportDto.setStatus("Inactive");
						}
						else if (Integer.parseInt(prjHistoryList.get(i).get("currvalue").toString()) == AppConstants.STATUS_DELETED)
						{
							reportDto.setStatus("Deleted");
						}
					}
				}
				if (i == iSize - 1)
				{
					finalList.add(reportDto);
				}
			}
			return finalList;
		}
		catch (Exception e)
		{
			throw new Exception(e.getMessage(), e);
		}
	}
}
