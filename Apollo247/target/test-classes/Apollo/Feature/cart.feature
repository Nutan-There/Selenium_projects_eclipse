Feature: validate Cart Functionality for Apollo 24/7 application

  @tag1
  Scenario: check the cart functionality
    Given user should be on home page of apollo247
    When user should click the cart icon
    Then user should land on test cart page

  @tag2
  Scenario: check the lab tests functionality
    Given user should be on home page of apollo247
    When user clicks on Book Lab Tests
    And user should click on complete blood count add button
    And user should click on go to cart
    And user should enter <number>
    And user click on log button
    And user should be logged in
    And user should click on icon
    And user should click on proceed to cart button
    And user should land on selected patients page
    And user should click on patients name
    #And user should click on continue button
    Then user should click the done button

  
   
