package fnProgramming;

import java.util.List;

//Lambda Expression is a simpler way of defining another method. 
//number -> number%2==0
public class LamdaExpression {

	public static void main(String[] args) {
		printEvenNumbersInFunction(List.of(12,2,3,4,5));
		printAllCourses(List.of("Spring Boot", "Angular", "React"));
		
		List<String> courses = List.of("Spring Boot", "Angular", "React", "Java");
		printFilteredCourses(courses);
		printCourses(courses);
		printCharCountinCourses(courses);
		
		List<Integer> number = List.of(12,2,3,4,5);
		printEvenNumbersInFunction(number);
	}
	
	private static void printCharCountinCourses(List<String> courses) {
		courses.stream()
		    .map(course-> course + ":" + course.length())
			.forEach(System.out::println);
		
	}

	private static void printSquaresofEvenNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2==0)
			.map(number -> number *number) //mapping expression
			.forEach(System.out:: println);
	}

	private static void printCourses(List<String> coursesWithFourLetters) {
		
		coursesWithFourLetters.stream()
			.filter(courses -> courses.length()==4)
			.forEach(System.out:: println);
	}

	private static void printFilteredCourses(List<String> filteredCourses) {
		filteredCourses.stream()
			.filter(courses -> courses.contains("Spring"))
			.forEach(System.out::println);
	}

	private static void printAllCourses(List<String> courses) {
		courses.stream()
			.forEach(System.out::println);
	}

	private static void print(int number) {
		System.out.println(number);
	}

	
	private static void printEvenNumbersInFunction(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2==0) //Lambda Expression
			.forEach(System.out::println);  //Method Reference
	}
	
	
}
