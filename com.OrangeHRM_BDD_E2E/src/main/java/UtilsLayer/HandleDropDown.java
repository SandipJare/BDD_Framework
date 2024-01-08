package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	public static void selectByVisibleText(WebElement wb, String value) {
		WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		new Select(selwb).selectByVisibleText(value);
	}

	public static void selectByValue(WebElement wb, String value) {
		WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		new Select(selwb).selectByValue(value);
	}

	public static void selectByIndex(WebElement wb, int index) {
		WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		new Select(selwb).selectByIndex(index);
	}

}
