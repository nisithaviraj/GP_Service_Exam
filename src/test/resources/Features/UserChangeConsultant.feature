Feature: UserChangeConsultant
  This feature file is to verify wether user can change consultant sucessfully.

  Scenario Outline: UserChangeConsultant
    Given user navigate to the sign in page
    When user log in to the System with "<username>" and "<password>"
    And user click on talk to doctor on home page
    And user select "<date>" and "<time>" on consultation page
    And user click on change consultant button
    Then user navigate to consultant page

    Examples: 
      | username             | password    | date          | time    |
      | ruby1@mailinator.com | Shakila@123 | 25th November | 2:45 pm |
