package QA;

import java.util.Scanner;

public class MobileNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Mobile Number: ");
		long n = sc.nextLong();
		int count = 0;
		long r=0;
		 
		while(n>0) {
			r=n%10;
			n = n/10;
			count++;
			
		}
		if(count==10) {
			System.out.println("Yes it is having 10 digits");
		}
		else {
			System.out.println("Enter 10 digits \nThe numbers u have entered is  "+count+" digits");
		}
			
		}
	}


