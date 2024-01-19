package stringPrograms;

public class ReverseWordbyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Iam going to market";
		String[] b = a.split(" ");
		for(int i=b.length-1;i>=0;i--) {
			String c = b[i];
			StringBuffer d = new StringBuffer(c);
			String e = d.reverse().toString();
			System.out.print(e +" ");
		}
	}

}
