Feature: Create Lead

Background:
Given Open the browser
And Maximize the browser
And Set the timeout
And Enter the url for TestLeaf

@Smoke
Scenario Outline: Create a new lead in TestLeaf(Positive)

And Enter the username as <userName>
And Enter the password as <passWord>
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

Examples:
|userName|passWord|
|DemoCSR|crmsfa|
|DemoCSR|crmsfa|

Scenario: Create a new lead in TestLeaf(Negative)

And Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click on Login button
And Click on CRMSFA link
And Click on Lead tap
And Click on Create Lead option
And Enter the Company Name
And Enter the Firstname
And Enter the Lastname
When Click on Create Lead button
But Verify create lead created successfully
Then Close the browser