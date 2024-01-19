package strings;

public class StoCharArray {
	public static void main(String[] args) {
		String s = "Java";
		char[] ch = s.toCharArray();
		int len = ch.length;
		System.out.println("Char Array length: "+ len);
		for(int i=0; i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
}
