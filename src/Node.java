
public class Node {
	
	// Attributes
	
	Node next;
	private int Counter;
	private String Word;
	
	// Constructor
	
	public Node(int Counter , String Word) {
		
		this.Counter = Counter;
		this.Word = Word;
		
	}
	
	// getValue()
	
	public int getCounter() {
		
		return Counter;
		
	}
	
	// getNext() {
	
	public Node getNext() {
		
		return next;
		
	}
	
	// getWord()
	public String getWord() {
		return Word;
	}
	
	// setNext()
	
	public void setNext(Node next) {
		this.next = next;
		
	}
	
	// setCounter()
	
	public void setCounter(int Counter) {
		this.Counter = Counter;
	}
	
	
	// toString()
	
	public String toString() {
		return "["+this.getWord()+","+this.getCounter() + "]";
		
	}

}
