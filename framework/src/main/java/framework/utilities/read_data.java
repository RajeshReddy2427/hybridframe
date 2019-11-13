package framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class read_data {

	Properties prop;
	
	public read_data() throws FileNotFoundException 
	{
		
		File src=new File("C:\\Users\\Rajesh Reddy\\eclipse-hybridframework\\framework\\configurations\\data.properties");
		
		FileInputStream fis=new FileInputStream(src);
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getapplicationurl()
	{
		String url=prop.getProperty("baseurl");
		
		return url;
		
	}
	
	
	public String getusername()
	{
		
		String username=prop.getProperty("username");
		
		return username;
	}
	
	public String getpassword()
	{
		String password=prop.getProperty("password");
		
		return password;
	}
	
	public String getchropath()
	{
		String cpath=prop.getProperty("chropath");
		return cpath;
	}
	
	public String getfirepath()
	{
		
		String fpath=prop.getProperty("firepath");
		
		return fpath;
	}
	
	
	public String getiepath()
	{
		
	String ipath=	prop.getProperty("iepath");
		
		return ipath;
	}
	
	public String getdataconfig()
	{
		String configpath=prop.getProperty("data");
		
		return configpath;
	}
	
	
	
	
	
	
	
	
	
	
}
