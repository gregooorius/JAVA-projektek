
public class Numbers {
	
	public static void main(String[] args) {
		System.out.println("Progress is starting");
		printName();
		int numA= 10;
		int numB = 20;
		addNumbers(numA, numB);
		//int prod = multiplyNumbers(numA, numB);
		System.out.println(multiplyNumbers(numA, numB));
	}
	static void printName(){
		System.out.println("My name is tim");
	}
	
	static void addNumbers(int numberA, int numberB ) {
		int sum = numberA + numberB;
		System.out.println("The Sum of numbers" + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product, product);
		return product;
	}
	
}
