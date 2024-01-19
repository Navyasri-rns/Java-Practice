package pattern;

import java.util.Scanner;

public class AlphabetC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r;j++) {
				if((i==1 && j<=r-1) || (i==r && j<=r-1) ||
						j==1 || (j==r && i!=1 && i!=r)) {
					System.out.print(" *");
				}
			else {
				System.out.print("  ");
			}
		}
			System.out.println();
		
	}

}
}
