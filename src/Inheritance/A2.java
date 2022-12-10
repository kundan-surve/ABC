package Inheritance;
		//Single Inheritance
class A1{
	public void m1() {
		System.out.println("this class is A1");
	}
		
}

public class A2 extends A1 {
	
	public void m2() {
		System.out.println("this class is A2");
	}

	public static void main(String[] args) {
		
		A2 a = new A2();
		a.m1();
		a.m2();

	}

}
