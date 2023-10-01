package labHints;

import java.util.Scanner;

public class Driver {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = s.nextLine();
		//Create an instance, ok to use Counter as the type since the WordProcessor is a typeof Counter
		Counter wp = new WordProcessor();
		
		System.out.println("Words:"+ wp.countWords(sentence));
	}

}
