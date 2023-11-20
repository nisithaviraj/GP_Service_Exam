package StepDefinition;

import Functions.PaymentDetails;
import PageObjects.BasePageObject;
import PageObjects.ConfirmationPage;
import PageObjects.PaymentPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PaymentStepDefinition {

	@When("user submit data {string},{string},{string} on payment page")
	public void userSubmitPaymentDetails(String cardnumber, String expdate, String cvc) throws InterruptedException {
		PaymentDetails.submitPaymentDetails(cardnumber, expdate, cvc);
	}

	@Then("user should be able to make payment sucessfully")
	public void user_should_be_able_to_make_payment_sucessfully() {
		ConfirmationPage confirmationPage = new ConfirmationPage();
		Assert.assertTrue(confirmationPage.confirmationMessage.isDisplayed());
	}

	@Then("user should dispaly the invalid card message")
	public void user_should_dispaly_the_invalid_card_message() {
		PaymentPage paymentPage = new PaymentPage();
		Assert.assertTrue(paymentPage.invalidCardMessage.isDisplayed());
	}

	@After
	public void closeBrowser() {
		BasePageObject.driver.close();
	}

}
