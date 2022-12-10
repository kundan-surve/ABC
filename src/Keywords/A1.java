package Keywords;
			//this keyword refer to current class instance variable

		
public class A1 {
	
	int a;
	
	public void m1(int a) {
		
		this.a=a;
		System.out.println(this.a);
		
	}
		
	public static void main(String[] args) {
		
		A1 b = new A1();
		b.m1(10);
		

	}

}
