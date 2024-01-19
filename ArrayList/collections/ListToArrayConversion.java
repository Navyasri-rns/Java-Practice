package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayConversion {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Apple");
		l.add("Mango");
		l.add("Banana");
		l.add("Grapes");
		
		String[] arr = l.toArray(new String[l.size()]);
		System.out.println("Array: "+ Arrays.toString(arr));
		System.out.println("List: "+ l);
	}

}
