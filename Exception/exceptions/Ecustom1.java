package exceptions;
class Parennt extends Exception{
	
}
public class Ecustom1 {
	public static void main(String[] args) {
		try {
			throw new Parennt();
		}
		catch(Parennt e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
		}
	}
}
