package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingElements {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<>();
		a.add(1);
		a.add(7);
		a.add(4);
		a.add(3);
		
		Collections.sort(a);
		for(Integer b: a) {
			System.out.println(b);
		}
	}

}
