package Keywords;
		//cannot override the method by using final keyword
class C3{
	final public void m1() {
		System.out.println("hello");
	}
}
public class C2 extends C3 {
	
	/*public void m1() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
		C2 a = new C2();
		a.m1();

	}*/

}
