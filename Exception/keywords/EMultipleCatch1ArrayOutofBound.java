package keywords;

public class EMultipleCatch1ArrayOutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int[] arr = new int[5];
		System.out.println(arr[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithemetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getStackTrace());
			System.out.println("ArrayIndex Out of Bound Exception occurs");
		}
		catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of code");
	}

}
