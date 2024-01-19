package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {

	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("Dhoni");
		a.add("Virat");
		a.add("Sachin");
		a.add("ABD");
		
		ListIterator<String> l = a.listIterator();
		System.out.println("Traversing Elements in Forward Direction");
		while(l.hasNext()) {
			System.out.println("Index: "+l.nextIndex()+" Value: "+l.next());
		}
		System.out.println("Traversing Elements in reverse Direction: ");
		while(l.hasPrevious()) {
			System.out.println("Index: "+l.previousIndex()+" Value: "+l.previous());
		}
	}
}
