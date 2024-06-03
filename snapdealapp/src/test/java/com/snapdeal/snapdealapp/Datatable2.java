package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\NTHERE\\eclipse-workspace\\snapdealapp\\ExcelData\\data2.xlsx");
		
		//read the data into excel sheet
		FileInputStream fos = new FileInputStream(file);
		
		Workbook w= new XSSFWorkbook(fos);
		
		Sheet s=w.getSheetAt(0);
		
		String cellValue=s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		
		Number cellValue1=s.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(cellValue1);
		
		
		int rows= s.getFirstRowNum();
		int col= s.getRow(0).getFirstCellNum();
		
		System.out.println(rows);
		System.out.println(col);
		
		int row1= s.getLastRowNum();
		int col1= s.getRow(0).getLastCellNum();
		
		System.out.println(row1);
		System.out.println(col1);
		
		
		
		
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c);
		w.close();
		fos.close();

	}
	

}
