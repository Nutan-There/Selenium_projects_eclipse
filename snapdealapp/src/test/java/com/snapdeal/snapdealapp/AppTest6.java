package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated methodWebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize(); 
		WebElement e = driver.findElement(By.cssSelector("#cars"));
		Select s=new Select(e);
		
		boolean b=s.isMultiple();
		System.out.println(b);
		
		s.selectByIndex(2);
		s.selectByValue("saab");
		s.selectByVisibleText("Volvo");
		
		//s.deselectAll();
		
	s.deselectByIndex(2);
	s.deselectByValue("saab");
	s.deselectByVisibleText("Volvo");
		

	}

}
