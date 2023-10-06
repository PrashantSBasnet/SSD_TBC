package fnProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.NumberUpSupported;

/**
 * Intermediate Operations: .distinct(), .sorted(), .filter(), /stream()
 * Intermediate operations are operations that can be chained together to form a pipeline of transformations on the elements of a stream. 
 * 
 * Terminal Operation: 
 * Terminal operations in Java's Stream API are operations that trigger the processing of the stream and produce a final result or perform an action.
 * .forEach, .collect, .reduce()
 * @author prashantsingh.basnet
 *
 */
public class FP02StreamOperations {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,5,6,15,15,12);
		
		numbers.stream() 
		.distinct() //returns Stream<T>
		.sorted() //returns Stream<T>
		.forEach(System.out::println);
	
	
	List<Integer> squaredNumbers = numbers.stream()
			.map(number -> number*number)  //returns Stream<T>
			.collect(Collectors.toList()); //list
	
	List<Integer> evenNumbersOnly = numbers.stream()
			.filter(x -> x%2 ==0) //Stream<T> 
			.collect(Collectors.toList()); //Terminal Operation
	
	int sum = numbers.stream()
			.reduce(0, (x,y)-> x*x+y*y);
	
	int greatest = numbers.stream()
			.reduce(Integer.MIN_VALUE,(x,y)->x<y?x:y);  //returns back specific type
	
	List<String> courses = List.of("Spring", "Spring Boot", "Angular", "React", "Hadoop");
	
	List<String> coursesByLengthOfCourseTitle = courses.stream()
			.sorted(Comparator.comparing(str -> str.length()))
			.collect(Collectors.toList());
	}
}