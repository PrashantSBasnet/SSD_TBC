package queueInterface;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	
		PriorityQueue<String> pq2 = new PriorityQueue<>(20);
	
		//PriorityQueue pq3 = new PriorityQueue(int initialCapacity, Comparator c);

		SortedSet<String> s = new TreeSet<>();
		//PriorityQueue pq4 = new PriorityQueue(SortedSet s);
		
		//List l = new ArrayList();
		//PriorityQueue pq4 = new PriorityQueue(l);
		
		//Despite the order in which our integers were added to the PriorityQueue, 
		//we can see that the retrieval order is changed according to the natural order of the numbers
		PriorityQueue<Integer> integerQueue = new PriorityQueue<>();

		integerQueue.add(9);
		integerQueue.add(2);
		integerQueue.add(4);

		int first = integerQueue.poll();
		int second = integerQueue.poll();
		int third = integerQueue.poll();

		//since it is priority queue, output will be in natural order
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}
}
