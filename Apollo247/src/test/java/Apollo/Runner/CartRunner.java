package Apollo.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Apollo\\Feature\\cart.feature",glue="Apollo.StepDef", tags="@tag1 or @tag2",
plugin= {"pretty","html:target/Cucumber-report.html","junit:target/JUNITReports/log.xml",

        "json:target/JUNITReports/log.json",

        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CartRunner extends AbstractTestNGCucumberTests{
	

}
