package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass{

	public static void accept() {
		// create object of WebDriverWait by passing driver instance and time i seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// verify alert pop is present or not by using alertIsPresent() method
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());

		// to click on ok button we use accept() method
		alt.accept();

	}

	public static void dismiss() {
		// create object of WebDriverWait by passing driver instance and time i seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// verify alert pop is present or not by using alertIsPresent() method
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());

		// to click on cancel button we use dimiss() method
		alt.dismiss();
	}

	public static void sendKeys(String value) {
		// create object of WebDriverWait by passing driver instance and time i seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// verify alert pop is present or not by using alertIsPresent() method
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());

		// Enter text in Alert pop Up text box we use sendKeys() method
		alt.sendKeys(value);
	}

	public static String getText() {

		// create object of WebDriverWait by passing driver instance and time i seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// verify alert pop is present or not by using alertIsPresent() method
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());

		// To capture the alert Pop up text use getText() method
		String a = alt.getText();
		// return a String
		return a;
	}

}
