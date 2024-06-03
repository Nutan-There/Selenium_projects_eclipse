
package Apollo.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {
	WebDriver driver;

	@FindBy(xpath = "//span[@class='icon-ic_account']")
	@CacheLookup
	WebElement loginIcon;

	@FindBy(xpath = "//input[@name='mobileNumber']")
	@CacheLookup
	WebElement mobileNumberInput;

	@FindBy(xpath = "//span[@class='icon-ic_arrow_forward']")
	@CacheLookup
	WebElement logButton;
	
	@FindBy(xpath = "//span[@class='icon-ic_arrow_forward']")
	@CacheLookup
	WebElement loginButton;
//log2
	
	@FindBy(xpath = "//input[@name='mobileNumber']")
	@CacheLookup
	WebElement mobileNumber;
	
	@FindBy(xpath = "//span[@class='icon-ic_arrow_forward']")
	@CacheLookup
	WebElement logBtn;
	
	@FindBy(xpath = "//span[@class='icon-ic_arrow_forward']")
	@CacheLookup
	WebElement lb;

	public LoginFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchApp() {
		driver.get("https://www.apollo247.com/");
	}

	public void loginIcon() {
		loginIcon.click();
//		Thread.sleep(1000);
//		actions = new Actions(driver);
//
//		actions.click(loginIcon).build().perform();

	}

	public void enterMobileNumber(String mobileNumber) {
		mobileNumberInput.sendKeys(mobileNumber);
	}

	public void clickLogButton() throws InterruptedException {
		logButton.click();
		Thread.sleep(1000);
	}

	
//	  public void enterOTP() { 
//	 otpInput.sendKeys();
//	  
//	  }
	public void clickLoginButton() throws Exception {
		loginButton.click();


		Thread.sleep(2000);
		
		
	}
	//log2
	public void enterMobileNumber1(String mobileNo) {
		mobileNumber.sendKeys(mobileNo);
	}
	
	public void logButton() throws InterruptedException {
		logBtn.click();
		Thread.sleep(1000);
	}
	public void loginButton() throws InterruptedException, AWTException {
		//lb.click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_ENTER);
	}


	

}
