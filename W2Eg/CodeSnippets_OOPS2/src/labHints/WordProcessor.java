package labHints;

public class WordProcessor implements Counter{
	
	private String text="";
	
	String getText() {
		return text;
	}

	void setText(String text) {
		this.text=text;
	}

	@Override
	public int countWords(String sentence) {
		
		if (sentence == null) // use 'text' if null sentence given
			sentence = text;
		
		return sentence.split(" ").length;
	}
}
