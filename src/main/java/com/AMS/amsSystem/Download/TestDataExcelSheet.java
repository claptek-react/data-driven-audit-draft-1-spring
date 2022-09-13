package com.AMS.amsSystem.Download;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.AMS.amsSystem.Model.ControlData;
import com.AMS.amsSystem.Model.TestData;

public class TestDataExcelSheet {
	
	
	public static void TestExcel(List<TestData> list, String filename) throws SQLException, IOException {
		
		
		
		   XSSFWorkbook workbook =new XSSFWorkbook();
		   
		   XSSFSheet sheet = workbook.createSheet("Test Data");
		   
		   
		   XSSFRow row;
		   int rowid = 0;
		   
		    row = sheet.createRow(rowid);
		    row.createCell(0).setCellValue("id");
		    row.createCell(1).setCellValue("Object Title");
		    row.createCell(2).setCellValue("Valid From");
		    row.createCell(3).setCellValue("Valid Until");
		    row.createCell(4).setCellValue("Owner org");
		    row.createCell(5).setCellValue("Owner");
		    row.createCell(6).setCellValue("Level 1 Approver");
		    row.createCell(7).setCellValue("Level 2 Approver");
		    row.createCell(8).setCellValue("Relationships");
		    row.createCell(9).setCellValue("Status");
		    row.createCell(10).setCellValue("Category");
		    row.createCell(11).setCellValue("Created On");
		    row.createCell(12).setCellValue("Created By");
		    row.createCell(13).setCellValue("Response Type");
		    
		    for (int i =0; i<list.size(); i++)
		    {
		    	int cellId = 0;
		    	
		    	row =sheet.createRow(++rowid);
		        XSSFCell cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getObjId());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getObjTitle());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getValidFrom());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getValidUntil());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getOwnerOrganisation());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getOwner());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getLevel1Approver());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getLevel2Approver());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getRelationships());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getStatus());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getCategory());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getCreatedOn());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getCreatedBy());
		        cell =row.createCell(cellId++);
		        cell.setCellValue(list.get(i).getResponseType());
		        cell =row.createCell(cellId++);
		    	
		    	
		    }
		    
		    FileOutputStream out = new FileOutputStream(new File("D:\\Download Excel sheet A3\\" + filename)); 
		    	
		    workbook.write(out);
		    out.close();
		    workbook.close();   
		    }

}
