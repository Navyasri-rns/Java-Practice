import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE2 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "ak"));
		System.out.println(Pattern.matches(".n", "nn"));
		System.out.println(Pattern.matches(".n", "ann"));
		System.out.println(Pattern.matches("..s", "sos"));
		System.out.println(Pattern.matches("..n", "van"));
	}
}
