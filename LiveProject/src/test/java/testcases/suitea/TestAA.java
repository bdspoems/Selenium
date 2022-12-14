package testcases.suitea;

import org.testng.annotations.Test;

import dataprovider.ProjectDataProvider;
import testbase.TestBase;




public class TestAA extends TestBase{
	

	@Test(dataProviderClass=ProjectDataProvider.class,dataProvider="getDataSuitea")
	public void tesAA(String user,String pwd) {
		log("Logging in");
		System.out.println(user+"   **  "+pwd);
		log("Entering info");
		log("pressing submit");
		log("Opening new window");
		log("Test Pass");
	}
}
