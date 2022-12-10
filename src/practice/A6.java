package practice;

public class A6 {
		//Reverse Number
	public static void main(String[] args) {
		
		int a = 54321;
		 int rem,rev=0;			//rem = reminder
		 while(a!=0) {
			 
			 rem=a%10;
			 rev=rev*10+rem;
			 a=a/10;
		 }
		 System.out.println(rev);
	}

}
