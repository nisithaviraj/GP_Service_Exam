package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePageObject {

	public SignInPage() {

		PageFactory.initElements(super.driver, this);
		// driver.get("https://app.alt.thegpservice.com/register/mygp");

	}

	@FindBy(xpath = "//span[contains(text(),'Accept all')]/parent::a")
	public WebElement acceptAllCookies;

	@FindBy(xpath = "//a[contains(text(),' Sign up now')]")
	public WebElement signUpNow;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//button[contains(text(),'SIGN IN')]")
	public WebElement signIn;

}
