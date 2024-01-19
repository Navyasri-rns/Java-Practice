package arrayPrograms;

public class CopyElementsOfArrayIntoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3,4,5};
		int[] a2 = new int[a1.length];
		
		for(int i=0;i<a1.length;i++) {
			a2[i] = a1[i];
		}
		System.out.println("Elements of Original Array: ");
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		
		System.out.println("Elements of Another Array: ");
		for(int i=0;i<a2.length;i++) {
			System.out.print(a2[i]+" ");
		}
	}

}
