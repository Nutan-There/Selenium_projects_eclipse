@login
Feature: validate Login Functionality for Apollo 24/7 application

Background: 
Given user should be on the login icon 

@log1
Scenario Outline: check the login functionality for valid data
When user enter <mobile_number> to login
And user click on login button
And user enter the otp
And user click on login button1
Then login should be successful

Examples:
|mobile number|
|9075850736|


@log2
Scenario: check the login functionality for invalid data 
When user enter <mobile_no> to login1
|9075850736|
And user click on login button2
And user enter the invalid otp
And user click on login button3
Then error msg should be displayed 





