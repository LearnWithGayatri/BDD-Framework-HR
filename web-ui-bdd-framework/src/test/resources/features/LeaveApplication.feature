Feature: Purna HR Leave Application functionality
	I want to validate the Leave Application functionality

	@TestHRLeaveApplication

	Scenario Outline: Verify that leave application is approved or rejected successfully
  Given user is logged into Purna application "<TestCase_ID>" "Leave Application"
	When user clicks on Leaves Dashboard link
	When user selects Status
	When user clicks on Leave Submit button
	When user clicks on Leave Popup ok
	Then employee should be removed from pending leave application list


  Examples:
 | TestCase_ID |
 | Purna_TC_020 |