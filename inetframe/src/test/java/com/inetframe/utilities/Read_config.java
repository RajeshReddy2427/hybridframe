package com.inetframe.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Read_config {

	Properties prop;
	
	public Read_config() 
	{
		
		File src=new File("C:\\Users\\Rajesh Reddy\\eclipse-hybridframework\\inetframe\\configurations\\config.properties");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public String setUrl()
	{
	String url=prop.getProperty("baseurl");
	
	return url;
		
	}
	
	public String setusername()
	{
	String user=prop.getProperty("username");
	
	return user;
		
	}
	
	public String setpassword()
	{
		String passw=prop.getProperty("password");
		
		return passw;
	}
	
	public String setcpath()
	{
		
		String chpath=prop.getProperty("chropath");
		
		return chpath;
	}
	
	
	public String setfirepath()
	{
		
		String fpath=prop.getProperty("firepath");
		
		return fpath;
	}
	
	
	public String setiepath()
	{
		
		String ipath=prop.getProperty("iepath");
		
		return ipath;
	}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
