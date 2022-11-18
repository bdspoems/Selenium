package com.annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotation {
/*
 * 
 * @BeforeClass Runs before every testClass
 * @Before runs before every @Test
 */
	
@BeforeClass
public static void begin() {
	System.out.println("in Begin");

}

@Before
public void init() {
	System.out.println("------");
	System.out.println("in init");
	
}
//@Ignore
@Test(timeout=500)
public void start() throws InterruptedException {
	
    Thread.sleep(490);
    System.out.println("in start");
}

@Test(expected=ArithmeticException.class)
public void cont() {
	System.out.println("in cont");
	System.out.println("in cont2"+9/0);

}

@After
public void quit() {
	System.out.println("in quit");
	System.out.println("------");
}

@AfterClass
public static void close() {
	System.out.println("close");

}

}
