package collections;

import java.util.ArrayList;

public class SizeCapacity {

	public static void main(String[] args) {
		//Size of ArrayList
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("Size of ArrayList: "+ a.size());
		
		//Capacity of ArrayList
		ArrayList<String> b = new ArrayList<>(10);
		System.out.println("Size of ArrayList with capacity 10: "+b.size());
	}

}
