package com.purna.stepdefinitions;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.testng.Assert;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.HRHomePage;
import com.purna.pages.LoginPage;
import com.purna.pages.PayslipPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewPayslip_Stepdefinition extends Utilities{
	
		private WebDriver driver;
		private TestContext testContext;
		LoginPage onLoginPage;
		HRHomePage onHRHomePage;
		PayslipPage onPayslipPage;

		public ViewPayslip_Stepdefinition(TestContext context) {
	
	
			testContext = context;
			driver = testContext.getDriver();
			onLoginPage = new LoginPage(driver);
			onHRHomePage = new HRHomePage(driver);
			onPayslipPage = new PayslipPage(driver);
		}

		
		@When("user clicks on View Generated Payslips button")
		public void user_clicks_on_view_generated_payslips_button() {
		    
			onHRHomePage.button_viewPayslip.sendKeys(Keys.ENTER);
			//Thread.sleep(3000);
		}
	
		
		@Then("user should be able to see list of generated payslips")
		public void user_should_be_able_to_see_list_of_generated_payslips() {
			
			//System.out.println(driver.getCurrentUrl());
			//https://purnadata.in/complete-hr-module/superuser/employee_list.php
			 Assert.assertEquals("https://purnadata.in/complete-hr-module/superuser/old_payslips.php?month=Jan&year=2023", driver.getCurrentUrl());
		}
	}
