package collections;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_HashMapEx {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<>();
		c.put(1, "One");
		c.put(4, "Four");
		c.put(3, "Three");
		System.out.println(c);
		c.putIfAbsent(2, "Two");
		System.out.println("After invoking putIfAbsent(): "+c);
	}

}
