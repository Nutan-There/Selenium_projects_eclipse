package Step_Def;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.RediffPage1;

public class Rediff1Test {
	
	WebDriver driver;
	RediffPage1 red;
	@Given("user is on create account page")
	public void user_is_on_create_account_page() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@When("user enters full_name , mailId , password , alternateMailId , mobileNo")
	public void user_enters_full_name_mail_id_password_alternate_mail_id_mobile_no(io.cucumber.datatable.DataTable dataTable) {
	   red=new RediffPage1(driver);
	   List<String> list= dataTable.asList(String.class);
	   red.createAccount(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5));
	}
	@When("click on create my account button")
	public void click_on_create_my_account_button() {
	    red.clickbtn();
	}
	@Then("The message box should display")
	public void the_message_box_should_display() {
	    
	}




}
