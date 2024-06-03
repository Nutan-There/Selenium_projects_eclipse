package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("alertButton")).click();
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		Thread.sleep(1000);
//
//        driver.switchTo().alert().accept();
//        
        
//        driver.findElement(By.id("timerAlertButton")).click();
//        Thread.sleep(6000);
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		Thread.sleep(1000);
//
//        driver.switchTo().alert().accept();
        
        
        
//        driver.findElement(By.id("confirmButton")).click();
//        Thread.sleep(6000);
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		Thread.sleep(1000);
//
//        driver.switchTo().alert().accept();
        
        
//        driver.findElement(By.id("promtButton")).click();
//        Thread.sleep(6000);
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		Thread.sleep(1000);

        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("promtButton")).click();

        String msg5= driver.switchTo().alert().getText();

        System.out.println(msg5);

 

        driver.switchTo().alert().sendKeys("Nutan");

        driver.switchTo().alert().accept();


	}

}
