package arrayPrograms;

import java.util.Scanner;

public class ARightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rotations you want");
		int n = sc.nextInt();
		
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++) {
			int j, last;
			last = a[a.length-1];
			for(j=a.length-1;j>0;j--) {
				a[j]= a[j-1];
					
			}
			a[j] = last;
			
		}
		System.out.println();
		System.out.println("rotation array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}
