package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		
		WebElement l = driver.findElement(By.xpath("//img[@src,'\"https://b.zmtcdn.com/data/o2_assets/d0bd7c9405ac87f6aa65e31fe55800941632716575.png\"']"));

        System.out.println(l.isDisplayed());

        System.out.println(l.isSelected());

        System.out.println(l.isEnabled());

        

	}

}
