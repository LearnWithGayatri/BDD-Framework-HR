package com.purna.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.EmployeePage;
import com.purna.pages.ExEmployeePage;
import com.purna.pages.HRHomePage;
import com.purna.pages.ListEmpPage;
import com.purna.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivateEmp_StepDefinition extends Utilities{
	
	

	private WebDriver driver;
    private TestContext testContext;
    LoginPage onLoginPage;
    HRHomePage onHRHomePage;
    EmployeePage onEmployeePage;
    ListEmpPage onListEmpPage;
    ExEmployeePage onExEmployeePage;
    
    
    public ActivateEmp_StepDefinition(TestContext context) {
    	
    	testContext = context;
    	driver = testContext.getDriver();
		onLoginPage = new LoginPage(driver);
		onHRHomePage = new HRHomePage(driver);
		onEmployeePage = new EmployeePage(driver);
		onListEmpPage = new ListEmpPage(driver);
		onExEmployeePage = new ExEmployeePage(driver);
		
	}

	@When("user clicks on Ex-Employees link")
	public void user_clicks_on_ex_employees_link() {
    
		onHRHomePage.link_exEmpDashboard.click();
	}
	
	@When("user clicks on Activate Employee link")
	public void user_clicks_on_activate_employee_link() {
		
		String strEmpId = testContext.getMapTestData().get("empId");
    	WebElement link_activateEmp = driver.findElement(By.xpath("//td[text()='"+strEmpId+"']//following-sibling::td[4]/a"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds((20)));
		wait.until(ExpectedConditions.elementToBeClickable(link_activateEmp));
		link_activateEmp.sendKeys(Keys.ENTER);
	
	}
	
	@When("user clicks on Acrivate Employee popup ok button")
	public void user_clicks_on_acrivate_employee_popup_ok_button() {
    
		acceptAlert(driver);
	}
	
	@Then("Employee should be activated")
	public void employee_should_be_activated() {
    
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds((20)));
		wait1.until(ExpectedConditions.elementToBeClickable(onHRHomePage.link_empDashboard));
		onHRHomePage.link_empDashboard.click();
		Assert.assertEquals("Ashwini001",onEmployeePage.textbox_EmpId1.getText());
	
	}

}
