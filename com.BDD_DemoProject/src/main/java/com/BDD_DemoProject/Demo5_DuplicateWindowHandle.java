package com.BDD_DemoProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo5_DuplicateWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		Select sel;
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String fbTitle = driver.getTitle();
		System.out.println("fbTitle: " + fbTitle);

		String FBWinID = driver.getWindowHandle();
		System.out.println("fb id: " + FBWinID);

		/*
		 * WebElement wb_day = driver.findElement(By.name("birthday_day")); sel = new
		 * Select(wb_day); sel.selectByValue("29"); WebElement wbSel_Day =
		 * sel.getFirstSelectedOption(); String selDate = wbSel_Day.getText();
		 * System.out.println("Selected date= " + selDate);
		 * 
		 * List<WebElement> lsDate = sel.getOptions();
		 * System.out.println("Total no of dates: " + lsDate.size()); for (WebElement
		 * dates : lsDate) { String AllDates = dates.getText(); //
		 * System.out.println("Total Dates in Dropdown List: " + AllDates); }
		 */
		System.out.println("------------------------------------------");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		System.out.println("page title: " + driver.getTitle());
		String googleWind = driver.getWindowHandle();
		System.out.println("googelWindowId: " + googleWind);

		System.out.println("------------------------------------------");

		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://chat.openai.com/c/0b79ad6d-d4e9-4e06-9bc4-e1b7d6db0482");
		System.out.println("page title: " + driver.getTitle());
		String bingWinid = driver.getWindowHandle();
		System.out.println("chatGPT id: " + bingWinid);

		System.out.println("------------------------------------------");

		/*
		 * Actions act = new Actions(driver); act.keyDown(Keys.CONTROL)
		 * .keyDown(Keys.SHIFT) .sendKeys("K") .keyUp(Keys.SHIFT) .keyUp(Keys.CONTROL)
		 * .build().perform();
		 * 
		 * act.keyDown(Keys.CONTROL) .keyDown(Keys.SHIFT) .sendKeys("K")
		 * .keyUp(Keys.SHIFT) .keyUp(Keys.CONTROL) .build().perform();
		 * 
		 * act.keyDown(Keys.CONTROL) .keyDown(Keys.SHIFT) .sendKeys("K")
		 * .keyUp(Keys.SHIFT) .keyUp(Keys.CONTROL) .build().perform();
		 */

		System.out.println("------------------------------------------");

		String actionClassWind = driver.getWindowHandle();
		System.out.println("Action class wind:" + actionClassWind);

		System.out.println("------------------------------------------");

		ArrayList arr = new ArrayList();

		Set<String> windnos = driver.getWindowHandles();
		for (String win : windnos) {
//			if (googleWind != win) {
//				String TotalwindoId = win;
//				System.out.println("Total Window Ids: " + TotalwindoId);
//			}
		}
		// ctrl+shift+k

		for (String win : windnos) {
			arr.add(win);
		}
		System.out.println(arr);

		String fbid0 = (String) arr.get(0);

		Thread.sleep(2000);
		driver.switchTo().window(fbid0);

		System.out.println("------------------------------------------");

		System.out.println("after arraylist changewindid: 0 th no " + driver.getTitle());

		String fbid2 = (String) arr.get(2);
		Thread.sleep(2000);
		driver.switchTo().window(fbid2);

		System.out.println("------------------------------------------");

		System.out.println("after arraylist changewindid: 2 th no " + driver.getTitle());

		driver.navigate().refresh();

		String windRefreshID = driver.getWindowHandle();

		System.out.println("refresh WindId: " + windRefreshID);
	}

}
