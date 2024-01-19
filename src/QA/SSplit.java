package QA;

import java.util.Scanner;

public class SSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Input: ");
		String s = sc.next();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(((int)ch>=65) && ((int)ch<=90) || ((int)ch>=97) && ((int)ch<=122) 
					|| ((int)ch>=48) && ((int)ch<=57)) {
				continue;
			}else {
				s = s.replace(ch, ' ');
			}
		}
		String b[] = s.split(" ");
		for(String e:b) {
			System.out.println(e);
		}
	}

}
