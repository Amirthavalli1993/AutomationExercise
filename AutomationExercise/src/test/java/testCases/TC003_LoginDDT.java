package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void LoginWithDDT(String email, String password, String result)
	{
		log.info("*************TC003_LoginDDT Started******************");
		try
		{
			HomePage home=new HomePage(driver);
			home.clickSignupOrLogin();
			
			LoginPage login=new LoginPage(driver);
			String msgLogin=login.verifyLoginPage();
			log.info("Validation: Verify 'Login to your account' is visible");
			if(msgLogin.equals("Login to your account"))
			{
				System.out.println("you are successfully navigated to Login Page");
			}
			
			login.SendEmail(email);
			login.SendPassword(password);
			login.ClickLogin();
			
			if(result.equalsIgnoreCase("Valid"))
			{
				String verifyLogged=home.VerifyLoggedIn();
				if(verifyLogged.contains("Bala T"))
				{
					home.ClickLogout();
					Assert.assertTrue(true);				
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(result.equalsIgnoreCase("Invalid"))
			{
				String verifyLogged=home.VerifyLoggedIn();
				if(verifyLogged.contains("Bala T"))
				{
					home.ClickLogout();
					Assert.assertTrue(false);				
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		log.info("*************TC003_LoginDDT Finished******************");
	}
}
