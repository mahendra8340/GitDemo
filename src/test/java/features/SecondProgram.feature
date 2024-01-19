
Feature: Application Login
  I want to use this template for my feature file
	
	
	Background:
	When launch the browser
	
	
	@SmokeTest @netBanking @secondFeature
  Scenario: Admin Page default login
  Given User is on Netbanking landing page
  When User loign into application with "Admin" and "Abcd"
  Then Home page is displayed  And card are displayed
  
  
  @SmokeTest @mobileBanking @secondFeature
  Scenario: User Page default login
  Given User is on Netbanking landing page
  When User loign into application with "User" and "Abcd"
  Then failedcase
  
  
 