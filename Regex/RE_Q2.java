import java.util.regex.Pattern;

/*Create a regular expression that accepts 10 digit numeric characters 
 starting with 7, 8 or 9 only.*/  

public class RE_Q2 {

	public static void main(String[] args) {
		System.out.println("by character classes and quantifiers...");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9951987712"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "8764269261"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "87642abc61"));//includes alphabets(false)
		System.out.println(Pattern.matches("[789][0-9]{9}", "98764269261"));//11characters(false)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6764269261"));//starts with 6(false)
		
		System.out.println();
		System.out.println("by metacharacters \\d...");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "9553892868"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "6309972687"));//starts with 6 (false)
		System.out.println(Pattern.matches("[789]\\d{9}", "9553892868"));
//		System.out.println(Pattern.matches("[678]\\d{9}", "6304972876"));
	}
	

}
