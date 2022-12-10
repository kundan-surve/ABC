package Polymorphism;
		//method overriding
		//here method name is same, arguments also same 
		//but class is different and they are in a relationship
class A3{
	public void greetings(String b,int c) {
		System.out.println("hi");
	}
	
}

public class A2 extends A3 {
	public void greetings(String d,int e) {
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		
		A2 a = new A2();
		a.greetings("kundan", 10);
		

	}

}
