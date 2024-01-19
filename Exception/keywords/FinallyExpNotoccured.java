package keywords;

public class FinallyExpNotoccured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 77/11;
			System.out.println(a);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("rest of code");
	}

}
