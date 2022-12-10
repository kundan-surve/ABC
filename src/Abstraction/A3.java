package Abstraction;
		// Abstraction by using interface
interface A1{
	
	void m1(); // by default public

}
interface A2{
	
	void m2();
	
}
public class A3 implements A1,A2 {
	
	public void m1() {
		System.out.println("i am m1");
	}

	public void m2() {
		System.out.println("i am m2");
	}
	
	public static void main(String[] args) {
		
		A3 a = new A3();
		a.m1();
		a.m2();
		

	}

}

