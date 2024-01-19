package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("Navya");
		a.add("Vidya");
		a.add("Bhargavi");
		
		String[] arr = a.toArray(new String[a.size()]);
		System.out.println("Printing Array: "+Arrays.toString(arr));
		System.out.println("Printing List: "+a);
	}

}
