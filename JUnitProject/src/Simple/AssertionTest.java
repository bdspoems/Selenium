package Simple;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class AssertionTest {
	/*
	 * did shift command O to get all the imports automatically
	 * Assert and errorcollector to avoid failing of the prog on getting Assert errors 
	 * by using ErrorColector
	 */
	@Rule
	public  ErrorCollector ec = new ErrorCollector();
	@Test
	public void search() {
		try {
		Assert.assertFalse(12>7);
		}catch(Throwable e)
		{System.out.println("caught in search");
		 ec.addError(e);
		}
		System.out.println("normal search");
	}
	
	@Test
	public void select() {
		
		try {
			Assert.assertTrue(12>17);
		}catch(Throwable e)
		{System.out.println("caught in select");
		 ec.addError(e);
		}
		System.out.println("normal select");
	}
	
	@Test
	public void buy() {
		System.out.println("buy in AssertionTest");
		
	}
	
}
