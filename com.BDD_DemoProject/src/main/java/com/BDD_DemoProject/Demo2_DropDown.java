package com.BDD_DemoProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2_DropDown {

	public static void main(String[] args) {
		Select sel;
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement wb_day = driver.findElement(By.name("birthday_day"));
		sel = new Select(wb_day);
		
		List<WebElement> lsDate = sel.getOptions();
		System.out.println("Total no of dates: " + lsDate.size());
		for (WebElement dates : lsDate) {
			String AllDates = dates.getText();
			System.out.println("Total Dates in Dropdown List: " + AllDates);
			if(AllDates.contains("25"));
			sel.selectByValue("25");
		}
		
		
		//sel.selectByValue("29");
		WebElement wbSel_Day = sel.getFirstSelectedOption();
		String selDate = wbSel_Day.getText();
		System.out.println("Selected date= " + selDate);

		

		System.out.println("------------------------------------------");

	}

}
