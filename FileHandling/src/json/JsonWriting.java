package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("JSONSTRING:...");
		JSONObject student1 = new JSONObject();
		student1.put("name","name1");
		student1.put("age","18");
		System.out.println(student1.toJSONString());
		System.out.println("JSONSTRING:...");
		JSONObject student2 = new JSONObject();
		student2.put("name","name2");
		student2.put("age","16");
		System.out.println(student2.toJSONString());
		System.out.println("JSONARRAY:...");
		JSONArray studentlist = new JSONArray();
		studentlist.add(student1);
		studentlist.add(student2);
		System.out.println(studentlist.toJSONString());
		
		System.out.println("JSONSTRING N ARRAY:...");
		JSONObject studentAll = new JSONObject();
		studentAll.put("students",studentlist);
		
		System.out.println(studentAll.toJSONString());
	}

}
