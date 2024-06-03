package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest2 {
	
	WebDriver driver;
 @BeforeTest
  public void test1() {
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
  }
  @Test
  @Parameters({"username","password"})
  public void test2() {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
  }
//  @Test
//  public void test3() {
//	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//	  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
//  }
//  
  @AfterTest
  public void teardown() {
	  driver.close();
  }
}
