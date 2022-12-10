package Keywords;
		//used to call parent class methods
class b1{
	public void m1(char a) {
		System.out.println("m1");
	}
}
public class B3 extends b1 {
	
	public void m2() {
		
		super.m1('a');
		System.out.println("m2");
	}

	public static void main(String[] args) {
		
		B3 c = new B3();
		
		c.m2();
		

	}

}
