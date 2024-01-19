import java.util.regex.Pattern;

public class RE_MetacharactersEx {

	public static void main(String[] args) {
		System.out.println("Metacharacters d....");
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "8"));
		System.out.println(Pattern.matches("\\d", "3bc6"));
		System.out.println(Pattern.matches("\\d", "567"));
		
		System.out.println("Metacharacters D....");
		System.out.println(Pattern.matches("\\D", "9"));
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "h43e"));
		System.out.println(Pattern.matches("\\D", "789"));
		System.out.println(Pattern.matches("\\D", "n"));
		
		System.out.println("Metacharacters D with Quantifier");
		System.out.println(Pattern.matches("\\D*", "mm"));
		System.out.println(Pattern.matches("\\D*", "m7n"));
		System.out.println(Pattern.matches("\\D+", "Navya"));
	}

}
