package Constructor;


	public class A2_constructor  {
		String name;
		int eng;
		int math;
		int sci;
		

		A2_constructor (String name,int eng, int math,  int sci){
			
			this.name=name;
			this.eng=eng;
			this.math=math;
			this.sci=sci;
			System.out.println(this.name+"  "+this.eng+"  "+this.math+"  "+this.sci);
			
		}
		public static void main(String[] args) {
			System.out.println("     Marksheet");
			System.out.println("---------------------");
			System.out.println("name"+"   "+"eng"+"  "+"math"+"  "+"sci");
			System.out.println("---------------------");
			A2_constructor  a = new A2_constructor("Tony   ",50,58,86);
			A2_constructor  a1 = new A2_constructor("Stev   ",51,59,52);
			A2_constructor  a2 = new A2_constructor("Bruse  ",51,59,52);
			A2_constructor  a3 = new A2_constructor("Natasha",51,59,52);
			A2_constructor  a4 = new A2_constructor("Groot  ",51,59,52);
			A2_constructor  a5 = new A2_constructor("Wanda  ",51,59,52);
			A2_constructor  a6 = new A2_constructor("Batan  ",51,59,52);
			A2_constructor  a7 = new A2_constructor("Vision ",51,59,52);
			A2_constructor a8 = new A2_constructor("Thor   ",51,59,52);
			A2_constructor a9 = new A2_constructor("Nick   ",51,59,52);
		}

	}


