package Collection;

import java.util.HashSet;
import java.util.Set;

public class A2 {

	public static void main(String[] args) {
		// Hashset
		//1.do not work on index value
		//2.do not use index
		
		Set set = new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		set.remove(2);
		
		System.out.println(set);
		
		System.out.println(set.contains(2));
		
		set.clear();
		
		System.out.println(set.isEmpty());

	}

}
