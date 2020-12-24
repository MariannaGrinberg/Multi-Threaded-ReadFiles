import java.io.IOException;

public class Threds implements Runnable{

	// Attributes
	
	public String fileName; 
	public LinkedList l = new LinkedList();
	
	// Constructor
	
	public Threds(String s ,LinkedList l) {
		
		this.fileName = s ; 
		this.l = l ;
	
	}
	
	@Override
	public void run() {
		
		try {
			
			ReadFromFiles.readFile(fileName , l);
		
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
		
	}

}
