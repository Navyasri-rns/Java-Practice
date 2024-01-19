import java.util.regex.Pattern;

/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/  

public class RE_Q1 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Navya7"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6,}", "Navyasri7"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Nav73"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Nav@73"));
	}

}
