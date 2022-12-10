package Keywords;
		//used to call current class methods
public class A2 {
	
	public void m1() {		// if we pass parameter here 
		System.out.println("m1");
	}
	
	public void m2() {
		
		this.m1();			// so we have to pass its value here also
		System.out.println("m2");
	}

	public static void main(String[] args) {
		
		A2 a = new A2();
		a.m2();
		

	}

}
