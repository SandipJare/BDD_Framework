package com.BDD_DemoProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1_DropDown {

	public static void main(String[] args) {
		Select sel;
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement wb_day = driver.findElement(By.name("birthday_day"));
		sel = new Select(wb_day);
		sel.selectByValue("29");
		WebElement wbSel_Day=sel.getFirstSelectedOption();
		String selDate=wbSel_Day.getText();
		System.out.println("Selected date= "+selDate);
		
		List<WebElement> lsDate=sel.getOptions();
		System.out.println("Total no of dates: "+lsDate.size());
		for (WebElement dates:lsDate) {
			String AllDates=dates.getText();
			System.out.println("Total Dates in Dropdown List: "+AllDates);
		}
		
		System.out.println("------------------------------------------");
		
		

		WebElement wb_month = driver.findElement(By.name("birthday_month"));
		sel = new Select(wb_month);
		sel.selectByVisibleText("Feb");
		WebElement wbSel_Month=sel.getFirstSelectedOption();
		String selMonth=wbSel_Month.getText();
		System.out.println("Selected date= "+selMonth);
		
		List<WebElement> lsMonth=sel.getOptions();
		System.out.println("Total no Months: "+lsMonth.size());
		for (WebElement months:lsMonth) {
			String AllMonths=months.getText();
			System.out.println("Total months in Dropdown List: "+AllMonths);
		}

		System.out.println("------------------------------------------");
		
		WebElement wb_year = driver.findElement(By.name("birthday_year"));
		sel = new Select(wb_year);
		sel.selectByIndex(12);
		WebElement wbSel_Year=sel.getFirstSelectedOption();
		String selYear=wbSel_Year.getText();
		System.out.println("Selected date= "+selYear);
		
		List<WebElement> lsYear=sel.getOptions();
		System.out.println("Total no of years: "+lsYear.size());
		for (WebElement Years:lsYear) {
			String AllYears=Years.getText();
			System.out.println("Total Year in Dropdown List: "+AllYears);
		}
		
	}

}
