package collections;

import java.util.HashMap;
import java.util.Map;

public class AddElements {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(101, "Navya");
		hm.put(102, "Divya");
		hm.put(103, "Kavya");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
			hm.putIfAbsent(104, "Chandu");
			System.out.println("After Invoking putIfAbsent() Method: ");
			for(Map.Entry m: hm.entrySet()) {
				System.out.println(m.getKey()+" : "+m.getValue());
			}
			
			Map<Integer, String> h = new HashMap<>();
			h.put(105, "Hema");
			h.put(106, "Suma");
			
			h.putAll(hm);
			for(Map.Entry a:h.entrySet()) {
				System.out.println(a.getKey()+" : "+a.getValue());
			}
		
	}

}
