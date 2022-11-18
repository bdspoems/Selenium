package suitea;


import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;



public class RegisterTest {
    SoftAssert sf; 
    
    @BeforeMethod
	 public void init() {
		sf  = new SoftAssert(); 
		System.out.println("-------------------");
	 }
    
	@Test
	public void chkUsername()
	{
	  String actualnm = "User1";
	  String expnm ="user1";
	  sf.assertEquals(actualnm, expnm);
	}
	
	@Test(dependsOnMethods= {"chkUsername"})
	public void chkpwdlength()
	{
	  sf.assertEquals(10, 10);
	}
	@AfterMethod
	public void quit()
	{
		System.out.println("-------------------");
	}
	@AfterTest
	public void assertAll()
	{
		sf.assertAll();
	}
}
