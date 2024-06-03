package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();//inbuild method
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[2]"));

        //act.moveToElement(a).click().build().perform();//single click
		//act.moveToElement(a).doubleClick().build().perform();//double click
		//act.doubleClick(a).build().perform();
		
		//act.moveToElement(a).contextClick().build().perform();//right click
		act.contextClick(a).build().perform();
        

	}

}
