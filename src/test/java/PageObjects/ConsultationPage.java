package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultationPage extends BasePageObject {

	public ConsultationPage() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),' Choose a different day ')]")
	public WebElement chooseDifferentDate;

	@FindBy(xpath = "//button[contains(text(),' Show all times ')]")
	public WebElement chooseDifferentTime;

	@FindBy(xpath = "//h1[contains(text(),'Book Your Consultation')]")
	public WebElement consultationPage;

	public void clickdifferentDateTime(String value) {
		BasePageObject.driver.findElement(By.xpath("//button[contains(text(),'" + value + "')]")).click();
	}

}
