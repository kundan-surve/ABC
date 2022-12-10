package ControlStatements;

public class whileloop {

	// while loop
	public static void main(String[] args) {
		// task= print numbers from 1 to 10
				int a=0;
				while (a<=10) {
					System.out.println(a);
					a++; // or here we can write 'a=a+1;' also.
				}
				System.out.println("--------------------------------------------------------------------------------------------------------------");
				
				 // task= print numbers from 10 to 1
				 int b=10;
				 while (b>=0) {
					 System.out.println(b);
					 b=b-1;
				 }
				 System.out.println("--------------------------------------------------------------------------------------------------------------");
				 
				 // task=print the numbers from 156 to 111
					
					int c= 156;
					while(c>=111) {
						System.out.println(c);
						c=c-1;
					}
					System.out.println("--------------------------------------------------------------------------------------------------------------");
					
					//. print the even and odd numbers from 456 to 785
					int d= 456;
					while (d<=785) {
						System.out.println(d);
						d=d+2; // for even numbers
					}
					System.out.println("--------------------------------------------------------------------------------------------------------------");
					int e=455;
					while(e<=785) {
						System.out.println(e);
						e=e+2; // for odd numbers
					}
					System.out.println("--------------------------------------------------------------------------------------------------------------");
					
	}

}
