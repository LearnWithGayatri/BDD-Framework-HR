package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayslipPage {
	public PayslipPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//button[text()='Calculate']")
    public WebElement button_calculate;
    
    @FindBy(id="form_submit_button")
    public WebElement button_submitPayslip;
    
    

}
