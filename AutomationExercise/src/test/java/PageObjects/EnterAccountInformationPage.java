package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class EnterAccountInformationPage extends BasePage
{
	public EnterAccountInformationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//b[normalize-space()='Enter Account Information']")
	WebElement msgEnterAccountInformation;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement chkboxTitle;
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(how=How.XPATH, using="//select[@id='days']")
	WebElement drpdownDays;
	
	@FindBy(how=How.XPATH, using="//select[@id='months']")
	WebElement drpdownMonths;
	
	@FindBy(how=How.XPATH, using="//select[@id='years']")
	WebElement drpdownYears;
	
	@FindBy(how=How.XPATH, using="//input[@id='newsletter']")
	WebElement chkboxNewsletter;
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement chkboxSpecialOffers;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement txtLastName;
	
	@FindBy(how=How.XPATH, using="//input[@id='company']")
	WebElement txtCompany;
	
	@FindBy(how=How.XPATH, using="//input[@id='address1']")
	WebElement txtAddress1;
	
	@FindBy(how=How.XPATH, using="//input[@id='address2']")
	WebElement txtAddress2;
	
	@FindBy(how=How.XPATH, using="//select[@id='country']")
	WebElement drpdownCountry;
	
	@FindBy(how=How.XPATH, using="//input[@id='state']")
	WebElement txtState;
	
	@FindBy(how=How.XPATH, using="//input[@id='city']")
	WebElement txtCity;
	
	@FindBy(how=How.XPATH, using="//input[@id='zipcode']")
	WebElement txtZipcode;
	
	@FindBy(how=How.XPATH, using="//input[@id='mobile_number']")
	WebElement txtMobileNumber;
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Create Account']")
	WebElement btnCreateAccount;
	
	public String VerifyAccountInformationPage()
	{
		return msgEnterAccountInformation.getText();
	}
	
	public void ClickTitle()
	{
		chkboxTitle.click();
	}
	
	public void SendPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void SelectDay(String day)
	{
		Select drpdownday=new Select(drpdownDays);
		drpdownday.selectByVisibleText(day);
	}
	
	public void SelectMonth(String month)
	{
		Select drpdownmonth=new Select(drpdownMonths);
		drpdownmonth.selectByVisibleText(month);
	}
	
	public void SelectYear(String year)
	{
		Select drpdownyear=new Select(drpdownYears);
		drpdownyear.selectByVisibleText(year);
	}
	
	public void SelectNewsLetterCheckBox()
	{
		chkboxNewsletter.click();
	}
	
	public void SelectSpecialOffersCheckBox()
	{
		chkboxSpecialOffers.click();
	}
	
	public void SendFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void SendLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void SendCompany(String company)
	{
		txtCompany.sendKeys(company);
	}
	
	public void SendAddress1(String address1)
	{
		txtAddress1.sendKeys(address1);
	}
	
	public void SendAddress2(String address2)
	{
		txtAddress2.sendKeys(address2);
	}
	
	public void SelectCountry(String country)
	{
		Select select=new Select(drpdownCountry);
		select.selectByVisibleText(country);
	}
	
	public void SendState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void SendCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	public void SendZipcode(String zipcode)
	{
		txtZipcode.sendKeys(zipcode);
	}
	
	public void SendMobileNumber(String mobilenumber)
	{
		txtMobileNumber.sendKeys(mobilenumber);
	}
	
	public void ClickCreateAccount()
	{
		btnCreateAccount.click();
	}
}
