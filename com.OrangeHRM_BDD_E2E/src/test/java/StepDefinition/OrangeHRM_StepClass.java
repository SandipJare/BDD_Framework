package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPageClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_StepClass extends BaseClass{

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.intilization();
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails() {
		LoginPageClass LoginPageClass=new LoginPageClass();
		LoginPageClass.loginFunctionlaity(prop.getProperty("Username"), prop.getProperty("Password"));
	}

	@Then("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {

	}

	@Then("user validate Home page URL")
	public void user_validate_home_page_url() {

	}

	@When("user is on pim Page")
	public void user_is_on_pim_page() {

	}

	@Then("validate PIM page url")
	public void validate_pim_page_url() {

	}

	@When("user click on add Employee")
	public void user_click_on_add_employee() {

	}

	@When("user enter valid {string},{string}, {string} and click on save button")
	public void user_enter_valid_and_click_on_save_button(String string, String string2, String string3) {

	}

	@When("user capture the employee id")
	public void user_capture_the_employee_id() {

	}

	@When("user click on add employee list")
	public void user_click_on_add_employee_list() {

	}

	@When("user enter employee id and click on search button")
	public void user_enter_employee_id_and_click_on_search_button() {

	}

	@When("user select searched employee and click on delete")
	public void user_select_searched_employee_and_click_on_delete() {

	}

	@Then("validate confirm delete window and click on yes deleted")
	public void validate_confirm_delete_window_and_click_on_yes_deleted() {

	}

	@When("user click on profile image")
	public void user_click_on_profile_image() {

	}

	@When("user click on logout button")
	public void user_click_on_logout_button() {

	}

}
