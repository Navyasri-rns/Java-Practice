package keywords;

public class EMultipleCatchNullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s = null;
		System.out.println(s.length());
		}
		catch(ArithmeticException e){
			System.out.println("Arithemetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex Out Of Bound Exception occurs");
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of code");
	}

}
