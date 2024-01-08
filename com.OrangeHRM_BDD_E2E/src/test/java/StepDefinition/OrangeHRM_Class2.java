package StepDefinition;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePageClass;
import PageLayer.LoginPageClass;
import PageLayer.PIMPageClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_Class2 extends BaseClass {

	public LoginPageClass loginPageClass;
	public HomePageClass homePageClass;
	PIMPageClass pIMPageClass;

	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		BaseClass.intilization();
	}

	@When("user enter valid username and password credentails")
	public void user_enter_valid_username_and_password_credentails(DataTable dataTable) {

		List<List<String>> ls = dataTable.asLists();
		String uname = ls.get(0).get(0);
		String pass = ls.get(0).get(1);
//		System.out.println(uname);
//		System.out.println(pass);
//		driver.findElement(By.name("username")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(pass);
		loginPageClass = new LoginPageClass(); // called method from login pageLayer OR class
		loginPageClass.loginFunctionlaity(uname, pass);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
//		driver.findElement(By.tagName("button")).click();
		loginPageClass.loginClick();
	}

	@When("user is on home page validate home page title")
	public void user_is_on_home_page_validate_home_page_title(DataTable dataTable) {

		homePageClass = new HomePageClass();

		List<List<String>> ls = dataTable.cells();
		String actuaTitle = ls.get(0).get(0);

		System.out.println("Actual title:" + actuaTitle);
		Assert.assertEquals(actuaTitle, homePageClass.getTitle());

	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		String actualhmPageUrl = homePageClass.homePageUrl();
		System.out.println("page url:" + actualhmPageUrl);
		Assert.assertTrue(actualhmPageUrl.contains("orangehrmlive"));
	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo(DataTable dataTable) throws InterruptedException {

		List<List<String>> ls = dataTable.cells();
		String b = ls.get(0).get(0);
		boolean logostatus = Boolean.parseBoolean(b);
		System.out.println("DatatableValue:" + b);
		System.out.println("Logo status:" + homePageClass.homePageLogo());
		Assert.assertEquals(logostatus, homePageClass.homePageLogo());

	}

	@When("user click on pim page link")
	public void user_click_on_pim_page_link() {
		HomePageClass HomePageClass1 = new HomePageClass();
		System.out.println("this is before pimlink validation");
		// HomePageClass1.clickOnPIMPageLink();
		HomePageClass1.clickOnPIMPageLink1();
		System.out.println("this is after pimlink validation");
	}

	@When("user validate user is on pim page by using url")
	public void user_validate_user_is_on_pim_page_by_using_url(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		List<List<String>> ls = dataTable.asLists();
		String expeUrl = ls.get(0).get(0);
		pIMPageClass = new PIMPageClass();
		String actualPimUrl = pIMPageClass.user_validate_user_is_on_pim_page_by_using_url();
		boolean compareUrl = actualPimUrl.contains(expeUrl);
		Assert.assertTrue(compareUrl);

	}

	@When("user click add employee and enter firstname, lastname and click on save button")
	public void user_click_add_employee_and_enter_firstname_lastname_and_click_on_save_button(DataTable dataTable)
			throws InterruptedException {
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		List<List<String>> ls = dataTable.asLists();

		for (int i = 0; i < ls.size(); i++) {
			String firstname = ls.get(i).get(0);
			String lastname = ls.get(i).get(1);
			pIMPageClass.user_click_add_employee_and_enter_firstname_lastname_and_click_on_save_button(firstname,
					lastname);
		}
	}

	@When("user capture employee id number and user click on employeelist")
	public void user_capture_employee_id_number_and_user_click_on_employeelist() {
		pIMPageClass.user_capture_employee_id_number_and_user_click_on_employeelist();

	}

	@When("user enter employee id is employee id text  box and click on search button")
	public void user_enter_employee_id_is_employee_id_text_box_and_click_on_search_button()
			throws InterruptedException {
		pIMPageClass.user_enter_employee_id_is_employee_id_text_box_and_click_on_search_button();
	}

	@When("user selected searched employee and click on delete")
	public void user_selected_searched_employee_and_click_on_delete() throws InterruptedException {
		pIMPageClass.user_selected_searched_employee_and_click_on_delete();
	}

	@Then("validate employee is deleted or not")
	public void validate_employee_is_deleted_or_not() throws InterruptedException {
		String ActualdeleteRecordValidation = pIMPageClass.validate_employee_is_deleted_or_not();
		Assert.assertEquals(ActualdeleteRecordValidation, "No Records Found");
	}

	@When("user click on profile and click on logout button")
	public void user_click_on_profile_and_click_on_logout_button() {

		PIMPageClass pIMPageClass1 = new PIMPageClass();
		String retunToLoinPage = pIMPageClass1.user_click_on_profile_and_click_on_logout_button();
		boolean logoutcnfrmation = retunToLoinPage.contains("login");
		Assert.assertTrue(logoutcnfrmation);
	}

	@AfterStep
	public void teardown(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] f = ts.getScreenshotAs(OutputType.BYTES);

		System.out.println(scenario.getName());
		System.out.println(scenario.getId());
		scenario.attach(f, "image/png", scenario.getId());

	}

}
