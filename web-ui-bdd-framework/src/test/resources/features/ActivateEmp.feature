Feature: Purna HR Activate Employee functionality
I want to validate the Employee Deactivate functionality

@TestHREmpActivate

Scenario Outline: Verify that employee is activated successfully
Given user is logged into Purna application "<TestCase_ID>" "Employee Deactivate"
When user clicks on employee dashboard link
When user clicks on Ex-Employees link
When user clicks on Activate Employee link
When user clicks on Acrivate Employee popup ok button
Then Employee should be activated

Examples:
 | TestCase_ID |
 | Purna_TC_017|