package testcases.suiteb;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import dataprovider.ProjectDataProvider;
import testbase.TestBase;
import util.ExtentManager;

public class TestB extends TestBase{
	

	@Test(dataProviderClass=ProjectDataProvider.class,dataProvider="getDataSuitea")
	public void tesB(String user,String pwd,String browser) {
		log("Logging in");
		System.out.println(user+"   **  "+pwd+"   **   "+browser);
		log("Entering info");
		log("pressing submit");
		log("Opening new window");
		log("Test Pass");
	}
}
