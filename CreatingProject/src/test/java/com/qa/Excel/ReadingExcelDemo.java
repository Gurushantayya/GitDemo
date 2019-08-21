package com.qa.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelDemo {

	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream file= new FileInputStream("C:\\Users\\Windows 10\\Downloads\\Book1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		 
		     int rowcount=sheet.getLastRowNum();
		     
		     int coloumn=sheet.getRow(0).getLastCellNum();
		     
		     System.out.println(rowcount);
		     
		    /* for(int i=0; i<=rowcount; i++)
		     {
		    	 
		    	 	 XSSFRow currentrow=sheet.getRow(i);
		    	 	 System.out.println();
		     } 	 
		    	/* 	for(int j=0; j<coloumn; j++)
		    	 	{
		    	 		String value=currentrow.getCell(j).toString();
		    	 		System.out.print("                   "+value);
		    	 	}
		    	 	
		    	System.out.println();
		     }*/
		
	}

	}
