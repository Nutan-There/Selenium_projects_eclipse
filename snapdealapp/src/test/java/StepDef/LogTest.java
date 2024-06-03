package StepDef;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginFactory;

public class LogTest {
	WebDriver driver;
	LoginFactory log;
	
	@Given("user is on the login page of swag labs")
	public void user_is_on_the_login_page_of_swag_lab() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@When("^user enter (.*) & (.*)$")
	public void user_enter (String username,String password) {
		log=new LoginFactory(driver);
		log.swaglog(username, password);
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		log.clickbtn();
		
		
	}
	@Then("login should be successful")
	public void login_should_be_successful() {
		//Utility.Capture(driver);
			}




}


