package keywords;

public class EThrowswithoutThrow {
	public static int divnum(int m, int n) throws ArithmeticException{
		int d = m/n;
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EThrowswithoutThrow e = new EThrowswithoutThrow();
		try {
			System.out.println(e.divnum(45, 0));
		}
		catch(ArithmeticException n){
			System.out.println("Exception handled");
		}
		System.out.println("normal flow...");
	}

}
