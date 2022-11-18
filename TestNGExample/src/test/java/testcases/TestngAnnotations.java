package testcases;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	/*
	 * @BeforeSuite @AfterSuite A suite has more than one java files and it runs before and after suite
	 * @BeforeTest  @AfterTest
	 * @BeforeClass  @AfterClass  Runs before every testClass
	 * @BeforeMethod  @AfterMethod runs before every @Test
	 * @DataProvider (dataProvider = method name)
	 * throw new SkipException("Skip message");
	 */
		
	@BeforeClass
	public void initTest()
	{
		System.out.println("BeforeClass");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("BeforeTest");
	}
	@BeforeMethod
	public void loginTest()
	{
		System.out.println("-------------");
		System.out.println("BeforeMethod");
	}
	@Test
	public void isValidTest()
	{
		System.out.println("isValidTest");
	}
	@Test
	public void IsTitleVisibleTest()
	{
		System.out.println("IsTitleVisibleTest");
	}
	@Test
	public void loggedInCheck()
	{
		System.out.println("loggedInCheck test");
	}
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout");
		System.out.println("-------------");
	}
	@AfterTest
	public void quit()
	{
		System.out.println("quit");
	}
}
