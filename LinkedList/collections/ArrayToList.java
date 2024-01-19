package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[] arr = {"Mango","Grapes","Guava"};
		System.out.println("Printing Array: "+Arrays.toString(arr));
		
		List<String> l = new ArrayList<>();
		for(String a:arr) {
			l.add(a);
		}
		System.out.println("Printing List: "+l);
	}

}
