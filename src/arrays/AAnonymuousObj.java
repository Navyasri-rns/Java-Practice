package arrays;



//	class sample{
//		 void printArray(int arr[]) {
//				for(int i=0;i<arr.length;i++) {
//					System.out.println(arr[i]);
//				}
//			}
//	}
	
	public class AAnonymuousObj {
		
		 static void printArray(int arr[]) {
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
			}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			sample s = new sample();
//			s.printArray(new int[] {2,4,5,7,9,12});
			printArray(new int[] {2,5,7,9,23});
		}
}
