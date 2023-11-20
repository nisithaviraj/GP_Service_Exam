package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GPServiceHomePage extends BasePageObject {

	public GPServiceHomePage() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(xpath = "//div[@class='intro_text']/.//a[1]")
	public WebElement talktoDoctor;

}
