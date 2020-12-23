import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFromFiles {

	static Object lock = new Object();
	
	public static void readFile(String fileName ,LinkedList l ) throws IOException{
		
	BufferedReader reader = new BufferedReader(new FileReader(fileName));
	String line = reader.readLine();
	int Counter = 1;
	
	try {	
		while (line != null) {
			synchronized(lock) {
				if (!excist(line, l)) 
				l.addFirst(Counter, line);
				
				else {
				Node n = l.getHead();
				
				while (!n.getWord().equals(line)) 
					n=n.getNext();
				
				n.setCounter(n.getCounter()+1);
				
				}
				
				line = reader.readLine();
			} 
		}
	} finally {	
		
		reader.close();	
		
	}

	
}
	
	private static boolean excist(String Word, LinkedList other) {
		int count = 0; 
		Node OtherCurrent = ((LinkedList) other).getHead(); 
		while (OtherCurrent != null ) {
		if (Word.equals(OtherCurrent.getWord())) {
			count++;
		}
		OtherCurrent = OtherCurrent.getNext();
	}
		if(count >0)
			return true;
		return false; 
	}

	

	
}




