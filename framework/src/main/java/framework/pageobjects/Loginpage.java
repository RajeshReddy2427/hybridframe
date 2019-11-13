package framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	public WebDriver driver;
	
	

	public  Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	@FindBy(name="uid")
	
	WebElement username;
	
	
	@FindBy(name="password")
	
	WebElement password;
	
	@FindBy(name="btnLogin")
	
	WebElement login;
	
	
	public void setusername(String uname)
	{
		username.sendKeys(uname);
		
	}
	
	public void setpassword(String pass)
	{
		
		password.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		
		login.click();
	}
	
	
	
	
	
	
	
}
