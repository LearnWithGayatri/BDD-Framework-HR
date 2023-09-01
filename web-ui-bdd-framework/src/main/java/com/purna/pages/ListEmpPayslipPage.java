package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListEmpPayslipPage {
	
public ListEmpPayslipPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="td[text()='a123']//following-sibling::td/button")
    public WebElement link_generatePayslip;

}
