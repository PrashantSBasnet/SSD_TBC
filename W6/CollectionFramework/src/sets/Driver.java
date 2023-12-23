   package sets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


/**
 * A set is a collection that does not allow duplicates elements to be stored
 * It has only two additional methods than Collection Interface: 
 * @author prashantsingh.basnet
 */
public class Driver {
	
	public static void main(String args[]) {
		
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		Room oxford = new Room("Oxford", "Premiere Room", 4, 200.00);
		
		//List<String> lsexample = new List<String>();
		List<String> lsexample2 = new ArrayList<>();

		//Set<String> stExample = new Set<String>();
		
		Set<String> stEg = new HashSet<>();
		Set<Double> stEg2 = new LinkedHashSet<>();
		Set<Integer> stEg3 = new TreeSet<>();
		Set<Float> str = new HashSet<Float>();
		Set<?> st2 = new HashSet<>();
		
		Set<Room> rooms = new HashSet<>();
		rooms.add(westminister);
		rooms.add(piccadilly);
		rooms.add(oxford);
		rooms.add(oxford);
		rooms.add(new Room("Oxford", "Premiere Room", 4, 200.00)); 
		
		for(Room x: rooms) {
			System.out.println(x);
		}
		
		Map<Integer,String> x = new HashMap<Integer,String>();
		Map<Integer,Object> x1 = new HashMap<>();
		x.put(1, "apple");
		
		Employee emp = new Employee("Suyog", 1343342);
		x1.put(1, emp);
		x1.put(2, new Employee("Manoj", 342342));
		
		
		Stack<Integer> abc;
		List<Integer> abc2 = new ArrayList<>(); 
		List<Integer> x2 = new LinkedList<>(); 
		
		ArrayList<Integer> y = new ArrayList<>();
		LinkedList<Double> z = new LinkedList<>();
		
		Stack<String> xzy = new Stack<>();
		List<String> abcd = new Stack<>();
		Vector<String> ab = new Stack<>();
		
		Queue<Double> abc3;
		Map<Integer,String> abc4;
		
		Set<String> abc5 = new HashSet<>();
				
		
		
		
	}

}


