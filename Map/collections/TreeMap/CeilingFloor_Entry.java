package collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class CeilingFloor_Entry {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<>();
		m.put(6, "Apple");
		m.put(13, "Grapes");
		m.put(-12, "Mango");
		m.put(1, "Watermelon");
		m.put(22, "Banana");
		
	//	System.out.println(m);
		System.out.println("Ceiling Entry: "+m.ceilingEntry(8));
		System.out.println("Ceiling key: "+m.ceilingKey(0));
		
		System.out.println("Floor Entry: "+m.floorEntry(0));
		System.out.println("Floor key: "+m.floorKey(5));
		
		
//		for(Map.Entry n: m.entrySet()) {
//			System.out.println(n.getKey()+"  "+n.getValue());
//		}
		
	}

}
