import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		File f = new File("Files") ;
		String[] list = f.list();
		
		ExecutorService executor = Executors.newFixedThreadPool(list.length);
		
		for(int i=0 ; i<list.length;i++) {
			
			String FileName = "Files/"+list[i] ; 
			Threds worker = new Threds(FileName,l);
            executor.execute(worker);
            
		}
		 executor.shutdown();
	
	        while (!executor.isTerminated()) {
	        	
	        }
	        
	        System.out.println("Finished all threads");
	        BubbleSort(l);
	        System.out.println(l);
	        TheMostPopularWord(l);
	        
		}
	
	public static void TheMostPopularWord(LinkedList l) {
		
		Node current  = l.getHead(); 
		int max = 0;
		Node CommonWord = null;
		
		while(current != null ) {
			if(current.getCounter() > max) {
				max = current.getCounter(); 
				CommonWord = current; }
			current=current.getNext();
		}
		System.out.println(CommonWord);

	}

	public static void BubbleSort(LinkedList list){ 

		boolean ans = true;
		while (ans) {
			ans = false;

			Node current = list.getHead();
			Node next = current.next;
			Node prev = null;

			while (next != null) {
				if(current.getWord().compareToIgnoreCase(next.getWord()) > 0) {

					Node temp = current;
					Node tempNextNext = next.next;
					current = next;
					current.next = temp;
					next = temp;
					next.next = tempNextNext;

					if (prev == null) { 
						list.setHead(current);
					} else {
						prev.next = current;
					}

					ans = true;
				}
				prev = current;
				current = current.next;
				next = current.next;
			}
		}
	}

	}

