package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRHomePage {

	public HRHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//a[@href='employee_dashboard.php']")
    public WebElement link_empDashboard;

    @FindBy(xpath="//a[@href='leave_application_dashboard.php']")
    public WebElement link_leaveDashboard;
    
    
    @FindBy(xpath=" //a[@href='ex_employees.php']")
    public WebElement link_exEmpDashboard;
    
 
    
    @FindBy(xpath="//a[@href=\"create_employee.php\"]")
    public WebElement link_createEmp;
	
    
    @FindBy(xpath="//a[@href='employee_list.php']")
    public WebElement link_generatePayslip;
	
    

    @FindBy(id="salary_month")
    public WebElement dropdown_salaryMonth;
    
    

    @FindBy(xpath="//input [@id='salary_year']//following::button[1]")
    public WebElement button_viewPayslip;
    
    
    
  
}
