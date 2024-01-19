import java.util.regex.Pattern;

public class RE_QuantifiersEx {

	public static void main(String[] args) {
		System.out.println("? Quantifier....");
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]", "aammnn"));
		System.out.println(Pattern.matches("[amn]?", "aazztn"));
		System.out.println(Pattern.matches("[amn]?", "am"));
		
		System.out.println("+ Quantifier....");
		System.out.println(Pattern.matches("[amn]+", "a"));
		System.out.println(Pattern.matches("[amn]+", "aamn"));
		System.out.println(Pattern.matches("[amn]", "aaannnmmm"));
		System.out.println(Pattern.matches("[amn]", "aazztn"));
		
		
		System.out.println("* Quantifier....");
		System.out.println(Pattern.matches("[amn]*", "aamnma"));
	}

}
