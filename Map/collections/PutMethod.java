package collections;

import java.util.HashMap;
import java.util.Map;

public class PutMethod {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(1, "Onee"); //trying Duplicate key
		
		for(Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey()+":"+n.getValue());
		}
	}

}
