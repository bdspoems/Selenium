package testcases;
import org.testng.Assert;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class TestApp {
	String mesg="Hello";
	SoftAssert sa = new SoftAssert();

	@Test
	public void printt()
	{
		System.out.println(mesg);
		
	}
		
	    @Test
		public void validate()
		{
	    	sa.assertEquals("A","D");
	    	try {
	    		//actual,expected
			Assert.assertEquals("Hello!", mesg);
			
			
	    	}catch(Throwable e) {System.out.println(e.getMessage());}
	    	
			 
		}
	    @Test
		public void validatewithSA()
		{
				sa.assertEquals("Hello!", mesg);
				sa.assertAll();
		}
	   
	}
