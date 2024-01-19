package strings;

import java.util.StringTokenizer;

public class STokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("My name is Navyasri");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
