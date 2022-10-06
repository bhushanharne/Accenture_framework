package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGenerator  {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
	
	String path="C:\\Users\\HP\\eclipse-workspace\\Accenture_framework\\Reports" ;
	ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
	Reporter.config().setDocumentTitle("Accenture Framework");
	Reporter.config().setTheme(Theme.DARK);
	Reporter.config().setReportName("Team spark");
	
	 extent=new ExtentReports();
	 extent.attachReporter(Reporter);
	 extent.setSystemInfo("project name", "Accenture framework");
	 extent.setSystemInfo("o.s", "Window 10");
	 extent.setSystemInfo("Tool", "selenuim webDriver");
	 extent.setSystemInfo("QA", "bhushan harne");
	 return extent;
		
	}

}
