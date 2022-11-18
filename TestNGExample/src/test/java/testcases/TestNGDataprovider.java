package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.realdata.Xls_Reader;

public class TestNGDataprovider {
/*
 * Read data from  2 xlsx file to provide it to methods in the same class using same dataprovider 
 	@DataProvider
	@Test(dataProvider = getData)
	public void printTable(All col nms declared with types)
*/
	Object[][] data;
	
	@Test(dataProvider = "getData")
	public void printTable(String name,String LastName,String Address,String state,String Zipcode,String d)
	{	
			
			if(name.startsWith("E") || name.startsWith("M") )
			{
				System.out.println(name+"  "+ LastName+"   "+Address+"   "+state+"    "+Zipcode+"   "+d);
			}//if	
	}
	
	@DataProvider
	public Object[][] getData() {
		
		String path = System.getProperty("user.dir")+"/src/main/resources/com/files/Studentform2.xlsx";
		Xls_Reader reader = new Xls_Reader(path);
		int rows = reader.getRowCount("Sheet1");
		int cols = reader.getColumnCount("Sheet1");
	    data = new Object[rows][cols];
		for(int i=0;i<rows;i++)
		{
			
			for(int j=0;j<cols;j++)
			{
				data[i][j]= reader.getCellData("Sheet1", j, i);
				//System.out.println(data[i][j]);
			}//for j
		}//for i
		return data;
	}
}
