package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertswag {
	@Test(dataProvider = "loginData")
	  public void testlog(String user , String pwd) throws InterruptedException {
		  WebDriverManager.edgedriver().setup();
	      WebDriver driver = new EdgeDriver();
	      driver.get("http://www.saucedemo.com/");
	      driver.manage().window().maximize();
	      
	      System.out.println("thread Id: " +Thread.currentThread().getId());
	      driver.findElement(By.id("user-name")).sendKeys(user);
	      Thread.sleep(1000);
	 	  driver.findElement(By.id("password")).sendKeys(pwd);
	 	  Thread.sleep(1000);
	 	  driver.findElement(By.id("login-button")).click();
	 	  Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed());
	 	  
	  }
	  @DataProvider (parallel=true)
	  public Object[][] loginData(){
		  Object[][] data= new Object[3][2];
		  
		  data[0][0] = "standard_user";
		  data[0][1] = "secret_sauce";
		  
		  data[1][0] = "problem_user";
		  data[1][1] = "secret_sauce";
		  
		  data[2][0] = "performance_glitch_user";
		  data[2][1] = "secret_sauce";
		return data;
		  
	  }
  }

