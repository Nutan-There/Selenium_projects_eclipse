Feature: create account functionality

Scenario: validate create account form
Given user is on create account page
When user enters full_name , mailId , password , alternateMailId , mobileNo
|Nutan There|
|nutan@gmail.com|
|nutan1234|
|nutan1234|
|nutan123@gmail.com|
|9075850736|
And click on create my account button
Then The message box should display