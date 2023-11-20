package Functions;

/*
	This class handles the Common functions of Appointment Page.
*/

import PageObjects.AppointmentPage;

public class Appointment {

	public static void submitAppointmentDetails(String description,String image,String postcode,String pharmacy) throws InterruptedException {
		AppointmentPage appointmentPage = new AppointmentPage();
		
		appointmentPage.description.sendKeys(description);
		Thread.sleep(5000);
		Actions.scrollToElement(appointmentPage.uploadImage);
		appointmentPage.uploadImage.sendKeys("src/test/resources/Features/Images/"+image);
		Actions.scrollToElement(appointmentPage.postcode);
		appointmentPage.postcode.sendKeys(postcode);
		Actions.scrollToElement(appointmentPage.findPharmacies);
		appointmentPage.findPharmacies.click();
		appointmentPage.clickSelectedPharmacy(pharmacy);
		Actions.scrollToElement(appointmentPage.confirmAppointment);
		appointmentPage.confirmAppointment.click();
	}
}
