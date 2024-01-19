package collections.TreeMap;

import java.util.TreeMap;

public class FirstLast_Entry {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(6, "Apple");
		t.put(13, "Grapes");
		t.put(-12, "Mango");
		t.put(1, "Watermelon");
		t.put(22, "Banana");
		
		System.out.println(t);
		System.out.println("First key: "+t.firstKey());
		System.out.println("First entry: "+ t.firstEntry());
		
		System.out.println("Last key: "+t.lastKey());
		System.out.println("Last Entry: "+t.lastEntry());
	}

}
