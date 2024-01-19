package strings;

public class StringBb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//		StringBuffer a= new StringBuffer("Navya");
//		StringBuffer b = a.append(" sri");
//		System.out.println(b);
//		//char d = b.charAt(2);
//		//b.deleteCharAt(3);
//		int c = b.length();
//		//System.out.println(d);
//		System.out.println(c);
//		//System.out.println(b);
		
		StringBuilder a = new StringBuilder("Hello");
		StringBuilder b = new StringBuilder(" World");
		StringBuilder c = a.append(b);
		System.out.println(c);
	}

}
