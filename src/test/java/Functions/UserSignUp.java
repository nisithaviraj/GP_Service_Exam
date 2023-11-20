package Functions;

/*
This class handles the Common functions of user Sign Up Page.
*/

import org.openqa.selenium.JavascriptExecutor;
import Constants.AppDetails;
import PageObjects.BasePageObject;
import PageObjects.SignInPage;
import PageObjects.SignUpBasicDetailsPage;
import PageObjects.SignUpMoreDetailsPage;

public class UserSignUp {

	public static void navigateToSignInPage() throws InterruptedException {
		
		BasePageObject.getChromeDriver();
		BasePageObject.driver.get(AppDetails.loginUrl);
		
		SignInPage signInPage = new SignInPage();
		Thread.sleep(2000);
		if (signInPage.acceptAllCookies.isDisplayed()) {
			signInPage.acceptAllCookies.click();
		}

	}

	public static void submituserBasicDetails(String email, String mobileNumber, String password,
			String confirmpassword) throws InterruptedException {

		SignInPage signInPage = new SignInPage();
		SignUpBasicDetailsPage basicDetailsPage = new SignUpBasicDetailsPage();

		signInPage.signUpNow.click();
		basicDetailsPage.email.sendKeys(email);
		basicDetailsPage.phoneNumber.sendKeys(mobileNumber);
		basicDetailsPage.password.sendKeys(password);
		basicDetailsPage.confirmPassword.sendKeys(confirmpassword);

		Actions.javaScriptClick(basicDetailsPage.confirmBox);
		basicDetailsPage.nextButton.click();
		Thread.sleep(5000);
	}

	public static void submitUserMoreDetails(String firstName,String lastName,String dob,String gender,String postalCode,String addline,String town) throws InterruptedException {
		SignUpMoreDetailsPage moreDetailsPage = new SignUpMoreDetailsPage();
		
		moreDetailsPage.firstName.sendKeys(firstName);
		moreDetailsPage.lastName.sendKeys(lastName);
		
		Actions.selectValuesFromCombo(moreDetailsPage.day, dob.split("-")[0].toString());
		Actions.selectValuesFromCombo(moreDetailsPage.month, dob.split("-")[1].toString());
		Actions.selectValuesFromCombo(moreDetailsPage.year, dob.split("-")[2].toString());
		
		if(gender.equals("Male")) {
			moreDetailsPage.male.click();
		}else {
			moreDetailsPage.female.click();
		}
		
		moreDetailsPage.postCode.sendKeys(postalCode);
		Actions.selectValuesFromCombo(moreDetailsPage.userAddress, "Enter address manually");
		moreDetailsPage.addressLine1.sendKeys(addline);
		moreDetailsPage.addressCity.sendKeys(town);
		moreDetailsPage.nextButton.click();
	
	}
	
	public static void userLogin(String userName,String password) throws InterruptedException {
		SignInPage signInPage = new SignInPage();
		
		signInPage.email.sendKeys(userName);
		signInPage.password.sendKeys(password);
		signInPage.signIn.click();
		Thread.sleep(4000);
		
	}
}