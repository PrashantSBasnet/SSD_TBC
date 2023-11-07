package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandleMultipleExceptions {

	public static void handleMultipleException() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			// Input a number as a string
			System.out.print("Enter a number: ");
			String input = reader.readLine();

			// Attempt to convert the string to an integer
			int number = Integer.parseInt(input);

			// Attempt to divide 10 by the entered number
			int result = 10 / number;

			System.out.println("Result: " + result);
			
		} catch (NumberFormatException e) {
			// Handle NumberFormatException
			System.err.println("Invalid input. Please enter a valid number.");
			
		} catch (ArithmeticException e) { 
			// Handle ArithmeticException
			System.err.println("Division by zero is not allowed.");
			
		} catch (IOException e) {
			// Handle IOException
			System.err.println("An I/O error occurred while reading input.");
			
		} finally {
			System.out.println("bye");
			try {
				reader.close();
			} catch (IOException e) {
				// Handle IOException from closing the reader
				System.err.println("An error occurred while closing the reader.");
			}
		}
	}
}
