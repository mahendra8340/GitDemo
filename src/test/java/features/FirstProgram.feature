
Feature: Application Login
  I want to use this template for my feature file
	
	
	Background:
	Given setup the entries
	When launch the browser
	
	
	@SmokeTest
  Scenario: Admin Page default login
  Given User is on Netbanking landing page
  When User loign into application with "Admin" and "Abcd"
  Then Home page is displayed  And card are displayed
  
  
  @SmokeTest
  Scenario: User Page default login
  Given User is on Netbanking landing page
  When User loign into application with "User" and "Abcd"
  Then Home page is displayed  And card are displayed
  
  
  @Outline  
  Scenario Outline: User Page default login
  Given User is on Netbanking landing page
  When User loign into application with "<Username>" and "<Password>"
  Then Home page is displayed  And card are displayed
  
  Examples:
  | Username | Password |
  | Admin 	 | abcd     |
  | carduser | efgh			|
  
  
  @SmokeTest @Outline
  Scenario: User page defaut signup
  Given User is on singup page
  When user signup in the application
  |firstname|
  |Lastname|
  |a@a.com|
  |213133123|
  Then Home page is displayed 
  
  
  
  Scenario Outline: SignUp page parameterization
  
  Given User is on singup page
  When user signup in the application
  |<FirstName>|
  |<LastName>|
  |<Email>|
  |<Phone>|
  Then Home page is displayed
  
  Examples:
  |FirstName|LastName|Email|Phone|
  |FirstName1|LastName1|Email1|12345|
  |FirstName2|LastName2|Email2|12346|
  |FirstName3|LastName3|Email3|12347|
  |FirstName4|LastName4|Email4|12348|