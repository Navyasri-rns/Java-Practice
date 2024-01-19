package stringPrograms;

public class LargestandSmallestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hardships often prepare ordinary people "
				+ "for an extraordinary destiny";
		int c;
		String[] b = a.split(" ");
		String s = b[0];
		String l =" ";
		for(int i = 0;i<b.length;i++) {
			c = b[i].length();
			if(c<s.length()) {
				s = b[i];
			}
			else if(c>l.length()) {
				l = b[i];
			}
		}
		System.out.println("smallest word: "+ s);
		System.out.println("largest word: "+l);
	}

}
