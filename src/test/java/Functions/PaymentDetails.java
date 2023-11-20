package Functions;

/*
	This class handles the Common functions of Payment Page.
*/

import PageObjects.PaymentPage;

public class PaymentDetails {

	public static void submitPaymentDetails(String cardNumber, String expDate, String cvc) throws InterruptedException {
		PaymentPage paymentPage = new PaymentPage();

		Thread.sleep(5000);
		paymentPage.cardNumber.click();
		paymentPage.cardNumber.sendKeys(cardNumber);
		paymentPage.expiaryDate.sendKeys(expDate);
		paymentPage.cvcNumber.sendKeys(cvc);
		paymentPage.agreeMedication.click();
		paymentPage.personalUse.click();
		paymentPage.agreefees.click();
		paymentPage.confirmPayment.click();
	}
}
