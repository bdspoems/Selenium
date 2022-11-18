package suitea;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
	SoftAssert sf;
	
	@BeforeMethod
	 public void init() {
		sf  = new SoftAssert(); 
		System.out.println("-------------------");
	 }

	@Test(priority=1)
	public void greaterTest()
	{
		sf.assertTrue(4>3);
		System.out.println("4 is greater");
	}
	@Test(priority=2)
	public void smallerTest()
	{
		sf.assertFalse(4>13);
		System.out.println("4 is smaller");
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
