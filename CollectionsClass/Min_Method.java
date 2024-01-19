import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Min_Method {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		l.add(26);
		l.add(78);
		l.add(9);
		l.add(37);
		l.add(12);
		System.out.println("List: "+l);
		System.out.println("Minimum Value: "+ Collections.min(l));
	}

}
