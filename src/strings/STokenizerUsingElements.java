package strings;

import java.util.StringTokenizer;

public class STokenizerUsingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer a = new StringTokenizer("Demonstrating Methods "
				+ "from StringTokenizer class "," ");
		while(a.hasMoreElements()) {
			//System.out.println(a.nextToken());
			System.out.println(a.nextElement());
		}
	}

}
