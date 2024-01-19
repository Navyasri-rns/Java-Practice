package threads;

import java.util.Scanner;

public class Navyaaa {
	public static void main(String[] args) {
		//Fibonacci
//		int n1 = 0, n2=1,n3,count =10;
//		for(int i=2;i<count;i++) {
//			n3=n1+n2;
//			System.out.println(n3);
//			n1 = n2;
//			n2 = n3;
//		}
		
		//Prime Number
//		int n =7,temp=0;
//		for(int i=2;i<=n-1;i++) {
//			if(n%i==0) {
//				temp = temp+1;
//			}
//		}
//		if(temp>0) {
//			System.out.println(n+" is not a prime number");
//		}
//		else {
//			System.out.println(n+" is a prime number");
//		}
		//Ascii value
//		int ch1 = 'a';
//		int ch2 = 'b';
//		System.out.println(ch1);
//		System.out.println(ch2);
		
		//Palindrome
//		int temp,r,sum=0;
//		int n=545;
//		temp=n;
//		while(n>0) {
//			r=n%10;
//			sum=sum*10+r;
//			n=n/10;
//		}
//		if(temp ==sum) {
//			System.out.println(temp+" is a palindrome number");
//		}
//		else {
//			System.out.println(temp+" is not a palindrome number");
//		}
		//Factorial
//		int r, fact =1;
//		int n = 5;
//		for(int i=1;i<=n;i++) {
//			fact = fact*i;
//		}
//		System.out.println(n+" Factorial is "+fact);
		//Armstrong
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any Armstrong number");
//		int n = sc.nextInt();
//		int temp,r,sum = 0;
//		temp = n;
//		while(n>0) {
//			r= n%10;
//			sum = sum+(r*r*r);
//			n =n/10;
//		}
//		if(temp ==sum) {
//			System.out.println(temp+" is a Armstrong number");
//		}
//		else {
//			System.out.println(temp+" is not a Armstrong number");
//		}
		
		//Numbers to words
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = in.nextInt();
		if(n<0||n>999) {
			System.out.println("Enter valid number");
		}
		else {
			int u = n%10;
			int tt = n/10;
			int t = tt%10;
			int h = n/100;
			String uw[] = {" ","one","two","three","four","five","six","seven","eight","nine","ten",
					"eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String tw[] = {" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
			String hw = "hundred";
			if(n<20) {
				System.out.println(uw[n]);
			}
			else if(n<100){
				System.out.println(tw[t]+" "+uw[u]);
			}
			else {
				System.out.println(uw[h]+" "+hw+" "+tw[t]+" "+uw[u]);
			}
		}
		
	}
}
