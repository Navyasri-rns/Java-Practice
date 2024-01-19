package stringPrograms;

import java.util.Scanner;

public class SSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.next();
		int len = str.length();
		int temp = 0;
		
		String arr[] = new String[len*(len+1)/2];
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				arr[temp] = str.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("All Subsets of for given String are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
