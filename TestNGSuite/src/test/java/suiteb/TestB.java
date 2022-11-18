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

public class TestB {
	 SoftAssert sf;
	 @BeforeMethod
	 public void init() {
		sf  = new SoftAssert(); 
		System.out.println("-------------------");
	 }
	 @Test
		public void TitleTest()
		{
		  String actual = "MyTest";
		  String expnm ="MyTest";
		  AssertJUnit.assertTrue(actual.equals(expnm));
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