package ArithmaticOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		
	System.out.println(a<b&&a>b);
	System.out.println(a>b&&a<b);
    System.out.println(a<b&&b>a);
    System.out.println(a==b&&a<=b);
    System.out.println(a>=b&&a==b);
    
    
    System.out.println(a<b||a>b);
    System.out.println(a>b||a<b);
    System.out.println(a==b||a<=b);
    System.out.println(a>=b||a==b);
    
	System.out.println(!(a>b));
	System.out.println(!(a<b));
	System.out.println(!(a==b)); 

	}

}
