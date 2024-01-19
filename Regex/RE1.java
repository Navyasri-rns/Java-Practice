import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b1 = m.matches();
		
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		//3rd way
		boolean b3 = Pattern.matches(".s", "as");
		
		System.out.println(b1+"\n"+b2+"\n"+b3);
	}

}
