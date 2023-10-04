package interfaceWorking;

public class Application {
	
	public static void main(String [] args) {
		Contract contract = new Implementation();
		printTerms(contract);
	}
	
	//passing Contract object
	private static void printTerms(Contract contract) {
		contract.term1(); //using interface to invoke term1()
		contract.extendedTerm(); //this method is part of contract through inheritacne 
	}

}
