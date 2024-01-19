package collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(102, "Chinni");
		t.put(104, "Frooti");
		t.put(103,"Lucky");
		t.put(101, "Navya");
		for(Map.Entry m:t.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}

	}

}
