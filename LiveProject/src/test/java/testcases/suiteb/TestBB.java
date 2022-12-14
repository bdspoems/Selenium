package testcases.suiteb;

import org.testng.annotations.Test;

import dataprovider.ProjectDataProvider;
import testbase.TestBase;


public class TestBB extends TestBase{
	

	@Test(dataProviderClass=ProjectDataProvider.class,dataProvider="getDataSuitea")
	public void tesBB(String user,String pwd,String browser) {
		log("Logging in");
		System.out.println(user+"   **  "+pwd+"   **   "+browser);
		log("Entering info");
		log("pressing submit");
		log("Opening new window");
		log("Test Pass");
	}
}
