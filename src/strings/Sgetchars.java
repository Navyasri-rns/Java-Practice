package strings;

public class Sgetchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello javatpoint how r u";
		char[] ch = new char[10];
		ch[0] = 'a';
		ch[1] = 'b';
		
		str.getChars(17, 24, ch, 0);
		System.out.println(ch);
	}

}
