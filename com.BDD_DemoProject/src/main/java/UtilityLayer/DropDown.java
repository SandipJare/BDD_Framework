package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class DropDown extends BaseClass {

	public static void SelectByVisibleText(WebElement wb, String Value) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement wb1 = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(wb1);
		sel.selectByVisibleText(Value);
	}

	public static void SelectByValue(WebElement wb, String Value) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement wb1 = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(wb1);
		sel.selectByValue(Value);
	}

	public static void SelectByIndex(WebElement wb, int index) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement wb1 = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(wb1);
		sel.selectByIndex(index);
	}
}
