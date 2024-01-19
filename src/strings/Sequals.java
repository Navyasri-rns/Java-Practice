package strings;

public class Sequals {
	public static void main(String[] args) {
		
	
	String str = "a";
	String str1 = "123";
	String str2 = "34.96";
	String str3 = "false";
	Character c = new Character('a'); //reference of character object is passed
	Integer i = new Integer(123);
    Float f = new Float("34.96");
    Boolean b = new Boolean("false");
    System.out.println(str.equals(c)); //
    System.out.println(str1.equals(i));
    System.out.println(str2.equals(f));
    System.out.println(str3.equals(b) + "\n");
    
    System.out.println(str.equals(c.toString()));
    System.out.println(str1.equals(i.toString()));
    System.out.println(str2.equals(f.toString()));
    System.out.println(str3.equals(b.toString()));
}
}
