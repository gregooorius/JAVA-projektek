
public class Function {

	public static void main(String[] args) {
		System.out.println(Nsum(3));
		
		System.out.println(Factorial(5));
		
		int[] arr = {3,5,7,12,5};
		System.out.println(Arraymin(arr));
		System.out.println(Arraymax(arr));
		System.out.println(Arrayavg(arr));

	}
	
	public static int Nsum (int n) {
		int sum = 0;
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			for (int i =1; i<=n; i++) {
				sum = sum + i;
			}
			return sum;
		}
	}
	
	public static int Factorial (int n) {
		
		 if (n >= 1) 
			return n * Factorial(n-1);
			else
				return 1;
		
	}
	
	public static int Arraymin (int arr[]) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	public static int Arraymax (int arr[]) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
		
	public static int Arrayavg (int arr[]) {
		int avg = 0;
		int sum = 0;
		for (int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum/arr.length;
	}

}
