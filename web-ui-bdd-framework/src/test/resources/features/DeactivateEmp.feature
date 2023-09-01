Feature: Purna HR Deactivate Employee functionality
  I want to validate the Employee Deactivate functionality
  
  @TestHREmpDeactivate
  
  Scenario Outline: Verify that employee is deactivated successfully
  Given user is logged into Purna application "<TestCase_ID>" "Employee Deactivate"
  When user clicks on employee dashboard link
  When user clicks on Deactivate Employee link
  When user clicks on deactivate employee Ok popup
  Then employee should be deactivated 
  
   Examples:
 | TestCase_ID |
 | Purna_TC_014 |