package TypesOfExceptions;

public class ENumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s = "anu";
		int i = Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
