package Collection;

import java.util.ArrayList;
import java.util.List;

public class A1 {

	public static void main(String[] args) {
		//Arraylist
		//1.allow duplicate values
		//2.we can handle by index 
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add("happiness");
		list.add(5);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);

	}

}
