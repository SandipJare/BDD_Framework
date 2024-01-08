package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	//Reusable script code for check element displayed status and enabled status and enter the value  in text box
		public static void sendKeys(WebElement wb,String value)
		{
			if(wb.isDisplayed()&&wb.isEnabled())
			{
				wb.sendKeys(value);
			}
		}
		
		//Reusable script code for select gender
		public static void selectGender(List<WebElement> ls,String gender)
		{
			for(WebElement wb: ls)
			{
				if(wb.getText().equalsIgnoreCase(gender))
				{
					wb.click();
					break;
				}
			}
		}
		
}
