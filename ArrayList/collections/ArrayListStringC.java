package collections;

import java.util.ArrayList;

public class ArrayListStringC {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Mango");
		a.add("Grapes");
		a.add("Guava");
		a.add("Watermelon");
		
		for(String fruits: a) {
			System.out.println(fruits);
		}
		System.out.println();
		
		a.set(2, "Banana");
		System.out.println(a);
		
		String c =a.get(3);
		System.out.println(c);
	}

}
