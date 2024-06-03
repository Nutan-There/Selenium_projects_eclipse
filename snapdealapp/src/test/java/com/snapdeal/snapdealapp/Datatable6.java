package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatable6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		File file = new File("C:\\Users\\NTHERE\\eclipse-workspace\\snapdealapp\\ExcelData\\data3.xlsx");

		FileOutputStream fos = new FileOutputStream(file);

		XSSFWorkbook w = new XSSFWorkbook();

		Sheet s = w.createSheet();

		s.createRow(0);

		s.getRow(0).createCell(0).setCellValue("user-name");

		s.getRow(0).createCell(1).setCellValue("standard_user");

		s.createRow(1);

		s.getRow(1).createCell(0).setCellValue("password");

		s.getRow(1).createCell(1).setCellValue("secret_sauce");

		w.write(fos);

		w.close();

		String username = s.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);

		String password = s.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

	}

}
