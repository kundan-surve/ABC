package Abstraction;
		// By using abstract

abstract class fruits {
	
	abstract void taste();
	
	}
	class mango extends fruits{
		void taste() {
			System.out.println("taste is sour");
		}
	}
public class apple extends fruits {

		void taste() {
			System.out.println("taste is sweet");
		}
		
	
	public static void main(String[] args) {
		fruits apple = new apple();
		fruits mango = new mango();
		mango.taste();
		apple.taste();
		
		
	}

}
