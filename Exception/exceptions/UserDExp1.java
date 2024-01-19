
//custom unchecked exception class

package exceptions;

import java.util.ArrayList;
import java.util.Arrays;

class CustomExp extends Exception{
	public CustomExp(String msg) {
		super(msg);
	}
}
public class UserDExp1 {
	static ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java","Python","Javascript"));
	public void checklang(String language) throws CustomExp {
		if(languages.contains(language)) {
			throw new CustomExp(language +" already exists");
		}
		else {
			languages.add(language);
			System.out.println(language +" is added to ArrayList");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDExp1 c = new UserDExp1();
		try {
		//c.checklang("Java");
		c.checklang("c");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(languages);
	}

}
