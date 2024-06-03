package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//1st way
//		String title = driver.getTitle();
//		System.out.println("the Title is : "+title);
//		
//		String current=driver.getCurrentUrl();
//		System.out.println("current url : "+current);
//		
		//2 way
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement a= driver.findElement(By.id("user-name"));
		System.out.println(a.getAttribute("class"));
		System.out.println(a.getTagName());
		System.out.println(a.getCssValue("font-family"));
		System.out.println(a.getCssValue("width"));
		
		String text= driver.findElement(By.xpath("//div[@class='login_password']/h4")).getText();
		System.out.println();

	}

}
