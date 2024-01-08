package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class ActionsEvent extends BaseClass {

	public static void click(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));

		Actions act = new Actions(driver);
		act.click(actwb).build().perform();
	}

	public static void doubleClick(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));

		Actions act = new Actions(driver);
		act.doubleClick(actwb).build().perform();

	}

	public static void contextClick(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act = new Actions(driver);
		act.contextClick(actwb).build().perform();
	}

	public static void moveToElement(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act = new Actions(driver);
		act.moveToElement(actwb).build().perform();
	}

	public static void clickAndHold(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act = new Actions(driver);
		act.clickAndHold(actwb).build().perform();
	}

	public static void dragAndDrop(WebElement source, WebElement destination) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement sourcewb = wait.until(ExpectedConditions.visibilityOf(source));
		WebElement destinationwb = wait.until(ExpectedConditions.visibilityOf(destination));

		Actions act = new Actions(driver);
		act.dragAndDrop(sourcewb, destinationwb).build().perform();
	}

	public static void release(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act = new Actions(driver);
		act.release(actwb).build().perform();
	}

	public static void sendKeys(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act = new Actions(driver);
		act.sendKeys(actwb, value).build().perform();
	}

	public static void sendUCText(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement actwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(actwb, value).keyUp(Keys.SHIFT).build().perform();
	}

}
