Feature: Edit Lead

Scenario Outline: Edit lead which is already existig in TestLeaf(Positive)

Given Open the browser
And Maximize the browser
And Set the timeout
And Enter the url for TestLeaf
And Enter the username as <userName>
And Enter the password as <passWord>
And Click on Login button
And Click on CRMSFA link
And Click on Lead tap
And Click on Find lead option
And Enter the Firstname as <fName>
And Click on Find Lead button to search
And Select the first option
And Click on Edit button
And Add Descriptions as <description>
And Click on update button
When Verify edit lead created successfully
Then Close the browser

Examples:
|userName|passWord|fName|description|
|DemoCSR|crmsfa|Ravi|Edit Lead|