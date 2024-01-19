package stringPrograms;

public class NoofVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vCount =0,cCount=0;
		String s = "Java Program to count Total no of"
				+ "Vowels and Consonants";
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u') {
				vCount++;
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println("Number of Vowels: "+ vCount);
		System.out.println("Number of Consonants:"+ cCount);
	}

}
