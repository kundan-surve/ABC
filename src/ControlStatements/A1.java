package ControlStatements;
         // 1.selectional/conditional Statements
public class A1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		
		// 1.simple if
		
		if (a>b) {
			System.out.println("bugspotter");
		}
			
        // 2. if else
		
		if (a<b) {
			System.out.println("a>b");
		}else {
			System.out.println("a=b");
		}
		
		//3.if else if
		
		if (a<b) {
			System.out.println("a>b");
		}else if(a<=b){
			System.out.println("a<=b");
		}else if (a==b) {
			System.out.println("a==b");
		}else 
			System.out.println("text");
		
		//4. nested if
		
		if (a>b) {
			
			if (a==b) {
				System.out.println("bug");
			}else {
				System.out.println("abc");
			}
		}
			
		
	}

}
