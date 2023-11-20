package StepDefinition;

import PageObjects.GPServiceHomePage;
import io.cucumber.java.en.When;

public class GPHomeStepDefinition {

	@When("user click on talk to doctor on home page")
	public void userClickOnTalkToDoctor() {
	  GPServiceHomePage gpServiceHomePage = new GPServiceHomePage();
	  gpServiceHomePage.talktoDoctor.click();
	}
}
