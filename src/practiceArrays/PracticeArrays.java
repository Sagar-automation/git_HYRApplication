package practiceArrays;

public class PracticeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[2];
		
		String na = "test,test2,test3";
		String[] aftersplit =	na.split(",");
		
		for(int i=0;i<na.length();i++) 
		{
		names[i]	=aftersplit[i];
		}
		
		System.out.println(names[2]);

	}

}
