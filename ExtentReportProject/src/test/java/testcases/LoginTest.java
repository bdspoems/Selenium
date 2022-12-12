package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginTest {
ExtentReports reports;
ExtentSparkReporter reporter;
ExtentTest test;

	@BeforeMethod
	public void init(){
		reports = new ExtentReports();
		
		reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports");
		reporter.config().setReportName("Extent Report for ExtentReportProject");
		reporter.config().setDocumentTitle("Test Result");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setEncoding("utf-8");
		
		reports.attachReporter(reporter);
		test= reports.createTest("LoginTest");
	}
	
	@Test
	public void login() {
	 
	 test.log(Status.INFO,"Opening browser");
	 test.log(Status.INFO,"Logging in");
	 test.log(Status.INFO,"Running test");
	 test.log(Status.PASS,"Test passed");
	 
	}
	
	
	@AfterMethod
	public void quit(){
		reports.flush();
	}
	
	
}
