package Functions;

/*
	This class handles the Common functions of Consult Doctor Page.
*/

import PageObjects.ConsultationPage;
import PageObjects.GPServiceHomePage;

public class ConsultDoctor {

	public void selecDates(String date,String time) {
		GPServiceHomePage gpServiceHomePage = new GPServiceHomePage();
		ConsultationPage consultationPage = new ConsultationPage();
		
		gpServiceHomePage.talktoDoctor.click();
		consultationPage.chooseDifferentDate.click();
		consultationPage.clickdifferentDateTime(date);
		consultationPage.chooseDifferentTime.click();
		consultationPage.clickdifferentDateTime(time);
		
	}
}
