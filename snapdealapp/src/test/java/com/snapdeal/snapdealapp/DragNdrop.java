package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement dst= driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, dst).perform();
		
		if(dst.getText().matches("Dropped!"))
		{
			System.out.println("Successfully Dropped");
		}

	}

}
