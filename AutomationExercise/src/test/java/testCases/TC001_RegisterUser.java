package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_RegisterUser extends BaseClass
{

	@Test
	public void RegisterUserTest()
	{
		try
		{
			log.info("*******TC001_RegisterUser Started******");
			HomePage home=new HomePage(driver);	
			String confirmationMsg=home.confirmMessage();
			if(confirmationMsg.equals("AutomationExercise"))
			{
				System.out.println("Home page is visible Successfully");
			}
			home.clickSignupOrLogin();
			
			LoginPage login=new LoginPage(driver);
			login.EnterName(RandomeString());
			login.EnterEmail(RandomeString()+"@gmail.com");
			login.ClickSignup();
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		log.info("*******TC001_RegisterUser Finished******");
	}
}
