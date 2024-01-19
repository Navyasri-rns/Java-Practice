package strings;
/*String Compare:
 * 1) equals() Method: equals(), equalsIgnoreCase()
 * 2) == operator
 * 3) CompareTo() Method */

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Navyasri";
//		String s2 = "Navyasri";
//		String s3 = new String("Navyasri");
//		String s4 = "Anusha";
//		System.out.println(s1.equals(s2));
		//public boolean equals (object another)compares this string to specified object
//		System.out.println(s1.equals(s3));
//	    System.out.println(s1.equals(s4));
//		
//		String s1 = "Navya";
//		String s2 = "NAVYA";
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2)); /*public boolean equalsIgnoreCase(String another)
//		                                 compares this string to another string ignoring case */
		
		String s1 = "Navyasri";
		String s2 = "Navyasri";
		String s3 = "Divya";
		String s4 = "NAVYASRI";
		System.out.println(s1.compareTo(s2));//s1 ==s2 returns 0
		System.out.println(s1.compareTo(s3));//s1>s3 returns positive
		System.out.println(s3.compareTo(s1));//s3>s1 returns negative value
		System.out.println(s1.compareTo(s4));
	}

}
