#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: User management / access management

  @validLogin
  Scenario: User should be able to login with valid credentials
    Given As a user, I am on the login page
    When I enter valid username and valid password
    And click on the login button
    Then I should be logged in

  @invalidEmailLogin
  Scenario: Invalid email login attempts
    Given As a user, I am on the login page
    When I enter invalid username and valid password
    And Click on login button
    Then I should see an error message "These credentials do not match our records." displays
    And I should not be logged in
    
    
  @invalidEmailLoginWithDynamicData
  Scenario: Invalid email login attempts
    Given As a user, I am on the login page
    When I enter invalid "<email>" and valid "<password>"
    And Click on login button
    Then I should see an error message "These credentials do not match our records." displays
    And I should not be logged in
    
    Examples: login credentials data
    | email                          | password          | 
    | helil@primetechschool.com      | standardhhfvajk   | 
    | nothing@primetechschool.com    | Testing123        |
    |                                | Testing123        |
    | nothing@primetechschool.com    |                   |
