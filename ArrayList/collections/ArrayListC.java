package collections;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListC{
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("Navyasri");
		a.add("Anusha");
		a.add("Ruthwika");
		a.add("Ithihasa");
		
		Iterator<String> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}