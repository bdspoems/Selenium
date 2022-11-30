package Simple;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest {

	/*
	 * add JUnit 4 reference library to build path
	 * Ignore a test
	 * another way to skip a test: Assume.assumeTrue(false);
	 * @FixMethodOrder(MethodSorters.NAME_ASCENDING)
	 * MethosSorters.DEFAULT/MethosSorters.JVM
	 * This annotation on the class will run tests as per the dictionary name order
	 * */
	
    @Ignore
	@Test
	public void test_1_search() {
		System.out.println("1,search in JunitTest");
	}
	
	@Test
	public void test_3_reject() {
		
		if(true)
			Assume.assumeTrue(false);
		System.out.println("3,reject");
	}
	
	@Test
	public void test_2_buy() {
		System.out.println("2,buy in JunitTest");
		
	}
	
	@Test
	public void test_4_buybuy() {
		
		System.out.println("4,buyThis in JunitTest");
	}
}//class
