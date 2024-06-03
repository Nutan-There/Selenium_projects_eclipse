package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;



public class Datatable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file= new File("C:\\Users\\NTHERE\\eclipse-workspace\\snapdealapp\\ExcelData\\data1.xls");

        

        //write the data into excel sheet

        FileOutputStream fos = new FileOutputStream(file);

        HSSFWorkbook w =  new HSSFWorkbook();

        Sheet s = w.createSheet();

        

        s.createRow(0);

        s.getRow(0).createCell(0).setCellValue("Hello");

        s.getRow(0).createCell(1).setCellValue("capg");

        

        s.createRow(1);

        s.getRow(1).createCell(1).setCellValue(true);

        s.getRow(1).createCell(1).setCellValue(1234);

        

        w.write(fos);

        w.close();

	}

}
