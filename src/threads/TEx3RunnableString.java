package threads;

public class TEx3RunnableString implements Runnable{
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Runnable r = new TEx3RunnableString();
		Thread t = new Thread(r,"Navya");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
