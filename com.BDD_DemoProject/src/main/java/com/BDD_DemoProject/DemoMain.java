package com.BDD_DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoMain {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");

	}

}
