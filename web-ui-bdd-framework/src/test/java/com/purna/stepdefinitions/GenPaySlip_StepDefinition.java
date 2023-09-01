package com.purna.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.HRHomePage;
import com.purna.pages.LoginPage;
import com.purna.pages.PayslipPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GenPaySlip_StepDefinition extends Utilities {
	
		private WebDriver driver;
	    private TestContext testContext;
	    LoginPage onLoginPage;
	    HRHomePage onHRHomePage;
	    PayslipPage onPayslipPage;
	
	public GenPaySlip_StepDefinition(TestContext context) {
		
		
		testContext = context;
    	driver = testContext.getDriver();
		onLoginPage = new LoginPage(driver);
		onHRHomePage = new HRHomePage(driver);
		onPayslipPage = new PayslipPage(driver);
	}
	
	@When("user clicks on Generate Payslip link")
	public void user_clicks_on_generate_payslip_link() {
		//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds((20)));
		//wait1.until(ExpectedConditions.elementToBeClickable(onHRHomePage.link_generatePayslip));
	
		onHRHomePage.link_generatePayslip.click();
	
		
	}
	
	@When("user selects Salary Month")
	public void user_selects_salary_month() {
		onHRHomePage.dropdown_salaryMonth.click();
		doDropDownUsingValue(onHRHomePage.dropdown_salaryMonth, "Jan");
		
	}
	

	@When("user clicks on Generate Payslip button")
	public void user_clicks_on_generate_payslip_button() throws InterruptedException {
		//String strEmpId = testContext.getMapTestData().get("empId");
		//String strEmpId = "Mansi006";
		WebElement button_genPayslip = driver.findElement(By.xpath("//td[text()='Aniket123']//following-sibling::td/button"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds((20)));
		wait.until(ExpectedConditions.elementToBeClickable(button_genPayslip));
		button_genPayslip.click();
		Thread.sleep(5000);
		//String handle = driver.getWindowHandle();
		//driver.switchTo().window(handle);
	}
	
	@When("user enters Salary Details")
	public void user_enters_salary_details() {
	    
		
	}
	
	@When("user clicks on Calculate button to get Net Salary")
	public void user_clicks_on_calculate_button_to_get_net_salary() throws InterruptedException {
	    
		onPayslipPage.button_calculate.click();
		Thread.sleep(3000);
	}
	
	@When("user clicks on Generate Payslip Save button")
	public void user_clicks_on_generate_payslip_save_button() {
	    
		onPayslipPage.button_submitPayslip.click();
	}
	
	@Then("payslip should be generated")
	public void payslip_should_be_generated() {
	    
		
	}


}
