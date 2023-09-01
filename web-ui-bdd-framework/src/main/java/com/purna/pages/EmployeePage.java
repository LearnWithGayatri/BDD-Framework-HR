package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
	
	
	public EmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(name="employee_id")
    public WebElement textbox_empId;
    
    @FindBy(name="first_name")
    public WebElement textbox_empFname;
    
    @FindBy(name="last_name")
    public WebElement textbox_empLname;
    
    @FindBy(name="designation")
    public WebElement dropdown_empDesg;
    
    @FindBy(name="date_of_joining")
    public WebElement textbox_empDateOfJoin;
    
    @FindBy(name="shift")
    public WebElement dropdown_empShift;
    
    @FindBy(name="gender")
    public WebElement dropdown_empGender;
    
    @FindBy(name="email_id")
    public WebElement textbox_empEmailId;
    
    @FindBy(name="password")
    public WebElement pwd_empPassword;
    
    @FindBy(name="aadhar_no")
    public WebElement textbox_empAadharNo;
    
    @FindBy(name="pan_no")
    public WebElement textbox_empPanNo;
    
    @FindBy(name="uan_no")
    public WebElement textbox_empUanNo;
    
    
    @FindBy(name="address")
    public WebElement textbox_empaddress;
    
    
    @FindBy(name="bank_name")
    public WebElement textbox_bankName;
    
    @FindBy(name="ifsc_no")
    public WebElement textbox_bankIfscNo;
    
    
    @FindBy(name="account_no")
    public WebElement number_empAccNo;
    
    @FindBy(id="annual_package")
    public WebElement number_empAnnualPkg;
    
    
    @FindBy(name="birthday_allowance")
    public WebElement number_empBdayAllow;
    
    @FindBy(name="saturday_allowance")
    public WebElement number_empSatAllow;
    
    @FindBy(name="sunday_allowance")
    public WebElement number_empSunAllow;
    
    
    @FindBy(name="leaves_availed")
    public WebElement name_empLeavesAail;
    
    @FindBy(name="new_sl_balance")
    public WebElement name_empSlbal;
    
    @FindBy(name="submit")
    public WebElement button_empSubmit;
    
    @FindBy(xpath="//td[text()='Naitik007']//following-sibling::td[3]")
    public WebElement td_empNewDesg;
    
    @FindBy(xpath="//td[text()='Ashwini001']")
    public WebElement textbox_EmpId1;
    
    
    
    
    
    
    
    
    
    
	

}
