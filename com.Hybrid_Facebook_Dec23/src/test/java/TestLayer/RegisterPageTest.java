package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{

private RegisterPage registerPage;
	
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateRegisterUserFunctionality()
	{
		registerPage =new RegisterPage();
	//	registerPage.registerNewUser("aboli", "Shinde", "aboli@gmail.com", "Aboli@123",
	//			"24", "Jan", "2007", "female");
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
}
