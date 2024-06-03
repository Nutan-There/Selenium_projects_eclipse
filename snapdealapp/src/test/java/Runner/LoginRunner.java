package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature\\Login.feature", glue={"StepDefinition"}, tags="@log1 or @log2") 


public class LoginRunner {



}

