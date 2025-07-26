import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PracticeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> names = new ArrayList<String>(Arrays.asList("goog","xom","aapl","goog"));


		ArrayList<Character>  alphabets = new ArrayList<Character>();
		alphabets.add('c');


		ArrayList<String> cloneList =    (ArrayList<String>) names.clone();
		System.out.println(cloneList);

		System.out.println(names.lastIndexOf("goog"));
		System.out.println(names.indexOf("goog"));
		//System.out.println(numbers);
		System.out.println(alphabets);



		names.contains("goog");

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,1,3,2,4,5));
		System.out.println(numbers);
		
		numbers.removeIf(num -> num%num != 0);
		System.out.println(numbers);
		
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>(numbers);
		
		

	}

}
