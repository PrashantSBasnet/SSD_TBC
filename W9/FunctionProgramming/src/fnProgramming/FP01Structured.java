package fnProgramming;

import java.util.List;

public class FP01Structured {
	
	public static void main(String[] args) {
		
		printAllNumbersInListStructured(List.of(12,2,3,4,5));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number: numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number: numbers) {
			if(number%2==0) {
				System.out.println(number);
			}
		}
	}

}
