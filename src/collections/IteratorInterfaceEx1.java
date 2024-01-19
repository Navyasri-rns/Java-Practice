package collections;

import java.util.HashMap;
import java.util.Iterator;

public class IteratorInterfaceEx1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		h.put(10, "Navya");
		h.put(15, "Chandu");
		h.put(20, "Hema");
		h.put(25, "Dilshad");
		h.put(30, "Saajan");
		
		Iterator<Integer> i = h.keySet().iterator();
		while(i.hasNext()) {
			int key = (int)i.next();
			System.out.println("Roll no: "+ key+ "  "+" Name: "+ h.get(key));
		}
	}

}
