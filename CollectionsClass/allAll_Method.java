import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class allAll_Method {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Navyasri");
		a.add("Anusha");
		a.add("Ithihasa");
		a.add("Ruthwika");
		
		System.out.println("List: "+a);
		boolean b = Collections.addAll(a, "Deepika","Nishitha");
		System.out.println("Boolean result: "+b);
		System.out.println("Collection value: "+a);
	}

}
