package practice;

public class A5 {
		//Reverse String
	public static void main(String[] args) {
		
		String a = "anjali";
		int length = a.length();
		String rev="";
		for (int i=length-1;i>=0;i--) {
			
			rev= rev+a.charAt(i);
		}
			System.out.println(rev);	
			System.out.println("------");
			
			String b ="shyam";
			int LENGTH = b.length();
			String reverse = "";
			for (int j=LENGTH-1;j>=0;j--) {
				
				reverse = reverse+b.charAt(j);
			}
			System.out.println(reverse);

	}

}
