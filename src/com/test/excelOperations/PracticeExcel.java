package com.test.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.*;

public class PracticeExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		  FileInputStream fis = new FileInputStream("C:\\Users\\vidya\\Documents\\Test.xlsx");
		  
		  XSSFWorkbook workbook = new XSSFWorkbook(fis);		  
		  XSSFSheet   sheet =   workbook.getSheetAt(0);
		  
		int rowscount =  sheet.getLastRowNum();
		int colscount =  sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<rowscount;i++) {
			
			XSSFRow row =	sheet.getRow(i);
			
			   for(int j=0;j<colscount;j++) {
				   XSSFCell cell=  row.getCell(j);
				   
				   System.out.print(cell.getStringCellValue());
			   }
			   System.out.println(" ");
			
		}
   
	}

}
