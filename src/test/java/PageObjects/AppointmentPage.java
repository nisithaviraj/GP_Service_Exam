package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage extends BasePageObject {

	public AppointmentPage() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(id = "presentingComplaint")
	public WebElement description;

	@FindBy(xpath = "//label[contains(text(),' Upload documents ')]")
	public WebElement uploadImage;

	@FindBy(name = "postcode")
	public WebElement postcode;

	@FindBy(xpath = "//button[contains(text(),'Find Pharmacies ')]")
	public WebElement findPharmacies;

	@FindBy(xpath = "//button[contains(text(),' Confirm Appointment')]")
	public WebElement confirmAppointment;

	@FindBy(xpath = "//div[contains(text(),'The postcode that you entered is not valid')]")
	public WebElement invalidPostalCodeMessage;

	@FindBy(xpath = "//button[contains(text(),'Change consultation')]")
	public WebElement changeConsultation;

	public void clickSelectedPharmacy(String value) throws InterruptedException {
		Thread.sleep(5000);
		BasePageObject.driver.findElement(By.xpath("//address[contains(text(),'" + value + "')]/ancestor::li[1]"))
				.click();
	}
}
