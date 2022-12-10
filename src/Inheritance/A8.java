package Inheritance;
		//Hierarchical Inheritance
class A6 {
	public void m1() {
		System.out.println("this is class A6");
	}
}
class A7 extends A6{
	public void m2() {
		System.out.println("this is class A7");
	}
}
public class A8 extends A6 {
	public void m3() {
		System.out.println("this is class A8");
	}

	public static void main(String[] args) {
		A7 a = new A7();
		a.m1();
		a.m2();
		//a.m3(); //if we want to execute m3 then we have to create the object 
				  //of class A8
		
		// in this Hierarchical Inheritance we have create the object of that
		// class which we want to execute 
		

	}

}
