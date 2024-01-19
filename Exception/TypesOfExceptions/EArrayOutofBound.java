package TypesOfExceptions;

public class EArrayOutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int[] arr = {1,2,3,7};
		System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of code");
	}

}