package com.ohrm.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;*/

public class ExcelLib {
	
	String filePath = "C:\\Users\\admin\\workspace_OCSW_7\\SelemiumHRMFramework\\testData\\testdata.xlsx";
	
//	public String getExcelData(String sheetNAme, int rowNum, int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException{
//		FileInputStream fis = new FileInputStream(filePath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetNAme);
//		Row row = sh.getRow(rowNum);
//		String data = row.getCell(colNum).getStringCellValue();
//		return data;
//	}
//
//	public void setExcelData(String sheetNAme, int rowNum, int colNum, String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
//		FileInputStream fis = new FileInputStream(filePath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetNAme);
//		Row row = sh.getRow(rowNum);
//		Cell cel = row.createCell(colNum);
//		cel.setCellType(cel.CELL_TYPE_STRING);
//		cel.setCellValue(data);
//		FileOutputStream fos = new FileOutputStream(filePath);
//		wb.write(fos);
//		((FileInputStream) wb).close();
		
	}
	
//}



