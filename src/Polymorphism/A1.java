package Polymorphism;
		//method overloading


public class A1 {
	
	public void login(String emailid,int pass) {
		System.out.println("login to fb");
		System.out.println("navigate to home page");
		
	}
	
	public void login(int mob, String pass) {
		System.out.println("login to fb");
		System.out.println("navigate to home page");
	}

	public static void main(String[] args) {
		
		A1 a = new A1();// we can call any method from method overloading
		
		a.login("kundan@gamil.com", 123456);
		
		a.login(862301095, "kundan");
		//here auto transfer is used when we pass different data type  
	}

}
