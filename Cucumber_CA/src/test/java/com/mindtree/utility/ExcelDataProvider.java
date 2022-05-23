package com.mindtree.utility;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataProvider {
	
	public HSSFWorkbook wb;
	
	public ExcelDataProvider() {
		File src=new File("./testdata/data.xls");
		
		
			
			FileInputStream fis;
			try {
				fis = new FileInputStream(src);
				wb=new HSSFWorkbook(fis);
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("Unable to read file");
			}
			
		
	}
	
	public String getStringData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public double getNumberData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
