package collections.TreeMap;

import java.util.TreeMap;

public class Replace_Contains {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(6, "Apple");
		t.put(13, "Grapes");
		t.put(-12, "Mango");
		t.put(1, "Watermelon");
		t.put(22, "Banana");
		
		System.out.println(t);
		System.out.println("contains key 6: "+t.containsKey(6));
		System.out.println("Contains Value: "+t.containsValue("Apple"));
		
		System.out.println("Replace: "+t.replace(6, "Orange"));
		System.out.println(t);
		System.out.println(t.replace(1, "Watermelon", "Guava"));
		System.out.println(t);
		
//		t.replaceAll((k,v)->"Navya");
//		System.out.println("After Invoking replaceAll method using Lamda Expression: "+t);
		
		
		System.out.println("Get method: "+t.get(1));
		System.out.println("GetorDefault Method: "+t.getOrDefault(6, "Navya"));
}
}