package strings;

public class SgetBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABCDE7868";
		byte[] b= a.getBytes();
		for(int i=0;i<a.length();i++) {
			System.out.println(b[i]);
		}
	}

}
