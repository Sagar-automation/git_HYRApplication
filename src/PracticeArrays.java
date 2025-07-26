import java.util.Arrays;

public class PracticeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array1 = {"chai", "coffee","sugar"};
		String[] array2 = {"milk", "water", "coke"};
		
		String[] array3 = new String[array1.length+array2.length];
				
		for(int i=0;i<array1.length;i++) {
		   array3[i]=	array1[i];
		   
		}
		
	    
	    for(int j=0;j<array2.length;j++) {
	    	array3[array1.length+j] = array2[j];
	    	
	    }
	    
	   for(int k=0;k<array3.length;k++) {
		   System.out.println(array3[k]);
	   }
	   
	   
	   for(String data:array3) {
		   System.out.print(data + " " );
	   }
	   
	   //System.out.println(Arrays.toString(array3));

	}

}
