package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constants.AppDetails;

//import Constants.Constants;

public class BasePageObject {
	public static WebDriver driver = null;

	public static void getChromeDriver() {

		System.setProperty("webdriver.chrome.driver", AppDetails.webDiver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
