package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_LoginWithValidCredentials extends BaseClass
{
	@Test
	public void LoginWithValidCredentialsTest()
	{
		log.info("*************TC002_LoginWithValidCredentials Started******************");
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
			
			login.SendEmail(p.getProperty("email"));
			login.SendPassword(p.getProperty("password"));
			login.ClickLogin();
			
			String verifyLogged=home.VerifyLoggedIn();
			if(verifyLogged.contains("Bala T"))
			{
				System.out.println("Successfully Logged In");
			}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		log.info("*************TC002_LoginWithValidCredentials Finished******************");
	}
}
