import java.util.regex.Pattern;

public class RE_CharacterEx {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[anm]", "n"));
		System.out.println(Pattern.matches("[amn]", "mma"));
		System.out.println(Pattern.matches("[^abc]", "r"));
		System.out.println(Pattern.matches("[a-z]", "n"));
		System.out.println(Pattern.matches("[A-Z]","S"));
		System.out.println(Pattern.matches("[0-9]", "9"));
	}

}
