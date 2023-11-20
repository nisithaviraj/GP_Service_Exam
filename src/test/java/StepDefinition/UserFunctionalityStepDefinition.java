package StepDefinition;

import Functions.UserSignUp;
import PageObjects.BasePageObject;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserFunctionalityStepDefinition {

	@Given("user navigate to the sign in page")
	public void userNavigateToSignInPage() throws InterruptedException {
		UserSignUp.navigateToSignInPage();
	}

	@When("user log in to the System with {string} and {string}")
	public void uselogInToSystem(String userName, String password) throws InterruptedException {
		UserSignUp.userLogin(userName, password);
	}

//	@After
//	public void closeBrowser() {
//		BasePageObject.driver.close();
//	}
}
