package TypesOfExceptions;

public class ENullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s = null;
		System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
