package arrayPrograms;

public class LeftRotateOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5,6,8,9};
		int n =3; //no of times array should be rotated
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			//Rotate the given array by n times to left
			for(int i=0;i<n;i++) {
				int j,first;
				first = arr[0];
				
				for(j=0;j<arr.length-1;j++) {
					arr[j] = arr[j+1];
				}
				arr[j]= first; //first element of array will be added to end
			}
			System.out.println();
			System.out.println("Array After Rotation: ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		
	}

}
