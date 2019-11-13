package com.inetframe.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetframe.utilities.Read_config;



public class Base_class {
	
	Read_config read=new Read_config();

	public String baseurl=read.setUrl();
	
	public String username=read.setusername();
	
	public String password=read.setpassword();
	
	public  WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	
	public WebDriver setup(String br)
	{
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", read.setcpath());
			 driver=new ChromeDriver();
			 
			 logger=Logger.getLogger("ebanking");
			 PropertyConfigurator.configure("log4j.properties");
			 
			 
		}
		else if(br.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", read.setfirepath());
			driver=new FirefoxDriver();
		}
		
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", read.setiepath());
			
			driver=new InternetExplorerDriver();
		}
		return driver;
		
	}
	
	
	@AfterClass
	
	public void teardown()
	{
		driver.close();
	}
	
}