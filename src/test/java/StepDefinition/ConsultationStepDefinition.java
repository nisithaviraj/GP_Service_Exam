package StepDefinition;

import org.junit.Assert;

import Functions.Consultation;
import PageObjects.BasePageObject;
import PageObjects.ConsultationPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsultationStepDefinition {

	@When("user select {string} and {string} on consultation page")
	public void userSubmitConsultationDetails(String date, String time) throws InterruptedException {
		Consultation.addConsultationDetails(date, time);
	}

	@Then("user navigate to consultant page")
	public void userNavigateToConsultantPage() {
		ConsultationPage consultationPage = new ConsultationPage();
		Assert.assertTrue(consultationPage.consultationPage.isDisplayed());
	}

//	@After
//	public void closeBrowser() {
//		BasePageObject.driver.close();
//	}
}
