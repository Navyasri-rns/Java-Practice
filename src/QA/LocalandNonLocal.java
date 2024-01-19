package QA;

import java.util.Scanner;

class LocalandNonLocal{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any city name");
			String c = sc.next();
			c=c.toLowerCase();
//			String d = "Khammam";
			if(c.equals("khammam")) {
				System.out.println("Local");
			}else {
				System.out.println("Non Local");
			}
		}
	}