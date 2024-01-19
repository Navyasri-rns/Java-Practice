package collections;

import java.util.TreeSet;

public class HighestLowestValues {

	public static void main(String[] args) {
		TreeSet<Integer> n = new TreeSet<>();
		n.add(77);
		n.add(63);
		n.add(23);
		n.add(56);
		n.add(3);
		
		System.out.println("Lowest value: "+n.pollFirst());
		System.out.println("Highest value: "+n.pollLast());
		System.out.println("Closest Greatest Element to 59 is: "+n.ceiling(59));
		System.out.println("Closest Least Element to 59 is: "+n.floor(59));
	}

}
