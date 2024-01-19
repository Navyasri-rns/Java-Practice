package keywords;

public class EMultipleCatchArithemetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int arr[] = new int[5];
		arr[7] = 50/0;
		System.out.println(arr[10]);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Arithemetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out Of Bound Exception occurs");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
