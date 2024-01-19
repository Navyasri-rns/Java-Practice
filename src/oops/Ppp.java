package oops;

import java.util.Scanner;

public class Ppp {
	public static void main(String[] args) {
		int rev,tem,sum=0,count=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a palindrome number");
		int n=a.nextInt();
		tem=n;
		
		while(n>0) {
			rev=n%10;
			sum=sum*10+ rev;
			n=n/10;
			count++;
		}
			if(tem==sum) {
				System.out.println("It is a palindrome ");
			
				for(int i=1;i<=count;i++) {
					for(int j=count-1;j>=i;j--) {
						System.out.print("  ");
					}					
					for(int k=1;k<=i;k++) {
						System.out.print(tem+ " ");
					}
					if(count==3) {
						System.out.println(" ");
					}
					if(count==5) {
						System.out.println("   ");
					}
					if(count==7) {
						System.out.println("   ");
					}
				}
			}
			else {
				System.out.println("Entered number is not a Palindrome number");
		//		break;
			}
			System.out.println();
		}
	
	
}
