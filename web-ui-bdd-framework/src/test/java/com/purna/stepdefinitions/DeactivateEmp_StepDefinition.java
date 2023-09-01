package com.purna.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class DeactivateEmp_StepDefinition extends Utilities {
	

	private WebDriver driver;
    private TestContext testContext;
    LoginPage onLoginPage;
    HRHomePage onHRHomePage;
    EmployeePage onEmployeePage;
    ListEmpPage onListEmpPage;
    ExEmployeePage onExEmployeePage;
    
    public DeactivateEmp_StepDefinition(TestContext context) {
    	
    	testContext = context;
    	driver = testContext.getDriver();
		onLoginPage = new LoginPage(driver);
		onHRHomePage = new HRHomePage(driver);
		onEmployeePage = new EmployeePage(driver);
		onListEmpPage = new ListEmpPage(driver);
		onExEmployeePage = new ExEmployeePage(driver);
		
	}
    
    
	
	@When("user clicks on Deactivate Employee link")
	public void user_clicks_on_deactivate_employee_link() {
	   
		
		String strEmpId = testContext.getMapTestData().get("empId");
		//String strEmpId = "Mansi006";
		//WebElement link_deactEmp = driver.findElement(By.xpath("//td[text()='Mansi006']//following-sibling::td[6]/a"));
		WebElement link_deactEmp = driver.findElement(By.xpath("//td[text()='"+strEmpId+"']//following-sibling::td[6]/a"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds((20)));
		wait.until(ExpectedConditions.elementToBeClickable(link_deactEmp));
		link_deactEmp.click();
		//wait.until(ExpectedConditions.elementToBeClickable(onListEmpPage.link_deactivateEmp));
		//onListEmpPage.link_deactivateEmp.click();
	}
	
	@When("user clicks on deactivate employee Ok popup")
	public void user_clicks_on_deactivate_employee_ok_popup() {
		acceptAlert(driver);
		
	}
	
	@Then("employee should be deactivated")
	public void employee_should_be_deactivated() {
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds((20)));
		wait1.until(ExpectedConditions.elementToBeClickable(onHRHomePage.link_exEmpDashboard));
		onHRHomePage.link_exEmpDashboard.click();
		Assert.assertEquals("Mansi006",onExEmployeePage.textbox_exEmpId.getText());
	}


}
