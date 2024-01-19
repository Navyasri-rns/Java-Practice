package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntC {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		int c = a.get(1); //get element at specified index
		System.out.println("Element at index 1: "+c);
		
		a.add(1,0);    //add element in between
		System.out.println(a);
		
		a.set(1, 7);  //set elements
		System.out.println(a);
		
		a.remove(2); //delete element
		System.out.println(a);
		
		//size of ArrayList
		int s = a.size();
		System.out.println("Size of ArrayList: "+s);
		
		//loops
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i));
		}
		System.out.println();
		
			Collections.sort(a);
			System.out.print("Sorting: "+a);
	}

}
