package stringPrograms;

import java.util.Arrays;

public class TwoStringsAreAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SEAT";
		String s2 = "EAST";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Both the Strings are not anagram");
		}else {
			char[] Str1 = s1.toCharArray();
			char[] Str2 = s2.toCharArray();
			
			Arrays.sort(Str1);
			Arrays.sort(Str2);
			if(Arrays.equals(Str1, Str2)==true) {
				System.out.println("Both the Strings are Anagrams");
			}else {
				System.out.println("Both the Strings are not Anagrams");
			}
		}
	}

}
