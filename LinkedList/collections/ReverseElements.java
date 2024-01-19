package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseElements {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("Anusha");
		l.add("Sravani");
		l.add("Bhargavi");
		
		Iterator<String> i = l.descendingIterator();
				while(i.hasNext()) {
					System.out.println(i.next());
				}
	}

}
