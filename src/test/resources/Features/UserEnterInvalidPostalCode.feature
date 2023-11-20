Feature: UserEnterInvalidPostalCode
  This feature file is to verify user should display invalid postal code message

  Scenario Outline: UserConsultDoctorWithValidDetails
    Given user navigate to the sign in page
    When user log in to the System with "<username>" and "<password>"
    And user click on talk to doctor on home page
    And user select "<date>" and "<time>" on consultation page
    And user submit data "<description>","<imege>","<postcode>","<pharmacy>" on Consultation page
    Then user should display invalid postal code message

    Examples: 
      | username             | password    | date          | time    | description     | imege         | postcode |
      | ruby1@mailinator.com | Shakila@123 | 25th November | 2:45 pm | TestDescription | MedicalSc.JPG | WC2N 5DU |
