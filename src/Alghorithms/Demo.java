package Alghorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10,25,56,13,73,4};
		int[] sortedNumbers = {1,4,8,12,22,26,33,42,54,55,63,71,78,87,90,94};
		
		int pos = Alghorithms.Search.linearSearch(numbers,73);
		
		System.out.println(pos);
		
		int index = Alghorithms.Search.binarySearch(sortedNumbers, 78, 0, sortedNumbers.length -1);
		System.out.println(index);
		
		Sort.bubbleSort(numbers);
	}

}
