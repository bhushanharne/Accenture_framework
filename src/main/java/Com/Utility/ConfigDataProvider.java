package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties p;
	public   ConfigDataProvider() throws Exception {
		
		
		String path="C:\\Users\\HP\\eclipse-workspace\\Accenture_framework\\Config\\config.properties";
	FileInputStream st=new FileInputStream(path);
	 p=new Properties();
	p.load(st);
	
	
	}
	public String get_BaseUrl() {
	return	p.getProperty("BaseUrl1");
		
	}

}
