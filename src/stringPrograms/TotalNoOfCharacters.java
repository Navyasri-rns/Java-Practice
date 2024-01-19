package stringPrograms;

public class TotalNoOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Earth is a planet";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				  count++;
			}
		}
		System.out.println("Total number of characters: " + count);
	}

}