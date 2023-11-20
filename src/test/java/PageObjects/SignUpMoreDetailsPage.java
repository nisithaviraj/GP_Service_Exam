package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpMoreDetailsPage extends BasePageObject {

	public SignUpMoreDetailsPage() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(name = "day")
	public WebElement day;

	@FindBy(name = "month")
	public WebElement month;

	@FindBy(name = "year")
	public WebElement year;

	@FindBy(xpath = "//button[contains(text(),'Male')]")
	public WebElement male;

	@FindBy(xpath = "//button[contains(text(),'Female')]")
	public WebElement female;

	@FindBy(name = "patientPostcodeInput")
	public WebElement postCode;

	@FindBy(id = "userAddressInput")
	public WebElement userAddress;

	@FindBy(id = "addressLine1")
	public WebElement addressLine1;

	@FindBy(id = "addressLine2")
	public WebElement addressLine2;

	@FindBy(id = "addressCity")
	public WebElement addressCity;

	@FindBy(id = "addressCounty")
	public WebElement addressCounty;

	@FindBy(xpath = "//button[contains(text(),'NEXT')]")
	public WebElement nextButton;

	@FindBy(xpath = "//h3[@class='head-text']")
	public WebElement noteMessage;

}
