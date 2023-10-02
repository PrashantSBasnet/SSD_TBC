package exceptionHandling;

public class NullPointerExceptionExample {

	public static void nullPointer() {

		try {
			String text = null;
			int length = text.length(); // This will throw a NullPointerException
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public static void nullPointerObject() {
		Object obj = null;
		obj.toString(); // This will throw a NullPointerException
	}

	public static void nullPointerArray() {
		int[] numbers = null;
		int firstNumber = numbers[0]; // This will throw a NullPointerException
	}

	public static void nullinConditional() {
		String name = null;
		if (name.equals("John")) {
			// This will throw a NullPointerException
		}
	}

	public static void nullReferences() {
		NullPointerExceptionExample myObject = null;
		String result = myObject.getName().toUpperCase(); // This will throw a NullPointerException

	}

	private String getName() {
		return "Apple";
	}

}
