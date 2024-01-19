package strings;

public class ImmutableString {

	public static void main(String[] args) {
		String s1 = "Navya";
//		s1.concat("Sri");
//		System.out.println(s1);  //will print Navya because Strings are immutable
		
		//s1 = s1 + "sri";
		s1 = s1.concat("sri");
		/*explicity assigned to reference variable, 
		  so it will refer "Navyasri" object.*/
		System.out.println(s1);
		System.out.println(s1.charAt(5));
		System.out.println(s1.concat(" Edharapu"));
	}

}
