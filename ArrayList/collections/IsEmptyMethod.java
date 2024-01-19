package collections;

import java.util.ArrayList;

public class IsEmptyMethod {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		System.out.println("Is ArrayList Empty: "+ a.isEmpty());
		a.add("Ram");
		a.add("Ravi");
		a.add("Raju");
		System.out.println("After Insertion of elements: "+a);
		System.out.println("Is ArrayList Empty after insertion: "+a.isEmpty());
	}

}
