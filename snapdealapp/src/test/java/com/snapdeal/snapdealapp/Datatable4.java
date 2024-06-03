package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("C:\\Users\\NTHERE\\eclipse-workspace\\snapdealapp\\ExcelData\\data2.xlsx");
		
		
		FileInputStream fos = new FileInputStream(file);
		
		Workbook w= new XSSFWorkbook(fos);
		
		Sheet s=w.getSheetAt(0);
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {

            Row r = s.getRow(i);

            for(int j=0;j<r.getPhysicalNumberOfCells();j++) {

                Cell c =r.getCell(j);

                System.out.println(c);
		
		

	}

		}
	}}
	
	
