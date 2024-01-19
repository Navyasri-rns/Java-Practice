package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class OfferfirstPollLast {

	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		d.add("Kohli");
		d.add("Glenn");
		d.add("Faf");
		d.offerFirst("ABD");
		d.offerLast("Chris Gayle");
		System.out.println("List:  "+d);
		
		d.pollLast();
		System.out.println(d);
	}

}
