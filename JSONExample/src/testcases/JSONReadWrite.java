package testcases;


import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class JSONReadWrite {
/*
 * Will run this java file as JUnit Test
 * Downloaded json simple jar and JUnit 4
 * Read StudentDetails.json and display on console
 */
	
	@Test
	public void readJson() throws IOException, ParseException
	{
		 String path = System.getProperty("user.dir")+"/src/resources/StudentDetails.json";
		 System.out.println(path);
		 FileReader reader = new FileReader(path);
		 JSONParser parser = new JSONParser();
		 JSONObject json = (JSONObject) parser.parse(reader);//reads the whole file
		 readData(json);
	}
	
	@SuppressWarnings("rawtypes")
	public void readData(JSONObject json)
	{
		JSONArray stud = new  JSONArray();
		stud = (JSONArray)json.get("StudentDetails");
		for(int i=0;i<stud.size();i++)
		{
		   JSONObject data = new JSONObject();
		   data =(JSONObject) stud.get(i);
		   System.out.println("1. "+data);
		   Set set  = data.keySet();
		   Iterator it = set.iterator();
	       while(it.hasNext())
		    	 {
		    		String key= (String)it.next();
		    		JSONArray value =(JSONArray) data.get(key);
		    		System.out.println("2a. "+key +" : "+value.toJSONString());
		    		String testnm= (String)it.next();
		    		
		    		String value2= (String)data.get(testnm);
		    		System.out.println("2b. "+"Testname" +" : "+value2);
		    		for(int d=0;d<value.size();d++)
		    		{
		    	     	JSONObject subdata = new JSONObject();
		    	     	subdata= (JSONObject)value.get(d);
		    	     	Set subset  = subdata.keySet();
		    			it = subset.iterator();
		    		    while(it.hasNext())
		    			    {
		    			    	 String k=(String) it.next();
		    			    	 String v= (String) subdata.get(k);
		    			    	 System.out.println("2a1. "+k +" : "+v);
		    			    	 
		    			    }
		    		}//d for
		    		System.out.println("_______________________");
		    	 }//while
		}//for
	}
}


/*
 * {
  "StudentDetails":
  [
   {"data":[
       {"studentName":"ChildA","Place":"USA"},
       {"studentName":"ChildB","Place":"UK"},
       {"studentName":"ChildB","Place":"UK"}
    ],
    "testname":"StudentTest"
    },
    {"metadata":[
    
       {"studentcity":"CityA","Need accomodation":"No"},
       {"studentcity":"CityB","Need accomodation":"Yes"},
       {"studentcity":"CityC","Need accomodation":"Yes"}
    ],
    "testname":"StudentAccom"
    }
   ]
 }
 */
