package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("C");
		t.add("B");
		t.add("A");

		
		System.out.println(t);
		
		Iterator<String> i = t.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		NavigableSet<String> n = t.descendingSet();
		System.out.println(n);
	}

}
