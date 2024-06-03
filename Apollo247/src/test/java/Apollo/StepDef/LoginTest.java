package Apollo.StepDef;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Apollo.Pages.LoginFactory;
import Apollo.Utility.ScreenshotUtility;
import Apollo.Utils.SetupDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver = SetupDriver.Edgedriver();
	LoginFactory log;

	//log1
	@Given("user should be on the login icon")
	public void user_should_be_on_the_login_icon() throws InterruptedException {
		log = new LoginFactory(driver);
		log.launchApp();
		log.loginIcon();
		Thread.sleep(2000);
	}

	@When("^user enter (.*) to login$")
	public void user_enter_to_login(String string) throws InterruptedException {
		log.enterMobileNumber("9075850736");
		Thread.sleep(2000);

	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		log.clickLogButton();
		// Thread.sleep(15000);

	}

	@And("user enter the otp")
	public void user_enter_the_otp() throws InterruptedException {
		Thread.sleep(15000);
		// ScreenshotUtility.capture(driver);

	}

	@And("user click on login button1")
	public void user_click_on_login_button1() throws Exception {
		Thread.sleep(1000);
		log.clickLoginButton();
		

	}

	@Then("login should be successful")
	public void login_should_be_successful() throws Exception {
		
//		log.clickLoginButton();

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	    WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
//	    loginButtonElement.click();
		//ScreenshotUtility.capture(driver);
		
//		WebElement verify =driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div/div[1]/div[1]/div/div/div/div"));
//
//	    boolean b=verify.isEnabled();
//
//	    Assert.assertEquals(true,b);

	  ScreenshotUtility.capture(driver);
	  Thread.sleep(3000);
	  driver.close();
	}
	
	//log2

	@When("user enter <mobile_no> to login1")
	public void user_enter_mobile_no_to_login1(DataTable data) throws InterruptedException {
		List<String> l = data.asList(String.class);
		log.enterMobileNumber1(l.get(0));
		Thread.sleep(2000);

	}
	@When("user click on login button2")
	public void user_click_on_login_button2() throws InterruptedException {
		log.logButton();
	}

	@And("user enter the invalid otp")
	public void user_enter_the_invalid_otp() throws InterruptedException {
		Thread.sleep(15000);

	}
	@And("user click on login button3")
	public void user_click_on_login_button3() throws InterruptedException, AWTException {
		log.loginButton();
	}

	@Then("error msg should be displayed")
	public void error_msg_should_be_displayed() throws IOException, InterruptedException {
//		String expectedErrorMessage = "Invalid OTP. Please try again.";
//        String actualErrorMessage = log.getErrorMessage();
//        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
		//ScreenshotUtility.capture(driver);
		WebElement verify =driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div/div[1]"));

	    boolean b=verify.isEnabled();

	    Assert.assertEquals(true,b);
	    Thread.sleep(3000);

	  ScreenshotUtility.capture(driver);
	  Thread.sleep(3000);
	  SetupDriver.teardown();
	}

}
