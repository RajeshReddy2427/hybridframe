package framework.testcases;

import org.testng.annotations.Test;

import framework.baseclass.Base_class;
import framework.pageobjects.Loginpage;

public class Login extends Base_class {

	@Test
	
	public void Logintest()
	{
		
		driver.get(baseurl);
		
		Loginpage lp=new Loginpage(driver);
		
		lp.setusername(username);
		lp.setpassword(password);
		lp.clickSubmit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
