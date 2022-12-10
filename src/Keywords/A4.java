package Keywords;
		//super keyword refer to parent class instance variable

class a5{
	int a;
}
public class A4 extends a5 {
	
	public void m1(int a) {
		super.a=a;
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		
		A4 b = new A4();
		
		b.m1(10);
		
		System.out.println();
		
		

	}

}
