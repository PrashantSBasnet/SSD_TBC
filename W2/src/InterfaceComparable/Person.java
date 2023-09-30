package InterfaceComparable;

public class Person implements Comparable<Person> {
	
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public int compareTo(Person otherPerson) {
	        // Compare persons based on their age
	    	
	    	//for ascending order
	        //return Integer.compare(this.age, otherPerson.age);
	    	  
	    	
	    	//for descending order
	    	if(age==otherPerson.age)    
	    		return 0;    
	    	else if(age<otherPerson.age)    
	    		return 1;   
	    	else    
	    		return -1;    
	    	}   
	    

	    @Override
	    public String toString() {
	        return "Person [name=" + name + ", age=" + age + "]";
	    }
	
}
