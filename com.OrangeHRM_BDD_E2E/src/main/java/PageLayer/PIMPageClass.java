package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.Wait;

public class PIMPageClass extends BaseClass {

	public static String EmployeeID;

	@FindBy(xpath = "//a[text()='Employee List']")
	WebElement emplList;

	@FindBy(xpath = "//a[text()='Add Employee']")
	WebElement addEmplyeeButton;

	@FindBy(name = "firstName")
	WebElement empFirstname;

	@FindBy(name = "lastName")
	WebElement empLastname;

	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement empSaveButton;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	WebElement empId;

	@FindBy(xpath = "//button[text()=' Search ']")
	WebElement searchButton;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")
	WebElement checkBox;

	@FindBy(xpath = "//*[text()=' Delete Selected ']")
	WebElement deleteSelected;

	@FindBy(xpath = "//*[text()=' Yes, Delete ']")
	WebElement yesDelete;

	@FindBy(xpath = "//*[text()='No Records Found']")
	WebElement NoRecordsFound;

	@FindBy(xpath = "//*[@alt='profile picture']")
	WebElement profPicIcon;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement logOutProfile;

	public PIMPageClass() {
		PageFactory.initElements(driver, this);
	}

	public String user_validate_user_is_on_pim_page_by_using_url() {

		return driver.getCurrentUrl();
	}

	public void user_click_add_employee_and_enter_firstname_lastname_and_click_on_save_button(String fName,
			String lName) throws InterruptedException {

		Wait.click(addEmplyeeButton);
		Thread.sleep(3000);
		Wait.sendKeys(empFirstname, fName);

		Wait.sendKeys(empLastname, lName);

		Thread.sleep(3000);
		Wait.click(empSaveButton);

	}

	public void user_capture_employee_id_number_and_user_click_on_employeelist() {

		EmployeeID = empId.getAttribute("value");
		Wait.click(emplList);
	}

	public void user_enter_employee_id_is_employee_id_text_box_and_click_on_search_button()
			throws InterruptedException {

		Thread.sleep(3000);
		empId.sendKeys(EmployeeID);
		// Wait.sendkeys(empId, EmployeeID);
		Thread.sleep(3000);
		Wait.click(searchButton);
	}

	public void user_selected_searched_employee_and_click_on_delete() throws InterruptedException {

		Thread.sleep(5000);
		checkBox.click();
		// Wait.click(checkBox);
		Wait.click(deleteSelected);
		Wait.click(yesDelete);
	}

	public String validate_employee_is_deleted_or_not() throws InterruptedException {
		Thread.sleep(3000);
		empId.clear();
		Thread.sleep(3000);
		empId.sendKeys(EmployeeID);
		// Wait.sendkeys(empId, EmployeeID);
		Thread.sleep(3000);
		Wait.click(searchButton);
		String confDeleteRecords = NoRecordsFound.getText();
		return confDeleteRecords;
	}

	public String user_click_on_profile_and_click_on_logout_button() {

		Wait.click(profPicIcon);
		Wait.click(logOutProfile);
		String LoginUrl = driver.getCurrentUrl();
		return LoginUrl;
	}
}
