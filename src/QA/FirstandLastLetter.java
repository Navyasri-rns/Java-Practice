package QA;

import java.util.Scanner;

public class FirstandLastLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name");
		String a = sc.next();
		char d[]=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			char c = d[0];
			char n = d[d.length-1];
			if(c==n) {
				System.out.println("same letters");
				break;
			}
			else {
				System.out.println("not same");
				break;
			}
	}
	}

}
