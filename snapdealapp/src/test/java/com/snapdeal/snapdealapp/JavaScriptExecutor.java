package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		//refresh
		js.executeAsyncScript("location.reload()");
		Thread.sleep(1000);
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span"));
		js.executeScript("arguments[0].click();",a);
		
		
		//scroll the page 1st-horizontal,2nd vertical
		js.executeScript("window.scrollBy(200,600)");

	}
	

}
