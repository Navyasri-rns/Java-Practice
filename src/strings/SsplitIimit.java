package strings;

public class SsplitIimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java String split method";
		String[] n = s.split("t", 0);
		for(String a: n) {
			System.out.println(a);
		}
		System.out.println("Split array length: "+ n.length);
	}

}
