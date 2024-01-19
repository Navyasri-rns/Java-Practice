import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swap_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("Harsha");
		a.add("Vishnu");
		a.add("Nishanth");
		a.add("Karthik");
		a.add("Arjun");
		System.out.println("List: "+ a);
		
//		Collections.swap(a,2,4);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter from index ");
		int i = sc.nextInt();
		System.out.println("Enter to index ");
		int j = sc.nextInt();
		
		Collections.swap(a, i, j);
		System.out.println("List after swapping: "+a);
	}

}
