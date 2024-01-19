package strings;

import java.util.ArrayList;

public class SEqual {

	public static void main(String[] args) {
			String str1 = "Navya";
			ArrayList<String> s = new ArrayList<>();
			s.add("Anusha");
			s.add("Navya");
			s.add("Navyasri");
			s.add("sravani");
			for(String str: s) {
				if(str.equals(str1)) {
					System.out.println("Navya is present");
				}
			}
	}

}
