package StepDef;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginFactory;

public class LoginExcelApp {
	WebDriver driver;

    LoginFactory log;

    

    @Given("user is on the login page of swag lab")

    public void user_is_on_the_login_page_of_swag_lab() {

        WebDriverManager.edgedriver().setup();

        driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

 

    }

    @When("user credentials takes  from excel username & password")

    public void user_credentials_takes_from_excel_username_password() throws IOException {

        File file = new File("C:\\Users\\NTHERE\\eclipse-workspace\\snapdealapp\\ExcelData\\data4.xlsx");

 

        FileInputStream fi = new FileInputStream(file);

 

        XSSFWorkbook w = new XSSFWorkbook(fi);

 

        XSSFSheet s = w.getSheetAt(0);

        Row r = s.getRow(0);

        String username = r.getCell(0).getStringCellValue();

        String password =r.getCell(1).getStringCellValue();

        

        log=new LoginFactory(driver);

        log.swaglog(username, password);

        

 

    }

    @When("user click on login button")

    public void user_click_on_login_button() {

        log.clickbtn();

    }

    @Then("Login should be successful")

    public void login_should_be_successful() {

    }

}
