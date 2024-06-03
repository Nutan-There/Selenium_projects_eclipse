package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void firstMethod() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("https://google.com/");
      driver.manage().window().maximize();
      
      //hard assert
      String expectedtitle="Goggle";

      String actualtitle= driver.getTitle();

      Assert.assertEquals(actualtitle,expectedtitle,"Title Mismatched");

      

      String exurl="";

      String actual=driver.getCurrentUrl();

      //Assert.assertEquals(exurl, actual,"URL are not same");     

      //soft assert

      SoftAssert soft= new SoftAssert();

      soft.assertEquals(actual, exurl, "url not same");

      soft.assertAll();
  }
}
