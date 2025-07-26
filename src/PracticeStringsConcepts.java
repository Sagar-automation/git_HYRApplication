
public class PracticeStringsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first repeated and non-repeated
		
		String data = "sagar testing string concepts";
		
	  String[] splitdata =  data.split(" ");
	  String[] arrayEvnPos = new String[2];
	  
	  String evnPosData;
	  
	  for(int i=0;i<splitdata.length;i++) 
	  {
		  //System.out.println(splitdata[i]);
		  
		  if(i%2==0) {
			 // System.out.print(splitdata[i] + " ");
			  //arrayEvnPos[i]=  splitdata[i];
			  evnPosData = splitdata[i];
			  System.out.println(evnPosData);
		  }
	  }
	  
	  //System.out.println(arrayEvnPos.toString());
	    
        
	}

}
