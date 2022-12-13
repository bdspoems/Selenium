package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reportclass.ExtentManager;

public class ReportTest {
ExtentReports reports;
ExtentTest test;
String pathOfImage = System.getProperty("user.dir")+"/src/test/resources/ScreenShotOfProject12:12:22.png";

	@BeforeMethod
	public void makeReport() {
		reports = ExtentManager.makeReport();
		test = reports.createTest("Report Test");
	}
	@AfterMethod
	public void quit(){
		reports.flush();
	}
	@Test
	public void log() {
		test.log(Status.INFO, "Open browser");
		test.log(Status.INFO, "Start test");
		test.log(Status.INFO, "Create report");
		test.log(Status.INFO, "ohh no!");
		test.addScreenCaptureFromPath(pathOfImage,"error msg- file not found");
		test.log(Status.FAIL, "TEST FAILED");
		Assert.fail();
		
	}
}
