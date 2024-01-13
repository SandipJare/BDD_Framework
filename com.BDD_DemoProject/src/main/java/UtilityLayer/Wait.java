package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {

	public static void click(WebElement wb) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
		WebElement wb1 = wait.until(ExpectedConditions.visibilityOf(wb));
		wb1.click();

	}

	public static void sendKeys(WebElement wb, String Value) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
		WebElement wb1 = wait.until(ExpectedConditions.visibilityOf(wb));
		wb1.sendKeys(Value);

	}

}
