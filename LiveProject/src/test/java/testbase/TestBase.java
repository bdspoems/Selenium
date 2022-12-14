package testbase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import util.ExtentManager;

public class TestBase {
	public ExtentReports reports;
	public ExtentTest test ;

	@BeforeMethod
	public void start(ITestResult result) {
		reports = ExtentManager.makeReport();
		 test  = reports.createTest(result.getMethod().getMethodName().toUpperCase());//will give the name of the @Test
	}
		
	@AfterMethod
	public void tear() {
		reports.flush();
	}
	public void log(String msg) {
		System.out.println(msg);
		test.log(Status.INFO,msg);
	}
}
