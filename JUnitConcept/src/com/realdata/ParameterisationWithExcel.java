package com.realdata;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/* To run this as Junit test I had to go to Run Configuration and in JRE change the Environment 
 * from JRE 14 to jdk1.8
 * When we read a file we shd read in such a way that the number of cols or rows if incresed or decreased shd not change the logic. 
 * This class uses @RunWith(Parameterised.class and reads data from Studentform2.xlsx and parametrizes 
 * data directly to the @Test method to display the output row wise. This runs well except gives some 
 * illegal reflective access warning 
 * 	WARNING: An illegal reflective access operation has occurred
   	WARNING: Illegal reflective access by org.dom4j.io.SAXContentHandler (file:/Users/urvashimehta/SeleniumDownloads/POI-3.6/poi-3.6/ooxml-lib/dom4j-1.6.1.jar) to method com.sun.org.apache.xerces.internal.parsers.AbstractSAXParser$LocatorProxy.getEncoding()
	WARNING: Please consider reporting this to the maintainers of org.dom4j.io.SAXContentHandler
	WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
	WARNING: All illegal access operations will be denied in a future release
 * */

@RunWith(Parameterized.class)
public class ParameterisationWithExcel {
	
		String FirstName;
		String LastName;
		String Address;
		String State;
		String Zipcode;
		String Date;
		
		public ParameterisationWithExcel(String FirstName,String LastName,String Address,String State, String Zipcode,String Date)
		{
			this.FirstName = FirstName;
			this.LastName = LastName;
			this.Address = Address;
			this.State = State;
			this.Zipcode = Zipcode;
		    this.Date = Date;
			//readData();
		}
		
		@Test
		public void testInput(){
			System.out.println(FirstName+"  ---   "+LastName +"  ---  "+Date);
		}

		@Parameters
		public static Collection<Object[]> getdata()//return a single dim object Array
		{
			try {
			return Arrays.asList(readData());
			}catch(IOException e)
			{
				e.printStackTrace();
				return null;
			}
			 //return Arrays.asList(new Object[][] {
		     //   {"uam11970@hotmail.com","wx123"},
		     //  {"uam11970@hotmail.com","gt123"}});
             //return Arrays.asList(data );
		}
		/*
		@Test
		public void LoginToFB()
		{
		        System.setProperty("webdriver.chrome.driver","/Users/urvashimehta/SeleniumDownloads/chromedriver");
		        WebDriver driver = (WebDriver) new ChromeDriver();
		        driver.get("https://www.facebook.com/");
		        WebElement elem1 = driver.findElement(By.id("email"));
		        elem1.sendKeys(username);
		        WebElement elem2 = driver.findElement(By.id("passContainer"));
		        elem2.sendKeys(password);
		        driver.findElement(By.linkText("Create new account")).click();
		        //submit

		        System.out.println(username+"  -  "+password+"  -  "+log);
		}
        */
		public static Object[][] readData() throws FileNotFoundException
		{
			  
			String path = System.getProperty("user.dir")+"/src/com/realdata/Studentform2.xlsx";
			System.out.println(path);
			Xls_Reader reader = new Xls_Reader(path);
			int cols = reader.getColumnCount("Sheet1");
			int rows =reader.getRowCount("Sheet1");
			//String[] value = {"Sammy","Patrick","1,North Street","Ca","95040","12/12/22"};
			//writeToFile("Sheet1",reader,rows,cols,value);
			Object[][] data = new String[rows][cols];
			for(int row= 0;row < rows;row++)
			{ 
			   for(int col= 0;col < cols;col++)
				  {
				   	data[row][col] = reader.getCellData("Sheet1",col,row);
				   	System.out.print(data[row][col]+"\t");
				  }
				System.out.println();
			}
			return data;
		}
		/*
		public static void writeToFile(String sheet,Xls_Reader xls,int rows,int cols,String value[])
		{
			for(int c= 0;c < cols;c++)
			  {
				String colnm = xls.getCellData("Sheet1", c, 0);
				System.out.print(colnm+"\t");
			    xls.setCellData(sheet,colnm,rows+1,value[c]);  //sheet,col nm,row,data
			  
			  }
			  
		}*/
}
