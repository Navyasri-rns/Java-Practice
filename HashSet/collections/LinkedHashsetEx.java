package collections;

import java.util.LinkedHashSet;

public class LinkedHashsetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> Li = new LinkedHashSet<>();
		Li.add("Navya");
		Li.add("Anusha");
		Li.add("Nishanth");
		Li.add("Navya");
		System.out.println("Initial List: "+Li);
		
		LinkedHashSet<String> Le = new LinkedHashSet<>();
		Le.add("Ruthwika");
		Le.add("Ithihasa");
		Li.addAll(Le);
		System.out.println("After invoking addAll(): "+ Li);
		Li.remove("Ruthwika");
		System.out.println(Li);
	}

}
