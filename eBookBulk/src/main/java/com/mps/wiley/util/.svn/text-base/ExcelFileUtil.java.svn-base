package main.java.com.mps.wiley.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

import main.java.com.mps.common.AppSystem;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.Region;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelFileUtil {
	public static File createExcelFile(String sheetName, String[][] reportHeader, String sheetName1, String[][] reportHeader1)
	{
		// create a new file
		File file = new File(AppSystem.getConfig("tempexcelpath")+"temp"+".xls");
		
			System.out.println("filepath===>"+AppSystem.getConfig("tempexcelpath")+"temp"+".xls");
		
		
		HSSFWorkbook workBook = null;
		FileOutputStream fileOut = null;
		try
		{
			workBook = createExcelReport(reportHeader, sheetName, reportHeader1, sheetName1);
			fileOut = new FileOutputStream(file);
			workBook.write(fileOut);
			fileOut.close();
		}
		catch (FileNotFoundException e)
		{
		}
		catch (IOException e)
		{
		}
		finally
		{
			workBook = null;
			fileOut = null;
		}

		return file;
	}
	
	public static HSSFWorkbook createExcelReport(String[][] reportHeader,
			String sheetName, String[][] reportHeader1, String sheetName1)
	{
		HSSFWorkbook wb = null;
		HSSFSheet sheet = null;
		HSSFSheet sheet1 = null;
		HSSFRow xlsRow = null;
		HSSFCellStyle cellStyle = null;
		HSSFFont font = null;
		try
		{
			// Create a row and put some cells in it. Rows are 0 based.
			wb = new HSSFWorkbook();
			cellStyle = wb.createCellStyle();
			cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
			cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);

			font = wb.createFont();
			font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			cellStyle.setFont(font);
			sheet = wb.createSheet(sheetName);
			sheet1 = wb.createSheet(sheetName1);

			// create row
			int len = reportHeader.length;
			for (int j = 0; j < len; j++)
			{
				xlsRow = sheet.createRow(j);
				int rowLength = reportHeader[j].length;
				for (short i = 0; i < rowLength; i++)
				{
					// Get cell
					HSSFCell xlsCell = xlsRow.getCell(i);

					//	if not found create cell
					if (xlsCell == null)
					{
						xlsCell = xlsRow.createCell(i);
						// write data to cell
						xlsCell.setCellType(HSSFCell.CELL_TYPE_STRING);
						if (reportHeader[j][i] != null)
						{
							xlsCell.setCellValue(reportHeader[j][i]);
						}
						else
						{
							xlsCell.setCellValue("");
						}
						xlsCell.setCellStyle(cellStyle);
					}// if cell
				}// for cell 
			}//for row
			int length = reportHeader.length;
			for (int i = 0; i < length - 1; i++)
			{
				sheet.addMergedRegion(new Region((int) 0, (short) 0, (int) 0,
						(short) (reportHeader[i].length - 1)));
			}
			
			/****************************************************/
			len = reportHeader1.length;
			for (int j = 0; j < len; j++)
			{
				xlsRow = sheet1.createRow(j);
				int rowLength = reportHeader1[j].length;
				for (short i = 0; i < rowLength; i++)
				{
					// Get cell
					HSSFCell xlsCell = xlsRow.getCell(i);

					//	if not found create cell
					if (xlsCell == null)
					{
						xlsCell = xlsRow.createCell(i);
						// write data to cell
						xlsCell.setCellType(HSSFCell.CELL_TYPE_STRING);
						if (reportHeader1[j][i] != null)
						{
							xlsCell.setCellValue(reportHeader1[j][i]);
						}
						else
						{
							xlsCell.setCellValue("");
						}
						xlsCell.setCellStyle(cellStyle);
					}// if cell
				}// for cell 
			}//for row
			 length = reportHeader1.length;
			for (int i = 0; i < length - 1; i++)
			{
				sheet1.addMergedRegion(new Region((int) 0, (short) 0, (int) 0,
						(short) (reportHeader1[i].length - 1)));
			}
			
			/**********************************************************/
		}
		catch (Exception e)
		{
		}
		finally
		{
		}
		return wb;
	}
	
	
	public static boolean writeExcelFileFooter(File file, String sheetName,
			int row, String[][] reportFooter, String sheetName1, String[][] reportFooter1)
	{
		POIFSFileSystem fs = null;
		HSSFWorkbook workBook = null;
		HSSFSheet sheet = null;
		HSSFSheet sheet1 = null;
		HSSFRow xlsRow = null;
		HSSFCellStyle cellStyle = null;
		FileOutputStream fileOut = null;
		HSSFFont font = null;

		boolean returnFlag = true;
		try
		{
			// get file 
			fs = new POIFSFileSystem(new FileInputStream(file));
			// get workbook
			workBook = new HSSFWorkbook(fs);
			cellStyle = workBook.createCellStyle();
			cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			cellStyle.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
			cellStyle.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
			cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
			cellStyle.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
			font = workBook.createFont();
			//font.setFontHeight((short)220);
			
			font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			//font.setFontHeight((short)220);
			cellStyle.setFont(font);

			// get workbook sheet
			sheet = workBook.getSheet(sheetName);
			sheet1 = workBook.getSheet(sheetName1);

			// create row
			int length = reportFooter.length;
			for (int j = 0; j < length; j++)
			{
				xlsRow = sheet.createRow(row + j);
				int rowLength = reportFooter[j].length;
				for (short i = 0; i < rowLength; i++)
				{
					// Get cell
					HSSFCell xlsCell = xlsRow.getCell(i);

					//	if not found create cell
					if (xlsCell == null)
					{
						xlsCell = xlsRow.createCell(i);

						xlsCell.setCellStyle(cellStyle);
						// write data to cell
						xlsCell.setCellType(HSSFCell.CELL_TYPE_STRING);
						if (reportFooter[j][i] != null)
						{
							byte[] bytes = StringUtility
									.getDenormalizedHtmlString(
											reportFooter[j][i]).getBytes();
							xlsCell.setCellValue(new String(bytes, 0,
									bytes.length, "UTF-8"));
						}
						else
						{
							xlsCell.setCellValue("");
						}

					}// if cell
				}// for cell 
			}//for row
			int len = reportFooter.length;
			for (int i = 0; i < len - 1; i++)
			{
				sheet.addMergedRegion(new Region((int) row, (short) 0,
						(int) row, (short) (reportFooter[i].length - 1)));
			}
			
			
			/****************************************************/
			len = reportFooter1.length;
			for (int j = 0; j < len; j++)
			{
				xlsRow = sheet1.createRow(j);
				int rowLength = reportFooter1[j].length;
				for (short i = 0; i < rowLength; i++)
				{
					// Get cell
					HSSFCell xlsCell = xlsRow.getCell(i);

					//	if not found create cell
					if (xlsCell == null)
					{
						xlsCell = xlsRow.createCell(i);
						// write data to cell
						xlsCell.setCellType(HSSFCell.CELL_TYPE_STRING);
						if (reportFooter1[j][i] != null)
						{
							xlsCell.setCellValue(reportFooter1[j][i]);
						}
						else
						{
							xlsCell.setCellValue("");
						}
						xlsCell.setCellStyle(cellStyle);
					}// if cell
				}// for cell 
			}//for row
			 length = reportFooter1.length;
			for (int i = 0; i < length - 1; i++)
			{
				sheet1.addMergedRegion(new Region((int) 0, (short) 0, (int) 0,
						(short) (reportFooter1[i].length - 1)));
			}
			
			/**********************************************************/
			// write to file
			fileOut = new FileOutputStream(file);
			workBook.write(fileOut);

		}
		catch (FileNotFoundException e)
		{
			returnFlag = false;
		}
		catch (IOException e)
		{
			returnFlag = false;
		}
		finally
		{
			fs = null;
			workBook = null;
			sheet = null;
			xlsRow = null;
			fileOut = null;

		}
		return returnFlag;
	}
	
	
	public static boolean writeExcelFileData(File file, String sheetName,
			int row, Collection<String[]> reportData, String sheetName1, Collection<String[]> reportData1)
	{
		POIFSFileSystem fs = null;
		HSSFWorkbook workBook = null;
		HSSFSheet sheet = null;
		HSSFSheet sheet1 = null;
		HSSFRow xlsRow = null;
		HSSFCellStyle cellStyle = null;
		HSSFCellStyle cellStyleForDecimals = null;
		HSSFFont font = null;
		FileOutputStream fileOut = null;

		boolean returnFlag = true;
		try
		{
			// get file 
			fs = new POIFSFileSystem(new FileInputStream(file));
			// get workbook
			workBook = new HSSFWorkbook(fs);
			// get workbook sheet
			sheet = workBook.getSheet(sheetName);
			sheet1 = workBook.getSheet(sheetName1);
			cellStyle = workBook.createCellStyle();
			cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			cellStyle.setFillPattern(HSSFCellStyle.NO_FILL);
			cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
			cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
			HSSFDataFormat df = workBook.createDataFormat();
			font = workBook.createFont();
			cellStyle.setFont(font);
			cellStyle.setDataFormat(df.getFormat("0"));
			
			cellStyleForDecimals = workBook.createCellStyle();
			cellStyleForDecimals.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			cellStyleForDecimals.setFillPattern(HSSFCellStyle.NO_FILL);
			cellStyleForDecimals.setBorderTop(HSSFCellStyle.BORDER_THIN);
			cellStyleForDecimals.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			cellStyleForDecimals.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			cellStyleForDecimals.setBorderRight(HSSFCellStyle.BORDER_THIN);
			font = workBook.createFont();
			cellStyleForDecimals.setFont(font);
			cellStyleForDecimals.setDataFormat(df.getFormat("General"));
			// create row
			int j = 0;
			for (String[] colReportData : reportData)
			{
				xlsRow = sheet.createRow(row + j);
				int len = colReportData.length;
				for (short i = 0; i < len; i++)
				{
					// Get cell
					HSSFCell xlsCell = xlsRow.getCell(i);

					//	if not found create cell
					if (xlsCell == null)
					{
						xlsCell = xlsRow.createCell(i);
						xlsCell.setCellStyle(cellStyle);

						// write data to cell
						
						if (colReportData[i] != null)
						{

							if(StringUtility.isNumberOrNot(StringUtility
											.getDenormalizedHtmlString(colReportData[i])))
							{
								if(colReportData[i].indexOf('.')!=-1){
									xlsCell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
									xlsCell.setCellStyle(cellStyleForDecimals);
								}
								xlsCell
								.setCellValue(Double.parseDouble(StringUtility
										.getDenormalizedHtmlString(colReportData[i])));
							}else{
							xlsCell.setCellType(HSSFCell.CELL_TYPE_STRING);
							xlsCell
									.setCellValue(StringUtility
											.getDenormalizedHtmlString(colReportData[i]));
							}
						}
						else
						{
							xlsCell.setCellValue("");
						}
					}// if cell
				}// for cell 
				/*if (j >= 499 && false)
				{
					fileOut = new FileOutputStream(file);
					workBook.write(fileOut);
					workBook = null;
					fs = null;
					fs = new POIFSFileSystem(new FileInputStream(file));
					// get workbook
					workBook = new HSSFWorkbook(fs);
					// get workbook sheet
					sheet = workBook.getSheet(sheetName);
				}*/
				j++;
			}//for row
			/****************************************************************/
			j = 0;
			row=2;
			for (String[] colReportData : reportData1)
			{
				xlsRow = sheet1.createRow(row + j);
				int len = colReportData.length;
				for (short i = 0; i < len; i++)
				{
					// Get cell
					HSSFCell xlsCell = xlsRow.getCell(i);

					//	if not found create cell
					if (xlsCell == null)
					{
						xlsCell = xlsRow.createCell(i);
						xlsCell.setCellStyle(cellStyle);

						// write data to cell
						
						if (colReportData[i] != null)
						{

							if(StringUtility.isNumberOrNot(StringUtility
											.getDenormalizedHtmlString(colReportData[i])))
							{
								if(colReportData[i].indexOf('.')!=-1){
									xlsCell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
									xlsCell.setCellStyle(cellStyleForDecimals);
								}
								xlsCell
								.setCellValue(Double.parseDouble(StringUtility
										.getDenormalizedHtmlString(colReportData[i])));
							}else{
							xlsCell.setCellType(HSSFCell.CELL_TYPE_STRING);
							xlsCell
									.setCellValue(StringUtility
											.getDenormalizedHtmlString(colReportData[i]));
							}
						}
						else
						{
							xlsCell.setCellValue("");
						}
					}// if cell
				}// for cell 
				/*if (j >= 499 && false)
				{
					fileOut = new FileOutputStream(file);
					workBook.write(fileOut);
					workBook = null;
					fs = null;
					fs = new POIFSFileSystem(new FileInputStream(file));
					// get workbook
					workBook = new HSSFWorkbook(fs);
					// get workbook sheet
					sheet = workBook.getSheet(sheetName);
				}*/
				j++;
			}//for row
			/****************************************************************/

			// write to file
			fileOut = new FileOutputStream(file);
			workBook.write(fileOut);

		}
		catch (FileNotFoundException e)
		{
			returnFlag = false;
		}
		catch (IOException e)
		{
			returnFlag = false;
		}
		finally
		{
			fs = null;
			workBook = null;
			sheet = null;
			xlsRow = null;
			fileOut = null;
		}
		return returnFlag;
	}
	 

}
