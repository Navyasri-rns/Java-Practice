package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Navya");
		a.add("Anusha");
		a.add("Navya");
		a.add("Divya");
//		System.out.println(a);
		Iterator<String> i =a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
