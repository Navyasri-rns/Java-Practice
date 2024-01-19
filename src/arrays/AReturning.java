package arrays;

public class AReturning {

	public static void main(String[] args) {
		int[] m = returnArray();
		for(int n : m) {
			System.out.println(n);
		}
	}
	static int[] returnArray() {
		int marks[] = {32,42,53,46,29};
		return marks;
	}
}
