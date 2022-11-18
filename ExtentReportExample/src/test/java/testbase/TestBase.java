package testbase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {
	public ExtentReports reports;
	public ExtentTest test;
	
	
	@BeforeMethod
	public void init(ITestResult result)
	{
		reports = ExtentManager.getReportObject();
		System.out.println(result.getMethod().getMethodName().toUpperCase());
		test = reports.createTest(result.getMethod().getMethodName().toUpperCase());//obj to create report
		//result.getTestContext().setAttribute("test",test);//to set the listener obj in the testcase as they both share the same ITestResult obj 
		
	}
	
	@AfterMethod
	public void quit()
	{
		reports.flush();
	}
   
	public void log(String message)
	{
		System.out.println(message);
		test.log(Status.INFO, message);
		
	}
}//class