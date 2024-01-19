package keywords;

public class ResolveinCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 0;
		int c;
		try {
			c = a/b; //may throw exception
		}
		//handle the exception
		catch(Exception e) {
			System.out.println(c = a/(b+2));//resolving exception in catch block
		}
	}

}
