package testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Parameterization {
/*
 * made this one to run a testcase with a number of data
 * add JUnit4 lib
 * declare class as @RunWith(Parameterized.class), add a test case, global vars and a source for data with @Parameters tag
 to see the reports in the target/site/ added maven surefire plugin as well as maven surefire reporting plugin to pom.xml... but doesn't seem to make any reports
 */
	String username;
	String password;
	String url;
	
    public Parameterization(String username,String password,String url) {
    	this.username = username;
    	this.password = password;
    	this.url = url;
     }
	
    @Test
    public void printResult()
    {
    	System.out.println(username+"   "+password +"   "+url+ "\n");
    }
    
    @Parameters
    public static Collection<Object[]> getData(){
    	Object[][] data = new Object[2][3];
    	
    	data[0][0] ="11";
    	data[0][1] ="ghj001";
    	data[0][2] ="http://yahoo.com";
    	
    	data[1][0] ="22";
    	data[1][1] ="fha231";
    	data[1][2] ="http://google.com";
    	
    		
    	return Arrays.asList(data);
    }
	
}
