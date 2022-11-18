
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class Yml_Reader {
/*
 * This app will read data from a yml file and display on console. 
 * It is maven proj but yet we can run this file as java file
 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws FileNotFoundException, YamlException {
		String path = System.getProperty("user.dir")+"/src/main/resources/test.yml";
		YamlReader reader = new YamlReader(new FileReader(path));//throws FileNotFoundException
        Map map = (Map)reader.read();//throws  YamlException 
        readArray(map,"testdata");
	}
    @SuppressWarnings("rawtypes")
	public static void readArray(Map mp, String key)
    {
    	List mainlist = (List)mp.get(key);//will get three array
    	//System.out.println(mainlist);
    	for(int i=0;i< mainlist.size();i++)
    	{
    	   Map testdetails = (Map)mainlist.get(i);
    	   System.out.println(testdetails);
    	   String testnm = (String)testdetails.get("testname");
    	   System.out.println("TestName : "+testnm);
    	   List data = (List) testdetails.get("data");
    	   getKeySet(data);
    	}   
    }
    
    @SuppressWarnings("rawtypes")
	public static void getKeySet(List dat)
    {
    	for(int i=0;i< dat.size();i++)
    	{
    	 Map data1 = (Map)dat.get(i);
    	 //System.out.println(data1);
    	 Set set = data1.keySet();
    	 Iterator it = set.iterator();
    	 while(it.hasNext())
	    	 {
	    		String key= (String)it.next();
	    		String value =(String) data1.get(key);
	    		System.out.println(key +" : "+value);
	    	 }
    	 
    	 
    	}//for
    	
    }//getKeySet
}//class
