package Exepction;

public class TryCatch {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try {
			int c = a/b;
		}catch (ArithmeticException e) {
			System.out.println("Cannot devide by zero");
			System.out.println(e.toString());
			}
		
		String[] state = {"TX","NY", "AL","FL"};
		
		for (int i =0; i<=state.length; i++) {
			try {
				
			
			System.out.println(state[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("out of the array domain");
				System.out.println(e.toString());
			}
		}
			
		
		
		System.out.println("Program closing");
   }
}
