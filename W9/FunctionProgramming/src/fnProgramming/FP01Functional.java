package fnProgramming;

import java.util.List;

//Functional Programming- we focus on what to do
//stream is a sequence of elements
public class FP01Functional {
	
	public static void main(String[] args) {
		
		printAllNumbersInListFunctional(List.of(12,2,3,4,5));
		printEvenNumbersInFunction(List.of(12,2,3,4,5));
	}
	
	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//[12,2,3,4,5]
		//convert into stream of elements
		//12
		//2
		//3
		//4
		//6
		
		numbers.stream()
			.forEach(FP01Functional::print); //for each element do a print
		                                     //call print method present in FP01Functional class
											 //Method Reference
		//you can do this as well
//		numbers.stream()
//		.forEach(System.out::print);	
	}
	
	
	private static void printEvenNumbersInFunction(List<Integer> numbers) {
		numbers.stream()
			.filter(FP01Functional::isEven) //Filter - Only allow even numbers
			.forEach(System.out::println);  //Method Reference
	}
	
	
	private static boolean isEven(int number) {
		return number%2==0;
	}

}
