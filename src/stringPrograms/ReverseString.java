package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Navya Sri";
		String r ="";
		for(int i=s.length()-1;i>=0;i--) {
			r = r+ s.charAt(i);
		}
		System.out.println("Original String: "+ s);
		System.out.println("Reversed String: "+ r);
	}
}
