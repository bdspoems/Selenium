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
	        Assert.assertTrue( true );
	    }
	    
	    @Test
	    public void shouldnotFail()
	    {
	    	Assert.assertFalse(false);
	    	flag = true;
	    }
	    @Test
	    public void onlyIf()
	    {
	    	if(flag)
	    		System.out.println ("\nAll good");
	    	   
	    }
	}

