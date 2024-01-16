package com.BDD_DemoProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo6_DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("q")).sendKeys("testing");
		List<WebElement> ls = driver.findElements(By.xpath("//b"));
		System.out.println(ls.size());
		for (WebElement dropText : ls) {

			String dropList = dropText.getText();

			System.out.println("List of dynamic dropdown: " + dropList);

			if (dropList.contains("testing")) {
				dropText.click();
			}
			
		}

	}

}
