package listInterface;

import java.util.Iterator;
import java.util.Stack;



public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Object> s = new Stack<>();
		
		//LIFO
		s.push("A");
		s.push("B");
		s.push(13);  //Autoboxing is the process of converting a primitive type to its corresponding wrapper class (int to Integer)
		s.push(true);
		s.push(null);
		
		//----methods in Stack
	
		//Object o = s.pop(); //removes the value at the top (front)
		System.out.println(s);
		
		Object obj = s.peek();	//returns the value at the top (front)
		System.out.println (s.peek());
		
		System.out.println(s);
		
		System.out.println(s.empty());
		System.out.println(s.search(13));
		
	
		
		//--Use of Generics 
		
		Stack<Integer> intStack = new Stack<>();
		intStack.push(4);
		intStack.push(5);
		
		
	
		//-----------Iterator Examples ---------------------------------
		
		
		
		
		Iterator<Object> it = s.iterator(); //creating Iterator object
		
		while (it.hasNext()) { //returns true or false
			Object val = it.next(); 
			//System.out.println(val);
		}
		
	    Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(13);
        stack.push(15);

        Iterator<Integer> iterator = stack.iterator();
      
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element.equals(Integer.valueOf(13))) {
                iterator.remove();
            }
        }

        // Now, the elements '13' in the stack have been removed.
      // System.out.println(stack); // [12, 14, 15]
        
 
    }
}
