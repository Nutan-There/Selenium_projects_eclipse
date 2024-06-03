package Apollo.StepDef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Apollo.Pages.CartFactory;
import Apollo.Pages.LoginFactory;
import Apollo.Utility.ScreenshotUtility;
import Apollo.Utils.SetupDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartTest {
	WebDriver driver = SetupDriver.Edgedriver();
	CartFactory cart;
	LoginFactory log=new LoginFactory(driver);
	
	//scenario1
	@Given("user should be on home page of apollo247")
	public void user_should_be_on_home_page_of_apollo247() {
		 cart = new CartFactory(driver); 
		 //cart.launchApp();
	}

	@When("user should click the cart icon")
	public void user_should_click_the_cart_icon() throws InterruptedException {
	  
	  //cart.clickCartIcon();
	}

	@Then("user should land on test cart page")
	public void user_should_land_on_test_cart_page() {
		 SetupDriver.teardown();
		 
	}

	
	//scenario2
	
	@When("user clicks on Book Lab Tests")
	public void user_clicks_on_book_lab_tests() throws InterruptedException {
		Thread.sleep(2000);
	    cart.clickBookLabTest1();
	}
	
	@And("user should click on complete blood count add button")
	public void user_should_click_on_complete_blood_count_add_button() throws InterruptedException {
	   Thread.sleep(5000);
		cart.addMethod();
		
	}
	
	@And("user should click on go to cart")
	public void user_should_click_on_go_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		cart.clickAddToCart();
		Thread.sleep(3000);
		cart.gotocart1();
	}
	
//scenario3
@When("^user should enter (.*)$")
public void user_should_enter(String string) {
    cart.adnum("9075850736");
}

@When("user click on log button")
public void user_click_on_log_button() {
	cart.clickbutton();
}

	@And("user should be logged in")
	public void user_should_be_logged_in() throws Exception {
		
		
        log.clickLogButton();
        Thread.sleep(15000);
        log.clickLoginButton();
		
	}
	@When("user should click on icon")
	public void user_should_click_on_icon() throws InterruptedException {
	    cart.clickIcon();
	    Thread.sleep(2000);
	}
	
	@When("user should click on proceed to cart button")
	public void user_should_click_on_proceed_to_cart_button() throws InterruptedException {
		Thread.sleep(4000);
	    cart.pCart();
		
	}


	
	@And("user should land on selected patients page")
	public void user_should_land_on_selected_patients_page() {
	    
		//
	}
	
	@And("user should click on patients name")
	public void user_should_click_on_patients_name() throws InterruptedException, IOException {
		Thread.sleep(3000);
	    cart.clickPatientNames();
	    
		
	}
	
	@And("user should click on continue button")
	public void user_should_click_on_continue_button() throws IOException, InterruptedException {
	    Thread.sleep(2000);
		cart.ClickOnContinue();
		Thread.sleep(2000);
		
		
		
	}
	

//	@When("user should click the booktests")
//	public void user_should_click_the_booktests() {
//		cart.booktest();
//	}
//
//	@When("user should select date and time")
//	public void user_should_select_date_and_time() {
//		cart.selectdate();
//		cart.selectime();
//	}

	@Then("user should click the done button")
	public void user_should_click_the_done_button() throws IOException, InterruptedException {
		//cart.clickdone();
		ScreenshotUtility.capture(driver);
		Thread.sleep(2000);
		driver.close();
		
	}



	
	
	
}