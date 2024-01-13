package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDown;
import UtilityLayer.Wait;

public class RegisterPage extends BaseClass {

	public static String fname;
	// Contact Information

	@FindBy(name = "firstName")
	WebElement wbFname;

	@FindBy(name = "lastName")
	WebElement wbLname;

	@FindBy(name = "phone")
	WebElement wbPhone;

	@FindBy(name = "userName")
	WebElement wbEmail;

	// Mailing Information

	@FindBy(name = "address1")
	WebElement wbAddress;

	@FindBy(name = "city")
	WebElement wbCity;

	@FindBy(name = "state")
	WebElement wbState;

	@FindBy(name = "postalCode")
	WebElement wbPostalCode;

	@FindBy(name = "country")
	WebElement wbSelCountry;

	// User Information

	@FindBy(name = "email")
	WebElement wbUserName;

	@FindBy(name = "password")
	WebElement wbPassword;

	@FindBy(name = "confirmPassword")
	WebElement wbConfirmPassword;

	@FindBy(name = "submit")
	WebElement wbSubmitBtn;

	@FindBy(xpath = "//font[contains(text(),'Thank you')]")
	WebElement wbTextmessege;
	
	@FindBy(xpath="//b[contains(text(),'Dear')]")
	WebElement registerUName;

	public RegisterPage() {

		PageFactory.initElements(driver, this);
	}

	public String[] validatePageUrlAndTitle() {

		String Url = driver.getCurrentUrl();
		System.out.println("Url: "+Url);
		String Title = driver.getTitle();
		System.out.println("Title: " +Title);

		String[] c = { Url, Title };

		return c;

	}

	public void user_enter_contact_page_details_and(String firstName, String lastName, String phone, String emailId) {

		Wait.sendKeys(wbFname, firstName);
		fname=wbFname.getAttribute("value");
		
		System.out.println("Firstname from fname textBox :" +fname);
	
		
		Wait.sendKeys(wbLname, lastName);
		Wait.sendKeys(wbPhone, phone);
		Wait.sendKeys(wbEmail, emailId);
	}

	public void user_enter_mailing_information_and(String address, String city, String state, String postalcode,
			String country) {
		Wait.sendKeys(wbAddress, address);
		Wait.sendKeys(wbCity, city);
		Wait.sendKeys(wbState, state);
		Wait.sendKeys(wbPostalCode, postalcode);
		DropDown.SelectByVisibleText(wbSelCountry, country);
	}

	public void user_enter_user_information_details_and(String userName, String password, String cfmPassword) {

		Wait.sendKeys(wbUserName, userName);
		Wait.sendKeys(wbPassword, password);
		Wait.sendKeys(wbConfirmPassword, cfmPassword);
		Wait.click(wbSubmitBtn);
	}

	public String[] getSuccessfulMessege() {
		
		String successPageUrl=driver.getCurrentUrl();
		System.out.println("SuccessPage Url:" +successPageUrl);
		String thankyoumsg = wbTextmessege.getText();
		System.out.println("msg from regPage: "+thankyoumsg);
		//String uname=registerUName.getAttribute("value");
		String uname2=registerUName.getText();
		//System.out.println("Uname is: " +uname);
		System.out.println("Uname2 : "+uname2);
		
		String [] successPageData= { successPageUrl, thankyoumsg, uname2};
		return successPageData;
	}

}
