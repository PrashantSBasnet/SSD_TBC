package listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {
	
	public static void main(String [] args) {
		
		//We create its instance using its implementation classes as it is an Interface
		List<String> a = new ArrayList<>(); //creating obj of ArrayList class. 
		
		List<Integer> l = new LinkedList<>();
		
		List<Double> v = new Vector<>();
		
		List<String> s = new Stack<>();
	
	}

}
