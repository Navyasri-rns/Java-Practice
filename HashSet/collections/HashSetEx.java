package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(7);
		h.add(5);
		
		//print all elements
		System.out.println(h);
		
		//search- Contains
		if(h.contains(7)) {
			System.out.println("h contains 7");
		}
		if(!h.contains(6)) {
			System.out.println("h does not contains 6");
		}
		h.remove(1);
		System.out.println(h);
		if(!h.contains(1)) {
			System.out.println("h does not contains 1");
		}
		//size
		System.out.println("Size of h is: "+h.size());
		
		//Iterator:-hasNext(),next()
		Iterator<Integer> i =h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
