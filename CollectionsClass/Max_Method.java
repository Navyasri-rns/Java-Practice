import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max_Method {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(23);
		l.add(34);
		l.add(67);
		l.add(10);
		l.add(54);
		System.out.println("List: "+ l);
		System.out.println("Maximum value: "+ Collections.max(l));
	}

}
