Feature: Create Lead

@Smoke
Scenario Outline: Create a new lead in TestLeaf(Positive)

And Enter the username as <userName>
And Enter the password as <passWord>
And Click on Login button
And Click on CRMSFA link
And Click on Lead tap
And Click on Create Lead option
And Enter the Company Name as <companyName>
And Enter the Firstname as <fName>
And Enter the Lastname as <lName>
When Click on Create Lead button
Then Verify create lead created successfully

Examples:
|userName|passWord|companyName|fName|lName|
|DemoCSR|crmsfa|TCS|Ravi|R|