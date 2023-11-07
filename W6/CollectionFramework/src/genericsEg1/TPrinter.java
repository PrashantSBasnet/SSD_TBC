package genericsEg1;

//Type parameter defined in <>
public class TPrinter<T> {

	T thingToPrint;
	
	public TPrinter(T thingToPrint) {
		this.thingToPrint= thingToPrint;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
}
