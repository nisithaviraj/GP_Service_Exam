package StepDefinition;

import Functions.UserSignUp;
import PageObjects.BasePageObject;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserSignUpStepDefinition {

	@When("user submit {string},{string},{string},{string} basic sign up details on  sign up page")
	public void user_submit_basic_sign_up_details_on_sign_up_page(String email, String mobileNumber, String password,
			String confirmPassword) throws InterruptedException {
		UserSignUp.submituserBasicDetails(email, mobileNumber, password, confirmPassword);
	}

	@When("user submit {string},{string},{string},{string},{string},{string},{string} more sign up details on  sign up page")
	public void user_submit_more_sign_up_details_on_sign_up_page(String firstName, String lastName, String dob,
			String gender, String postalCode, String addline, String town) throws InterruptedException {
		UserSignUp.submitUserMoreDetails(firstName, lastName, dob, gender, postalCode, addline, town);
	}

//	@After
//	public void closeBrowser() {
//		BasePageObject.driver.close();
//	}
}
