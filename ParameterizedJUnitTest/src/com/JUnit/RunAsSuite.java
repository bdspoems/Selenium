package com.JUnit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/*
  
  THese two commands will run all these test classes one after the other like a suite
 **/
@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	Validation.class,
	ShopMobilePhone.class
})
public class RunAsSuite {

}
