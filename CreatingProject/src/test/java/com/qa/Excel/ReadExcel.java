package com.qa.Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
//How to read excel files using Apache POI
public class ReadExcel {
 public static void main (String [] args) throws IOException{
                        //I have placed an excel file 'Test.xlsx' in my D Driver 
 FileInputStream fis = new FileInputStream("C:\\Users\\Windows 10\\Downloads\\Book1.xlsx");
 XSSFWorkbook workbook = new XSSFWorkbook(fis);
 XSSFSheet sheet = workbook.getSheet("Sheet1");
                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
 XSSFRow row = sheet.getRow(0);
 Cell cell = row.getCell(0);
                       System.out.println(cell);
System.out.println(sheet.getRow(0).getCell(0));
 //String cellval = cell.getStringCellValue();
// System.out.println(cellval);
 
 } 
}