package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	// found the elements
	By uname = By.id("user-name");// by means renaming
	By pwd = By.id("password");
	By logbtn = By.cssSelector("#login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void typelog(String uid, String pass) {
		driver.findElement(uname).sendKeys(uid);
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(logbtn).click();
	}

	public void typeuser() {
		driver.findElement(uname).sendKeys("standard_user");

	}

	public void typepass() {
		driver.findElement(pwd).sendKeys("secret_sauce");
	}

	public void clickbtn() {
		driver.findElement(logbtn).click();
	}

	public void addToCart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

	}

	public void cart() {
		driver.findElement(By.id("shopping_cart_container")).click();

	}

	public void checkout() {
		driver.findElement(By.id("checkout")).click();

	}

}
