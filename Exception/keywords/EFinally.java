
//exception occur but not handled by the catch block

package keywords;

public class EFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 50/0;
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
