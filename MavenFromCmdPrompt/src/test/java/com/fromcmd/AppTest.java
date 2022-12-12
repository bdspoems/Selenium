package com.fromcmd;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 * test can not return anything?
 */

public class AppTest 
{
    /**
     * generated this class n Ran from command prompt with junit library
     */
	
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
    }
    
    @Test
    public void shouldnotFail()
    {
    	Assert.assertFalse(false);
    	
    }
    @Test
    public void onlyIf()
    {
    	
    		System.out.println ("\nAll good");
    	   
    }
}
