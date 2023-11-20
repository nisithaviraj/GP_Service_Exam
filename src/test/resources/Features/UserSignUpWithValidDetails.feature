Feature: UserSignUpWithValidDetails

  Scenario Outline: user Sign Up With Valid Details
    Given user navigate to the sign in page
    When user submit "<emailaddress>","<mobilenumber>","<passsword>","<confirmpassword>" basic sign up details on  sign up page
    And user submit "<firstname>","<lastname>","<dob>","<gender>","<postcode>","<addressline1>","<town>" more sign up details on  sign up page

    Examples: 
      | emailaddress         | mobilenumber | passsword  | confirmpassword | firstname | lastname    | dob       | gender | postcode | addressline1 | town   |
      | testexa21m@gmail.com |   1236478921 | Gpexam@123 | Gpexam@123      | test User | test User l | 12-2-1978 | Male   | WC2N 5DU | London       | London |
