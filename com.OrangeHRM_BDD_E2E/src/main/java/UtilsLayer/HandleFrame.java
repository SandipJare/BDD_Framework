package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{

	// create reusable script code for handle frame using frame id or name and
	// before handing frame, check
	// frame is present or not by using explicit wait concept. and inside the
	// Explicit wait we have ExpectedConditions
	// class and inside this class they define frameToBeAvailableAndSwitchToIt()
	// method
	public static void frame(String frameIdOrName) {
		// create Object of WebDriverWait class by passing driver instance and time in
		// seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// check frame is available or not by using frameToBeAvailableAndSwitchToIt()
		// method
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));

	}

	// create reusable script code for handle frame using frame index and before
	// handing frame, check
	// frame is present or not by using explicit wait concept. and inside the
	// Explicit wait we have ExpectedConditions
	// class and inside this class they define frameToBeAvailableAndSwitchToIt()
	// method
	public static void frame(int frameIndex) {
		// create Object of WebDriverWait class by passing driver instance and time in
		// seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// check frame is available or not by using frameToBeAvailableAndSwitchToIt()
		// method
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

	}

	// create reusable script code for handle frame using frame WebElement,and
	// before handing frame, check
	// frame is present or not by using explicit wait concept. and inside the
	// Explicit wait we have ExpectedConditions
	// class and inside this class they define frameToBeAvailableAndSwitchToIt()
	// method
	public static void frame(WebElement framewb) {
		// create Object of WebDriverWait class by passing driver instance and time in
		// seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// check frame is available or not by using frameToBeAvailableAndSwitchToIt()
		// method
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framewb));

	}

	// create reusable script code to handle parent frame
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	// create reusable script code to handle the top frame
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

}
