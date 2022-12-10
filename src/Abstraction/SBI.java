package Abstraction;
				//Task for finding rate of interest.
abstract class Bank{
	
	abstract void Roi();
}

class HDFC extends Bank{
	
	void Roi() {
		System.out.println("HDFC :-rate if interest is 2%");
	}
}
class Union extends Bank{
	
	void Roi () {
		System.out.println("Union:-rate if interest is 3.8%");
	}
}
class ICICI extends Bank{
	
	void Roi() {
		System.out.println("ICICI:-rate if interest is 2.2%");
	}
}
class IDBI extends Bank{
	
	void Roi() {
		System.out.println("IDBI :-rate if interest is 4.4%");
	}
}
class AXIS extends Bank{
	
	void Roi() {
		System.out.println("AXIS :-rate if interest is 6.3%");
	}
}
class CBI extends Bank{
	
	void Roi() {
		System.out.println("CBI  :-rate if interest is 4.2%");
	}
}
public class SBI extends Bank {
	
	void Roi () {
		System.out.println("SBI  :-rate if interest is 5%");
	}
	

	public static void main(String[] args) {
		
		HDFC HDFC = new HDFC();
		SBI SBI = new SBI();
		Union Union = new Union();
		ICICI ICICI = new ICICI();
		IDBI IDBI = new IDBI();
		CBI CBI = new CBI();
		CBI.Roi();
		AXIS AXIS = new AXIS();
		AXIS.Roi();
		IDBI.Roi();
		ICICI.Roi();
		Union.Roi();
		SBI.Roi();
		HDFC.Roi();

	}

}
