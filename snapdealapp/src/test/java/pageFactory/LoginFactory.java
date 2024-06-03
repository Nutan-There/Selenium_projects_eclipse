package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {

	/*
	 * WebDriver driver;
	 * 
	 * @FindBy(xpath="//input[@name='user-name']") WebElement uname;
	 * 
	 * @FindBy(id="password") WebElement pass;
	 * 
	 * @FindBy(how=How.XPATH,using="//input[@id='login-button']") WebElement logBtn;
	 * 
	 * public LoginFactory(WebDriver driver) { this.driver=driver;
	 * PageFactory.initElements(driver,this); }
	 * 
	 * public void swaglog(String uid, String pwd) { uname.sendKeys(uid);
	 * pass.sendKeys(pwd);
	 * 
	 * 
	 * } public void clickbtn() { logBtn.click(); }
	 */

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"user-name\"]")

	WebElement uname;

	@FindBy(id = "password")

	WebElement pass;

	@FindBy(how = How.XPATH, using = "//*[@id=\"login-button\"]")

	WebElement logbtn;

	public LoginFactory(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void swaglogin(String username, String password) {

		uname.sendKeys(username);

		pass.sendKeys(password);

	}

	public void swaglog(String username, String password) {

		uname.sendKeys(username);

		pass.sendKeys(password);

	}

	public void clickbtn() {

		logbtn.click();

	}

}
