package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	    driver.manage().window().maximize();
	    Actions act = new Actions(driver);
	    
	    
//driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();

        

        driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();

	}

}
