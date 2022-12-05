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
     * Rigorous Test :-)
     */
	boolean flag = false;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldnotFail()
    {
    	Assert.assertFalse(false);
    	flag = true;
    }
    public void onlyIf()
    {
    	if(flag)
    		System.out.println ("\nAll good");
    	   
    }
}
