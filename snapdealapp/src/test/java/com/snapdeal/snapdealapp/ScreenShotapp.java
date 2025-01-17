package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotapp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("./Screenshots/image.png"));
//		driver.close();
		
		Utils.CaptureScreen(driver, "log1");
		driver.findElement(By.id("login-button")).click();
		Utils.CaptureScreen(driver, "after log");
		driver.close();
		
		

		

	}

}
