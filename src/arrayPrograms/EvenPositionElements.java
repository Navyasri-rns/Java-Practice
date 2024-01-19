package arrayPrograms;

public class EvenPositionElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,2,3,4,5,6,7};
		System.out.println("Elements in even positions: ");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
//      System.out.println("Elements in Odd positions: ");		
//		for(int i=1;i<arr.length;i++) {
//			if(i%2!=0) {
//				System.out.print(arr[i]);
//			}else {
//				System.out.println();
//			}
//       }		
		}
	}


