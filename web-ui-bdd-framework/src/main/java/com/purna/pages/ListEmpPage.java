package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListEmpPage {

	public ListEmpPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//td[text()='Mansi006']//following-sibling::td[6]/a")
    public WebElement link_deactivateEmp;
	
	
	
}
