Feature: Testing User login and profile

  Scenario: Check ability to login with correct username and password
  
  	Given I Open Browser
    Given I Enter URL as "http://operatorptsdemo.devmll.com/users/sign_in"
    And I fill "Username" field with text "samariya.praveen@mahindra.com"
    And I fill "Password" field with text "m00ve4wd"
    When I click on Submit
