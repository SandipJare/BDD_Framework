package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass_BDD_FB {

	public static WebDriver driver;

	public static void intilization(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		}
		if (browsername.equalsIgnoreCase("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			driver = new ChromeDriver(opt);
		} else {
		}
		System.err.println("please enter the standard browser name");
		driver.manage().window().maximize();

		// 4. implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 5. pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// 6. delete all cookies
		driver.manage().deleteAllCookies();
	}

}
