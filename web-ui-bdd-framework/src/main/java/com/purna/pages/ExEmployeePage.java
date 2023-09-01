package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExEmployeePage {

	public ExEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//td[text()='Mansi006']")
    public WebElement textbox_exEmpId;
}
