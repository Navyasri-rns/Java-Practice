package stringPrograms;

public class SisPalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Kayak";
		String b = "";
		a = a.toLowerCase();
		StringBuffer c = new StringBuffer(a);
		String d = c.reverse().toString();
		if(a.equals(d)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
