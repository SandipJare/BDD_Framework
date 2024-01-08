package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.Wait;

public class LoginPageClass extends BaseClass {

	@FindBy(name = "username")
	WebElement uname;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//button")
	WebElement loginBtn;

	public LoginPageClass() {
		PageFactory.initElements(driver, this);
	}

	public void loginFunctionlaity(String UserName, String Passwd) {

		// uname.sendKeys(UserName);
		Wait.sendkeys(uname, UserName);

		// pass.sendKeys(Passwd);
		Wait.sendkeys(pass, Passwd);

	}

	public void loginClick() {
		// loginBtn.click();
		Wait.click(loginBtn);
	}

}
