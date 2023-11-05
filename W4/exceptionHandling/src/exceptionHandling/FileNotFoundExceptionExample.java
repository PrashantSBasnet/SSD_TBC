package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Checked Exception, Type of IOException
 * 
 * @author prashantsingh.basnet
 *
 */
public class FileNotFoundExceptionExample {

	public static void fileNotFoundException(){
		
		String filePath = "nonexistentfile.txt";
		
		try {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			
		} catch (FileNotFoundException e) { //more specific exception
			// Handle the FileNotFoundException
			System.err.println("The file " + filePath + " was not found."); //this message gets generated
			
		} catch (IOException e) { 
			// Handle other IOExceptions
			System.err.println("An IOException occurred: " + e.getMessage());
		}
	}

}
