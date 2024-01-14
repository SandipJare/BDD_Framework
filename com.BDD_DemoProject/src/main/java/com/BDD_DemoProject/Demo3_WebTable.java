package com.BDD_DemoProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3_WebTable {

	public static void main(String[] args) {
		String alllist2 = "";
		int id = 0;
		WebDriver driver = new EdgeDriver();
		driver.get("https://prafpawar11.github.io/emptable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find all table data
		List<WebElement> ls = driver.findElements(By.xpath("//td"));

		// find all table header
		List<WebElement> ls1 = driver.findElements(By.xpath("//th"));

		// find all row value
		List<WebElement> ls2 = driver.findElements(By.xpath("//tr"));

		// find tabe index number
		List<WebElement> lsid = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

		for (WebElement list : ls) {
			String alllist = list.getText();
			// System.out.println(alllist);
		}

		for (WebElement list1 : ls1) {
			String alllist1 = list1.getText();
			// System.out.println(alllist1);
		}

		for (WebElement list2 : ls2) {
			alllist2 = list2.getText();
			System.out.println(alllist2 + " ");
		}

		String[] str = alllist2.split(" ");

		String p = str[1];
		System.out.println("firts index position : " + p);

		for (int i = 0; i < alllist2.length() - 1; i++) {
			// String m=str[i];
			// System.out.println(m);
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (WebElement listnum : lsid) {
			String listid = listnum.getText();
		//	System.out.println(listid);

			id = Integer.parseInt(listid);
			arr.add(id);
			
			System.out.println("String id : " +listid + " int id Num : " + id);

		}
		// arraylist used to compare the sequence of the number
		
		//Collections.sort(arr);
		//Collections.reverse(arr);
		//System.out.println("List in reveser order: " +arr);
		
		System.out.println("arraylist" + arr);
	
		for (int i = 0; i < arr.size(); i++) {
			// System.out.println("Array loop: "+i);
			//System.out.println("Arraya index object: " + arr.get(i));
		
			if (arr.get(i).equals(i + 1)) {
				System.out.println("Arr:TC is pass");
			} else {
				System.out.println("Arr:tc is Fail");
			}

		}

	}
}
