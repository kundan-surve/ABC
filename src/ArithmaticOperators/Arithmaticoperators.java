package ArithmaticOperators;

public class Arithmaticoperators {
	
	public void Add(int a, int b) {
		System.out.println(a+b);
	}
    public void Sub(int a,int b) {
    	System.out.println(a-b);
    }
    public void Multiple(int a,int b) {
    	System.out.println(a*b);
    }
    public void Divide(int a,int b) {
    	System.out.println(b/a);
    }
    public void Modulus(int a,int b) {
    	System.out.println(a%b);
    }
    
    
    
	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		
		Arithmaticoperators xyz=new Arithmaticoperators();
		xyz.Add(a, b);
		xyz.Sub(a, b);
		xyz.Multiple(a, b);
		xyz.Divide(a, b);
		xyz.Modulus(a, b);
	}

}
