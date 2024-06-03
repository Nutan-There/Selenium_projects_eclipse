package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPF {
	WebDriver driver;
	LoginFactory log;
  @Test
  public void verifyswag() {
	  
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("https://www.saucedemo.com/");
      driver.manage().window().maximize();
      
      log= new LoginFactory(driver);
      log.swaglog("locked_out_user", "secret_sauce");
      log.clickbtn();
  }
}
