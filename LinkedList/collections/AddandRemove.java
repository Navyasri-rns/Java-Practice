package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddandRemove {

	public static void main(String[] args) {
		//Add
		LinkedList<String> a1 = new LinkedList<>();
		a1.add("Harsha");
		a1.add("Vishnu");
		a1.add("Nishanth");
		System.out.println("Intial Elements: "+ a1);
		a1.add(1, "Vinay");
		System.out.println("After inserting element at index 1: "+ a1);
		LinkedList<String> a2 = new LinkedList<>();
		a2.add("Ram");
		a2.add("Raju");
		a1.addAll(a2);
		System.out.println("After adding a2: "+a1);
		
		LinkedList<String> a3 = new LinkedList<>();
		a3.add("Ajay");
		a3.add("Rahul");
		a1.addAll(1,a3);
		System.out.println("After adding a3 elements at index 1: "+a1);
		
		a1.addFirst("Vijay");
		System.out.println("After invoking addFirst Method: "+a1);
		
		a1.addLast("Hema");
		System.out.println("After invoking addLast Method: "+a1);
		
		//Remove
		System.out.println();		
		a1.remove("Rahul");
		System.out.println("After Removing Rahul: "+a1);
		
		a1.remove(0);
		System.out.println("After removing element at 0 index: "+a1);
		
		LinkedList<String> n = new LinkedList<>();
		n.add("Ram");
		n.add("Harsha");
		a1.addAll(n);
		System.out.println("Updated list: "+a1);
		
		a1.removeFirstOccurrence("Ram");
		System.out.println("After invoking removeFirstOccurence: "+a1);
		
		a1.removeLastOccurrence("Harsha");
		System.out.println("After invoking removeLastOccurence: "+a1);
		
		a1.clear();
		System.out.println("Clear Method: "+a1);
	}

}
