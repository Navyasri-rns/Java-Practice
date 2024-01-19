package collections;

import java.util.LinkedList;
import java.util.List;

public class GetAndSetElements {

	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("Telugu");
		a.add("Hindi");
		a.add("English");
		a.add("Maths");
		
		System.out.println("Element at index 3: "+a.get(3));
		
		a.set(1, "Social");
//		System.out.println("After invoking set method: "+a);
		for(String b:a) {
			System.out.println(b);
		}
		
	}

}
