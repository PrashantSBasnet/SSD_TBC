package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[]args) {
	
		//creating empty Stream
		Stream<String> streamEmpty = Stream.empty();
		
		//Stream of any Collection
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		
		//Stream of Array
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		
		//create a stream out of an existing array or of part of an array
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		
		//When builder is used, the desired type should be additionally specified in the right part of 
		//the statement, otherwise the build() method will create an instance of the Stream<Object>	 
		Stream.<String>builder().add("a").add("b").add("c").build();

		/*
		 * The generate() method accepts a Supplier<T> for element generation.
		 * As the resulting stream is infinite, the developer should specify the desired size, 
		 * or the generate() method will work until it reaches the memory limit
		 */
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		
		//iterating stream 
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);


	}

}
