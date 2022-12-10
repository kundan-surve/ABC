package Encapsalation;
		// By using get set method
public class A1 {

	private int RollNo;
	
		
	public void setRollNo(int RollNo) {
		
	this.RollNo=RollNo;	
	}
	public int getRollNo() {
		
		return RollNo;
	}
	
	public static void main(String[] args) {
		
		A1 a = new A1();
		
		a.setRollNo(101);
		
		System.out.println(a.getRollNo());
		
		a.getRollNo();

	}

}
