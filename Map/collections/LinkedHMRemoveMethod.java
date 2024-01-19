package collections;

import java.util.LinkedHashMap;

public class LinkedHMRemoveMethod {

	public static void main(String[] args) {
		LinkedHashMap<String, String> l = new LinkedHashMap<>();
		l.put("Navya", "One");
		l.put("Anusha", "Two");
		l.put("Deepika", "Three");
		System.out.println("Initial list: "+l);
		l.remove("Deepika");
		System.out.println("After Invoking remove method: "+ l);
	}

}
