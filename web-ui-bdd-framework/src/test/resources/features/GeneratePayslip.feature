Feature: Purna HR Generate Payslip functionality
	I want to validate the Generate Payslip functionality

	@TestHRGeneratePayslip

	Scenario Outline: Verify that payslip is generated successfully
  Given user is logged into Purna application "<TestCase_ID>" "Generate Payslip"
	When user clicks on Generate Payslip link
	When user selects Salary Month
	When user clicks on Generate Payslip button
	When user enters Salary Details
	When user clicks on Calculate button to get Net Salary
	When user clicks on Generate Payslip Save button
	Then payslip should be generated


  Examples:
 | TestCase_ID |
 | Purna_TC_016 |