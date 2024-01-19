package arrays;

public class ACopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cf = {'a','d','c','a','f','f','e','i','n'
				,'a','t','e','d'};
		char[] ct = new char[7];
		System.arraycopy(cf, 2, ct, 0, 7);
		System.out.println(String.valueOf(ct));
		
	}
	
}
