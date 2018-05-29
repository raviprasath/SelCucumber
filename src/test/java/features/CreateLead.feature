Feature: Create Lead

Scenario: Create a new lead in TestLeaf(Positive)

Given Open the browser
And Maximize the browser
And Set the timeout
And Enter the url for TestLeaf
And Enter the username
And Enter the password
And Click on Login button
And Click on CRMSFA link
And Click on Lead tap
And Click on Create Lead option
And Enter the Company Name
And Enter the Firstname
And Enter the Lastname
And Click on Create Lead button
When Verify create lead created successfully
Then Close the browser