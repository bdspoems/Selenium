package test;

import org.junit.Assert;
import org.junit.Test;

public class Mytest {
	
	@Test
    public void isTitleRight()
    {
		System.out.println("isTitleRight()");
        Assert.assertEquals("facebook","facebook" );
       
    }
}
