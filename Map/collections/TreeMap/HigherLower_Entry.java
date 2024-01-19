package collections.TreeMap;

import java.util.TreeMap;

public class HigherLower_Entry {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(6, "Apple");
		t.put(13, "Grapes");
		t.put(-12, "Mango");
		t.put(1, "Watermelon");
		t.put(22, "Banana");
		
		System.out.println(t);
		
		System.out.println("Higher Entry: "+t.higherEntry(5));
		System.out.println("Higher key: "+t.higherKey(0));
		
		System.out.println("Lower Entry: "+t.lowerEntry(15));
		System.out.println("Lower Key: "+t.lowerKey(25));
		t.clear();
		System.out.println("After Invoking clear method: "+ t);
	}

}
