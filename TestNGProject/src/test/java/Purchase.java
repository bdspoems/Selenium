package test.java;

import org.junit.Ignore;
import org.junit.Test;

public class Purchase {

	@Test
	public void select()
	{
		System.out.println("Select");
		
	}
	@Test
	public void confirm()
	{
		System.out.println("Confirm");
		
	}
	@Ignore//skip the test
	@Test
	public void buy()
	{
		System.out.println("Buy");
		
	}
}
