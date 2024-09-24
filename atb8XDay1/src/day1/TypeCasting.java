package day1;

public class TypeCasting {

	public static void main(String[] args) {
		
		//implicit Casting
				byte b =10;
				int a = b;
				
				System.out.println(a);
				
				//Explicit Casting
				
				int a1 = (int) b; //valid explicit
			

			
			//narrowing
			//bigger buscket data int small buscket data
			
			int s = 300;
			byte i = (byte) s;
			
			
			//another example of widening
			
			int sa = 50;
			double number = sa; //implicit widening
			System.out.println(number);
			
			double numberExpl = (double) sa; //Explicit widening
			System.out.println(numberExpl);
			
			//another example of narrowing
			// int n = 300;
			// byte k = n;
			// System.out.println(k); // this will give error because its implicit narrowing
			
			 int n = 300;
			 byte k = (byte) n;
			 System.out.println(k); // example of narrowing with explicit examples
			 

	}

}
