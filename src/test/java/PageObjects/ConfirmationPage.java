package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BasePageObject{

	public ConfirmationPage() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(xpath = "//h2[contains(text(),'Thank you for your order')]")
	public WebElement confirmationMessage;
}
