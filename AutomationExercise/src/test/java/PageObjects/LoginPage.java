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
	
	@FindBy(how=How.XPATH, using="//h2[normalize-space()='New User Signup!']")
	WebElement msgNewUserSignup;
	
	@FindBy(how=How.XPATH, using="//h2[normalize-space()='Login to your account']")
	WebElement msgLoginAccount;
	
	@FindBy(how=How.XPATH, using="//input[@data-qa='login-email']")
	WebElement txtemail;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
	WebElement txtpassword;
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
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
	
	public String verifyNewUserSignup()
	{
		return msgNewUserSignup.getText();
	}
	
	public String verifyLoginPage()
	{
		return msgLoginAccount.getText();
	}
	
	public void SendEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void SendPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void ClickLogin()
	{
		btnLogin.click();
	}
}
