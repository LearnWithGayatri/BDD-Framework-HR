Feature: Purna HR View Payslip functionality
	Validate view payslip functionality
	@TestHRViewPayslip
	
	
Scenario Outline: Verify that payslip is seen succeesfully	
Given user is logged into Purna application "<TestCase_ID>" "View Payslip"
When user clicks on Generate Payslip link
When user selects Salary Month
When user clicks on View Generated Payslips button
Then user should be able to see list of generated payslips

 Examples:
 | TestCase_ID |
 | Purna_TC_018|