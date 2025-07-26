
// should be >1
// factors should be 2 (prime number divisible by 1 and it self) 

//print prime numbers between 50 to 150

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
       
		for(int i=51;i<150;i++) 
		{
					
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) {
					count++;
				}
				
			}
			
			if(count==2) {
				System.out.println("primeNumber: " + i);
				count =0;
			}
			else {
				count =0;
			}
			
		}	
	
	
		
		
	}

}
