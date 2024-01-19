package arrayPrograms;

public class SmallesElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {22,18,7,3,28};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];	
			}	
		}
		System.out.println("Smallest Element of Array: "+min);
	}

}
