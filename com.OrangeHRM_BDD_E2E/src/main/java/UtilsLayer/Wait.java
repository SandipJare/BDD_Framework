package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {

	public static void sendkeys(WebElement wb, String Value) {

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(Value);

		// or
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).sendKeys(Value);
	}

	public static void click(WebElement wb) {

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(wb)).click();

		// or
		new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.visibilityOf(wb)).click();
	}

	
}
