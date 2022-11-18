package com.one;
/* declare class with @RunWith(Parameterized.class
 * declare global vars
 * make a constructor initialising the global vars
 * Make a @Parameters STATIC method
 * do something in @Test using the global vars
 * Run as JUnit Test
 */

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterisedTest {
	String username;
	String password;
	
	public ParameterisedTest(String uname,String pass)
	{
		this.username = uname;
		this.password= pass;
	}
	
	@Test
	public void testInput(){
		System.out.println(username+"  ---   "+password);
	}

	@Parameters
	public static Collection<Object[]> getdata()//return a single dim object Array
	{
		return Arrays.asList(//convert two dim array into single dim array
				new Object[][] {
	        {"uam11970@hotmail.com","wx123"},
	        {"uam11970@gmail.com","gt123"},
	        {"pasta@gmail.com","pt890"}
		});	//)close the bracket for asList

	}//getdata
}//class
