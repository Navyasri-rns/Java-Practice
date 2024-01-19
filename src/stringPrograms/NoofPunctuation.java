package stringPrograms;

public class NoofPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = "https://www.javatpoint.com";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==':'||str.charAt(i)=='/'||str.charAt(i)==';'||
					str.charAt(i)=='.'||str.charAt(i)=='?') {
				count++;
			}
		}
		System.out.println("Total no of punctuations: "+count);
	}

}
