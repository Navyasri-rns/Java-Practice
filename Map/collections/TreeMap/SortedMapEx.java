package collections.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {

	public static void main(String[] args) {
		SortedMap<Integer, String> s = new TreeMap<>();
		s.put(102, "Two");
		s.put(104, "Four");
		s.put(103, "Three");
		s.put(101, "One");
		
		System.out.println("Head Map: "+ s.headMap(103));
		System.out.println("Tail map: "+s.tailMap(102));
		System.out.println("Sub map: "+ s.subMap(102, 104));
	}

}
