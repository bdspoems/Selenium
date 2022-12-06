package test;

import org.junit.Assert;
import org.junit.Test;

public class Mytest {
	
	@Test
    public void isTitleRight()
    {
        Assert.assertEquals("facebook","Facebook" );
        Assert.fail();
    }
}
