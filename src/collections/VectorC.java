package collections;

import java.util.Vector;

public class VectorC {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Tiger");
		v.add("Lion");
		v.add("Dog");
		v.add("Elephant");
		
		System.out.println("Size: "+ v.size());
		System.out.println("Capacity: "+v.capacity());
		//Adding elements using addElements Method
		v.addElement("Deer");
		v.addElement("Peacock");
		
		System.out.println("Elements are: "+v);
		System.out.println("Size after invoking addElement Method: "+v.size());
		System.out.println("Capacity after invoking addElement Method: "+v.capacity());
		
		System.out.println("Removing element at index 3: "+v.remove(3));
	}

}
