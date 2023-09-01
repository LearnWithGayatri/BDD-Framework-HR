package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoteEmpPage {
	
	
	public PromoteEmpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    @FindBy(id="date")
    public WebElement textbox_promoteDate;
    
    @FindBy(id="emp_name")
    public WebElement textbox_promoteName;
    
    @FindBy(id="designation1")
    public WebElement dropdown_promoteDesg;
    
    @FindBy(name="shift")
    public WebElement dropdown_promoteShift;
    
    @FindBy(name="monthly_salary")
    public WebElement number_promoteMonthSal;
    
    @FindBy(name="promote_3_month")
    public WebElement button_promote;
    

}
