package collections;

import java.util.HashMap;
import java.util.Map;

public class RemoveMethod {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("One", 1);
		m.put("Two", 2);
		m.put("Three", 3);
	
		System.out.println("Initial List: ");
//		for(Map.Entry n:m.entrySet()) {
//			System.out.println(n.getKey()+"  "+ n.getValue());
//		}
		m.remove("One");
		System.out.println(m);
		m.remove("Three", 3);
		System.out.println(m);
	}

}
