package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    WebElement frame123= driver.findElement(By.id("iframeResult"));
	    driver.switchTo().frame(frame123);
	    
	    //driver.switchTo().frame(0);
	    //driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//a[@href='https://www.w3schools.com/']")).click();
	    
	    Thread.sleep(1000);
	    //driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.id("runbtn")).click();
	    
	    //driver.close();
	    


	}

}
