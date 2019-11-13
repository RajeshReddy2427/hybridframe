package com.inetframe.testcases;



import org.testng.annotations.Test;

import com.inetframe.pageobjects.LoginPage;

public class login extends Base_class{
	
	
	@Test
	
	public void logintest()
	{
		
		driver.get(baseurl);
		
		logger.info("Url is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setusername(username);
		
		logger.info("username entered");
		
		lp.setpassword(password);

		logger.info("password is entered");
		lp.ClickSubmit();
		
		logger.info("click on submit");
	}

}
