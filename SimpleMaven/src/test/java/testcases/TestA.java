package testcases;

import org.testng.annotations.Test;

public class TestA {
    
	@Test
	public void testA() throws InterruptedException {
	    System.out.println("Starting TestA");
	    Thread.sleep(3000);
	    System.out.println("Ending TestA");
}
	
}
