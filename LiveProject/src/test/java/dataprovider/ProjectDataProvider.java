package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class ProjectDataProvider {
	
	@DataProvider
	public static Object[][] getDataSuitea(Method m){
		Object[][] data = null;
		String nameinUppercase= m.getName().toUpperCase();
		if(nameinUppercase.equals("TESA")|| nameinUppercase.equals("TESAA"))
		{   data = new String [2][2];
			//row1
			data[0][0]="u1";
			data[0][1]="p1";
			//row2
			data[1][0]="u2";
			data[1][1]="p2";
		}else if(nameinUppercase.equals("TESB")|| nameinUppercase.equals("TESBB"))
		{
			data = new String [2][3];
			//row1
			data[0][0]="u1";
			data[0][1]="p1";
			data[0][2]="chrome";
			//row2
			data[1][0]="u2";
			data[1][1]="p2";
			data[1][2]="Firefox";
		}
		return data;
	}

}
