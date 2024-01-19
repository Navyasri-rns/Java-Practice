package exceptions;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			int a=50/0;
		}
		catch(Exception e) {
			
			throw new Exception(e);
		}
		System.out.println("rest of the code");
	}

}
