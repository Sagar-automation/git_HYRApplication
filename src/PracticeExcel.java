import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class PracticeExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String excelpath = "C:\\Users\\vidya\\Documents\\Test.xlsx";
		FileInputStream fis = new FileInputStream(excelpath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet =	workbook.getSheetAt(0);
		
	int rowcount=	sheet.getLastRowNum();
	int cellcount =sheet.getRow(0).getLastCellNum();
	
	System.out.println("rowscount = " + rowcount);
	System.out.println("Columnscount = " + cellcount);
	
	
	
	
	
	
	

	}

}
