package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String[] arr = {"C","C++","Python","Java"};
		System.out.println("Array: "+ Arrays.toString(arr));
		
		List<String> l = new ArrayList<>();
		for(String lang:arr) {
			l.add(lang);
		}
		System.out.println("List: "+ l);
	}

}
