package collections.TreeMap;

import java.util.TreeMap;

public class pollFirst_pollLast {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(6, "Apple");
		t.put(13, "Grapes");
		t.put(-12, "Mango");
		t.put(1, "Watermelon");
		t.put(22, "Banana");
		
		System.out.println(t);
		System.out.println("Poll first: "+t.pollFirstEntry());
		System.out.println("Poll last: "+ t.pollLastEntry());
		
		
	}

}
