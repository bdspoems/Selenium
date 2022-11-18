package suiteb;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestA {
	SoftAssert sf; 
	@BeforeMethod
	 public void init() {
		sf  = new SoftAssert(); 
		System.out.println("-------------------");
	 }
	@Test
	public void nameinCaps()
	{
	  String actualnm = "USER1";
	  String expnm ="User1";
	  AssertJUnit.assertTrue(actualnm.equals(expnm.toUpperCase()));
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
