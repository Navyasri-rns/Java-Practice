package collections;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Blocking_QueueEx {

	public static void main(String[] args) {
		BlockingQueue<String> b = new LinkedBlockingDeque<>();
		b.add("A");
		b.add("B");
		b.add("C");
		b.add("D");
		b.add("E");
		
		System.out.println("The Content of Linked Blocking Deque is: ");
		System.out.println(b);
		
		//Accessing Elements
		if(b.contains("C")) {
			System.out.println("C founded in the queue");
		}
		else {
			System.out.println("Not found");
		}
		
		//Deleting elements
		b.remove("C");
		b.poll();
		System.out.println(b);
		
		//Iterating through the elements
		Iterator<String> a = b.iterator();
		for(int i=0;i<b.size();i++) {
			System.out.println(a.next());
		}
		
		//drainTo() method
		BlockingQueue<String> c = new LinkedBlockingDeque<>();
		c.drainTo(b);
		System.out.println("drainTo(): "+c);
	}

}
