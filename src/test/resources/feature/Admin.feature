Feature: Create a new job title

Background:
Given user is on the admin page

Scenario: Create a job title with valid details

When user clicks the job dropdown
And user selects the  job titles
And user clicks the add button 
And user enter a valid  jobtitle
And user enter a valid  job description
And user click the save button 
Then The new job title should be added successfully


