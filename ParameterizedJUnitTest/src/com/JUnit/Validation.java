package com.JUnit;

import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;
/*
 * prog to show Assert statement usage n errorcollector how it displys all errors in the log
 * 
 **/
public class Validation {
	@Rule
	public ErrorCollector  errcol = new ErrorCollector();
	
	@SuppressWarnings("deprecation")
	@Test
	public void Validate() {
		
		System.out.println("Validate");
		try {
		Assert.assertEquals("b","A");
		
		Assert.assertFalse("error msg",2<10);
		}catch(Throwable e)
		{
			errcol.addError(e);
		}
   
		try {
			
			Assert.assertTrue(5>12);
			
			}catch(Throwable e)
			{
				errcol.addError(e);
			}
		
	}
	@Test
	public void confirm(){
	 System.out.println("confirm");	
	 Assume.assumeTrue(false); //in the body to get the test skipped
	}
}
