package Functions;

/*
	This class handles the Common functions of Consultation Page.
*/

import PageObjects.ConsultationPage;

public class Consultation {

	public static void addConsultationDetails(String date, String time) throws InterruptedException {
		ConsultationPage consultationPage = new ConsultationPage();

		Thread.sleep(2000);
		consultationPage.chooseDifferentDate.click();
		consultationPage.clickdifferentDateTime(date);
		consultationPage.chooseDifferentTime.click();
		consultationPage.clickdifferentDateTime(time);
	}
}
