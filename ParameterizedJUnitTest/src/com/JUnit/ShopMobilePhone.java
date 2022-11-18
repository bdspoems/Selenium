package com.JUnit;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class ShopMobilePhone {

	@Test
	public void checkPhone() {
		System.out.println("Check Phone");
	}
	@Ignore//makes this test skip
	@Test
	public void selectPhone() {
		System.out.println("Select Phone");
	}
	
	@Test
	public void checkOut() {
		System.out.println("Checkout");
		Assume.assumeTrue(false);;//makes this test skip
	}
}
