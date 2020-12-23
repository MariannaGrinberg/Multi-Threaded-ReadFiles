
public class LinkedList {
	
	// Attributes
	
	private Node head, tail;
	private int length;

	// Constructor
	
	public LinkedList() {
		
		head = tail = null;
		length = 0;
		
	}
	
	
	// Getters
	
	public Node getHead() {
		
		return head;
		
	}
	
	// isEmpty()
	
	public boolean isEmpty() {
		
		return head == null;
		
	}
	
	// addFirst
	
	public void addFirst(int Counter , String Word) {
		
		Node oldHead = head;
		head = new Node(Counter,Word);
		head.setNext(oldHead);
		
	}
	
	// addLast
	
	public void addLast(int Counter , String Word) {
		
		Node newTail = new Node(Counter ,Word );
		Node current = head;
		
		while (current.getNext() != null)
			current = current.getNext();
		
		current.setNext(newTail);
		
	}
	
	// setHead()
	
	public void setHead(Node newHead) {
		this.head = newHead;
	}


	// removeFirst
	
	public void removeFirst() {

		if (!(isEmpty())) {
			
			head = head.getNext();
			
			if (-- length == 0)
				tail = head;
			
		}
		
	}
	public int length() {
		
		return length;
		
	}
	
	// toString
	
	public String toString() {
		
		String strToReturn = "";
		Node current = head;
		
		if (head == null)
			return "The List Is Empty!";
		
		while (current != null) {
			
			strToReturn += "["+current.getWord()+","+current.getCounter() + "]->" + " ";
			current = current.getNext();

		}
		
		return strToReturn + "Null";
		
	}


	

}
