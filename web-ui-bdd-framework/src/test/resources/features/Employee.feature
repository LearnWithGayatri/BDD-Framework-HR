Feature: Purna HR Employee functionality
  I want to validate the Employee functionality
 
 @TestHREmp
Scenario Outline: Verify that employee is created successfully
Given user is logged into Purna application "<TestCase_ID>" "Employee"
When user clicks on employee dashboard link
When user clicks on add employee button
When user enters employee details
When user cliks on emp save button
When user clicks on emp popup ok button
Then new employee should be created
 
 Examples:
 | TestCase_ID |
 | Purna_TC_013|
 
 
 