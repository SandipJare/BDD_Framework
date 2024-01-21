package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.Wait;

public class HomePageClass extends BaseClass {

	@FindBy(xpath = "//img[@src='/web/images/orangehrm-logo.png?v=1689053487449']")
	WebElement pageLogoImg;

	@FindBys(@FindBy(xpath = "//a"))
	List<WebElement> WebLinks;

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pimLinks;

	public HomePageClass() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {

		return driver.getTitle();
	}

	public String homePageUrl() {

		return driver.getCurrentUrl();

	}

	public boolean homePageLogo() throws InterruptedException {

		Thread.sleep(3000);
		String homeaPgLogoSource = pageLogoImg.getAttribute("src");
		// System.out.println("homePageLogo:" + homeaPgLogoSource);
		if (homeaPgLogoSource.contains("orangehrm-logo")) {
			return true;
		}
		return false;
	}

	public void clickOnPIMPageLink() {

		System.out.println("Total Links on pages:" + WebLinks.size());

		for (WebElement linkwb : WebLinks) {
			String pageLinks = linkwb.getAttribute("href");
			System.out.println(pageLinks);

			if (pageLinks.contains("pim")) {
				// Wait.click(linkwb);
				linkwb.click();
			}
		}

	}

	public void clickOnPIMPageLink1() {

		System.out.println("Total Links on pages:" + WebLinks.size());
		Wait.click(pimLinks);
	}

}
