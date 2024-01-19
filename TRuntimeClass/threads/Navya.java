package threads;

public class Navya {

	public static void main(String[] args) {
		//Total no of characters of a given string
//		String str = "Edharapu Navya sri";
//		int count =0;
//		for(int i=0;i<str.length();i++) {
//		//	char c = str.charAt(i); //Including with space
//			if(str.charAt(i)!=' ') //without space
//				count++;	
//		}
//		System.out.println("Total no characters of given string: "+ count);
		
		//no of punctuations
		String s ="Hi, How are you!!, Whats going on.";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)=='.'){
					count++;
		}
	}
		System.out.println("Total no of punctuations: "+count);
}
}