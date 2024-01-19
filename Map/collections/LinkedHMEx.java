package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHMEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
		l.put(1, "Aman");
		l.put(2, "Ajay");
		l.put(3, "Arun");
		
//		for(Map.Entry m:l.entrySet()) {
//			System.out.println(m.getKey()+"  "+m.getValue());
//		}
		System.out.println("Keys: "+l.keySet());
		System.out.println("Values:  "+l.values());
		System.out.println("Key-Value pairs:  "+l.entrySet());
	}

}
