# GP_Service_Exam

#Project Structure

1. Packages
      This Test Project Contains 6 packages in the src/test/java
      * Constant - This Packege Contains all the  Constants values in the Application
      * Functions - This Package includes all the reusable Functions of the each page object.
      * PageObjetcs - This Package includes all the Page Objects in the Project.
      * StepDefinition - This package includes all the defines steps of the each Page.
      * TestRunner - This Package includes the Test Runner Class.
      * Features - This is in src/test/resources and contains all the feature files.
      * Images - This folder contains the images that need to upload during the test execution.
      * WebDriver - This  folder contains the chrome driver. 
2. Web Driver Initialitaion - Web Driver initialitation happens in the BasePageObject class in the PageObject Package and inherit to the   
                              each page object
3. Reports  - All the Reports are generated to the target folder in HTML format.
4. compatibility - These test feature files can be executed on chrome browser version 114
 

#Test Scenarios

There are  5 identified scenarios in the Features Folder.
   * UserChangeConsultant.feature - This feature Verify the steps that user clic on the change consultant button on the Appointment page.
   * UserConsultDoctorWithValidDetails.feature - This feature file covers the e2e flow that user make a sucessful Appointment with the                                                     valid card number.
   * UserEnterInvalidCreditCardnumber.feature - This feature file validates the mesages when user enter invalid card number.
   * UserEnterInvalidPostalCode.feature - This feature file validates teh message when user enters the invalid postalcode.
   * UserSignUpWithValidDetails.feature - Tihs feaure file covers the e2e flow of creating a new user. 
