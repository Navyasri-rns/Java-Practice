package collections;

import java.util.TreeSet;

public class NavigableSetOperations {

	public static void main(String[] args) {
		TreeSet<String> e = new TreeSet<>();
		e.add("A");
		e.add("B");
		e.add("C");
		e.add("D");
		e.add("E");
		
		System.out.println("Initial set: "+ e);
		System.out.println("Reverse set: "+e.descendingSet());
		System.out.println("Head Set: "+e.headSet("C", true));
		System.out.println("Subset: "+ e.subSet("A", false, "E", false));
		System.out.println("Tail Set: "+e.tailSet("C",true));
	}

}
