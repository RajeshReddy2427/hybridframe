package framework.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import framework.utilities.read_data;

public class Base_class {

	
 Properties prop;
public  WebDriver driver;
	
 read_data read;

 public void read() throws FileNotFoundException
 {
	 
	 read_data read=new read_data();
 }
    
	public void intilizedriver() throws IOException
	
	{
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Rajesh Reddy\\eclipse-hybridframework\\framework\\configurations\\data.properties");
		
		prop.load(fis);
		
		
		String br=prop.getProperty("browser");
		
		if(br=="chrome")
		{
			System.setProperty("webdriver.chrome.driver", read.getchropath());
			driver=new ChromeDriver();
		}
		
		else if(br=="firefox")
		{
			System.setProperty("webdriver.gecko.driver", read.getfirepath());
			
			driver=new FirefoxDriver();
		}
		else if(br=="InternetExplorer")
		{
			System.setProperty("webdriver.ie.driver", read.getiepath());
			
			driver=new InternetExplorerDriver();
		}
		
	}

	public String baseurl=read.getapplicationurl();
	
	 public String username=read.getusername();
	
	 public String password=read.getpassword();
	
	
	
}
