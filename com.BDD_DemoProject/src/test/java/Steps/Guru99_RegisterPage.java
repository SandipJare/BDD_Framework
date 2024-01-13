package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Guru99_RegisterPage extends BaseClass {

	RegisterPage registerPage;
	RegisterPage registerPage1;
	public static String fname;

	@Given("user is on guru99 register page")
	public void user_is_on_guru99_register_page() {
		BaseClass.intilization();
	}

	@Given("user validate url and register page title")
	public void user_validate_url_and_register_page_title() {
		registerPage1 = new RegisterPage();
		String[] urlAndPageTitle = registerPage1.validatePageUrlAndTitle();
		String Actaultitle = urlAndPageTitle[1];
		String ActaulUrl = urlAndPageTitle[0];

		System.out.println("Actaul URL: " + ActaulUrl);

		String expectedUrl = prop.getProperty("expUrl");
		System.out.println("Expected URL from configFile: " + expectedUrl);
		String expectedTilte = prop.getProperty("title");

		Assert.assertEquals(ActaulUrl, expectedUrl);
		Assert.assertEquals(Actaultitle, expectedTilte);

	}

	@When("user enter contact page details {string} , {string},{string} and {string}")
	public void user_enter_contact_page_details_and(String fname, String lname, String phone, String email) {
		registerPage = new RegisterPage();
		registerPage.user_enter_contact_page_details_and(fname, lname, phone, email);
	}

	@When("user enter mailing information {string} , {string},{string}, {string} and {string}")
	public void user_enter_mailing_information_and(String address, String city, String state, String postalcode,
			String country) {
		registerPage.user_enter_mailing_information_and(address, city, state, postalcode, country);

	}

	@When("user enter user information details {string}, {string} and {string}")
	public void user_enter_user_information_details_and(String uname, String upassword, String ucfmPassword) {
		registerPage.user_enter_user_information_details_and(uname, upassword, ucfmPassword);
	}

	@When("user validate sucessful register messege")
	public void user_validate_sucessful_register_messege() {
		String[] msgfromSeccessPage = registerPage1.getSuccessfulMessege();

		String suPageUrl = msgfromSeccessPage[0];
		String ExpectedSuccessUrl = prop.getProperty("successUrl");

		System.out.println(msgfromSeccessPage[1]);
		boolean b = msgfromSeccessPage[1].contains("Thank you");

		Assert.assertEquals(suPageUrl, ExpectedSuccessUrl);
		Assert.assertEquals(b, true);

		String ActualUserName = msgfromSeccessPage[2];
		System.out.println("Username: " + ActualUserName);

		boolean fnametobePresent = ActualUserName.contains(RegisterPage.fname);

		Assert.assertEquals(fnametobePresent, true);

	}

	@AfterStep
	public void getScreenshot(Scenario scenario) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] b = ts.getScreenshotAs(OutputType.BYTES);

		System.out.println(scenario.getName());
		System.out.println(scenario.getId());

		scenario.attach(b, "image/png", scenario.getId());

	}

	@After

	public static void before_or_after_all() {
		BaseClass.tearDown();
	}

}
