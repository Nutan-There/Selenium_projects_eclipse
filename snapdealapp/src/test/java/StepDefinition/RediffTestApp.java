package StepDefinition;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.RediffPage;

public class RediffTestApp {
	WebDriver driver;
	RediffPage red;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@When("user gives keyword in search field")
	public void user_gives_manipur_in_search_field(DataTable keyword) {
		red=new RediffPage(driver);
		java.util.List<String> cells=keyword.asList(String.class);
	    red.stext(cells.get(1));
	}
	@And("user click on search icon")
	public void user_click_on_search_icon() {
		red.sbtn();
	}
	@Then("search data should be displayed")
	public void search_data_should_be_displayed() {
		driver.close();
	}



}
