package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class RegisterTest {

ExtentReports reports;
ExtentTest test;
	
	@BeforeMethod
	public void init()
	{
		 reports = (ExtentReports)ExtentManager.getReportObject();
		
	}
	@Test
	public void register()
	{
		System.out.println("3. registration start");
	}
	@Test(dependsOnMethods= {"register"})
	public void checkName()
	{
		AssertJUnit.assertEquals("Myname","Myname");
		System.out.println("4. check Name done");
	}
	@Test(dependsOnMethods= {"checkName"} )
	public void logIntoReport() throws IOException
	{
		 test = reports.createTest("Registration Test");
		 test.log(Status.INFO, "Register Name");
		 test.log(Status.INFO, "Check Name");
		 test.log(Status.PASS, "Reg Test Pass");
		 test.addScreenCaptureFromPath("/Users/filepathtoscreenshot.png","titleOrErrormessageCaptured");
	}
	@AfterMethod()
	public void quit()
	{
		reports.flush();
	}
}
