Feature: UserEnterInvalidCreditCardnumber
  This feature file is to verify user enter invalid card number

  Scenario Outline: UserConsultDoctorWithValidDetails
    # Given user navigate to the sign in page
    When user log in to the System with "<username>" and "<password>"
    And user click on talk to doctor on home page
    And user select "<date>" and "<time>" on consultation page
    And user submit data "<description>","<imege>","<postcode>","<pharmacy>" on Consultation page
    And user submit data "<cardNumber>","<expdate>","<cvc>" on payment page
    Then user should dispaly the invalid card message

    Examples: 
      | username             | password    | date          | time    | description     | imege         | postcode | pharmacy         | cardNumber       | expdate | cvc |
      | ruby1@mailinator.com | Shakila@123 | 25th November | 2:45 pm | TestDescription | MedicalSc.JPG | WC2N 5DU | 232 High Holborn | 6271701225979642 |    1223 | 258 |
