Feature: Login 

Background:
Given User is on the login page 

Scenario: Valid inputs 
#Given User is on the login page
When User enters valid "<username>" and "<password>"
And User click the login button 
Then User page should navigate to the dashboard page

Scenario: invalid inputs
#Given user is on the login page 
When user enter a invalid username and password
And user click the login button
Then user should  receive invalid  username and password

Scenario: Test with empty field 
When user not enter username and password
And user click the login button 
Then user should recieve require eror message

Scenario Template:
Examples:

      |username|password|
      |Admin   |admin123|


