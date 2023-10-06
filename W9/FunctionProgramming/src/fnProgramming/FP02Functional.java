package fnProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,5,6,15,15,12);
		int sum = addListFunctional(numbers); //using stream 
		int sum2 = addListFunctionalLambda(numbers); //using lambda
		int sumOfSq = sumOfSqOfNumbersLambda(numbers);
		
		List<String> course = List.of("Java", "C#", "Angular", "Hadoop", "SpringBoot");
		
		
		distinctNumbers(numbers);
		sortNumbers(numbers);
		sortStringValues(course);
		customSort(course);
		
		//creating another list with doubled values of numbers List
		List<Integer> doubledNumbers = doubleList(numbers);
		
		//creating a list with even numbers filtered from the numbers list
		List<Integer> evenNumbers = evenNumbers(numbers);
		
		//creating list with length of all course titles
		List<Integer> courseTitles = courseTitles(course);
		
		//System.out.println(sumOfSq);
		
		
		//traditional method
		int sum3 = addListStructured(numbers);
		//System.out.println(sum3);
		
		//System.out.println(minMaxNumber(numbers));
	}
	
	
	
	
	
	private static List<Integer> courseTitles(List<String> course) {
		return course.stream()
				.map(x ->x.length()).collect(Collectors.toList());
	}

	
	private static List<Integer> evenNumbers(List<Integer> numbers) {
		return numbers.stream()
				.filter(number -> number%2==0)
				.collect(Collectors.toList());
	}

	
	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream()
				.map(number -> number*number)
				.collect(Collectors.toList()); //collecting in the list
	}


	private static void customSort(List<String> x) {
		x.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		//x.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//x.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		
	}



	private static void sortStringValues(List<String> x) {
		x.stream().sorted().forEach(System.out::println);
		
	}



	private static void sortNumbers(List<Integer> numbers) {
		 numbers.stream().sorted().forEach(System.out::println);
		
	}

	
	private static void distinctNumbers(List<Integer> numbers) {
		 numbers.stream().distinct().forEach(System.out::println);;
	}


	private static int sumOfSqOfNumbersLambda(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, (x,y)->x+y*y);
//      Alternatively,		
//		return numbers.stream()
//				.map(x->x*x).reduce(0, Integer::sum);
	}
	
	private static int sumOfOddNumbersLambda(List<Integer> numbers) {
		return numbers.stream()
				.filter(x -> x%2==1).reduce(0, Integer::sum);		
	}
	
	


	//traditional method
	private static int addListStructured(List<Integer> numbers) {
		int sum=0;
		for (int number:numbers) {
			//System.out.println(sum +" "+ number); to check the numbers
			sum= sum+number;
		}
		return sum;
	}

	
	//Using Lambda
	private static int addListFunctionalLambda(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, (x,y)->x+y);
			//	.reduce(0, Integer::sum); //using Integer class
	}
	
	//Using Lambda
	private static int minMaxNumber(List<Integer> numbers) {
		return numbers.stream()
			//	.reduce(0, (x,y)->x>y?x:y); //works only for positive values
				.reduce(Integer.MIN_VALUE, (x,y)->x>y?x:y); //finding maximum value --for both positive and negative
			//	.reduce(Integer.MAX_VALUE, (x,y)->x>y?y:x); //finding minimum value 
	}
	

	private static int sum (int aggregate, int nextNumber) {	
		return aggregate + nextNumber;
    	//    aggregated + nextNumber 
	}

	//using stream only
	private static int addListFunctional(List<Integer> numbers) {
		//Combine them into one result =>one value
		return numbers.stream()
				.reduce(0,FP02Functional::sum); //0+method()
		//0 12
		//12 9
	}
}