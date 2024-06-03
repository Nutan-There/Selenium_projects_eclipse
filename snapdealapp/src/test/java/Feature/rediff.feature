Feature: Search Functinality

Scenario Outline: Check the search functionality for rediff
Given user is on home page
When user gives <keyword> in search field
And user click on search icon
Then search data should be displayed

Examples:
|keyword|
|manipur|
|modi|