package listInterface;

import java.util.Iterator;
import java.util.Stack;



public class StackDemo {
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push(13);
		s.push(true);
		
		//----methods in Stack
	
		Object o = s.pop();
		System.out.println(s);
		
		Object obj = s.peek();	
		System.out.println(s);
		
		System.out.println(s.empty());
		System.out.println(s.search(13));
		
	
		
		
		
		//-----------Iterator Examples ---------------------------------
		
		
		
		
		Iterator it = s.iterator(); //creating Iterator object
		
		while (it.hasNext()) { //returns true or false
			Object val = it.next(); 
			//System.out.println(val);
		}
		
	    Stack stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(13);
        stack.push(15);

        Iterator iterator = stack.iterator();
      
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
