package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DriverCountry {
	
	public static void main(String[] args) {
		 
		ArrayList<Country> list = new ArrayList<Country>();
	       
			list.add(new Country(830000, "Nepal", 2015));
	        list.add(new Country(700000, "China", 2016));
	        list.add(new Country(880000, "India", 2017));
	        list.add(new Country(840000, "Russia", 2018));
	 
	        Collections.sort(list);
	 
	        System.out.println("Countries after sorting (year) : ");
	      
	     
	        for (Country country: list)
	        {
	            System.out.println(	country.getName() + " " +
	            					country.getGdp() + " " +
	            					country.getYear());
	        }
	        
	      
//	        //--use of iterator
//	        Iterator<Country> iterator = list.iterator(); 
//	        
//	        while (iterator.hasNext()) {
//	        	
//	        	if (iterator.next().getName()=="Nepal") 
//	        		iterator.remove();
//	        	
//	        	System.out.println(iterator.next().getName());
//	        }
	      
	    }
	}


