package collections.TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx {

	public static void main(String[] args) {
		NavigableMap<Integer, String> n = new TreeMap<>();
		n.put(102,"Two");
		n.put(103, "Three");
		n.put(104, "Four");
		n.put(101, "One");
		
		System.out.println("Desending Map: "+ n.descendingMap());
		System.out.println("Head Map: "+n.headMap(103));
		System.out.println("Tail Map: "+n.tailMap(102));
		System.out.println("Sub Map: "+ n.subMap(102, 104));
		System.out.println("subMap: "+n.subMap(101, false, 104, true));
	}

}
