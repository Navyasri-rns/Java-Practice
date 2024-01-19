package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Cocurrent_LinkedQueueEx {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> c = new ConcurrentLinkedQueue<>();
		
		c.add(32);
		c.add(65);
		c.add(19);
		c.add(40);
		
		System.out.println("Elements in c: "+ c);
		c.remove(19);
		System.out.println("After invoking remove method: "+c);
		c.retainAll(c);
		System.out.println("After invoking retainAll method: "+ c);
		System.out.println("Contains(): "+c.contains(32));
		
		c.offer(77);
		System.out.println("After invoking offer method: "+c);

	}

}
