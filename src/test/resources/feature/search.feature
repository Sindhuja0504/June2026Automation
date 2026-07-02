Feature: Search Employee

Scenario Outline:
Given user is on the search page 

Scenario: Search employee with name 
When user enter the "<Ename>" name
And user click the search icon
Then employee details should view 

Scenario Template:
Examples:
|Ename|
|Sindhuja|

