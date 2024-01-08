package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.UtilsClass;
import UtilityLayer.Wait;

public class RegisterPage4 extends BaseClass {

	// 1. create Object Repository by using @FindBy annotations
	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;

	@FindBy(name = "reg_email__")
	private WebElement uname;

	@FindBy(name = "reg_passwd__")
	private WebElement pass;

	@FindBy(name = "birthday_day")
	private WebElement day;

	@FindBy(name = "birthday_month")
	private WebElement month;

	@FindBy(name = "birthday_year")
	private WebElement year;

	@FindBys(@FindBy(xpath = "//span[@class='_5k_3']//child::label"))
	private List<WebElement> gender;

	// 2. initialize the Object Repository by using PageFactory.initElements()
	// method in constructor

	public RegisterPage4() {
		PageFactory.initElements(driver, this);
	}

	// 3. create associated method for each and every object repository without
	// entering test data.

	public void registerNewUser(String firstname, String lastname, String username, String password, String Date,
			String Month, String Year, String Gender) {

		Wait.checkElementStatusAndEnterValue(fname, firstname);

		Wait.checkElementStatusAndEnterValue(lname, lastname);

		Wait.checkElementStatusAndEnterValue(uname, username);

		Wait.checkElementStatusAndEnterValue(pass, password);

		HandleDropDown.selectByVisibleText(day, Date);

		HandleDropDown.selectByVisibleText(month, Month);

		HandleDropDown.selectByVisibleText(year, Year);

		UtilsClass.selectGender(gender, Gender);

	}
}
