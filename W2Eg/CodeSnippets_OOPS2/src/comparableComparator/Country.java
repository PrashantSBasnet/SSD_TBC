package comparableComparator;

//Comparable is an interface defining strategy of comparing an object with other objects of the same type
//"Natural Ordering"
public class Country implements Comparable<Country>  {
	
	private double gdp; 
	private String name;
	private int year;

	
	//we define strategy in this implemented method
	@Override
	public int compareTo(Country c) {
		//return this.year-c.year;
		return Integer.compare(this.year, c.year); //natural ordering
	}


	public Country(double gdp, String name, int year) {
		
		this.gdp = gdp;
		this.name = name;
		this.year = year;
	}


	public double getGdp() {
		return gdp;
	}


	public void setRating(double gdp) {
		this.gdp = gdp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	

}
