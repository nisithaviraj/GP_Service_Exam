package Functions;

/*
    This Action class handles the Common functions of the Automation Project
*/

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageObjects.BasePageObject;

public class Actions {

	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) BasePageObject.driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public static void scrollToElement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) BasePageObject.driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void selectValuesFromCombo(WebElement element, String value) throws InterruptedException {
		Select select = new Select(element);
		Thread.sleep(2000);
		select.selectByVisibleText(value);
	}

}
