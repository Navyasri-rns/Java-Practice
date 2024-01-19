package keywords;

	
public class EThrowUnchecked {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("rest of code");
	}

}
