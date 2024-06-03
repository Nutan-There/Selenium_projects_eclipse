package com.snapdeal.snapdealapp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {
	public static void main(String[] args) throws InterruptedException, AWTException {	
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.redbus.com/");
	    driver.manage().window().maximize();	
		Robot robot = new Robot();
		
		
	    
	    driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mumbai");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-fjdhpX jxFepI']")).click();
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 fxWHuy']")).click();
		driver.findElement(By.xpath("//input[@id='r-date']")).click();
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 kseSaZ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item-name']")).click();
		driver.findElement(By.xpath("//div[@class='item-name']")).click();
		Thread.sleep(3000);
	 
	//
//		for (int i = 0; i < 11; i++) {
//	        robot.keyPress(KeyEvent.VK_TAB);
//	    }
	//
//	    robot.keyPress(KeyEvent.VK_ENTER);
	 
	    
		driver.findElement(By.xpath("//*[@id=\"search_butn\"]/div")).click();
	}

}
