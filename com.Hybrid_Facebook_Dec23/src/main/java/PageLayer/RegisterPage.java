package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass_BDD_FB;

public class RegisterPage extends BaseClass_BDD_FB {
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

	@FindBys(@FindBy(xpath = "//label[@class='_58mt']"))
	private List<WebElement> gender;

	// 2. initialize the Object Repository by using PageFactory.initElements()
	// method in constructor

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	// 3. create associated method for each and every object repository without
	// entering test data.

	public void registerNewUser(String firstname, String lastname, String username, String password) {
		if (fname.isDisplayed() && fname.isEnabled()) {
			fname.sendKeys(firstname);
		}

		if (lname.isDisplayed() && lname.isEnabled()) {
			lname.sendKeys(lastname);
		}

		if (uname.isDisplayed() && uname.isEnabled()) {
			uname.sendKeys(username);
		}
		if (pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys(password);
		}
	}

	public void selectFunctionality(String Date, String Month, String Year, String Gender) throws InterruptedException {

		Select sel1 = new Select(day);
		sel1.selectByVisibleText(Date);

		Select sel2 = new Select(month);
		sel2.selectByVisibleText(Month);

		Select sel3 = new Select(year);
		sel3.selectByVisibleText(Year);
		
		for(WebElement genderls:gender) {
			String gender1=genderls.getText();
			System.out.println(gender1);
			Thread.sleep(3000);
			if(gender1.equalsIgnoreCase(Gender));
			genderls.click();
		}
	}

}
