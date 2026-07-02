Feature: logout

Scenario Outline:
Given  user should logged into the application

Scenario: logout successfuly
When user  navigate to the profile page 
And user  click the logout button
Then user should navigate to the login page

