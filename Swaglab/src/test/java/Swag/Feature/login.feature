Feature: Validate Login Functionality for swag labs application

Scenario Outline: check the login functionality for valid data

Given user is on the login page of swag labs
When user enter <username> & <password>
And user clicks on login button
Then login should be successful

Examples:
|username|password|
|standard_user|secret_sauce|
