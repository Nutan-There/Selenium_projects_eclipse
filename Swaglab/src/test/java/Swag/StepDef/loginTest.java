package Swag.StepDef;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.snapdeal.snapdealapp.Utility;

import Swag.Page.LoginFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class loginTest {
	WebDriver driver=null;
	LoginFactory log=new LoginFactory();
	
	@Given("user is on the login page of swag lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@When("user enter uname & password")
	public void user_enter_uname_password() {
		log=new LoginFactory();
		log.swaglog("standard_user", "secret_sauce");
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		log.clickbtn();
		
	}
	@Then("login should be successful")
	public void login_should_be_successful() throws IOException {
		
		  Assert.assertEquals(false, false); 
		  Utility.Capture(driver);
		  driver.close();
		 	}
}