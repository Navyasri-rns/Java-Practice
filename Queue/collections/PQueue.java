package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("Ajay");
		q.add("Raju");
		q.add("Ram");
		q.add("Ravi");
		q.add("Jai");
		
//		System.out.println("List:  "+q);
		System.out.println("Head:  "+q.element());//retrives-head
		System.out.println("Head:  "+q.poll());//retrives and removes-head
		System.out.println("Head:  "+q.peek());//retrives-head
		System.out.println("Queue elements: ");
		Iterator<String> i = q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		q.poll();
//		System.out.println(q);
		System.out.println("After removing one element");
		Iterator<String> i1 = q.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
