package stringPrograms;

public class Swap2VarWithout3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Navya";
		String b = "Hi";
		a = a+b;
		b = a.substring(0,(a.length()-b.length()));
		a = a.substring(b.length());
		System.out.println( a + " "+ b);
	}

}
