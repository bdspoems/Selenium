package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReading {

	public static void main(String[] args) throws IOException, ParseException {
		String path = System.getProperty("user.dir")+"/src/jsonfile.json";
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(path);
		JSONObject hotelmenu=(JSONObject)parser.parse(reader);
		System.out.println(hotelmenu.toJSONString());
		
		System.out.println("\n");
		JSONObject menu = (JSONObject)hotelmenu.get("menu");
		System.out.println(menu.toJSONString());
		
		String id = (String)menu.get("id");
		System.out.println(id);
		
		String value = (String)menu.get("value");
		System.out.println(value);
		
		JSONObject popup = (JSONObject)menu.get("popup");
		System.out.println(popup.toJSONString());
		
		JSONArray menuitem = (JSONArray)popup.get("menuitem");
		for(int i=0;i<menuitem.size();i++)
		{
			JSONObject menuitems =(JSONObject) menuitem.get(i);
			Set<String> hs = menuitems.keySet();//Set is unordered and not indexed. 
			//this way even if keys in each array vary, your data can be printed properly
			//System.out.println("onclick:"+menuitems.get("onclick"));
			//System.out.println("value:"+menuitems.get("value"));
			Iterator<String> it = hs.iterator();
			while(it.hasNext()) {
			     String mykey = (String) it.next();
		       	 System.out.println(mykey+menuitems.get(mykey));
			}//while
		}
			
		    
	}

}
