import java.util.HashMap;
import java.util.*;

public class PracticeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer,String> emp = new HashMap <Integer,String>();
		
		emp.put(1, "sagar");
		emp.put(2, null);
		emp.put(3, "amar");

		Set<Integer> keyslist =   emp.keySet();
		Collection<String> valuesList =  emp.values();
		
		for(Integer k : keyslist) {
			System.out.println(k + "---->" + emp.get(k));
		}
		
		for(String val: valuesList) {
			
			System.out.println(val);
		}
		
		emp.remove(2);
		System.out.println(emp);

	}

}
