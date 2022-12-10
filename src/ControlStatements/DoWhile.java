package ControlStatements;

public class DoWhile {

	// Do While
	public static void main(String[] args) {
		
		//task = print numbers from 1 to 10
		int a=1;
		do {
		System.out.println(a);
		a=a+1;
		}while (a<=10);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		// task=print the number from 10 to 1
		int b=10;
		do {
		System.out.println(b);
		b=b-1;
		}while (b>=1);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		//task = print the number from 156 to 111
		int c=156;
		do {
			System.out.println(c);
			c=c-1;
		}while (c>=111);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		//task = print the even and odd number from 456 to 785
		int d=456;
		do {
			System.out.println(d);
			d=d+2; // for even numbers
		}while (d<=785);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		int e=455;
		do {
			System.out.println(e);
			e=e+2; // for odd numbers
		}while (e<=785);
	}
	

}
