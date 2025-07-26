
public class PracticeConstructors {
	
	int i;
	int j;
	
	public int add() {
		int c = i+j;
		return c;
	}
	
	public PracticeConstructors() {
		i=10;
		j=20;
		
	}
	
	public PracticeConstructors(int i, int j) {
		this.i = i;
		this.j =j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeConstructors pc = new PracticeConstructors(100,100);
	    System.out.println(pc.add());	
	    
	    int i=100;
	  

	}

}
