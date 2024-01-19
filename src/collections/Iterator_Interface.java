package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Interface {

	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<>();
		cityNames.add("Hyderabad");
		cityNames.add("Delhi");
		cityNames.add("Calcutta");
		cityNames.add("Bhuvaneshwar");
		cityNames.add("Vishakapatnam");
		
		Iterator<String> i = cityNames.iterator();
		System.out.println("CityNames Elements: ");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
