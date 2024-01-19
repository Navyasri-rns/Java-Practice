package strings;

import java.util.StringTokenizer;

public class STokenizerusingDelim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer s = new StringTokenizer("My,name,is,Navyasri");
		System.out.println("Next token is: "+ s.nextToken(","));
		System.out.println(s.countTokens());
	}

}
