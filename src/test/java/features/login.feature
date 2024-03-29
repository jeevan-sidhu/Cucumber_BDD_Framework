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
@important
Feature: Testing Login form

Background: Homepage
Given User must be on page url "https://demo.applitools.com/"

  @smoke
  Scenario Outline: Checking functionality of Login form
    When User enters valid <username> and <password>
    And clicks on sign in button
    Then User must be logged into his account

    Examples: 
      | username | password |
      | admin    | admin123 |
      | jeevan   | jvn1234  |
      | sidhu    | sid1234  |
