package Keywords;
		//cannot inherit the class by using final keyword
final class C6{
	
	public void m1() {
		System.out.println("hi");
	}
}
public class C5 extends C6 {
	
	public void m1() {
		System.out.println("hey");
	}

	
	public static void main(String[] args) {
		
		C5 a = new C5();
		a.m1();
		

	}

}
