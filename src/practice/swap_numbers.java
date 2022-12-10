package practice;

public class swap_numbers {

	public static void main(String[] args) {
		//swap 2 numbers without using 3rd variable
		
		int a=10,b=20;
		
		a=a+b; //10+20=30 so a=30
		b=a-b; //30-20=10 so b=10
		a=a-b; //30-10=20 so a=20
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
