import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortMethod {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Chinni");
		a.add("Chinnu");
		a.add("Lucky");
		a.add("Frooti");
		a.add("Achu");
		
//		Collections.sort(a); // sorting string objects 
		Collections.sort(a,Collections.reverseOrder()); // sorting string objects in reverse order
		Iterator<String> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
