package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class LoginTest {
  
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeMethod
	public void init()
	{
		 reports = (ExtentReports)ExtentManager.getReportObject();
		 
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("1. login start");
	}
	@Test(priority=2,dependsOnMethods= {"login"})
	public void checkTitle()
	{
		AssertJUnit.assertEquals("Facebook page","Facebook page");
		System.out.println("2. check Title done");
	}
	@Test
	public void logIntoReport() throws IOException
	{
		 test = reports.createTest("Registration Test");
		 test.log(Status.INFO, "Login Name");
		 test.log(Status.INFO, "Check Title");
		 test.log(Status.PASS, "Login Test Pass");
		 test.addScreenCaptureFromPath("/Users/filepathtoscreenshot.png","titleOrErrormessageCaptured");
	}
	@AfterMethod()
	public void quit()
	{
		reports.flush();
	}
}
