
package collections;

import java.util.ArrayList;

public class AddRemove {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Navyasri");
		a.add("Chandu");
		a.add("Hema");
		System.out.println("Initial list of elements: "+a);
//		ArrayList<String> a1 = new ArrayList<>();
//		a1.add("Dilshad");
//		a1.add("Prasanna");
//		a.addAll(a1);
//		System.out.println("After invoking AddAll method: "+a);
//		ArrayList<String> a3 = new ArrayList<>();
//		a3.add("Saajan");
//		a3.add("Ravi");
//		a.addAll(3,a3);
//		System.out.println("After invoking AddAll method at index 3: "+a);

		//Remove method 
		a.remove("Hema");
		System.out.println("After removing Hema: "+a);
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Ram");
		a1.add("Raju");
		a.addAll(a1);
		System.out.println("After adding a1 elements: "+a);
		
		a.removeAll(a1);
		System.out.println("After RemovingAll a1 elements: "+a);
		a.clear();
		System.out.println("After invoking clear Method: "+ a);
	}

}
