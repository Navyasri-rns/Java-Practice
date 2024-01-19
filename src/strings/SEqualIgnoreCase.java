package strings;

public class SEqualIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Serole";
		String b = "serole";
		String c = "java";
		String d = "SEROLE";
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(d));
		System.out.println(a.equalsIgnoreCase(c));
	}

}
