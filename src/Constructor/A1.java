package Constructor;

public class A1 {

	//Argument Constructor
	A1(int a, String b){
		System.out.println(a);
		System.out.println(b);
	}
	
	//No-Argument Constructor
	A1(){
		System.out.println("hello"); 
	}
	
	
	public static void main(String[] args) {

		A1 a = new A1(10, "xyz"); //this syntex is for no argument
		
		//A1 a = new A1(); this syntex is for no argument
		// we can't write both syntex at the same time 
	}

}
