package Calling_parameters;

public class Test_2 {

	public void A1() {
		System.out.println("kundan");
	}
	
	public static void A2() {
		System.out.println("surve");
	}
	
	public void Add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void Sub(int a,int b) {
		System.out.println(a-b);
	}
	
	public void Multiple(int a,int b) {
		System.out.println(a*b);
	}
	
	public void Divide(int a,int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
          Test_2 text =new Test_2();
          text.A1();
          text.Add(10, 20);
          text.Add(35, 50);
          
          text.Sub(50, 15);
          
          text.Multiple(10, 5);
          
          text.Divide(20, 2);
          
          Test_2.A2();
	}

}
