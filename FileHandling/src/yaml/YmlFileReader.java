package yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;


public class YmlFileReader {
/*yamlbeans.jar needs to be configured into buildpath as a library
 * All curly brackets are Map(key value pair)and all square brackets are Lists(array)
    */
   
	public static void main(String[] args) throws FileNotFoundException, YamlException  {

		String path = System.getProperty("user.dir")+"/src/yaml/test.yml";
		FileReader file = new FileReader(path);
		YamlReader reader = new YamlReader(file);
		
		Map map1 = (Map)reader.read();
		System.out.println(map1);
		String s1 = (String)map1.get("doe");
		String s2 = (String)map1.get("ray");
		String s3 = (String)map1.get("pi");
		String s4 = (String)map1.get("xmas");
		String s5 = (String)map1.get("french-hens");
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n");
		
		List l1 = (List)map1.get("calling-birds");
		for(int i=0;i<l1.size();i++)
				{
			     System.out.println(l1.get(i));
				}
		Map map2 = (Map)map1.get("xmas-fifth-day");
		System.out.println(map2);
		String s11 = (String)map2.get("calling-birds");
		String s22 = (String)map2.get("french-hens");
		String s33 = (String)map2.get("golden-rings");
		System.out.println(s11+"\n"+s22+"\n"+s33+"\n");
		Map map11 = (Map)map2.get("partridges");
		
		System.out.println(map11.get("count"));
		
		System.out.println(map11.get("location"));
		String slast = (String)map2.get("turtle-doves");
		System.out.println(slast);
	}

}
//how to understand a yml file: https://www.cloudbees.com/blog/yaml-tutorial-everything-you-need-get-started
//it starts with a space
//after colon another space and then value
//an array is designated with another space and dash 