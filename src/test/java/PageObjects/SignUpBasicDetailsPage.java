package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpBasicDetailsPage extends BasePageObject {

	public SignUpBasicDetailsPage() {

		PageFactory.initElements(super.driver, this);

	}

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(name = "phone")
	public WebElement phoneNumber;

	@FindBy(id = "rpassword")
	public WebElement password;

	@FindBy(name = "cpassword")
	public WebElement confirmPassword;

	@FindBy(name = "marketingConsent")
	public WebElement confirmBox;

	@FindBy(xpath = "//button[contains(text(),'NEXT')]")
	public WebElement nextButton;

}
