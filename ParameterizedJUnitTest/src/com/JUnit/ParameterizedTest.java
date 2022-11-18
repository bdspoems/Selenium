package com.JUnit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/*
 This will run the test with different sets of data
 //using JUnit4 Library
	//Step1: Declare @RunWith(Parameterized.class)
	//Step2: Declare global vars
	//Step3: build a constructor passing the params
	//Step4: Declare @ parameters and provide the values in that method returning a Collection single data array (converted from 2D via Arrays.asList
	//main step: create a @Test will take each row of data from @Parameters method
 **/
 
@RunWith(Parameterized.class)
public class ParameterizedTest {
    
	String usernm;
	String password;
	
	public ParameterizedTest(String usernm,String password) 
	{
	   this.usernm = usernm;	
	   this.password=password;
	}
	
	@Test
	public void login()
	{
		System.out.println(usernm +"  ----   "+password);
	}
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]= "U1";
		data[0][1]= "P1";
		
		data[1][0]= "U2";
		data[1][1]= "P2";
		
		data[2][0]= "U3";
		data[2][1]= "P3";
		
		return Arrays.asList(data);
	}
}
