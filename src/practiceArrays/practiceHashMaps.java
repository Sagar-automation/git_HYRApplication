package practiceArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class practiceHashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		
		hm.put(1, "sagar");
		hm.put(2, "vidya");
		hm.put(3, "amaravathi");
		
		hm.put(1, "Amaravathi");
		hm.put(2, "sagar");
		//hm.remove(3);
		hm.putIfAbsent(3, "Vidya");
		
		
		
		
		
		Set<Integer> allkeys =hm.keySet();
		
	
		
		for(Integer key: allkeys) {
			System.out.println(key + " " + hm.get(key));
			
		}
		
    
		
	//	Entry<key,value>
		
	Set <Entry<Integer,String>> entries =	hm.entrySet();
	
	for(Entry<Integer,String> entry : entries) {
		System.out.println(entry.getKey());
		
	}
	
	
	Set<String> names = new HashSet();
	names.add("apple");
	names.add("apple");
	
	for(String name : names) {
		System.out.println(name);
	}
	
	
	
   List<String> sym = new ArrayList<>();
   sym.add("msft");
   sym.add("goog");
   
   sym.get(1);
   
   
   
	
	
	
	
	
	
		
	}

}
