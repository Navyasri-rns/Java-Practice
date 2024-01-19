package keywords;
 class UserDefinedException extends Exception{
	 public UserDefinedException(String str) {
		 super(str);
	 }
 }

public class ThrowCustomExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new UserDefinedException("This is UserDefinedException");
		}
		catch(UserDefinedException e) {
			System.out.println(e.getMessage());
			System.out.println("Caught the Exception");
		}
	}

}
