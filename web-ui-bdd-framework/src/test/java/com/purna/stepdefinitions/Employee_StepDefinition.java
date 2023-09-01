package com.purna.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.EmployeePage;
import com.purna.pages.HRHomePage;
import com.purna.pages.LoginPage;

//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_StepDefinition extends Utilities {
	
	
	private WebDriver driver;
    private TestContext testContext;
    LoginPage onLoginPage;
    HRHomePage onHRHomePage;
    EmployeePage onEmployeePage;
		
	
    public Employee_StepDefinition(TestContext context) {
	
    	testContext = context;
    	driver = testContext.getDriver();
		onLoginPage = new LoginPage(driver);
		onHRHomePage = new HRHomePage(driver);
		onEmployeePage = new EmployeePage(driver);
		
	}
    
	@When("user clicks on employee dashboard link")
	public void user_clicks_on_employee_dashboard_link() {
		onHRHomePage.link_empDashboard.click();
	}
	
	@When("user clicks on add employee button")
	public void user_clicks_on_add_employee_button() {
		onHRHomePage.link_createEmp.click();
	}
	
	@When("user enters employee details")
	public void user_enters_employee_details() {
	  
		//onEmployeePage.textbox_empId.sendKeys("aaa");
		onEmployeePage.textbox_empId.sendKeys(testContext.getMapTestData().get("empId"));
		
		//onEmployeePage.textbox_empFname.sendKeys("a");
		onEmployeePage.textbox_empFname.sendKeys(testContext.getMapTestData().get("empFname"));
		
		//onEmployeePage.textbox_empLname.sendKeys("b");
		onEmployeePage.textbox_empLname.sendKeys(testContext.getMapTestData().get("empLname"));
		
		onEmployeePage.dropdown_empDesg.click();
		doDropdownUsingIndex(onEmployeePage.dropdown_empDesg,3);
		
		//onEmployeePage.textbox_empDateOfJoin.sendKeys("14-08-2023");
		onEmployeePage.textbox_empDateOfJoin.sendKeys(testContext.getMapTestData().get("empDateOfJoin"));
		
		onEmployeePage.dropdown_empShift.click();
		doDropDownUsingVisibleText(onEmployeePage.dropdown_empShift, "Afternoon");
		
		onEmployeePage.dropdown_empGender.click();
		doDropDownUsingValue(onEmployeePage.dropdown_empGender, "male");
		
		
		//onEmployeePage.textbox_empEmailId.sendKeys("ms@test.com");
		onEmployeePage.textbox_empEmailId.sendKeys(testContext.getMapTestData().get("empEmailId"));
		
		//onEmployeePage.pwd_empPassword.sendKeys("ms123");
		onEmployeePage.pwd_empPassword.sendKeys(testContext.getMapTestData().get("empPassword"));
		
		//onEmployeePage.textbox_empAadharNo.sendKeys("123487659876");
		onEmployeePage.textbox_empAadharNo.sendKeys(testContext.getMapTestData().get("empAadharNo"));
		
		//onEmployeePage.textbox_empPanNo.sendKeys("ABMSD1234N");
		onEmployeePage.textbox_empPanNo.sendKeys(testContext.getMapTestData().get("empPanNo"));
		
		//onEmployeePage.textbox_empUanNo.sendKeys("uan777");
		onEmployeePage.textbox_empUanNo.sendKeys(testContext.getMapTestData().get("empUanNo"));
		
		//onEmployeePage.textbox_empaddress.sendKeys("Ranchi");
		onEmployeePage.textbox_empaddress.sendKeys(testContext.getMapTestData().get("empaddress"));
		
		//onEmployeePage.textbox_bankName.sendKeys("HDFC");
		onEmployeePage.textbox_bankName.sendKeys(testContext.getMapTestData().get("bankName"));
		
		//onEmployeePage.textbox_bankIfscNo.sendKeys("HDFC0000123");
		onEmployeePage.textbox_bankIfscNo.sendKeys(testContext.getMapTestData().get("bankIfscNo"));
		
		//onEmployeePage.number_empAccNo.sendKeys("7777777777");
		onEmployeePage.number_empAccNo.sendKeys(testContext.getMapTestData().get("empAccNo"));
		
		//onEmployeePage.number_empAnnualPkg.sendKeys("10000000");
		onEmployeePage.number_empAnnualPkg.sendKeys(testContext.getMapTestData().get("empAnnualPkg"));
		
		
		//onEmployeePage.number_empBdayAllow.sendKeys("50000");
		onEmployeePage.number_empBdayAllow.sendKeys(testContext.getMapTestData().get("empBdayAllow"));
		
		//onEmployeePage.number_empSatAllow.sendKeys("0");
		onEmployeePage.number_empSatAllow.sendKeys(testContext.getMapTestData().get("empSatAllow"));
		
		//onEmployeePage.number_empSunAllow.sendKeys("0");
		onEmployeePage.number_empSunAllow.sendKeys(testContext.getMapTestData().get("empSunAllow"));
		
		//onEmployeePage.name_empLeavesAail.sendKeys("3");
		onEmployeePage.name_empLeavesAail.sendKeys(testContext.getMapTestData().get("empLeavesAail"));
		
		//onEmployeePage.name_empSlbal.sendKeys("15");
		onEmployeePage.name_empSlbal.sendKeys(testContext.getMapTestData().get("empSlbal"));
		
	}
	
	@When("user cliks on emp save button")
	public void user_cliks_on_emp_save_button() {
		
		//SoftAssert softAssert = new SoftAssert();
		

	  
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds((20)));
		wait.until(ExpectedConditions.elementToBeClickable(onEmployeePage.button_empSubmit));
		onEmployeePage.button_empSubmit.sendKeys(Keys.ENTER);
		//onEmployeePage.button_empSubmit.click();
		//clickElementByJSE(driver, onEmployeePage.button_empSubmit);
	
		//softAssert.assertEquals("",onEmployeePage.textbox_empId.getText());
		//softAssert.assertAll();
	}
	
	@When("user clicks on emp popup ok button")
	public void user_clicks_on_emp_popup_ok_button() {
		acceptAlert(driver);
	}
	@Then("new employee should be created")
	public void new_employee_should_be_created() {

	  Assert.assertEquals("Sam123", driver.findElement(By.xpath("//td[text()='Sam123']")).getText());
	}


}
