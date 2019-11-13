package com.inetframe.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement login;
	
	public void setusername(String user)
	{
		username.sendKeys(user);
		
	}
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	
	public void ClickSubmit()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
