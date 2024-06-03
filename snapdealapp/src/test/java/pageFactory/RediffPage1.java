package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPage1 {
	WebDriver driver;
    @FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
    WebElement fullName;

    @FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
    WebElement id;

    @FindBy(xpath="//*[@id=\"newpasswd\"]")
    WebElement password;

    @FindBy(xpath="//*[@id=\"newpasswd1\"]")
    WebElement conpass;

    @FindBy(xpath="//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")
    WebElement email;

    @FindBy(xpath="//*[@id=\"mobno\"]")
    WebElement phoneNumber;

    @FindBy(xpath="//*[@id=\"Register\"]")
    WebElement create;

    public RediffPage1(WebDriver driver)
    {
        this.driver= driver;

 

        PageFactory.initElements(driver, this);
    }

    public void enterName(String value)
    {
        fullName.sendKeys(value);
    }

    public void enterId(String value)
    {
        id.sendKeys(value);
    }

    public void enterPassword(String value)
    {
        password.sendKeys(value);
    }

 

    public void re_enterPassword(String value)
    {
        conpass.sendKeys(value);
    }

    public void enterEmail(String value)
    {
        email.sendKeys(value);
    }

    public void enterNumber(String value)
    {
        phoneNumber.sendKeys(value);
    }

    public void clickbtn() {

 

        create.click();

 

        }

	public void createAccount(String string, String string2, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated method stub
		
	}

}
