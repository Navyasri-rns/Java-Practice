package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ALListIterator {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Mango");
		a.add("Apple");
		a.add("Banana");
		
//		ListIterator<String> l = a.listIterator();
//		while(l.hasNext()) {
//			System.out.println(l.next());
//		}
//		ListIterator<String> l = a.listIterator(a.size());
//		while(l.hasPrevious()) { //element iterates in reverse order
//			String s = l.previous();
//			System.out.println(s);
		
		for(String s: a) {
			
		}
		System.out.println(a);
	}
}
