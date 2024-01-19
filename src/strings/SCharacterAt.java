package strings;

public class SCharacterAt {
	public static void main(String[] args) {
		String s = "Welcome to Indian railways";
//		int a = s.length();
//		System.out.println("Character at 0 index: "+ s.charAt(0));
//		System.out.println("Character at last index: "+ s.charAt(s.length()-1));
//		
//		for(int i=0;i<s.length();i++) {
//			if(i%2==0) {
//				System.out.println("Char at " + i + " index is "+ s.charAt(i));
//			}
//	}
		int count = 0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("a is repeating "+count+" times");
	}
}
