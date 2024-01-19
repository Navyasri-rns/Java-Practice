package strings;

public class SCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Navya");
		System.out.println(str.capacity());
		str.append("Navyanavyasrireddy");
		System.out.println(str.capacity());
	}

}
