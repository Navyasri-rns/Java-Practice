package keywords;

public class ENestedTry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				try {
					int[] a = new int[5];
					System.out.println(a[10]);
				}
				catch(ArithmeticException e){
					System.out.println(e);
				}
			}
			catch(ArithmeticException e1) {
				System.out.println(e1);
			}
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
			System.out.println("ArrayIndex OutOf Bound Exception occurs");
		}
		catch(Exception f) {
			System.out.println("handled in main try block");
		}
	}

}
