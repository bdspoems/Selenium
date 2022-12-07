package test;



	import static org.junit.Assert.assertTrue;

	import org.junit.Assert;
	import org.junit.Test;

	/**
	 * Unit test for simple App.
	 * test can not return anything?
	 */

	public class Apptest 
	{
	    /**
	     * generated this class n Ran from command prompt with junit library
	     */
		boolean flag = false;
	    @Test
	    public void shouldAnswerWithTrue()
	    {
	    	System.out.println("shouldAnswerWithTrue()");
	        Assert.assertTrue( true );
	    }
	    
	    @Test
	    public void shouldnotFail()
	    {
	    	System.out.println("shouldnotFail()");
	    	Assert.assertTrue(true);
	    	flag = true;
	    }
	    @Test
	    public void onlyIf()
	    {
	    	if(flag)
	    		System.out.println("onlyIf");
	    	   
	    }
	}

