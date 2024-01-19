package collections;

import java.util.HashSet;

public class HashsetRemove {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<>();
		s.add("Navyasri");
		s.add("Anusha");
		s.add("Achu");
		System.out.println("Initial list: "+ s);
		s.remove("Achu");
		System.out.println("After Invoking remove(): "+s);
		
		HashSet<String> s1 = new HashSet<>();
		s1.add("Deepika");
		s1.add("Nishitha");
		s.addAll(s1);
		System.out.println("Updated list: "+s);
		
		s.removeAll(s1);
		System.out.println("After invoking removeAll(): "+s);
		
		s.clear();
		System.out.println("After invoking clear(): "+s);
		
	}

}
