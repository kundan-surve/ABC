package ControlStatements;

public class LoopStatements {

	public static void main(String[] args) {
		// for loop
		for(int a=0;a<10;a++) {
			System.out.println(a);
		}
		
		for (int a=9;a>=0;a--) {
			System.out.println(a);
		}
		
		// for loop for even and odd numbers
		for (int a=0;a<=10;a++) {
			if (a%2==0)
			System.out.println(a);
		}
				
		for (int a=10;a>=0;a--) {
			if (a%2!=0)
			System.out.println(a);
		}
	}
	

}
