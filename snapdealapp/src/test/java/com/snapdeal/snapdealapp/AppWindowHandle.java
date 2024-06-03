package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.magicbricks.com/property-for-sale-rent-in-Thane/pg-hostels-Thane");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    Actions act =new Actions(driver);
	    
	    String parenthandle= driver.getWindowHandle();
	    System.out.println("Parent Window " +parenthandle);
	    
	    WebElement a=driver.findElement(By.xpath("//*[@id=\"buyheading\"]"));
	    
	    act.moveToElement(a).build().perform();
	    driver.findElement(By.xpath("//*[@id=\"propTypesBuy1\"]/ul/li[l]/a")).click();
	    
	 
	    Thread.sleep(2000);
	    driver.switchTo().window(parenthandle);

	}

}
