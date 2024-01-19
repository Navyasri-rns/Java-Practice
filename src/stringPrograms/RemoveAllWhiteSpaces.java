package stringPrograms;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any String");
//		String n = sc.next();
		String n = "Navya sri";
		
		n = n.replaceAll("\\s", "");
		System.out.println(n);
	}

}
