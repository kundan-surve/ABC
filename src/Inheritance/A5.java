package Inheritance;
		// Multilevel Inheritance
class A3 {
	
	public void m1(){
		
		System.out.println("this is class A3");
		
	}
}
class A4 extends A3{
	
	public void m2() {
		
		System.out.println("this is class A4");
	}
	
}

public class A5 extends A4 {
	
	public void m3() {
		
		System.out.println("this is class A5");
	}

	public static void main(String[] args) {
		
		A5 a = new A5();
		
		a.m1();
		a.m2();
		a.m3();

	}

}
