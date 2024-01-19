package threads;

public class TEx2byStrName {

	public static void main(String[] args) {
		Thread t = new Thread("Navya");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
