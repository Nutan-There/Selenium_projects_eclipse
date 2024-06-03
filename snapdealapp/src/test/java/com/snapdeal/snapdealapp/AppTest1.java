package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "‪C:\\driver\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize();
		 */
		//driver.close();
		
		
//		System.setProperty("webdriver.edge.drive", "‪C:\\driver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
		//driver.close();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
		

        Thread.sleep(1000);
		
        driver.close();
		
		
		
		
		
		
		
		
		
		
		
//		WebElement a = driver.findElement(By.id("user-name"));
//		a.sendKeys("standard_user");
//		Thread.sleep(1000);
//		
//		WebElement b = driver.findElement(By.id("password"));
//		b.sendKeys("secret_sauce");
//		Thread.sleep(1000);
//		
//		WebElement c = driver.findElement(By.id("login-button"));
//		c.click();
		
//    	driver.close();
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");    
//
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//
//        driver.findElement(By.id("login-button")).click();

	}

}
