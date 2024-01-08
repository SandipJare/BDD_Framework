package Steps;

import BaseLayer.BaseClass_BDD_FB;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ResgisterPageSteps extends BaseClass_BDD_FB {

	public RegisterPage registerPage;

	@Given("user is open {string} browser")
	public void user_is_open_browser(String browsername) {
		BaseClass_BDD_FB.intilization(browsername);
	}

	@When("user is on register page")
	public void user_is_on_register_page() {
		driver.get("https://www.facebook.com/reg");
	}

	@When("user enter the {string} , {string} ,{string} and {string}")
	public void user_enter_the_and(String firstname, String lastname, String username, String password) {
		registerPage = new RegisterPage();
		registerPage.registerNewUser(firstname, lastname, username, password);
	}

	@When("user entered the {string} , {string} , {string} and  gender {string}")
	public void user_entered_the_and_gender(String Date, String Month, String Year, String Gender) throws InterruptedException {
		registerPage.selectFunctionality(Date, Month, Year, Gender);
	}

}
