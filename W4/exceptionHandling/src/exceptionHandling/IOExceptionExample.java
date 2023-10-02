package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Checked - Compile Time Error 
 * 
 * @author prashantsingh.basnet
 *
 */
public class IOExceptionExample {
	 
	public static void ioExceptionExample() {
		 
		String filePath = "nonexistentfile.txt";

     try {
    	 
         FileReader fileReader = new FileReader(filePath);
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         String line;
         while ((line = bufferedReader.readLine()) != null) {
             System.out.println(line);
         }

         bufferedReader.close();
     } catch (IOException e) {
         // Handle the IOException
         System.err.println("An IOException occurred: " + e.getMessage());
     }
 }

}
