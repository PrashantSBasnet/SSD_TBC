package comparableComparator;

class Person implements Comparable<Person> {
	
	String surname, forename; 
	
	Person (String surname, String forename){
		this.surname = surname; 
		this.forename = forename;
	}
	
	@Override
	public int compareTo(Person other) {
		int result = surname.compareTo(other.surname); // compare surname
		
		if (result == 0)
			result = forename.compareTo(other.forename); // compare forename
		return result;
		
		
	}
	
	public String toString() {
		return "'" + surname + "," + forename + "'";
	 }
	
}

