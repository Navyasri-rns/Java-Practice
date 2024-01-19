package stringPrograms;

public class MinMaxChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Program to find maximum and minimum occurring character in a string";
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0);
		char maxChar = str.charAt(0);
		char[] ch = str.toCharArray();
		int min,max;
		for(int i=0;i<str.length();i++) {
			freq[i] = 1;
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j] && ch[i]!= ' ' && ch[i]!='0') {
					freq[i]++;	
					ch[j] = '0';	
				}
			}
		}
		min = max = freq[0];
		for(int i=0;i<freq.length;i++) {
			if(min>freq[i] && freq[i]!='0') {
				min = freq[i];
				minChar = ch[i];
			}
			if(max<freq[i]) {
				max = freq[i];
				maxChar = ch[i];
			}
		}
		System.out.println("Minimum Occuring chracter: "+ minChar + " occured "+min+" time");
		System.out.println("Maximum Occuring Character: "+maxChar+ " occured "+max +" times");
	}

}
