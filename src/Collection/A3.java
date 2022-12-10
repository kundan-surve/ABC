package Collection;

import java.util.HashMap;
import java.util.Map;

public class A3 {
		//HashMap (here we use put method)
	public static void main(String[] args) {
		

		Map map = new HashMap();
		
		map.put("Name", "kundan");
		map.put("RollNo", "55");
		map.put("Div", "A");
		map.put("Class", "VI");
		map.put("Marks", "66"); 
		
		System.out.println(map.get("Name")); // here we have to call method by using get
		System.out.println(map.get("RollNo"));
		System.out.println(map.get("Div"));
		System.out.println(map.get("Class"));
		System.out.println(map.get("Marks"));
	}

}
