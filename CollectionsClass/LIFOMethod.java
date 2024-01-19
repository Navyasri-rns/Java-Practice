import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;

public class LIFOMethod {

	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<String>(5);
		d.add("Harsha");
		d.add("Anusha");
		d.add("Ruthwika");
		d.add("Ithihasa");
		d.add("Vishnu");
		Queue<String> q = Collections.asLifoQueue(d);
		System.out.println("LIFO order: "+q);
	}

}
