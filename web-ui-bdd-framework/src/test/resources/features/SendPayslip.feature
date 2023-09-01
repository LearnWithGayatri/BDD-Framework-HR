Feature: Purna HR Send Payslip functionality
	Validate send payslip functionality
	
	@TestHRSendPayslip
	
	Scenario Outline: Verify that payslip is seen succeesfully	
Given user is logged into Purna application "<TestCase_ID>" "Send Payslip"
When user clicks on Generate Payslip link
When user selects Salary Month
When user clicks on View Generated Payslips button
When user clicks on Download button
Then user should be able to download payslip

 Examples:
 | TestCase_ID |
 | Purna_TC_019|