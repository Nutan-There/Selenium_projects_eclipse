package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLog {
	WebDriver driver=null;
	LogPage lp;
  @Test
  public void testLog() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("http://www.saucedemo.com/");
      driver.manage().window().maximize();
      lp=new LogPage(driver);
      
      lp.typelog("problem_user","secret_sauce");
      
//      lp.typeuser();
//      lp.typepass();
//      lp.clickbtn();
	  
  }
}
