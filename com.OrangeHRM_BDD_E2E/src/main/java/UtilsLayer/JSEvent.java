package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JSEvent extends BaseClass {

	public static void openUrl(String url) {
		((JavascriptExecutor) driver).executeScript("window.location='" + url + "'");
	}

	public static void openUrlInNewWindow(String url) {
		((JavascriptExecutor) driver).executeScript("window.open('" + url + "')");
	}

	public static void navigateBack(int previousPage) {
		((JavascriptExecutor) driver).executeScript("history.go('-" + previousPage + "')");
	}

	public static void navigateForward(int nextPage) {
		((JavascriptExecutor) driver).executeScript("history.go('+" + nextPage + "')");
	}

	public static void refresh() {
		((JavascriptExecutor) driver).executeScript("history.go('0')");
	}

	public static String getTitle() {

		return ((JavascriptExecutor) driver).executeScript("return document.TITLE").toString();
	}

	public static String getCurrentUrl() {

		return ((JavascriptExecutor) driver).executeScript("return document.URL").toString();
	}

	public static void click(WebElement wb) {
		WebElement wb1 = Wait.visibilityStatus(wb);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb1);
	}

	public static void sendKeys(WebElement wb, String value) {
		WebElement wb1 = Wait.visibilityStatus(wb);
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", wb1);
	}

	public static void scrollUptoElement(WebElement wb) {
		WebElement wb1 = Wait.visibilityStatus(wb);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wb1);
	}

	public static void borderForElement(WebElement wb) {
		WebElement wb1 = Wait.visibilityStatus(wb);
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red';", wb1);
	}

}
