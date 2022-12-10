package Keywords;
		//use to invoke current class constructor
public class A3 {
	
	A3(String c){
		System.out.println("a3");
	}
	
	A3(int b){
		this("abc");
		System.out.println("2nd con");
	}

	public static void main(String[] args) {
		

		A3 a = new A3(10);
	}

}
