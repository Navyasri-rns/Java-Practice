package oops;

import java.util.Scanner;

public class PalindromePyramid {
	static String Palindrome(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;	
		}
		int k=0;
		if(temp==rev) {
				k=temp;
				return k+" ";
		}
		else {
			return"Not a Palindrome";
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any palindrome number");
		int a=sc.nextInt();
			for(int i=1;i<=5;i++) {
				if(Palindrome(a).equals("Not a Palindrome")) {
					System.out.println("Entered number is not a palindrome");
					break;
				}else {
					for(int s=1;s<=5-i;s++) {
						System.out.print("   ");
					}
					for(int j=1;j<=i;j++) {
						System.out.print(Palindrome(a)+"  ");
					}
					System.out.println();
				}
			}
	}

}
