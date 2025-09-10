package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage 
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Name']")
	WebElement txtName;
	
	@FindBy(how=How.XPATH, using="//input[@data-qa='signup-email']")
	WebElement txtSignupEmail;
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Signup']")
	WebElement btnSignup;
	
	public void EnterName(String name)
	{
		txtName.sendKeys(name);
	}
	
	public void EnterEmail(String email)
	{
		txtSignupEmail.sendKeys(email);
	}
	
	public void ClickSignup()
	{
		btnSignup.click();
	}

}
