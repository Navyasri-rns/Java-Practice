package keywords;

public class ENestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int a = 60/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println("Arithemetic Exception occurs");
			}
			
			try {
				int arr[] = new int[5];
				arr[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
				System.out.println("ArrayIndex Out Of Bound Exception occurs");
			}
			
		}
		catch(Exception e2){
			System.out.println("handled the exception(outer catch)");
		}
		System.out.println();
		System.out.println("normal flow...");
	}

}
