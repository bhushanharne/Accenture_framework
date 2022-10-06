package Com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners  extends BaseClass implements ITestListener{
	ExtentReports extent =ExtendReportGenerator.getReport();
	ThreadLocal<ExtentTest> Extenttest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
	Library.test=extent.createTest(result.getTestName()+"=="+result.getMethod().getMethodName());
	Extenttest.set(Library.test);
	Extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestSuccess(ITestResult result) {
		Extenttest.get().log(Status.PASS, "Test case pass");
		Extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
		
		
	}

	public void onTestFailure(ITestResult result) {
		Extenttest.get().log(Status.FAIL, "Test case fail");
		Extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		Extenttest.get().log(Status.SKIP, "Test case skip");
		Extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	public static String getScreenshot() {
		TakesScreenshot tc=(TakesScreenshot) driver;
		return tc.getScreenshotAs(OutputType.BASE64);
	}
	
	

}
