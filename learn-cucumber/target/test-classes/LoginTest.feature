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

Feature: user login
	a user logs into the system

Scenario: a user logs in with a credential
  Given the user is in the <loginPage>
  When the user gives "userName" and "password"
  And the user click "login" button 
  Then the credential is checked 
  When the credential is valid
  Then the user is redirected to <operationPage>
  When the credential is not valid
  Then the user is redirected to <loginPage> with a error message 

 