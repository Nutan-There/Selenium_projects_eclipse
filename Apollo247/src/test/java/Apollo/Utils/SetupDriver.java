package Apollo.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	public static WebDriver driver;

	public static EdgeOptions options;

	public static WebDriver Edgedriver() {

		driver = new EdgeDriver();

        

       driver.get("https://www.apollo247.com/");

         


		driver.manage().window().maximize();

		options = new EdgeOptions();

		options.addArguments("--start-maximized");

		options.addArguments("--disable-popup-blocking");

		options.addArguments("--disable-notifications");

		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		return driver;

	}

	public static void teardown() {

		driver.close();

	}

}
