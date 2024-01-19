package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("One");
		h.add("Two");
		h.add("One"); //Ignoring duplicate elements
		h.add("Three");
		h.add("Four");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}

	}

}
