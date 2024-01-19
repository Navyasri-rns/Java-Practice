package exceptions;
class Problem extends Exception{
	public Problem(String str) {
		super(str);
	}
}
public class ECustom {
	static void validate(int age) throws Problem {
		if(age<18) {
			throw new Problem("age is not valid");
		}
		else {
			System.out.println("eligible to vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
