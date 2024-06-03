package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//File file= new File("C:\\Users\\NTHERE\\eclipse-workspace\\snapdealapp\\ExcelData\\data1.xlsx");
File file= new File("C:\\Users\\NTHERE\\eclipse-workspace\\snapdealapp\\ExcelData\\data2.xlsx");

        

        //write the data into excel sheet

        FileOutputStream fos = new FileOutputStream(file);

        XSSFWorkbook w =  new XSSFWorkbook();

        Sheet s = w.createSheet();

        

        s.createRow(0);

        s.getRow(0).createCell(0).setCellValue("Hello");

        s.getRow(0).createCell(1).setCellValue("capg");

        

        s.createRow(1);

        s.getRow(1).createCell(0).setCellValue(true);

        s.getRow(1).createCell(1).setCellValue(1234);
        
        //another sheet
        Sheet s1=w.createSheet("Testing data");
        
        s1.createRow(0);
        s1.getRow(0).createCell(0).setCellValue("nutan");
        s1.getRow(0).createCell(1).setCellValue("nutan");
        
        

        

        w.write(fos);

        w.close();


	}

}
