package com.one;

import org.testng.annotations.Test;

public class Test1 {
/*
 * all the file with the word test in name will run by surefire plugin with mvn clean n mvn test
 *  from path of project in terminal as well as from eclipse
 */
	@Test
	public void checkNumberOfPage() {
		System.out.println("There are 200 pages");
	}
	
	@Test
	public void checkNumberOfCopies() {
		System.out.println("There are 100 copies");
	}
	
	@Test
	public void checkNumberOfOrders() {
		System.out.println("There are 70 orders");
	}
}
