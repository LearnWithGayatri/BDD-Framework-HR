package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPayslipPage {
	
		public ListPayslipPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	    @FindBy(xpath="//td[text()='anjali']//following-sibling::td[5]")
	    public WebElement link_payslipDwnld;

}

