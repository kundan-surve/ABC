package String_Method;

public class A94 {

	public static void main(String[] args) {
		// split
		
		String a = "hey@how@are@you";
		
		String[] b = a.split("@");
		
		String c =  b[0];
		String c1 = b[1];
		String c2 = b[2];
		String c3 = b[3];
		
		System.out.println(c);   //hey
		System.out.println(c1);  //how
		System.out.println(c2);  //are
		System.out.println(c3);  //you
		
		

	}

}
