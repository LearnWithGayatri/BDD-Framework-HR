package com.purna.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.EmployeePage;
import com.purna.pages.ExEmployeePage;
import com.purna.pages.HRHomePage;
import com.purna.pages.ListEmpPage;
import com.purna.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveApp_StepDefinition extends Utilities {
	
	
	private WebDriver driver;
    private TestContext testContext;
    LoginPage onLoginPage;
    HRHomePage onHRHomePage;
    EmployeePage onEmployeePage;
    ListEmpPage onListEmpPage;
    ExEmployeePage onExEmployeePage;
    
    
    public LeaveApp_StepDefinition(TestContext context) {
    	
    	testContext = context;
    	driver = testContext.getDriver();
		onLoginPage = new LoginPage(driver);
		onHRHomePage = new HRHomePage(driver);
		onEmployeePage = new EmployeePage(driver);
		onListEmpPage = new ListEmpPage(driver);
		onExEmployeePage = new ExEmployeePage(driver);
		
	}
    
    
    @When("user clicks on Leaves Dashboard link")
    public void user_clicks_on_leaves_dashboard_link()  {
       
    	onHRHomePage.link_leaveDashboard.click();
    	
    }
    //
    @When("user selects Status")
    public void user_selects_status() throws InterruptedException {
    	//td[text()="Sachin Joshi"]//following-sibling::td[6]
    	//String strEmpName = testContext.getMapTestData().get("empName");
    	//System.out.println(strEmpName);
    	//driver.findElement(By.xpath("//td[text()='"+strEmpName+"']//following-sibling::td[6]")).click();
    	driver.findElement(By.xpath("//select[@id='row_id_17']")).click();
    	 Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds((20)));
		//wait.until(ExpectedConditions.elementToBeClickable(link_activateEmp));
		//link_activateEmp.sendKeys(Keys.ENTER);
    	
    }
    
    @When("user clicks on Leave Submit button")
    public void user_clicks_on_leave_submit_button() {
        
    }
    
    @When("user clicks on Leave Popup ok")
    public void user_clicks_on_leave_popup_ok() {
       
    	
    }
    
    @Then("employee should be removed from pending leave application list")
    public void employee_should_be_removed_from_pending_leave_application_list() {
        
    	
    }

}
