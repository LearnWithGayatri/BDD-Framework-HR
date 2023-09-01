package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.purna.libraries.Utilities;

public class LoginPage extends Utilities
{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(name="adminid")
    public WebElement txtbox_username;

    @FindBy(name="password")
    public WebElement txtbox_password;

    @FindBy(name="submit")
    public WebElement btn_login;
    
}
