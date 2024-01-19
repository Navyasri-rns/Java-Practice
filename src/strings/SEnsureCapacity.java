package strings;

public class SEnsureCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Navya");
		System.out.println(s.capacity());
		s.ensureCapacity(10);
		System.out.println(s.capacity());
		s.append("c is a programming language");
		System.out.println(s.capacity());
		
//		System.out.println(s.charAt(2));
//		System.out.println(s.length());
//		System.out.println(s.substring(12, 15));
	}
}
