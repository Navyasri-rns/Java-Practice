package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HsAnotherCollection {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Harsha");
		a.add("Vishnu");
		a.add("Nishanth");
		
		HashSet<String> h = new HashSet<>(a);
		h.add("Arjun");
		h.add("Ajay");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
