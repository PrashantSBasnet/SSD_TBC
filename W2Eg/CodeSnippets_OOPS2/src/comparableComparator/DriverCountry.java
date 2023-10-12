package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DriverCountry {
	
	public static void main(String[] args) {
		
		
		ArrayList<Country> list = new ArrayList<>();
	       
			list.add(new Country(830000, "Nepal", 2015));
	        list.add(new Country(700000, "China", 2026));
	        list.add(new Country(880000, "India", 2027));
	        list.add(new Country(840000, "Russia", 2018));
	 
	      
	        Collections.sort(list);
	 
	        System.out.println("Countries after sorting (year) : ");
	      
	     
//	        for (Country country: list)
//	        {
//	            System.out.println(	country.getName() + " " +
//	            					country.getGdp() + " " +
//	            					country.getYear());
//	        }
	        
	       Iterator<Country> iterator = list.iterator();
	        
	        while (iterator.hasNext()) {
	        	String name = iterator.next().getName();
	        	
	        	if (name.equals("Nepal")) {
	        		iterator.remove();
	        	}
	        }
	        
	     for (Country country: list) {
	    	 System.out.println(country.getName());
	     }
	}
}

	        
	    
	


