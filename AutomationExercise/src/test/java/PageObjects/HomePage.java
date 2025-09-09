package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage
{
	//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//locator
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Signup / Login']")
	WebElement lnkSignupOrLogin;
	
	//Actions	
	public void clickSignupOrLogin()
	{
		lnkSignupOrLogin.click();
	}

}
