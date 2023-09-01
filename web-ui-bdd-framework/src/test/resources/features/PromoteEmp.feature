Feature: Purna HR Promote Employee functionality
  I want to validate the Employee Promote functionality
  
  @TestHREmpPromote
    Scenario Outline: Verify that employee is promoted successfully
    Given user is logged into Purna application "<TestCase_ID>" "Employee Promote"
    When user clicks on employee dashboard link
    When user clicks on Promote Employee link
    When user enters on Employee Promotion details
    When user clicks on Promote employee Ok popup
  	Then employee should be promoted
  	
  	 
   Examples:
 | TestCase_ID |
 | Purna_TC_015|