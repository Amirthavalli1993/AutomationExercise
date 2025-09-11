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
	@FindBy(how=How.XPATH, using="//div[@class='item active']//h1[1]")
	WebElement txtHomepage;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Signup / Login']")
	WebElement lnkSignupOrLogin;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Delete Account']")
	WebElement btnDeleteAccount;
	
	@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']/li[10]/a")
	WebElement btnLoggedInAs;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Logout']")
	WebElement btnLogout;
	
	//Actions	
	public void clickSignupOrLogin()
	{
		lnkSignupOrLogin.click();
	}
	
	public String confirmMessage() 
	{
		return txtHomepage.getText();
	}
	
	public void ClickDeleteAccount()
	{
		btnDeleteAccount.click();
	}
	
	public String VerifyLoggedIn()
	{
		return btnLoggedInAs.getText();
	}
	
	public void ClickLogout()
	{
		btnLogout.click();
	}

}
