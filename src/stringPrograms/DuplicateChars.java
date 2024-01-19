package stringPrograms;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Edharapu Navyasri Reddy";
		int count = 0;

		char[] ch = str.toCharArray();
		System.out.println("Printing Duplicate Numbers: ");
		for(int i=0;i<ch.length;i++) {
			count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&& ch[i]!=' '&&ch[i]!='0') {
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
	}

}
