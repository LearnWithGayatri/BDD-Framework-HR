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
import com.purna.pages.PromoteEmpPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PromoteEmp_StepDefinition extends Utilities{

	

	private WebDriver driver;
    private TestContext testContext;
    LoginPage onLoginPage;
    HRHomePage onHRHomePage;
    EmployeePage onEmployeePage;
    ListEmpPage onListEmpPage;
    ExEmployeePage onExEmployeePage;
    PromoteEmpPage onPromoteEmpPage;
    
    public PromoteEmp_StepDefinition(TestContext context) {
    	
    	testContext = context;
    	driver = testContext.getDriver();
		onLoginPage = new LoginPage(driver);
		onHRHomePage = new HRHomePage(driver);
		onEmployeePage = new EmployeePage(driver);
		onListEmpPage = new ListEmpPage(driver);
		onExEmployeePage = new ExEmployeePage(driver);
		onPromoteEmpPage = new PromoteEmpPage(driver);
	}
    
    
    
    @When("user clicks on Promote Employee link")
    public void user_clicks_on_promote_employee_link() {
    	
    	String strEmpId = testContext.getMapTestData().get("empId");
    	WebElement link_promoteEmp = driver.findElement(By.xpath("//td[text()='"+strEmpId+"']//following-sibling::td[4]/button"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds((20)));
		wait.until(ExpectedConditions.elementToBeClickable(link_promoteEmp));
		link_promoteEmp.click();
		
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		
        
    }
    
    @When("user enters on Employee Promotion details")
    public void user_enters_on_employee_promotion_details() {
    	
    	//driver.findElement(By.name("monthly_salary")).sendKeys("80000");
    	onPromoteEmpPage.number_promoteMonthSal.sendKeys("80000");
    	//doDropdownUsingIndex(onEmployeePage.dropdown_empDesg,4);
    	doDropdownUsingIndex(onPromoteEmpPage.dropdown_promoteDesg,5);
    	doDropDownUsingValue(onPromoteEmpPage.dropdown_promoteShift, "Afternoon");
    	
    }
    
    
    @When("user clicks on Promote employee Ok popup")
    public void user_clicks_on_promote_employee_ok_popup() {
    
    	onPromoteEmpPage.button_promote.click();
    	acceptAlert(driver);
    }
    
    @Then("employee should be promoted")
    public void employee_should_be_promoted() {
    	System.out.println(driver.findElement(By.xpath("//td[text()='Naitik007']//following-sibling::td[3]")).getText());
    	//EXCLUSIONS CONSULTANT
    	
    	
    	//System.out.println(onEmployeePage.td_empNewDesg.getText());
    	Assert.assertEquals("EXCLUSIONS CONSULTANT",driver.findElement(By.xpath("//td[text()='Naitik007']//following-sibling::td[3]")).getText().trim());
        
        
    }

}
