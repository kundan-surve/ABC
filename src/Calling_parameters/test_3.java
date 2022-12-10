package Calling_parameters;

public class test_3 {

	public void A1() {
		System.out.println("kundan");
	}
	public static void A2() {
		System.out.println("surve");
	}
	public void Add(int a,int b) {
		System.out.println(a+b);
	}
	public void Sub(int a, int b) {
		System.out.println(a-b);
	}
	public void Multilpe(int a,int b) {
		System.out.println(a*b);
	}
	public void Divide(int a,int b) {
		System.out.println(a/b);
	}
	
	
	
	
	public static void main(String[] args) {
		

		test_3 abc=new test_3();
		abc.A1();
		test_3.A2();
		abc.Add(25,75);
		abc.Sub(45, 22);
		abc.Multilpe(13, 6);
		abc.Divide(29, 4);
		
	}

}
