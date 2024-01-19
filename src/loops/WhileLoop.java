package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=10){
//			System.out.println(i);
//			i++;
//		}
		
		//Fibonacci sequence 
//		Scanner input= new Scanner(System.in);
//		System.out.print("Enter the number of terms in the Fibonacci sequence to print");
//		int n=input.nextInt();
//		int f=0;
//		int s=1;
//		int i=1;
//		while(i<=n) {
//			System.out.print(f +" ");
//			int t=f+s;
//			f=s;
//			s=t;
//			i++;	
//			
//		}	
		
		//Factorial
//		Scanner input= new Scanner(System.in);
//		System.out.print("Enter a positive number");
//		int n = input.nextInt();
//		int factorial=1;
//		int i=1;
//		while(i<=n) {
//			factorial *= i;
//			i++;
//		}
//		System.out.println(n +"! is " + factorial);
		
		//Palindrome 
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any number");
//		int n=sc.nextInt();
//		int rev,temp,sum=0;
//		temp=n;
//		while(n>0) {
//			rev=n%10;
//			sum=(sum*10)+ rev;
//			n=n/10;	
//		}
//		if(temp==sum) {
//			System.out.println("Palindrome Number");
//		}
//		else {
//			System.out.println("Not a Palindrome Number");
//		}
		
		//Reverse a number
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp,sum=0;
		while(n>0) {
			temp=n%10;
			sum=(sum *10)+ temp;
			n=n/10;
		}
		System.out.println("The reverse of the given number is "+ sum);
		
		
		//Do While Loops
//		int i=0;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i<5);
	}

}
