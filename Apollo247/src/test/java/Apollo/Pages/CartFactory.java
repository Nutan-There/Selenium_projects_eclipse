package Apollo.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Apollo.Utils.SetupDriver;

public class CartFactory {
	WebDriver driver;
	Actions actions;

	public void launchApp() {
		// driver.get("https://www.apollo247.com/");
	}

	@FindBy(xpath = "//span[@class='icon-ic_cart']")
	@CacheLookup
	WebElement cartIcon;

	@FindBy(xpath = "//*[@id=\"mainContainerCT\"]/div/div/div[1]/div[1]/ul/li[3]/div/a/div[2]/h3")
	@CacheLookup
	WebElement bookLabTest;

	@FindBy(xpath = "//*[@id=\"mainContainerCT\"]/div[1]/div[1]/div/div[1]/a/div/div[2]")
	@CacheLookup
	WebElement add;

	@FindBy(xpath = "//*[@id=\"mainContainerCT\"]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/button")
	@CacheLookup
	WebElement addToCart;

	@FindBy(xpath = "//*[@id=\"mainContainerCT\"]/div/div/div[2]/div[1]/div/div[2]/button[2]")
	@CacheLookup
	WebElement goTocart;

	@FindBy(xpath = "//*[@id=\"mainContainerCT\"]/div/div/div[2]/div[1]/div[3]/div/button/span")
	@CacheLookup
	WebElement proceedToCart;

	@FindBy(xpath = "//input[@name='mobileNumber']")
	@CacheLookup
	WebElement number;

	@FindBy(xpath = "//input[@name='mobileNumber']")
	@CacheLookup
	WebElement button;

	@FindBy(xpath = "//span[@class='HeaderNew_link__ZlmdG']")
	@CacheLookup
	WebElement icon;

	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div")
	@CacheLookup
	WebElement PatientNames;

	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/button/span")
	@CacheLookup
	WebElement clickContinue;

//	
//	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div/div/div[4]/div[2]/button")
//	@CacheLookup
//	WebElement booktest;
//	
//	@FindBy(xpath="/html/body/div[16]/div[3]/div/div[2]/div[1]/div/div/div/div/div[4]/div/div")
//	@CacheLookup
//	WebElement date;
//	
//	@FindBy(xpath="//*[@id=\"06:00 AM0\"]")
//	@CacheLookup
//	WebElement time;
//	
//	@FindBy(xpath="/html/body/div[16]/div[3]/div/div[2]/div[4]/button")
//	@CacheLookup
//	WebElement done;

	public void gotocart1() {
		goTocart.click();
	}

	public void adnum(String num) {
		number.sendKeys(num);
	}

	public void clickbutton() {
		button.click();
	}

	public void clickIcon() {
		icon.click();
	}

	public void clickCartIcon() throws InterruptedException {

		// cartIcon.click();

		Thread.sleep(1000);
		actions = new Actions(driver);

		actions.click(cartIcon).build().perform();

	}

	public CartFactory(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void clickBookLabTest1() throws InterruptedException {
		Thread.sleep(2000);
		bookLabTest.click();

	}

	public void addMethod() {
		add.click();
	}

	public void clickAddToCart() {
		addToCart.click();
	}

	public void pCart() {
		proceedToCart.click();

	}

	public void clickPatientNames() {
		actions = new Actions(driver);
		actions.click(PatientNames).build().perform();

	}

	public void ClickOnContinue() {
		clickContinue.click();
	}
	// scenario3
//	public void booktest() {
//		booktest.click();
//	}
//	
//	public void selectdate() {
//		date.click();
//	}
//	public void scroll() {
//
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//    js.executeScript("window.scrollBy(0,300);");


//  }
//	
//	public void selectime() {
//		time.click();
//	}
//	
//	public void clickdone() {
//		done.click();
//	}

}