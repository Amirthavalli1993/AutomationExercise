package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountDeletePage extends BasePage
{
	public AccountDeletePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement msgDeleteAccount;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public String VerifyAccountDeleted()
	{
		return msgDeleteAccount.getText();
	}
	
	public void ClickContinue()
	{
		btnContinue.click();
	}

}
