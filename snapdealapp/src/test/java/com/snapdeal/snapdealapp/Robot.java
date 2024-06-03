package com.snapdeal.snapdealapp;


import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


 

public class Robot {

 

    public static void main(String[] args) throws AWTException, InterruptedException {

        // TODO Auto-generated method stub

        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        

        Robot robot = new Robot();

        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_DOWN);

        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_TAB);

        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_TAB);

        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_TAB);

        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(1000);

    }

	private void keyPress(int vkDown) {
		// TODO Auto-generated method stub
		
	}

	

}

