package arrayPrograms;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,43,64,13,42,74};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];	
			}
		}
		System.out.println("Largest Element in the Array: "+max);
	}

}
