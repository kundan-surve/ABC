package Calling_parameters;

public class Test_1 {

	int a=10; //non static or instance variable
	static int b=20; //static variable
	
	public static void main(String[] args) {
		
		int c=30;
		System.out.println(c);
		
		System.out.println(Test_1.b);  // opt for static variable
		
		Test_1 xyz=new Test_1();
		System.out.println(xyz.a); // opt for non static variable

		System.out.println(Test_1.b);
		
		Test_1 abc =new Test_1();
		System.out.println(abc.a);
		
	}

}
