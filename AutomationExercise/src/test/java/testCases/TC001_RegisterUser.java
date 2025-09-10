package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountCreatedPage;
import PageObjects.EnterAccountInformationPage;
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
			log.info("Validation: Verifying the home page visibility");
			if(confirmationMsg.equals("AutomationExercise"))
			{
				System.out.println("Home page is visible Successfully");
			}
			home.clickSignupOrLogin();
			
			LoginPage login=new LoginPage(driver);
			String NewUserSignup=login.verifyNewUserSignup();
			log.info("Validation: You are now on New User Signup! page");
			if(NewUserSignup.equals("New User Signup!"))
			{
				System.out.println("you are on New User Signup! Page");
			}			
			else
			{
				System.out.println("New User Signup! is not visible");
			}
			login.EnterName("Amirthavalli");
			login.EnterEmail(RandomeString()+"@gmail.com");
			login.ClickSignup();
			
			EnterAccountInformationPage accountinformation = new EnterAccountInformationPage(driver);
			String verifyaccountinfo=accountinformation.VerifyAccountInformationPage();
			//System.out.println(verifyaccountinfo);
			log.info("Validation: Verify that 'ENTER ACCOUNT INFORMATION' is visible");
			if(verifyaccountinfo.equals("ENTER ACCOUNT INFORMATION"))
			{
				System.out.println("you are successfully navigated to Enter Account Information Page");
			}
			else {
				System.out.println("Incorrect Page");
			}
			accountinformation.ClickTitle();
			accountinformation.SendPassword("test@12");
			accountinformation.SelectDay("7");
			accountinformation.SelectMonth("September");
			accountinformation.SelectYear("2021");
			accountinformation.SelectNewsLetterCheckBox();
			accountinformation.SelectSpecialOffersCheckBox();
			accountinformation.SendFirstName("Amirtha");
			accountinformation.SendLastName("Bala");
			accountinformation.SendCompany("ABC");
			accountinformation.SendAddress1("Alkjhkmsndfisfdm,n");
			accountinformation.SendAddress2("urkjviuslsdksdoi");
			accountinformation.SelectCountry("India");
			accountinformation.SendState("TamilNadu");
			accountinformation.SendCity("Erode");
			accountinformation.SendZipcode("654987");
			accountinformation.SendMobileNumber("7896541236");
			accountinformation.ClickCreateAccount();
			
			AccountCreatedPage accountcreation=new AccountCreatedPage(driver);
			String msgConfirmation=accountcreation.VerifyAccountCreation();
			if(msgConfirmation.equals("ACCOUNT CREATED!"))
			{
				System.out.println("Account created successfully");
			}
			
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		log.info("*******TC001_RegisterUser Finished******");
	}
}
