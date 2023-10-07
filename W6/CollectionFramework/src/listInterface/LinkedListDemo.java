package listInterface;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		//LinkedList linkedList2 = new LinkedList(Collection c); //using parameterized constructor of Linked List

		//available methods: all those present in Collection Interface, List Class and LinkedList
		linkedList.add("John"); //0 index
		linkedList.add(null);   //1 index
		linkedList.add(10);     //2 index
		
		System.out.println(linkedList);
		
		//set -- replaces value at particular index with supplied value
		linkedList.set(1, "Apple");
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		linkedList.addFirst("Adding"); //adds at 0 index 
		
		
		
	}

}
