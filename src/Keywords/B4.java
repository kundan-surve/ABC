package Keywords;
		//use to invoke parent class constructor
class B5{
	B5(int a){
		System.out.println("B5");
	}
}
public class B4 extends B5{
	
	B4(){
	
	     super(10);
	     System.out.println("B4");
}	

	public static void main(String[] args) {
		
		B4 c = new B4();
		

	}

}
