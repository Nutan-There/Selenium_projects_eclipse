package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
	    driver.manage().window().maximize();
	    Actions act = new Actions(driver);
	    
	    
	    WebElement visit=driver.findElement(By.tagName("a"));
	      //act.moveToElement(visit).click().perform();
	    driver.findElement(By.tagName("a")).click();


	}

}
