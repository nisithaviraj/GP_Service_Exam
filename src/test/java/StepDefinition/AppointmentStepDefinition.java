package StepDefinition;

import Functions.Appointment;
import PageObjects.AppointmentPage;
import PageObjects.BasePageObject;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AppointmentStepDefinition {

	AppointmentPage appointmentPage = new AppointmentPage();

	@When("user submit data {string},{string},{string},{string} on Consultation page")
	public void userSubmitAppointmentDetails(String description, String image, String postcode, String pharmacy)
			throws InterruptedException {
		Appointment.submitAppointmentDetails(description, image, postcode, pharmacy);
	}

	@Then("user should display invalid postal code message")
	public void user_should_display_invalid_postal_code_message() {
		Assert.assertTrue(appointmentPage.invalidPostalCodeMessage.isDisplayed());
	}

	@When("user click on change consultant button")
	public void userClickOnConsultant() {
		appointmentPage.changeConsultation.click();
	}

	

//	@After
//	public void closeBrowser() {
//		BasePageObject.driver.close();
//	}
}
