package pattern;

import java.util.Scanner;

public class Alphabet_BJLMNOPQRSTUVWXYZ {

	public static void main(String[] args) {
		//Scanner is applicable for BJLMNO Letters
		Scanner re = new Scanner(System.in);
		int n= re.nextInt();
//		B Letter
		for(int i=1; i<=n; i++)
		{
			for(int j=1;j<=n;j++) {
				if((i==1 && j<=n-1) || (i==n/2+1 && j<=n-1) || (i==n && j<=n-1) || j==1 
						|| (j==n && i!=1 && i!=n && i!=n/2+1)) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//J Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1 || j==n/2+1 ||
//						i==4 && j==1 || i==5 && j==1 || i==5 && j==2) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//L Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j==1 || i==n) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		//M Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j==1 || j==5 || i+j==6 && i<=3 || (i==j && i<=3) ) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
       //N Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j==1 || j==n || i==j ) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		O Letter
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if((i==1 & j>=2 && j<=4) || (j==1 && i>=2 && i<=4) || 
//						(j==5 && i>=2 && i<=4) || (i==5 && j>=2 && j<=4)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//P Letter
//		Scanner sc=new Scanner(System.in);
//		int m= sc.nextInt();
//		int n=sc.nextInt();
//		for(int i=1;i<=m;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j==1 || (i==1 && j!=4) || (i==3 && j!=4) || (i==2 && j==4)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//Q Letter
//		Scanner sc=new Scanner(System.in);
//		int n= sc.nextInt();
////		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if((i==1 && j>=2 && j<n) || (j==1 && i>=2 && i<n-1) || (i==n-1 && j>1 && j<n) ||
//						(j==n && i>1 && i<n-1) || (i==j && i>=n-2)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//R Letter
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number of rows");
//     	int m= sc.nextInt();
//     	System.out.println("Enter the number of columns");
//		int n=sc.nextInt();
//		int k=1;
//		for(int i=1;i<=m;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j==1 || (i==1 && j!=n) || (i==3 && j!=n) || (i==2 && j==n) ||
//						(i+j==k)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//			k=k+2;
//		}
		//S Letter
//		Scanner re= new Scanner(System.in);
//		int n=re.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1 || i==3 || i==n || (i==2 && j==1) || (i==4 && j==n)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//T Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1 || j==n/2+1) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//U Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if((j==1 && i!=n) || (j==n && i!=n) || (i==n && j!=1 && j!=n)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//V Letter
//		int i=4;
//		int j=7;
//		for(i=1;i<=4;i++) {
//			for(j=1;j<=7;j++) {
//				if(i==j || i+j==8) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		//W Letter
//		Scanner sc=new Scanner(System.in);
//		int n= sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j==1 || j==5 || (i==j && i>=3) || (i+j==6 && i>=3)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		//X Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==j || i+j==6) {
//					System.out.print("x");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		//Y Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if((i==j && i<=3) || (i+j==6 && i<=3) || (j==3 && i>3)) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		//Z Letter
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1 || i==n || i+j==n+1) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
}

	}
