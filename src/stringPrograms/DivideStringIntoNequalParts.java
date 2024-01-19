package stringPrograms;

public class DivideStringIntoNequalParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbbbcccc";
		int n = 3;
		int len = s.length();
		int temp = 0, chars = len/n;
		String eqStr[] = new String[n];
		if(len%n!=0) {
			System.out.println("given String will not divide into "+ n+ "equal parts");
		}else {
			for(int i=0;i<s.length();i= i+chars) {
				String a = s.substring(i, i+chars);
				 eqStr[temp] = a;
				 temp++;
			}
			System.out.println(n + " equal parts of given String are");
			for(int i=0;i<eqStr.length;i++) {
				System.out.println(eqStr[i]);
			}
		}
	}

}
