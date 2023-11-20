package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePageObject {

	public PaymentPage() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(name = "cardnumber")
	public WebElement cardNumber;

	@FindBy(name = "exp-date")
	public WebElement expiaryDate;

	@FindBy(name = "cvc")
	public WebElement cvcNumber;

	@FindBy(id = "agreeMedication")
	public WebElement agreeMedication;

	@FindBy(id = "personalUse")
	public WebElement personalUse;

	@FindBy(id = "agreeFees")
	public WebElement agreefees;

	@FindBy(xpath = "//button[contains(text(),' Confirm Payment ')]")
	public WebElement confirmPayment;

	@FindBy(xpath = "//div[contains(text(),'Your card was declined. Your request was in test mode, but used a non test card')]")
	public WebElement invalidCardMessage;

}
