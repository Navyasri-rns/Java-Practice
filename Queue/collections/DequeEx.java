package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		d.add("Navyasri");
		d.add("Chandu");
		d.add("Hema");
		
		for(String s:d) {
			System.out.println(s);
		}
		System.out.println("Size: "+d.size());
		System.out.println("RemoveLast Method: "+ d.removeLast());
		System.out.println("Deque after removing Last element: "+d);

	}

}
