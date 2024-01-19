package collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class RemoveMethod {

	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<>();
		m.put(102, "Chinni");
		m.put(104, "Frooti");
		m.put(103,"Lucky");
		m.put(101, "Navya");
		for(Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey()+"  "+ n.getValue());
		}
		m.remove(101);
		System.out.println("After Invoking remove method: ");{
			for(Map.Entry n:m.entrySet()) {
				System.out.println(n.getKey()+"  "+n.getValue());
			}
		}
	}

}
