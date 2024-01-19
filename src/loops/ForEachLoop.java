package loops;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		//Strings using ForEachLoop
//		String[] cars= {"Suzuki", "Volvo", "Mercedes", "Skoda", "Honda"};
//		for(String r :cars) {
//			System.out.println(r);
//		}
		//Arrays using ForEachLoop
//		int arr[]= {15,4,54,36,92,76,45};
//		for(int i: arr) {
//			System.out.println(i);
//		}
		//Labeled For Loop
//		aa:
//			for(int i=1;i<=5;i++) {
//				for(int j=1;j<=5;j++) {
//					if(i==2 && j==2) {
//						break aa;
//					}
//						System.out.println(i +" "+j);
//					}
//				}
		//Infinite For Loop
//		for(;;) {
//			System.out.println("Navya");
//		}
		List<Integer> num = Arrays.asList(34,89,4,79);
		for(int n: num) {
			System.out.println(n);
		}
			}
}

