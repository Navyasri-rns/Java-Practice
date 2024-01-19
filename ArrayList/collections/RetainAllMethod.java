package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllMethod {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Anusha");
		a1.add("Ruthwika");
		a1.add("Ithihasa");
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("Navyasri");
		a2.add("Ruthwika");
		a2.add("Ithihasa");
		
		a1.retainAll(a2);
//		System.out.println(a1);
		Iterator<String> i = a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
